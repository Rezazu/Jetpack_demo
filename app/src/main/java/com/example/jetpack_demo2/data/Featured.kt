package com.example.jetpack_demo2.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Featured(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightcolor: Color,
    val mediumColor: Color,
    val darkColor: Color
)
