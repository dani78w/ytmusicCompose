package com.example.ytmusiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.ytmusiccompose.ui.theme.YtmusicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YtmusicComposeTheme {
                var scr1 = BottomComponents()
                var wll = Wallpaper()
                // A surface container using the 'background' color from the theme
                Box(){
                    Surface(
                        modifier = Modifier.fillMaxSize().zIndex(2f),
                        color = Color.Transparent
                        ) {
                        Column() {
                            Row(
                                modifier = Modifier
                                    .weight(.9f)
                            ) {

                            }
                            Row(
                                modifier = Modifier
                                    .weight(3f)
                            ) {

                            }
                            Row(
                                modifier = Modifier
                                    .wrapContentHeight()
                            ) {
                                scr1.Greeting(name ="Daniel")
                            }
                        }

                    }

                    wll.Wallpaper()

                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YtmusicComposeTheme {
        var screen1 = BottomComponents()
        screen1.Greeting(name ="Daniel")
    }
}