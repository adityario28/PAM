package com.example.mysplash

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysplash.ui.theme.Purple200
import com.example.mysplash.ui.theme.Purple700
import com.example.mysplash.R

@Composable
fun AnimatedSplashScreen(){
    Splash()
}


@Composable
fun Splash(){
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize(),
    contentAlignment = Alignment.Center){
        Icon(painter = painterResource(id = R.drawable.logo_form) , contentDescription = "Logo", modifier = Modifier.size(120.dp))
    }
    
}


@Composable
@Preview
fun SplashScreenPreview() {
    Splash()
}