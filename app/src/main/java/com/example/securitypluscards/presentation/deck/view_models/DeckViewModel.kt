package com.example.securitypluscards.presentation.deck.view_models

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.securitypluscards.presentation.deck.DeckState
import javax.inject.Inject

class DeckViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = mutableStateOf(DeckState())
    val state: State<DeckState> = _state

    init {
        val deckId = savedStateHandle.get<String>("deckId")
        if (deckId == "newDeck") {
            createNewDeck()
        } else {
            loadExistingDeck(deckId)
        }
    }

    private fun createNewDeck() {
        TODO("Not yet implemented")
    }

    private fun loadExistingDeck(deckId: String?) {
        TODO("Not yet implemented")
    }
}