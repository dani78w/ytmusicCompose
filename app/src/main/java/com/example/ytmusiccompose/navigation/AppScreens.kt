package com.example.ytmusiccompose.navigation

sealed class AppScreens(val route: String) {
    object FirstScreen : AppScreens("FirstScreen")
    object SecondScreen : AppScreens("SecondScreen")
    object ThirdScreen : AppScreens("ThirdScreen")
}
