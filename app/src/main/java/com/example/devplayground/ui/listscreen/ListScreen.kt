package com.example.devplayground.ui.listscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListItem(title: String, description: String){
    Column {
        Text(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            letterSpacing = 2.sp,
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            text = title
        )
        Text(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            textAlign = TextAlign.Center,
            text = description)

    }
}

@Composable
fun ListScreen(){
    val viewModel = ListScreenViewModel()
    val listItemsContent = viewModel.listScreenContent

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(listItemsContent) {item ->
            ListItem(title = item.title, description = item.description)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ListItemPreview() {
    ListItem(title = "Title", description = "Description" )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ListScreen()
}
