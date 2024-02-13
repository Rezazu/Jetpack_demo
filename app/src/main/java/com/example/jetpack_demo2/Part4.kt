package com.example.jetpack_demo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//Creating an Image Card Composable
class Part4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter1 = painterResource(id = R.drawable.jingliu)
            val painter2 = painterResource(id = R.drawable.ruanmei)
            val description = "Honkai Star Rail"
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                ImageCard(
                    painter = painter1,
                    contentDescription = description,
                    title = "Jing Liu",
                    modifier = Modifier
                        .width(180.dp)
                        .height(180.dp)
                        .clickable { }
                )
                ImageCard(
                    painter = painter2,
                    contentDescription = description,
                    title = "Ruan Mei",
                    modifier = Modifier
                        .width(180.dp)
                        .height(180.dp)
                        .clickable { }
                )

            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
    ){
    //Made the card
    Card(
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        //Box to create the stackable content inside the card
        Box(modifier = Modifier
            .height(200.dp)

        ) {
            //Image
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            //Gradient
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                       colors = listOf(
                            Color.Transparent,
                            Color.Black
                       ),
                        startY = 300f
                    ))
            )
            //Text
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 16.sp
                    )
            }
        }
    }
}