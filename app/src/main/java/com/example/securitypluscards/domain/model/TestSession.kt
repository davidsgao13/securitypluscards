package com.example.securitypluscards.domain.model

data class TestSession(
    val deckId: Int,
    val testedCards: List<TestSessionCard>
)