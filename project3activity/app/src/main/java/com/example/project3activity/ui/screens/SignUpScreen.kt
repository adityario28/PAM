package com.example.project3activity.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
//import androidx.compose.runtime.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project3activity.ui.theme.Project3activityTheme
import com.example.project3activity.R


@Composable
fun Signup(
    btnOnClickAction: (String?) -> Unit
){
    val lCOntext = LocalContext.current


    var firstnameInput by remember {
        mutableStateOf("")
    }

    var lastnameInput by remember {
        mutableStateOf("")
    }

    var usernameInput by remember {
        mutableStateOf("")
    }

    var passwordInput by remember {
        mutableStateOf("")
    }

    var confpasswordInput by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding((20.dp)),
        verticalArrangement = Arrangement.spacedBy(8.dp))
    {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            TextField(value = firstnameInput , onValueChange = {firstnameInput = it},
                label = { Text(text = stringResource(id = R.string.label_first)) },
                modifier = Modifier
                    .width(180.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            TextField(value = lastnameInput , onValueChange = {lastnameInput = it},
                label = { Text(text = stringResource(id = R.string.label_last)) },
                modifier = Modifier
                    .width(180.dp)

            )



        }
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = usernameInput,
            onValueChange = {usernameInput = it},
            label = { Text(text = stringResource(id = R.string.label_username)) }

        )

        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = passwordInput,
            onValueChange = {passwordInput = it},
            label = { Text(text = stringResource(id = R.string.label_password)) },
            visualTransformation = PasswordVisualTransformation()
        )

        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = confpasswordInput,
            onValueChange = {confpasswordInput = it},
            label = { Text(text = stringResource(id = R.string.label_conf_pass)) },
            visualTransformation = PasswordVisualTransformation()
        )


        Button(
            modifier = Modifier
                .align(alignment = Alignment.End),
//                .fillMaxWidth(),
//                .padding(25.dp),
            onClick = {
//                val isAuthenticated = doAuth(usernameInput, passwordInput)
//                if (isAuthenticated) {
//                    lCOntext.startActivity(
//                        Intent(lCOntext, HomeActivity::class.java)
//                            .apply {
//                                putExtra("username", usernameInput)
//                            }
//                    )
//                }
                btnOnClickAction(usernameInput)
            }
        ) {
            Text(text = stringResource(id = R.string.label_signup))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    Project3activityTheme {
//        Greeting2("Android")
        Signup({})
    }

}

//class SignUpScreen {
//
//
//
//}