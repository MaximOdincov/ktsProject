package com.example.ktsproject.presentation.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val GreenAccent = Color(0xFF00E676)

private val DarkColorScheme = darkColorScheme(
    primary = GreenAccent,
    secondary = Color(0xFF00C853),
    tertiary = Color(0xFF69F0AE),
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onTertiary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White,
    error = Color(0xFFFF5252),
    onError = Color.White
)

@Composable
fun KtsProjectTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}
