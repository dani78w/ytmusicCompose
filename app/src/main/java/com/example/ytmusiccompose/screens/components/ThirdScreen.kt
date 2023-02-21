package com.example.ytmusiccompose.screens.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.zIndex
import androidx.navigation.NavController

@Composable
fun ThirdScreen(navController: NavController){
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
                    cont.content()
                }

                //bottom_bar
                Row(
                    modifier = Modifier
                        .wrapContentHeight()
                ) {
                    scr1.Greeting(navController)

                }

            }

        }

        wll.Wallpaper()

    }
}