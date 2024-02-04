package com.codelap.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codelap.namecard.ui.theme.NameCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameCardFrame()
                }
            }
        }
    }
}

@Composable
fun InfoCard() {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxHeight().fillMaxWidth()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            Modifier
                .background(Color(R.color.black))
                .width(80.dp)
                .height(80.dp)
        )
        Text(text = "Minsu Jang", fontSize = 50.sp, textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        )
        Text(text = "Android Developer Experts", color = Color(0xFF3ddc84),
            modifier = Modifier.padding(top = 5.dp))
    }
}

@Composable
fun EtcInfoFrame() {
    Column(modifier = Modifier.fillMaxWidth()
        .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom) {
        Info()
        Info()
        Info()
    }
}

@Composable
fun Info() {
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(bottom = 20.dp)) {
        val icon = painterResource(id = R.drawable.call_black_24dp)
        Icon(painter = icon, contentDescription = null)
        Text(text = "010-6645-7026", Modifier.padding(start = 20.dp))
    }
}



@Composable
fun NameCardFrame() {
    Box (
        modifier = Modifier.fillMaxHeight()
    ) {
        InfoCard()
        EtcInfoFrame()
    }
}

@Preview(showBackground = true)
@Composable
fun NameCardPreview() {
    NameCardTheme {
        NameCardFrame()
    }
}