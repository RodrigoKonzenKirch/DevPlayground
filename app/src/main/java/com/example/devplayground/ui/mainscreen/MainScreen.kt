package com.example.devplayground.ui.mainscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AppMainScreen(navController: NavController) {

    Column {
        Button(modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
            onClick = { navController.navigate("nextScreen") }
        ) {
            Text(text = "Go to next screen")
        }

        Button(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            onClick = { navController.navigate("listScreen") }
        ) {
            Text(text = "Go to the list")
        }

        Button(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            onClick = {navController.navigate("bottomBarScreen")}
        ) {
            Text(text = "Go to screen with bottom bar")
        }

        Button(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            onClick = {navController.navigate("tabsScreen")}
        ) {
            Text(text = "Go to screen with tabs")
        }

        Button(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            onClick = { navController.navigate("cardScreen") }) {
            Text(text = "Go to cards screen")
        }
    }
}