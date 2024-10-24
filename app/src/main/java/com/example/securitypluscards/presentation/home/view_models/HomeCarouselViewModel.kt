package com.example.securitypluscards.presentation.home.view_models

import androidx.lifecycle.ViewModel
import com.example.securitypluscards.R
import com.example.securitypluscards.domain.model.HomeCarouselItem

class HomeCarouselViewModel : ViewModel() {
    val carouselItems = listOf(
        HomeCarouselItem(R.drawable.carousel_item_1, "Item 1", "Description 1"),
        HomeCarouselItem(R.drawable.carousel_item_2, "Item 2", "Description 2"),
        HomeCarouselItem(R.drawable.carousel_item_3, "Item 3", "Description 3"),
        HomeCarouselItem(R.drawable.carousel_item_4, "Item 4", "Description 4")
    )

    fun getItemsCount(): Int {
        return carouselItems.size
    }
}