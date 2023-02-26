package com.example.project3activity

import android.content.Intent
import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.gestures.ModifierLocalScrollableContainerProvider.value
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project3activity.contracts.SignUpContracts
import com.example.project3activity.ui.screens.LoginForm
import com.example.project3activity.ui.theme.Project3activityTheme

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
//                    val navController = rememberNavController()
//                    NavHost(navController = navController, startDestination = Screens.Splash) {
//                        composable(route  = Screens.Splash) {
//                            SplashScreen(navController = navController)
//                        }
//
//                        composable(route = Screens.Login) {
//                            LoginScreen(navController = navController)
//                        }
//                    }
                    SignupActivity()
                    LoginForm()
//                    Hero()
//                    BottomNavbar()
                }
            }
        }
    }
}
