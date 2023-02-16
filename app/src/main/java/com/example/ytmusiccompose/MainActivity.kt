package com.example.ytmusiccompose

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import java.net.URL

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YtmusicComposeTheme {
                    app()
                }


        }
    }
}

@Composable
fun app(){
    var scr1 = BottomComponents()
    var wll = Wallpaper()
    var tbar = Topbar()
    var chps = Chips()
    var cont = ContentMain()
    // A surface container using the 'background' color from the theme
    Box(){
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .zIndex(2f),
            color = MaterialTheme.colorScheme.primary
        ) {
            Column() {
                //topbar
                    Row(
                        modifier = Modifier
                            .wrapContentHeight()
                    ) {
                            tbar.topbar()

                    }
                //content
                    Column(
                        modifier = Modifier
                            .weight(3f)
                    ) {
                        chps.Chips()
                        cont.content()
                    }

                //bottom_bar
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


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YtmusicComposeTheme {
        app()
    }
}