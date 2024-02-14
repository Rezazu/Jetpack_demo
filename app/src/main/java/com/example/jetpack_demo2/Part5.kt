package com.example.jetpack_demo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpack_demo2.ui.theme.Jetpack_demo2Theme

class Part5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.lexend_thin, FontWeight.Thin),
            Font(R.font.lexend_light, FontWeight.Light),
            Font(R.font.lexend_regular, FontWeight.Normal),
            Font(R.font.lexend_medium, FontWeight.Medium),
            Font(R.font.lexend_semibold, FontWeight.SemiBold),
            Font(R.font.lexend_bold, FontWeight.Bold),
            Font(R.font.lexend_extrabold, FontWeight.ExtraBold),
        )
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF101010))
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ) {
                            append("Thy")
                        }
                        append(" strength befits a",)
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 50.sp
                            )
                        ) {
                            append(" crown")
                        }
                    },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal,
                    textAlign = TextAlign.Left,
                    textDecoration = TextDecoration.Underline
                    )
            }
        }
    }
}