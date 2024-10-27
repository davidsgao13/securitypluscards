package com.example.securitypluscards.presentation.home.components.home_carousel

import androidx.compose.foundation.interaction.collectIsDraggedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.example.securitypluscards.presentation.home.view_models.home.HomeCarouselViewModel
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
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth(),
                pageSpacing = 0.dp
            ) { page ->
                val item = carouselItems[page]
                HomeCarouselItemView(
                    imageResId = item.imageResId,
                    title = stringResource(item.title),
                    description = stringResource(item.description)
                )
            }
            Surface(
                modifier = Modifier,
                shape = CircleShape,
                color = SoftBlue
            ) {
                HomeIndicatorDots(
                    totalDots = pageCount,
                    selectedIndex = if (isDragged) pagerState.currentPage else pagerState.targetPage,
                    dotSize = 8.dp
                )
            }
        }
    }
}