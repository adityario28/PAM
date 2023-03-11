package com.example.mysplash.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.mysplash.AnimatedSplashScreen
//import com.example.mysplash.navigation.Screen
import java.security.AccessController
//
//@Composable
//fun SetupNavGraph(navController: NavHostController) {
//    NavHost(
//        navController = navController,
//        startDestination = Screen.Splash.route
//    ){
//        composable(route = Screen.Splash.route) {
//            AnimatedSplashScreen()
//        }
//        composable(route = Screen.Home.route) {
//            Box(modifier = Modifier.fillMaxSize())
//        }
//    }
//}