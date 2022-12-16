package com.example.jetpackcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposenavigation.navigation.appNavigation
import com.example.jetpackcomposenavigation.screen.firstScreen
import com.example.jetpackcomposenavigation.ui.theme.JetPackComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background){
                    appNavigation()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackComposeNavigationTheme {
        appNavigation()
    }
}