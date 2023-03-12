package com.example.project3activity.ui.screens


import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Face
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project3activity.HomeActivity
import com.example.project3activity.R
import com.example.project3activity.ui.theme.Project3activityTheme

@Composable
fun RegJKN() {
    val lCOntext = LocalContext.current

    var userId by remember {
        mutableStateOf("")
    }

    var usernameInput by remember {
        mutableStateOf("")
    }

    var passwordInput by remember {
        mutableStateOf("")
    }

    LaunchedEffect(
        Unit,
        block = {
//            vm.getUserList()
        }
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.pattern),
            contentDescription = "pattern",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(bottom = 80.dp)
                .width(width = 400.dp)
                .height(height = 85.dp)
        )
    }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 120.dp),
    ) {
        Text(
            text = stringResource(id = R.string.label_icon4),
            color = Color.Black,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ),
        )
    }


    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize()
            .fillMaxHeight()
    ) {


        TextButton(
            onClick = {
                lCOntext.startActivity(
                    Intent(lCOntext, HomeActivity::class.java)
                )
            },
            modifier = Modifier.padding(start = 20.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.other_back),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)

            )
        }



        Column(
            modifier = Modifier
//            .fillMaxSize()
                .padding((20.dp)),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        )
        {

            OutlinedTextField(
                shape = CircleShape,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    focusedBorderColor = colorResource(id = R.color.bg_splash),
                    unfocusedBorderColor = Color.Gray,
//                disabledIndicatorColor = Color.Transparent
                ),
//            draw
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Rounded.Face,
                        contentDescription = "icon email"
                    )
                },
                modifier = Modifier
                    .fillMaxWidth(),
                value = usernameInput,
                onValueChange = { usernameInput = it },
                label = {
                    Text(
                        text = stringResource(id = R.string.label_reg1),
                        style = TextStyle(
                            color = colorResource(id = R.color.bg_splash),
                            fontSize = 16.sp
                        )
                    )
                }

            )


            OutlinedTextField(
                shape = CircleShape,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    focusedBorderColor = colorResource(id = R.color.bg_splash),
                    unfocusedBorderColor = Color.Gray,
//                disabledIndicatorColor = Color.Transparent
                ),
//            draw
                trailingIcon = {
                    Icon(imageVector = Icons.Rounded.Face, contentDescription = "icon email")
                },
                modifier = Modifier
                    .fillMaxWidth(),
                value = passwordInput,
                onValueChange = { passwordInput = it },
                label = {
                    Text(
                        text = stringResource(id = R.string.label_reg2),
                        style = TextStyle(
                            color = colorResource(id = R.color.bg_splash),
                            fontSize = 16.sp
                        )
                    )
                }
            )



            OutlinedTextField(
                shape = CircleShape,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    focusedBorderColor = colorResource(id = R.color.bg_splash),
                    unfocusedBorderColor = Color.Gray,
//                disabledIndicatorColor = Color.Transparent
                ),
//            draw
                trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.info_pes_nik),
                        modifier = Modifier.size(25.dp),
                        contentDescription = "Key password"
                    )
                },
                modifier = Modifier
                    .fillMaxWidth(),
                value = passwordInput,
                onValueChange = { passwordInput = it },
                label = {
                    Text(
                        text = stringResource(id = R.string.label_reg3),
                        style = TextStyle(
                            color = colorResource(id = R.color.bg_splash),
                            fontSize = 16.sp
                        )
                    )
                }
            )


            OutlinedTextField(
                shape = CircleShape,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    focusedBorderColor = colorResource(id = R.color.bg_splash),
                    unfocusedBorderColor = Color.Gray,
//                disabledIndicatorColor = Color.Transparent
                ),
//            draw
                trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.info_pes_date),
                        modifier = Modifier.size(25.dp),
                        contentDescription = "Key password"
                    )
                },
                modifier = Modifier
                    .fillMaxWidth(),
                value = passwordInput,
                onValueChange = { passwordInput = it },
                label = {
                    Text(
                        text = stringResource(id = R.string.label_reg5),
                        style = TextStyle(
                            color = colorResource(id = R.color.bg_splash),
                            fontSize = 16.sp
                        )
                    )
                }
            )


            OutlinedTextField(
                shape = CircleShape,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.Black,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.Transparent,
                    focusedBorderColor = colorResource(id = R.color.bg_splash),
                    unfocusedBorderColor = Color.Gray,
//                disabledIndicatorColor = Color.Transparent
                ),
//            draw
                trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.info_pes_loc),
                        modifier = Modifier.size(25.dp),
                        contentDescription = "Key password"
                    )
                },
                modifier = Modifier
                    .fillMaxWidth(),
                value = passwordInput,
                onValueChange = { passwordInput = it },
                label = {
                    Text(
                        text = stringResource(id = R.string.label_reg6),
                        style = TextStyle(
                            color = colorResource(id = R.color.bg_splash),
                            fontSize = 16.sp
                        )
                    )
                }
            )


            Spacer(modifier = Modifier.height(12.dp))
            
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
//            modifier = Modifier
//                .fillMaxWidth()

//                .align(alignment = Alignment.CenterHorizontally)
            ) {
//                var auth = false
//                for (index in vm.userList) {
//                    if (index.username == usernameInput && index.password == passwordInput) {
//                        auth = true
//                        userId = index.userId.toString()
//                    }
//                }

                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.bg_splash)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(58.dp),
//                .padding(25.dp),
//                    .width(12.dp)
                    onClick = {
//                        if (auth) {
//                            lContext.startActivity(
//                                Intent(lContext, HomeActivity::class.java)
//                                    .putExtra("userId", userId)
//                            )
//                        }
//                        else {
//                            Toast.makeText(lContext, "Password atau Username salah", Toast.LENGTH_SHORT).show()
//                        }
                    }
                ) {
                    Text(
                        text = stringResource(id = R.string.label_login),
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        ),
                        color = Color.White
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))


            }


        }
    }
}





@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    Project3activityTheme {
        RegJKN()
    }
}