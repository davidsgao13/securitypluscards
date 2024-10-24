package com.example.securitypluscards.presentation

sealed class Screen(val route: String) {
    data object HomeScreen : Screen("home")
}