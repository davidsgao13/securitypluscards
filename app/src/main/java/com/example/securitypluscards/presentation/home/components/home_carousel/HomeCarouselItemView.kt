package com.example.securitypluscards.presentation.home.components.home_carousel

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeCarouselItemView(
    imageResId: Int,
    title: String,
    description: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        HomeCarouselItemViewText(text = title)
        Image(
            modifier = Modifier
                .size(150.dp)
                .aspectRatio(1f),
            painter = painterResource(id = imageResId),
            contentDescription = null
        )
        HomeCarouselItemViewText(text = description)
    }
}

@Composable
fun HomeCarouselItemViewText(text: String) {
    Text(
        text = text,
        fontSize = 20.sp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp),
        textAlign = TextAlign.Center
    )
}