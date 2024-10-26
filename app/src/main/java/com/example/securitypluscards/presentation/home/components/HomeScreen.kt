package com.example.securitypluscards.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.securitypluscards.R
import com.example.securitypluscards.presentation.Screen
import com.example.securitypluscards.presentation.home.components.home_carousel.HomeCarousel
import com.example.securitypluscards.presentation.home.view_models.home.HomeViewModel
import com.example.securitypluscards.presentation.theme.SoftBlue

@Composable
fun HomeScreen(
    navController: NavController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val state = homeViewModel.state.value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(SoftBlue),
    ) {
        Column(
            modifier = Modifier
                .weight(.8f)
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                modifier = Modifier.padding(start = 16.dp),
                style = TextStyle(fontSize = 20.sp),
                text = stringResource(R.string.time_to_study),
            )
            Spacer(modifier = Modifier.weight(.5f))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2.5f)
            ) {
                HomeCarousel(homeCarouselViewModel = hiltViewModel())
            }
            Spacer(modifier = Modifier.weight(.5f))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
                .weight(.2f),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            HomeScreenButton(text = "Create New", onClick = {
                navController.navigate(Screen.DeckScreen.route + "/newDeck")
            })
            HomeScreenButton(text = "Quick Start", onClick = { })
            HomeScreenButton(text = "Library", onClick = { })
        }
    }
}