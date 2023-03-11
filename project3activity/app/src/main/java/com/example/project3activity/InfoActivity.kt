package com.example.project3activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import com.example.project3activity.ui.screens.InfoPeserta
import com.example.project3activity.ui.theme.Project3activityTheme

class InfoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project3activityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    var username = getIntent().getStringExtra("username") ?: ""
                    var password = getIntent().getStringExtra("password") ?: ""
                    var firstname = getIntent().getStringExtra("firstname") ?: ""
                    var lastname = getIntent().getStringExtra("lastname") ?: ""
//                    Greeting2("Android")
                    InfoPeserta(username, password, firstname, lastname)
                }
            }
        }
    }


}


