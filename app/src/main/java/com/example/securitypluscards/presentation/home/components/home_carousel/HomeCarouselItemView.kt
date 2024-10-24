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
import com.example.securitypluscards.domain.model.HomeCarouselItem

@Composable
fun HomeCarouselItemView(item: HomeCarouselItem) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = item.title,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Image(
            modifier = Modifier
                .size(150.dp)
                .aspectRatio(1f),
            painter = painterResource(id = item.imageResId),
            contentDescription = null
        )
        Text(
            text = item.description,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}