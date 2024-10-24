package com.example.securitypluscards.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.example.securitypluscards.R

val SecurityTypography = createTypography()

fun createProvider(): GoogleFont.Provider {
    return GoogleFont.Provider(
        providerAuthority = "com.google.android.gms.fonts",
        providerPackage = "com.google.android.gms",
        certificates = R.array.com_google_android_gms_fonts_certs
    )
}

fun createTypography(): Typography {
    val fontName = GoogleFont("Nunito")
    val fontFamily = FontFamily(
        Font(googleFont = fontName, fontProvider = createProvider()),
        Font(
            googleFont = fontName, fontProvider = createProvider(), weight =
            FontWeight.Bold
        )
    )
    return Typography(
        bodyMedium = TextStyle(
            fontFamily = fontFamily, fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            letterSpacing = 2.sp
        ),
        bodyLarge = TextStyle(
            fontFamily = fontFamily
        ),
        headlineMedium = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.SemiBold)
    )
}