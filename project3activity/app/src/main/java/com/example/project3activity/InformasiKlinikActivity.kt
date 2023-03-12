package com.example.project3activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import com.example.project3activity.models.JknUserViewModel
import com.example.project3activity.ui.screens.InformasiKlinikScreen
import com.example.project3activity.ui.theme.Project3activityTheme

class InformasiKlinikActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val vm = JknUserViewModel()
        super.onCreate(savedInstanceState)
        setContent {
            Project3activityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting2("Android")
                    val userId = getIntent().getStringExtra("userId") ?: ""
                    InformasiKlinikScreen(vm, userId)
                }
            }
        }
    }


}




