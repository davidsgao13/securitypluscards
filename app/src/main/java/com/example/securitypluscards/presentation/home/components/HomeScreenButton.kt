package com.example.securitypluscards.presentation.home.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.securitypluscards.presentation.theme.DarkBlue

@Composable
fun HomeScreenButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = DarkBlue
        ),
        modifier = modifier
    ) {
        Text(text = text)
    }
}