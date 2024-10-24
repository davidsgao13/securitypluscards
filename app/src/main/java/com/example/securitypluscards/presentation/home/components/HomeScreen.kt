package com.example.securitypluscards.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.securitypluscards.R
import com.example.securitypluscards.presentation.home.components.home_carousel.HomeCarousel
import com.example.securitypluscards.presentation.home.view_models.HomeViewModel
import com.example.securitypluscards.presentation.theme.SoftBlue

@Composable
fun HomeScreen(
    navController: NavController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val state = homeViewModel.state.value

    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(SoftBlue)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 16.dp)
        ) {
            Text(

                text = stringResource(R.string.time_to_study)
            )
        }
        HomeCarousel(homeCarouselViewModel = hiltViewModel())
    }
}