package com.example.project7firebaseauth

import android.content.Intent
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project7firebaseauth.ui.theme.Project7firebaseAuthTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class HomeActivity : ComponentActivity() {
    private lateinit var  auth: FirebaseAuth
    var fauth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth

        setContent {
            Project7firebaseAuthTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(onClickAction = ::logout)
                }
            }
        }
    }

    private fun logout(
        name: String?
    ){

        auth.signOut()
        finish()
    }

}

@Composable
fun Greeting(onClickAction: (String) -> Unit) {
    val user = FirebaseAuth.getInstance()
    val name = user.currentUser!!
    val showname = name.email

    var nameInput by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hello $showname")
        Button(onClick = {onClickAction(nameInput)}, modifier = Modifier
            .height(60.dp)
            .fillMaxWidth()) {
            Text(text = "LOGOUT")
        }
    }


}
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    Project7firebaseAuthTheme {
//        Greeting()
//    }
//}