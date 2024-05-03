package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    GreetingPreview()
                }
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Background()
}

@Composable
fun Name(name: String, title: String, modifier: Modifier = Modifier) {
    val headshot = painterResource(R.drawable.headshot)

    Box(
        contentAlignment = Alignment.Center,

        modifier = Modifier

            .padding(vertical = 128.dp)
            .fillMaxWidth()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            modifier = Modifier
                .padding(10.dp)
        ) {
            Image(
                painter = headshot,
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(200.dp)
            )
            Text(
                text = name,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Text(text = title)
        }
    }
}

@Composable
fun ContactInfo(phone: String, email: String, modifier: Modifier = Modifier) {

    Box(
        contentAlignment = Alignment.Center,

        modifier = Modifier
            .padding(vertical = 32.dp)
            .fillMaxWidth()
    ) {
        Column {
            Row {
                Icon(
                    Icons.Rounded.Phone,
                    contentDescription = null,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
                Text(text = phone)
            }

            Row {
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = null,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
                Text(text = email)
            }
        }
    }
}

@Composable
fun Background(modifier: Modifier = Modifier) {

    Box(
        contentAlignment = Alignment.Center,
    ) {
        Image(
            painter = painterResource(R.drawable.__80264_gaussian_blur_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(1080.dp)

        )
        Column {
            Name(
                name = "Francois Martinez",
                title = "Software Developer"
            )

            ContactInfo(
                phone = "(438) 493-2262",
                email = "martinezfrancois004@gmail.com"
            )
        }
    }
}

