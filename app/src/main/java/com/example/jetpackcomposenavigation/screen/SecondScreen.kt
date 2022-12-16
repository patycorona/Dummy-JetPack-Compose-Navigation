package com.example.jetpackcomposenavigation.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun  secondScreen(navController:NavController, text:String?){
    Scaffold {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow Back",
            modifier = Modifier.clickable { navController.popBackStack() })
            Spacer(modifier = Modifier.width(8.dp))
            Text("¡SECOND SCREEN!")
        }
        secondBodyContent(navController, text)
    }
}

@Composable
fun secondBodyContent(navController: NavController, text: String?){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("¡SECOND NAVEGACIÓN!")
        text?.let{
            Text(it)
        }
        //popBackStack para regresar
        Button(onClick = { navController.popBackStack() }) {
            Text("NAVE")
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun secondDefaultPreview(){
//    secondScreen()
//}