package com.example.jetpack_demo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_demo2.ui.theme.Jetpack_demo2Theme
import kotlinx.coroutines.delay

//Effect Handlers
class Part10 : ComponentActivity() {
    private var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var text by remember {
                mutableStateOf("")
            }
            LaunchedEffect(key1 = text) {
                delay(1000L)
                println("Text is $text")
            }
        }
    }
}
