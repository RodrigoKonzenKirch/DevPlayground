package com.example.devplayground.ui.cards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardsScreen() {
    val scrollState = rememberScrollState()
    val paddingModifier = Modifier.padding(10.dp)

    Column(modifier = Modifier.verticalScroll(scrollState)) {
        Text(
            modifier = Modifier.padding(20.dp),
            text = "Simple Card with elevation",
            color = Color.Blue,
            fontSize = 22.sp
        )

        Card(elevation = 10.dp, modifier = paddingModifier) {
            Text(modifier = paddingModifier, text = "Card with elevation")
        }

        Text(
            modifier = Modifier.padding(20.dp),
            text = "Card with different shapes",
            color = Color.Blue,
            fontSize = 22.sp
        )

        Card(elevation = 10.dp, shape = RectangleShape, modifier = paddingModifier) {
            Text(modifier = paddingModifier, text = "Rectangle shaped card")
        }

        Card(elevation = 10.dp, shape = CircleShape, modifier = paddingModifier) {
            Text(modifier = paddingModifier, text = "Circle shaped card")
        }

        Card(elevation = 10.dp, shape = RoundedCornerShape(20.dp), modifier = paddingModifier) {
            Text(modifier = paddingModifier, text = "Rounded shaped card")
        }

        Card(elevation = 10.dp, shape = CutCornerShape(topEnd = 10.dp), modifier = paddingModifier) {
            Text(modifier = paddingModifier, text = "CutCorner card")
        }

        Text(
            modifier = Modifier.padding(20.dp),
            text = "Card with multiple views",
            color = Color.Blue,
            fontSize = 22.sp
        )

        Card(elevation = 10.dp, modifier = paddingModifier) {
            Column(modifier = paddingModifier) {
                Row {
                    Icon(imageVector = Icons.Outlined.Email, contentDescription = null)
                    Text(text = "Email")
                }
                Text(text = "example@email.com")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardsScreenPreview(){
    CardsScreen()
}