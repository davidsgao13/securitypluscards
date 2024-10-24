package com.example.securitypluscards.presentation.home.components.home_carousel

import androidx.compose.foundation.interaction.collectIsDraggedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.securitypluscards.domain.model.HomeCarouselItem
import com.example.securitypluscards.presentation.home.view_models.HomeCarouselViewModel
import com.example.securitypluscards.presentation.theme.SoftBlue

@Composable
fun HomeCarousel(homeCarouselViewModel: HomeCarouselViewModel) {
    val carouselItems = homeCarouselViewModel.carouselItems
    val pageCount = homeCarouselViewModel.getItemsCount()
    val pagerState = rememberPagerState { pageCount }
    val isDragged by pagerState.interactionSource.collectIsDraggedAsState()

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            pageSpacing = 0.dp
        ) { page ->
            val item = carouselItems[page]
            HomeCarouselItemView(
                HomeCarouselItem(
                    imageResId = item.imageResId,
                    title = stringResource(item.title),
                    description = stringResource(item.description)
                )
            )
        }

        Surface(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .align(Alignment.BottomCenter),
            shape = CircleShape,
            color = SoftBlue
        ) {
            HomeIndicatorDots(
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp),
                totalDots = pageCount,
                selectedIndex = if (isDragged) pagerState.currentPage else pagerState.targetPage,
                dotSize = 8.dp
            )
        }
    }
}