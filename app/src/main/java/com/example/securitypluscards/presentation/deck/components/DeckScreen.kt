package com.example.securitypluscards.presentation.deck.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.securitypluscards.presentation.deck.view_models.DeckViewModel

@Composable
fun DeckScreen(
    navController: NavController,
    viewModel: DeckViewModel = hiltViewModel()
) {
    val state = viewModel.state.value

    Box() {
        // This should be the CardView later on
        Row() {
            Text(text = "Question")
        }
        // This should be the card number text
        Text(text = "1/100")
        Button(onClick = {}) {

        }
        Button(onClick = {}) {

        }
    }
}