package com.example.ytmusiccompose

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Chips {
    @SuppressLint("NotConstructor")
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Chips(

    ) {
        Row(
            modifier = Modifier.height(45.dp).scrollable(
                orientation = Orientation.Horizontal,
                state = ScrollState(0)
            ).horizontalScroll(ScrollState(0))
            //añadir pading entre chips
        ) {
            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Relajacion") },
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.padding(start=10.dp),
            )
            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Entrenamiento") },
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.padding(start=10.dp)
            )
            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Desplazamiento") },
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.padding(start=10.dp)
            )
            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Desplazamiento") },
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.padding(start=10.dp)
            )
            AssistChip(
                onClick = { /* Do something! */ },
                label = { Text("Desplazamiento") },
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.padding(start=10.dp)
            )
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Chips()
    }
}