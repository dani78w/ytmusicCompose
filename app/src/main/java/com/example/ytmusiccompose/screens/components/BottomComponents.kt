package com.example.ytmusiccompose.screens.components


import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ytmusiccompose.R

class BottomComponents {
    var currentSong = R.raw.singmetosleep

    fun setSong(song: Int){
        currentSong = song
    }

    @Composable
    fun Greeting(navController: NavController) {

        /* media compose */
        var mediaPlayer = MediaPlayer.create(LocalContext.current, currentSong)
        Column() {
                    //imagen de la cancion y botones de reproduccion
                    Row (
                        modifier = androidx.compose.ui.Modifier.background(color = androidx.compose.material3.MaterialTheme.colorScheme.surface)


                            ){
                        Spacer(modifier = androidx.compose.ui.Modifier.width(5.dp))
                        Image(
                            painter = androidx.compose.ui.res.painterResource(id = R.drawable.ic_launcher_background),
                            contentDescription = "Imagen de la cancion",
                            modifier = androidx.compose.ui.Modifier
                                .width(75.dp)
                                .height(55.dp)
                                .padding(top = 7.dp)
                                .weight(1f)
                        )

                        Column(
                            modifier = androidx.compose.ui.Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .weight(2f)


                        ) {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
                            Text(text = "Sing me to sleep", fontSize = 16.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, color = androidx.compose.material3.MaterialTheme.colorScheme.inverseSurface)
                            Text(text= "Alan Walker",fontSize = 14.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Light,color = androidx.compose.material3.MaterialTheme.colorScheme.inverseSurface)
                        }
                        Column(modifier = androidx.compose.ui.Modifier.weight(1.15f)) {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))
                            Row() {

                                IconButton(onClick = { mediaPlayer.start() }) {
                                    Icon(Icons.Filled.PlayArrow, contentDescription = "Play",tint = androidx.compose.material3.MaterialTheme.colorScheme.inverseSurface)
                                }
                                IconButton(onClick = { mediaPlayer.pause()}) {
                                    Icon(Icons.Filled.PlayArrow, contentDescription = "Favorito", tint = androidx.compose.material3.MaterialTheme.colorScheme.inverseSurface)
                                }

                            }
                        }



                    }
                    //Linea de progreso
                    Row(modifier= androidx.compose.ui.Modifier
                        .fillMaxWidth()
                        .height(2.dp)
                        .background(androidx.compose.material3.MaterialTheme.colorScheme.surface)
                    ) {

                        var progreso :Float = 0.45f;
                        LinearProgressIndicator(progress = progreso, modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth()
                            .height(4.dp)
                            .background(Color.Transparent),trackColor = Color.Transparent
                        )
                    }
                    //Botones de navegacion
                    Row(
                        modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth()
                            .height(73.dp)
                            .background(color = androidx.compose.material3.MaterialTheme.colorScheme.surface)
                    ) {
                        NavigationBar(containerColor = Color.Transparent,
                            modifier = androidx.compose.ui.Modifier
                                .fillMaxWidth()


                        ) {
                            var selectedItem by remember { mutableStateOf(0) }
                            val items = listOf("Songs", "Artists", "Playlists")
                            items.forEachIndexed { index, item ->
                                NavigationBarItem(
                                    icon = { Icon(Icons.Filled.Favorite, contentDescription = item) },
                                    label = { Text(item) },
                                    selected = selectedItem == index,
                                    onClick = {
                                        selectedItem = index
                                        when (index) {
                                            0 -> navController.navigate("FirstScreen")
                                            1 -> navController.navigate("SecondScreen")
                                            2 -> navController.navigate("ThirdScreen")
                                        }
                                    }
                                )
                            }

                        }

                    }

                }

        }
    }


