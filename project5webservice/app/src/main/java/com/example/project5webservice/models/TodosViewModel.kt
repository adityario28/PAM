package com.example.project5webservice.models

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project5webservice.repositories.JSONPlaceholderTypicodeRepository
import kotlinx.coroutines.launch

class TodosViewModel :  ViewModel(){
    private var _toDOList = mutableStateListOf<TodosModel>()

    var errorMessage: String by mutableStateOf("")
    val toDoList: List<TodosModel>
        get() = _toDOList

    fun getToDoList() {
        viewModelScope.launch {
            val apiClient = JSONPlaceholderTypicodeRepository.getClient()
            try {
                _toDOList.clear()
                _toDOList.addAll(apiClient.getTodos())
            }
            catch (e: Exception) {
                errorMessage = e.message!!
            }
        }
    }

}