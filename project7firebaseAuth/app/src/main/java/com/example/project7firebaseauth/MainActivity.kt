package com.example.project7firebaseauth

import android.content.Intent
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project7firebaseauth.contracts.SignUpContract
import com.example.project7firebaseauth.ui.theme.Project7firebaseAuthTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : ComponentActivity() {
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
                    LoginScreen(onSignInAction = ::doAuth)
                }
            }
        }
    }
    private fun doAuth(username: String, password: String){
        auth.signInWithEmailAndPassword(username, password).addOnCompleteListener(this) {
            task ->
            if (task.isSuccessful){
                startActivity(
                    Intent(this, HomeActivity::class.java)
                )

                finish()
            }
            else {
                Toast.makeText(applicationContext, "Auth Failed", Toast.LENGTH_SHORT).show()
            }

        }
    }
}

@Composable
fun LoginScreen(
    onSignInAction: (String, String) -> Unit
){
    var usernameInput by remember { mutableStateOf("")}
    var passwordInput by remember { mutableStateOf("") }

    var getUsernameFromSignUp = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { username ->
            {usernameInput = username!!}
        }
    )

    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize()) {
        Column(modifier = Modifier.fillMaxWidth()) {
            TextField(value = usernameInput, onValueChange = {usernameInput = it}, label = { Text(text = "Insert Username")}, modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(8.dp))

            TextField(value = passwordInput, onValueChange = {passwordInput = it}, label = { Text(text = "Insert Password")}, modifier = Modifier.fillMaxWidth() ,visualTransformation = PasswordVisualTransformation())


            Spacer(modifier = Modifier.height(12.dp))
            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = { onSignInAction(usernameInput, passwordInput)}) {
                    Text(text = "Sign in")
                }
                
                Spacer(modifier = Modifier.width(12.dp))

                Button(onClick = { getUsernameFromSignUp.launch("")}) {
                    Text(text = "Sign Up")
                }
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun prevLogin(){
//    LoginScreen()
}
