package com.example.devplayground.ui.tabsscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.devplayground.ui.theme.DarkBlue
import com.example.devplayground.ui.theme.SlightlyDarkBlue

@Composable
fun TabsScreen(){

    val tabIndex = rememberSaveable { mutableStateOf(0) }
    val tabData = listOf(
        "Home" to Icons.Default.Home,
        "Not home" to Icons.Default.Face,
        "Search" to Icons.Default.Search,
        "Settings" to Icons.Default.Settings
    )

    Column {
        TabRow(selectedTabIndex = tabIndex.value) {
            tabData.forEachIndexed{ index, pair ->
                val selected = index == tabIndex.value

                Tab(
                    selected = selected,
                    onClick = {
                        tabIndex.value = index
                    },
                    modifier =
                    if (selected)
                        Modifier.background(DarkBlue)
                    else
                        Modifier.background(SlightlyDarkBlue),
                    text = {
                        Text(text = pair.first)
                    },
                    icon = {
                        Icon(imageVector = pair.second, contentDescription = null)
                    }
                )
            }
        }
        when(tabIndex.value){
            0 -> ContentTabHome(text = tabData[tabIndex.value].first)
            1 -> ContentTabNotHome(text = tabData[tabIndex.value].first)
            2 -> ContentTabSearch(text = tabData[tabIndex.value].first)
            3 -> ContentTabSettings(text = tabData[tabIndex.value].first)
        }
    }

}

@Composable
fun ContentTabHome(text: String){
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            textAlign = TextAlign.Center,
            fontSize = 22.sp,
            text = "This is the $text tab. Only one button."
        )

        Button(
            modifier = Modifier.padding(16.dp),
            onClick = { /*TODO*/ }
        ) {
            Text(text = "A useless button")
        }
    }
}

@Composable
fun ContentTabNotHome(text: String){
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center,
        fontSize = 22.sp,
        text = "This is the $text tab. There are two buttons here."
    )

    Button(
        modifier = Modifier.padding(16.dp),
        onClick = { /*TODO*/ }
    ) {
        Text(text = "A useless button")
    }

    Button(
        modifier = Modifier.padding(16.dp),
        onClick = { /*TODO*/ }
    ) {
        Text(text = "Another useless button")
    }
}

@Composable
fun ContentTabSearch(text: String){
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center,
        fontSize = 22.sp,
        text = "This is the $text tab. There is no buttons here. only extra text."
    )
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center,
        fontSize = 30.sp,
        letterSpacing = 4.sp,
        text = "Extra text"
    )
}

@Composable
fun ContentTabSettings(text: String){
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center,
        fontSize = 22.sp,
        text = "This is the $text tab. This text have a different color.",
        color = Color.Red
    )
}