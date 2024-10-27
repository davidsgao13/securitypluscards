package com.example.securitypluscards.domain.model

import java.time.LocalDateTime

data class Card(
    val id: Int,
    val question: String,
    val answer: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val lastReviewedAt: LocalDateTime
)
