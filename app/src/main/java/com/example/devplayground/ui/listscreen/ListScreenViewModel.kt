package com.example.devplayground.ui.listscreen

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.devplayground.data.repository

class ListScreenViewModel: ViewModel() {

    private val repo = repository()

    val listScreenContent = repo.getListScreenContent().toMutableStateList()
}