package com.example.jetpackcomposenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpackcomposenavigation.screen.firstScreen
import com.example.jetpackcomposenavigation.screen.secondScreen

@Composable
fun appNavigation(){
    // se encarga de getionar el estado de navegacion
    val navController = rememberNavController( )
    NavHost(navController = navController, startDestination = AppScreen.FirstScreen.route ){
        composable(route = AppScreen.FirstScreen.route){
            firstScreen(navController)
        }
        composable(route = AppScreen.SecondScreen.route + "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
            })){
            secondScreen(navController, it.arguments?.getString("text"))
        }
    }
}