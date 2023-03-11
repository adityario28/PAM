package com.example.project3activity

//import androidx.compose.foundation.gestures.ModifierLocalScrollableContainerProvider.value
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.project3activity.ui.screens.LoginForm
import com.example.project3activity.ui.screens.navigation
import com.example.project3activity.ui.theme.Project3activityTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
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
                    val password = getIntent().getStringExtra("password") ?: ""
                    val firstname = getIntent().getStringExtra("firstname") ?: ""
                    val lastname = getIntent().getStringExtra("lastname") ?: ""
                    LoginForm(username, password, firstname, lastname)
                }
            }
        }
    }
}
