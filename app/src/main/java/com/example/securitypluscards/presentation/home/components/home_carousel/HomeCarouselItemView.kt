package com.example.securitypluscards.presentation.home.components.home_carousel

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.securitypluscards.domain.model.HomeCarouselItem

@Composable
fun HomeCarouselItemView(item: HomeCarouselItem) {
    // You can expand this to include more UI elements like text, buttons, etc.
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.fillMaxSize(.5f),
            painter = painterResource(id = item.imageResId),
            contentDescription = item.description
        )
        Text(
            text = item.title,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
        )
    }
}