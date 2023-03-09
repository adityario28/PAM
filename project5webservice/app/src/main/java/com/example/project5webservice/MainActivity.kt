package com.example.project5webservice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.project5webservice.models.TodosViewModel
import com.example.project5webservice.ui.theme.Project5webserviceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val vm = TodosViewModel()
        super.onCreate(savedInstanceState)
        setContent {
            Project5webserviceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreenView(vm)
                }
            }
        }
    }
}

@Composable
fun MainScreenView(
    vm: TodosViewModel
) {
    LaunchedEffect(
        Unit,
        block = {
            vm.getToDoList()
        }
    )

    Column {
        if (vm.errorMessage.isEmpty()) {
            LazyColumn(modifier = Modifier.padding(10.dp)) {
                items(vm.toDoList.size) {
                    index -> Text(text = vm.toDoList[index].title)

                }
            }
        }
        else {
            Text(text = vm.errorMessage)
        }
    }

}


