package com.example.ytmusiccompose

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ContentMain {
    @Composable
    fun content() {
        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text ="Inicia una radio a partir de una cancion", fontSize = 10.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraLight)
            Text(text ="Selecciones rapidas", fontSize = 20.sp , fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold)
        }


    }
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        content()
    }
}