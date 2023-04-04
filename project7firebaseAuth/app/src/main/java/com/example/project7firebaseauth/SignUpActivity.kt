package com.example.project7firebaseauth

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project7firebaseauth.ui.theme.Project7firebaseAuthTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SIgnUpActivity : ComponentActivity() {
    private lateinit var  auth: FirebaseAuth

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
                    SignUpScreen(onClickAction = ::sendUsernameBackToLoginPage)
                }
            }
        }
    }

    private fun sendUsernameBackToLoginPage(
        nama: String?,
        username: String?,
        password: String?,
        cpassword: String?
    ) {

        auth.createUserWithEmailAndPassword(username!!, password!!)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    val result = Intent().putExtra("username", username)

                    setResult(Activity.RESULT_OK, result)
                    finish()
                }
                else {
                    Toast.makeText(applicationContext, "Error Create User", Toast.LENGTH_SHORT).show()
                }
            }
    }
}

@Composable
fun SignUpScreen(
    onClickAction: (String, String, String, String) -> Unit
) {
    val lContext = LocalContext.current
    var nameInput by remember { mutableStateOf("")}
    var usernameInput by remember { mutableStateOf("")}
    var passwordInput by remember { mutableStateOf("")}
    var repasswordInput by remember { mutableStateOf("")}

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Column() {

            TextField(value = nameInput, onValueChange = {nameInput = it}, modifier = Modifier.fillMaxWidth(), label = { Text(
                text = "Name"
            )})

            Spacer(modifier = Modifier.height(8.dp))
            
            TextField(value = usernameInput, onValueChange = {usernameInput = it}, modifier = Modifier.fillMaxWidth(), label = { Text(
                text = "Username"
            )})

            Spacer(modifier = Modifier.height(8.dp))
            
            TextField(value = passwordInput, onValueChange = {passwordInput = it}, label = { Text(
                text = "Password"
            )} ,visualTransformation = PasswordVisualTransformation(), modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(8.dp))

            TextField(value = repasswordInput, onValueChange = {repasswordInput = it}, label = { Text(
                text = "Confirm Password"
            )} ,visualTransformation = PasswordVisualTransformation(), modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(12.dp))

            Button(onClick = {if (!passwordInput.equals(repasswordInput)){
                Toast.makeText(lContext, "Password do not match", Toast.LENGTH_SHORT).show()
            }
                else{
                onClickAction(nameInput, usernameInput, passwordInput, repasswordInput)
                } }, modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)) {
                Text(text = "Sign Up")
            }


        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun PrevSignUp(){
//    SignUpScreen()
//}

