package com.example.securitypluscards.presentation.card.components

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.securitypluscards.presentation.card.view_models.CardViewModel

@Composable
fun CardScreen(
    navController: NavController,
    cardViewModel: CardViewModel = hiltViewModel()
) {

}