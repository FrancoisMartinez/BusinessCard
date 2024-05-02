package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Background()
    BusinessCardTheme {
        Name(name = "Francois Martinez", title = "Software Developer")
    }
}

@Composable
fun Name(name: String, title: String, modifier: Modifier = Modifier) {
    val headshot = painterResource(R.drawable.headshot)

    Box(
        contentAlignment = Alignment.TopCenter,

        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.Black
            )
            .padding(8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,

            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color.Black
                )
                .padding(8.dp)
        ) {
            Image(
                painter = headshot,
                contentDescription = null,

            )
            Text(
                text = name,
                fontSize = 32.sp
            )
            Text(text = title)
        }
    }

}

@Composable
fun ContactInfo(phone: String, linkedin: String, email: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = phone
        )
        Text(text = linkedin)
        Text(text = email)
    }
}

@Composable
fun Background(modifier: Modifier = Modifier) {
    val background = painterResource(R.drawable.__80264_gaussian_blur_background)

    Image(
        painter =  background,
        contentDescription = null,
        contentScale = ContentScale.Crop,
    )
}

