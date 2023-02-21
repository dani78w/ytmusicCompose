package com.example.ytmusiccompose.screens.components

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import com.example.ytmusiccompose.R

class ContentMain {
    @Preview(showBackground = true)
    @Composable
    fun content() {
        Column(
            modifier = Modifier

                .wrapContentHeight()
                .wrapContentWidth()
        ) {
            SeleccionesRapidas()
            VuelveAescuchar()
            VideosMusicalesRecomendados()
        }


    }

   @Composable
   fun SeleccionesRapidas(){
       Spacer(modifier = Modifier.height(10.dp))
       Text(text ="Inicia una radio a partir de una cancion", fontSize = 15.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, modifier = Modifier.padding(10.dp, 0.dp))
       Text(text ="Selecciones rapidas", fontSize = 33.sp , fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold, modifier = Modifier.padding(10.dp, 0.dp))
       Row(
           modifier = Modifier
               .wrapContentHeight()
               .wrapContentWidth()
               .padding(10.dp, 0.dp)
       ) {
           Column(modifier = Modifier
               .wrapContentHeight()
               ) {

               songContent("Sing me to sleep")
               songContent("Sing me to sleep")
               songContent("Sing me to sleep")
               songContent("Sing me to sleep")
               songContent("Sing me to sleep")
           }


       }

   }
    @Composable
    fun VuelveAescuchar() {
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Vuelve a escucharlo",
            fontSize = 33.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold,
            modifier = Modifier.padding(10.dp, 0.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .wrapContentWidth()
                .horizontalScroll(state = ScrollState(0), enabled = true)
        ) {
            Spacer(modifier =Modifier.width(30.dp))
            Column(
                modifier = Modifier.width(150.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.alan_tv_background),
                    contentDescription = "Song Image",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(150.dp)
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Sing me to sleep",
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                )
            }
            Column(
                modifier = Modifier.width(150.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.alan_tv_background),
                    contentDescription = "Song Image",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(150.dp)
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Sing me to sleep",
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                )
            }
            Column(
                modifier = Modifier.width(150.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.alan_tv_background),
                    contentDescription = "Song Image",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(150.dp)
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Sing me to sleep",
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                )
            }
            Column(
                modifier = Modifier.width(150.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.alan_tv_background),
                    contentDescription = "Song Image",
                    modifier = Modifier
                        .padding(1.dp)
                        .size(150.dp)
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Sing me to sleep",
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                )
            }
        }
    }
    @Composable
    fun VideosMusicalesRecomendados() {
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Videos Musicales \nRecomendados",
            fontSize = 33.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold,
            lineHeight = 34.sp,
            modifier = Modifier.padding(10.dp, 0.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .wrapContentWidth()
                .horizontalScroll(state = ScrollState(0), enabled = true)
        ) {
            Spacer(modifier = Modifier.width(30.dp))
            Column(
                modifier = Modifier.width(350.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.alan_tv_background),
                    contentDescription = "Song Image",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(500.dp)
                        .height(200.dp)
                        .background(Color.Black)
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Sing me to sleep",
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                )
            }
            Column(
                modifier = Modifier.width(350.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.alan_tv_background),
                    contentDescription = "Song Image",
                    modifier = Modifier
                        .padding(1.dp)
                        .width(500.dp)
                        .height(200.dp)
                        .background(Color.Black)
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Sing me to sleep",
                    fontSize = 16.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                )
            }
        }
    }
    @Composable
    fun songContent(song:String){
        Row(
            modifier = Modifier
                .clickable(enabled = true, onClick = { /*TODO*/ })
                .height(60.dp)
                .width(250.dp),

            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.alan_tv_background),
                contentDescription = "Song Image",
                modifier = Modifier
                    .padding(10.dp)
                    .size(50.dp)
            )
            Column(modifier = androidx.compose.ui.Modifier.width(250.dp)) {
                Text(text = "Sing me to sleep", fontSize = 16.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, color = androidx.compose.material3.MaterialTheme.colorScheme.surface)
                Text(text= "Alan Walker",fontSize = 14.sp,fontWeight = androidx.compose.ui.text.font.FontWeight.Light,color = androidx.compose.material3.MaterialTheme.colorScheme.surface)
            }

        }
    }

    @Composable
    fun RadomContentFeed(){
        var randomInt: Int = (1..3).random()
        if (randomInt == 1){
            SeleccionesRapidas()
            VuelveAescuchar()
            VideosMusicalesRecomendados()
        }else if (randomInt == 2){
            VuelveAescuchar()
            VideosMusicalesRecomendados()
            SeleccionesRapidas()

        }else{
            VideosMusicalesRecomendados()
            VuelveAescuchar()
            SeleccionesRapidas()

    }
}



}