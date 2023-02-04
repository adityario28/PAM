package com.example.project2compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project2compose.ui.theme.Project2composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project2composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                    LoginField()
                }
            }
        }
    }
}


@Composable
fun LoginField(){
    var username by remember { mutableStateOf("Username") }
    var password by remember { mutableStateOf("Password") }

    Column() {
        Greeting("Android")

        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") },
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("password") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.fillMaxWidth() {
        Text(text = "Hello $name!")
    }
    )

}

@Preview(showBackground = true)


@Composable
fun DefaultPreview() {
    Project2composeTheme {
//        Greeting("Android")
        LoginField()
    }
}