package com.example.securitypluscards.domain.model

data class TestSessionCard(
    val cardId: Int,
    var isAnswered: Boolean = false,
    var isCorrect: Boolean = false
)