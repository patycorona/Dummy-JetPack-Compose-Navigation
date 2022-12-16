package com.example.jetpackcomposenavigation.navigation

sealed class AppScreen (val route:String){
    object FirstScreen: AppScreen("first_screen")
    object SecondScreen: AppScreen("Second_screen")
}
