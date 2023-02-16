package com.example.ytmusiccompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ContentMain {
    @Preview(showBackground = true)
    @Composable
    fun content() {
        Column(
            modifier = Modifier
                .padding(10.dp, 40.dp)
                .wrapContentHeight(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text ="Inicia una radio a partir de una cancion", fontSize = 15.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
            Text(text ="Selecciones rapidas", fontSize = 33.sp , fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold)

            songContent("Sing me to sleep")
            songContent("Sing me to sleep")
            songContent("Sing me to sleep")
            songContent("Sing me to sleep")
            songContent("Sing me to sleep")



        }


    }

    @Composable
    fun songContent(song:String){
        Row(
            modifier = Modifier
                .clickable(enabled = true, onClick = { /*TODO*/ })
                .height(60.dp),

            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = androidx.compose.ui.res.painterResource(id = R.drawable.alan2_background),
                contentDescription = "Imagen de la cancion",
                modifier = androidx.compose.ui.Modifier
                    .width(75.dp)
                    .height(55.dp)
                    .padding(top = 7.dp)
                    .weight(0.5f)
            )
            Column(modifier = androidx.compose.ui.Modifier.weight(2f)) {
                Text(text = "Sing me to sleep", fontSize = 16.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, color = androidx.compose.material3.MaterialTheme.colorScheme.surface)
                Text(text= "Alan Walker",fontSize = 14.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Light,color = androidx.compose.material3.MaterialTheme.colorScheme.surface)
            }

        }
    }



}