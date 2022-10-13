package com.example.devplayground.data

object repository {

    operator fun invoke(): repository {
        return this
    }

    // Content for ListScreen
    data class Content(
        val title: String = "",
        val description: String = ""
    )

    private val listContent = listOf(
        Content("Title 1", "This is a description"),
        Content("Title 2", "This is another description"),
        Content("Title 3", "This is yet another description"),
        Content("Title 4", "This item is here to make the list longer"),
        Content("Title 5", "This item is here to make the list longer"),
        Content("Title 6", "This item is here to make the list longer"),
        Content("Title 7", "This item is here to make the list longer"),
        Content("Title 8", "This item is here to make the list longer"),
        Content("Title 9", "This item is here to make the list longer"),
        Content("Title 10", "This item is here to make the list longer"),
        Content("Title 11", "This item is here to make the list longer"),
        Content("Title 12", "This item is here to make the list longer"),
        Content("Title 13", "This item is here to make the list longer"),
        Content("Title 14", "This item is here to make the list longer"),
        Content("Title 15", "This item is here to make the list longer"),
        Content("Title 16", "This item is here to make the list longer"),
        Content("Title 17", "This item is here to make the list longer"),
        Content("Title 18", "This item is here to make the list longer"),
        Content("Title 19", "This item is here to make the list longer"),
        Content("Title 20", "This item is probably the last one")

    )

    fun getListScreenContent(): List<Content>{
        return listContent
    }

}