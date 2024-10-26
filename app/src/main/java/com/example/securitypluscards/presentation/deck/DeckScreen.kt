package com.example.securitypluscards.presentation.deck

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun DeckScreen() {
    val viewModel: DeckViewModel = hiltViewModel()
    val state = viewModel.state.value
}