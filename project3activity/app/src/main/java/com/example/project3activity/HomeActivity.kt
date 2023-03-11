package com.example.project3activity

//import com.example.project3activity.ui.screens.Greeting
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.project3activity.ui.screens.BottomNavigationMainScreenView
import com.example.project3activity.ui.screens.Hero
import com.example.project3activity.ui.theme.Project3activityTheme

//import android.media.Image as Image1

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContent {
            Project3activityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    val username = getIntent().getStringExtra("username") ?: ""
//                    Greeting(username)
                    var username = getIntent().getStringExtra("username") ?: ""
                    var password = getIntent().getStringExtra("password") ?: ""
                    var firstname = getIntent().getStringExtra("firstname") ?: ""
                    var lastname = getIntent().getStringExtra("lastname") ?: ""
                    BottomNavigationMainScreenView(username, password, firstname, lastname)
                }
            }
        }
    }
}
