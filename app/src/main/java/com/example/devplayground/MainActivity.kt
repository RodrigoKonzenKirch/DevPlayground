package com.example.devplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.devplayground.ui.bottombarscreen.BottomBarScreen
import com.example.devplayground.ui.listscreen.ListScreen
import com.example.devplayground.ui.mainscreen.AppMainScreen
import com.example.devplayground.ui.nextscreen.NextScreen
import com.example.devplayground.ui.tabsscreen.TabsScreen
import com.example.devplayground.ui.theme.DevPlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevPlaygroundTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "mainScreen"){
                        composable("mainScreen"){ AppMainScreen(navController) }
                        composable("nextScreen"){ NextScreen(navController = navController) }
                        composable("listScreen"){ ListScreen() }
                        composable("bottomBarScreen"){ BottomBarScreen() }
                        composable("tabsScreen"){ TabsScreen() }

                    }
                }
            }
        }
    }
}

