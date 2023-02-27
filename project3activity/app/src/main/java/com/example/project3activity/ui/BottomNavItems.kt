package com.example.project3activity.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItems(
        var title: String,
        var icon: ImageVector,
        val screen_route: String
){
        object Home: BottomNavItems("Home", Icons.Default.Home, "home")
        object Article: BottomNavItems("Article", Icons.Default.MoreVert, "article")
        object Profile: BottomNavItems("Profile", Icons.Default.Person, "profile")

}