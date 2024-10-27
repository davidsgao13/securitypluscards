package com.example.securitypluscards.presentation.card.view_models

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.securitypluscards.presentation.card.CardState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CardViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle

) : ViewModel() {
    private val _state = mutableStateOf(CardState())
    val state: State<CardState> = _state

    fun flipCard() {
        _state.value = _state.value.copy(isFlipped = !_state.value.isFlipped)
    }

    fun markAnswered(answer: Boolean) {
        _state.value = _state.value.copy(isAnswered = answer)
    }

}