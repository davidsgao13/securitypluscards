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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.securitypluscards.presentation.home.view_models.HomeCarouselViewModel
import com.example.securitypluscards.presentation.theme.SoftBlue
import kotlinx.coroutines.delay

@Composable
fun HomeCarousel(homeCarouselViewModel: HomeCarouselViewModel) {
    val carouselItems = homeCarouselViewModel.carouselItems
    val pageCount = homeCarouselViewModel.getItemsCount()
    val pagerState = rememberPagerState { pageCount }
    val isDragged by pagerState.interactionSource.collectIsDraggedAsState()
    val autoSlideDuration = 10000L

    LaunchedEffect(pagerState.currentPage) {
        delay(autoSlideDuration)
        pagerState.animateScrollToPage(
            (pagerState.currentPage + 1) %
                    pageCount
        )
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth(.60f)
                .height(250.dp)
        ) { page ->
            HomeCarouselItemView(carouselItems[page])
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