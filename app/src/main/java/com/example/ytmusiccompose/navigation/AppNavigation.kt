package com.example.ytmusiccompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ytmusiccompose.screens.FirstScreen
import com.example.ytmusiccompose.screens.components.SecondScreen
import com.example.ytmusiccompose.screens.components.ThirdScreen

@Composable
fun AppNavigation() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route) {
        composable(AppScreens.FirstScreen.route) {
            FirstScreen(navController)
        }
        composable(AppScreens.SecondScreen.route) {
            SecondScreen(navController)
        }
        composable(AppScreens.ThirdScreen.route) {
            ThirdScreen(navController)
        }

    }
}