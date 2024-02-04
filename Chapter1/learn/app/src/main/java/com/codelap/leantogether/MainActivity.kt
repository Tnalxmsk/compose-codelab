package com.codelap.leantogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codelap.leantogether.ui.theme.LeanTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LeanTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskManager(title = "All tasks completed", content = "Nice work!")
                    /*MainImage(title = getString(R.string.text_tilte),
                        firstText = getString(R.string.text_first),
                        secondText = getString(R.string.text_second))*/
                }
            }
        }
    }
}

@Composable
fun MainImage(title: String, firstText: String, secondText:String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
        LearnText(title = title, firstText = firstText, secondText = secondText)
    }
}

@Composable
fun LearnText(title: String, firstText: String, secondText:String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(start = 16.dp)
            .padding(end = 16.dp)
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            textAlign = TextAlign.Start,
            modifier = modifier
                .padding(top = 16.dp)
                .padding(bottom = 16.dp)
        )
        Text(
            text = firstText,
            textAlign = TextAlign.Justify,
            modifier = modifier
        )
        Text(
            text = secondText,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(top = 16.dp)
                .padding(bottom = 16.dp)
        )
    }
}

@Composable
fun TaskManager(title: String, content: String) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
        )
        ResultText(title = title, content = content)
    }
}

@Composable
fun ResultText(title: String, content: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(top = 24.dp)
                .padding(bottom = 8.dp)
        )
        Text(
            text = content,
            fontSize = 16.sp
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LeanTogetherTheme {
        TaskManager(title = "", content = "")
        /*MainImage(title = "", firstText = "", secondText = "")*/
    }
}