package com.example.securitypluscards.domain.model

data class HomeCarouselItem (
    val imageResId: Int,
    val title: String,
    val description: String? = null
)