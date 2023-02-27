package com.example.project3activity.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItems(
        var title: String,
        var icon: ImageVector,
        val screen_route: String
){
        object Home: BottomNavItems("Home", Icons.Filled.Home, "home")
        object Article: BottomNavItems("Article", Icons.Filled.Info, "article")
        object Profile: BottomNavItems("Profile", Icons.Filled.Person, "profile")

}