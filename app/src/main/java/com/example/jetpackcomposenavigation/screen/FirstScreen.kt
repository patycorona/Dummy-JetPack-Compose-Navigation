package com.example.jetpackcomposenavigation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.jetpackcomposenavigation.navigation.AppScreen

@Composable
fun  firstScreen(navController:NavController){
    //Elemento gráfico que nos va a servir para estructurar los elementos más típicos de MD
    Scaffold {
        TopAppBar() {
            Text("¡FIRST SCREEN!")
        }
        bodyContent(navController)
    }
}

@Composable
fun bodyContent(navController:NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("¡HOLA NAVEGACIÓN!")
        Button(onClick = { navController.navigate(route = AppScreen.SecondScreen.route + "/ESTE ES UM PARÁMETRO") }) {
            Text("NAVE")
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun defaultPreview(){
//    firstScreen()
//}