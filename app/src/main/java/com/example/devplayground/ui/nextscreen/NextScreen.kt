package com.example.devplayground.ui.nextscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun NextScreen(navController: NavController){
    Column {
        Text(
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            letterSpacing = 2.sp,
            textAlign = TextAlign.Center,
            text = "This is the next screen."
        )

        Button(
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            onClick = { navController.navigate("mainScreen") }
        ) {
            Text(text = "Go back to main screen")

        }
    }
}