package com.example.securitypluscards.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColorScheme(
    primary = SoftBlue,
    onPrimary = Color.White,
    secondary = FreshTeal,
    background = DarkBackground,
    surface = DarkSurface,
    onBackground = Color.White,
    onSurface = Color.White,
)

private val LightColorPalette = lightColorScheme(
    primary = SoftBlue,
    onPrimary = DarkGrayText,
    secondary = FreshTeal,
    background = LightGrayBackground,
    surface = SoftWhiteSurface,
    onBackground = DarkGrayText,
    onSurface = DarkGrayText,
)

@Composable
fun SecurityTheme(
    content: @Composable () -> Unit) {
    val colors = if (isSystemInDarkTheme()) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    MaterialTheme(
        colorScheme = colors,
        shapes = CustomShapes,
        typography = SecurityTypography
    ) {
        content()
    }
}