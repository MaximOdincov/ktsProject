package com.example.ktsproject.presentation.utils

import coil3.ImageLoader
import coil3.PlatformContext
import coil3.util.DebugLogger

fun getAsyncImageLoader(context: PlatformContext): ImageLoader {
    return ImageLoader.Builder(context)
        .logger(DebugLogger())
        .build()
}
