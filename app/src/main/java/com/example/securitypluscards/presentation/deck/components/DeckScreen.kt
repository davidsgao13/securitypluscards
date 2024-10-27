package com.example.securitypluscards.presentation.deck.components

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.securitypluscards.presentation.deck.view_models.DeckViewModel

@Composable
fun DeckScreen() {
    val viewModel: DeckViewModel = hiltViewModel()
    val state = viewModel.state.value
}