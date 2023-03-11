package com.example.project3activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import com.example.project3activity.ui.screens.OtherPage
import com.example.project3activity.ui.theme.Project3activityTheme

class OtherActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project3activityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val username = getIntent().getStringExtra("username") ?: ""
//                    Greeting2("Android")
                    OtherPage(username)
                }
            }
        }
    }


}




