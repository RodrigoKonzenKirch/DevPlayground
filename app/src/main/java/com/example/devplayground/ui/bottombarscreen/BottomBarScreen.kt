package com.example.devplayground.ui.bottombarscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Composable
fun BottomBarScreen(){

    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = {
            DrawerContent()
        },
        bottomBar = {
            BottomAppBar(
                cutoutShape = MaterialTheme.shapes.small.copy(
                    CornerSize(percent = 50)
                )

            ) {

                IconButton(
                    onClick = {
                        scope.launch { scaffoldState.drawerState.open() }
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = "Open Navigation Drawer"
                    )
                }
                Text(modifier = Modifier.padding(8.dp), text = "Bottom Bar")
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    scope.launch {
                        scaffoldState.snackbarHostState.showSnackbar("FAB was tapped!")
                    }
                }
            ) {
                Text(text = "F")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true
    ) {

    }
}

@Composable
fun DrawerContent(){
    val itemsList = prepareNavigationDrawerItems()

    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.verticalGradient(
                listOf(
                    Color(0xFF004BA0),
                    Color(0xFF63A4FF)
                )
            )
        )
    ) {
        item {
            Text(text = "Menu", modifier = Modifier.padding(16.dp))
            Divider()
        }

        items(itemsList){ item ->
            NavigationListItem(item = item) {

            }
        }
    }
}

@Composable
fun NavigationListItem(
    item: NavigationDrawerItem,
    itemClick: () -> Unit
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { itemClick }
            .padding(
                horizontal = 24.dp,
                vertical = 10.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(imageVector = item.icon, contentDescription = null)
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = item.label,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )

    }

}

@Composable
fun prepareNavigationDrawerItems(): List<NavigationDrawerItem> {
    val itemsList = arrayListOf<NavigationDrawerItem>()

    itemsList.add(
        NavigationDrawerItem(
            icon = Icons.Filled.Home,
            label = "Home"
        )
    )

    itemsList.add(
        NavigationDrawerItem(
            icon = Icons.Filled.Share,
            label = "Share"
        )
    )

    itemsList.add(
        NavigationDrawerItem(
            icon = Icons.Filled.Info,
            label = "Info"
        )
    )

    itemsList.add(
        NavigationDrawerItem(
            icon = Icons.Filled.Phone,
            label = "Phone"
        )
    )

    itemsList.add(
        NavigationDrawerItem(
            icon = Icons.Filled.Search,
            label = "Search"
        )
    )
    return itemsList
}

data class NavigationDrawerItem(
    val icon: ImageVector,
    val label: String,
)