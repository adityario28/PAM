package com.example.project3activity.ui.screens

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Face
import androidx.compose.runtime.*
//import androidx.compose.runtime.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project3activity.MainActivity
import com.example.project3activity.ui.theme.Project3activityTheme
import com.example.project3activity.R


@Composable
fun Signup(
    btnOnClickAction: (String) -> Unit
){
    val lContext = LocalContext.current




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

        Column(
            modifier = Modifier
                .padding(top = 100.dp)
                .align(Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.Center
//        horizontalAlignment =  Alignment.CenterHorizontally
        ){
            Image(painter = painterResource(id = R.drawable.logo_form),
                contentDescription = "Main Logo Form",
                modifier = Modifier
                    .size(154.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = stringResource(id = R.string.welcome_signup),
                color = Color.Black,
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
        }
    
        Spacer(modifier = Modifier.height(8.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            OutlinedTextField(
                value = firstnameInput ,
                onValueChange = {firstnameInput = it},
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    focusedBorderColor = colorResource(id = R.color.bg_splash),
                    unfocusedBorderColor = Color.Gray,

//                disabledIndicatorColor = Color.Transparent
                ),
                label = { Text(text = stringResource(id = R.string.label_first),
                    style = TextStyle(
                        color = colorResource(id = R.color.bg_splash),
                        fontSize = 16.sp
                    )) },
                modifier = Modifier
                    .width(180.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            OutlinedTextField(value = lastnameInput , onValueChange = {lastnameInput = it},
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    focusedBorderColor = colorResource(id = R.color.bg_splash),
                    unfocusedBorderColor = Color.Gray,
//                disabledIndicatorColor = Color.Transparent
                ),
                label = { Text(text = stringResource(id = R.string.label_last),
                    style = TextStyle(
                        color = colorResource(id = R.color.bg_splash),
                        fontSize = 16.sp
                    )) },
                modifier = Modifier
                    .width(180.dp)

            )



        }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = usernameInput,
            onValueChange = {usernameInput = it},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color.Black,
                disabledTextColor = Color.Transparent,
                backgroundColor = Color.Transparent,
                focusedBorderColor = colorResource(id = R.color.bg_splash),
                unfocusedBorderColor = Color.Gray,
//                disabledIndicatorColor = Color.Transparent
            ),
            trailingIcon = { Icon(imageVector = Icons.Rounded.Face, contentDescription = "icon username") },
            label = { Text(text = stringResource(id = R.string.label_username),
                style = TextStyle(
                    color = colorResource(id = R.color.bg_splash),
                    fontSize = 16.sp
                )) }

        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = passwordInput,
            onValueChange = {passwordInput = it},
            trailingIcon = { Icon(painter = painterResource(id = R.drawable.key_form), contentDescription = "Key password") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color.Black,
                disabledTextColor = Color.Transparent,
                backgroundColor = Color.Transparent,
                focusedBorderColor = colorResource(id = R.color.bg_splash),
                unfocusedBorderColor = Color.Gray,
//                disabledIndicatorColor = Color.Transparent
            ),
            label = { Text(text = stringResource(id = R.string.label_password),
                style = TextStyle(
                    color = colorResource(id = R.color.bg_splash),
                    fontSize = 16.sp
                )) },
            visualTransformation = PasswordVisualTransformation()
        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = confpasswordInput,
            onValueChange = {confpasswordInput = it},
            trailingIcon = { Icon(painter = painterResource(id = R.drawable.key_form), contentDescription = "Key password") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color.Black,
                disabledTextColor = Color.Transparent,
                backgroundColor = Color.Transparent,
                focusedBorderColor = colorResource(id = R.color.bg_splash),
                unfocusedBorderColor = Color.Gray,
//                disabledIndicatorColor = Color.Transparent
            ),
            label = { Text(text = stringResource(id = R.string.label_conf_pass),
                style = TextStyle(
                    color = colorResource(id = R.color.bg_splash),
                    fontSize = 16.sp
                )) },
            visualTransformation = PasswordVisualTransformation()
        )


        Button(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .size(58.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.bg_splash)),
            shape = RoundedCornerShape(8.dp),
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
                lContext.startActivity(
                    Intent(lContext, MainActivity::class.java))
                btnOnClickAction(usernameInput)
            }
        ) {
            Text(text = stringResource(id = R.string.label_signup),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                color = Color.White)
        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview2() {
//    Project3activityTheme {
////        Greeting2("Android")
//        Signup({})
//    }
//
//}

//class SignUpScreen {
//
//
//
//}