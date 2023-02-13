package com.example.project3activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
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
                    SignupActivity()
                    LoginForm()
                }
            }
        }
    }
}

internal fun doAuth(username: String, password:String): Boolean {
    return(username.equals("admin") && password.equals("admin"))
}

@Composable
fun LoginForm() {
    val lCOntext = LocalContext.current

    var usernameInput by remember {
        mutableStateOf("")
    }

    var passwordInput by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding((20.dp)),
        verticalArrangement = Arrangement.spacedBy(8.dp))
    {
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = usernameInput,
            onValueChange = {usernameInput = it},
            label = {Text(text = stringResource(id = R.string.label_username))}

        )
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = passwordInput,
            onValueChange = {passwordInput = it},
            label = {Text(text = stringResource(id = R.string.label_password)) },
            visualTransformation = PasswordVisualTransformation()
        )
        Row(
            modifier = Modifier
//                .fillMaxWidth()
                .align(alignment = Alignment.End)
        ) {
            
            Button(
                modifier = Modifier
//                    .align(alignment = Alignment.End),
//                .fillMaxWidth(),
//                .padding(25.dp),
                ,onClick = {
                        lCOntext.startActivity(
                            Intent(lCOntext, SignupActivity::class.java)
                        )
                    }
            ) {
                Text(text = stringResource(id = R.string.label_signup))
            }
            
            Spacer(modifier = Modifier.width(8.dp))
            
            Button(
                modifier = Modifier
//                    .fillMaxWidth(),
//                .padding(25.dp),
                        ,
                onClick = {
                    val isAuthenticated = doAuth(usernameInput, passwordInput)
                    if (isAuthenticated) {
                        lCOntext.startActivity(
                            Intent(lCOntext, HomeActivity::class.java)
                                .apply {
                                    putExtra("username", usernameInput)
                                }
                        )
                    }
                }
            ) {
                Text(text = stringResource(id = R.string.label_login))
            }



        }


    }
}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    Project3activityTheme() {
        LoginForm()
    }
}