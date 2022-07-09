package com.vguilhen.myjetpackcompose_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vguilhen.myjetpackcompose_01.ui.theme.MyJetpackCompose01Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyJetpackCompose01Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) { Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "add Personal photo", modifier = Modifier.padding(10.dp))
        Column() {
            Text(text = "Your Name")
            Text(text = "Your Age")
        }

            
        }
    Column() {
        Text(text = "Skills")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyJetpackCompose01Theme {
        Greeting("Android")
    }
}