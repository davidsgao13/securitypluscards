package com.example.securitypluscards.presentation.home.view_models

import androidx.lifecycle.ViewModel
import com.example.securitypluscards.R

enum class CarouselItemContent(
    val imageResId: Int,
    val title: Int,
    val description: Int
) {
    ITEM_1(R.drawable.carousel_item_1, R.string.carousel_title_1, R.string.carousel_item_1),
    ITEM_2(R.drawable.carousel_item_2,  R.string.carousel_title_2, R.string.carousel_item_2),
    ITEM_3(R.drawable.carousel_item_3, R.string.carousel_title_3, R.string.carousel_item_3),
    ITEM_4(R.drawable.carousel_item_4, R.string.carousel_title_4, R.string.carousel_item_4)
}

class HomeCarouselViewModel : ViewModel() {
    val carouselItems = CarouselItemContent.entries

    fun getItemsCount(): Int {
        return carouselItems.size
    }
}