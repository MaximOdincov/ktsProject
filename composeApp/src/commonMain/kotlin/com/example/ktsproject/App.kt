package com.example.ktsproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import coil3.compose.setSingletonImageLoaderFactory
import com.example.ktsproject.presentation.theme.KtsProjectTheme
import com.example.ktsproject.presentation.utils.getAsyncImageLoader
import com.example.ktsproject.presentation.navigation.AppNavigation

@Composable
fun App() {
    KtsProjectTheme {
        setSingletonImageLoaderFactory { context ->
            getAsyncImageLoader(context)
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            AppNavigation()
        }
    }
}
