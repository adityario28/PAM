package com.example.project3activity.ui.screens


import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project3activity.HomeActivity
import com.example.project3activity.R
import com.example.project3activity.ui.theme.Project3activityTheme

@Composable
fun InfoPeserta(){
    val lCOntext = LocalContext.current


    Column (
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .fillMaxWidth()
    ){
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

    val button_big = Modifier
        .size(width = 315.dp, height = 100.dp)
        .defaultMinSize(1.dp, minHeight = 1.dp)
        .shadow(4.dp, shape = RoundedCornerShape(8.dp))

    val button = Modifier
        .size(width = 150.dp, height = 100.dp)
        .shadow(4.dp, shape = RoundedCornerShape(20.dp))
        .defaultMinSize(1.dp, minHeight = 1.dp)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 120.dp),
    ) {
        Text(
            text = "Informasi Peserta",
            color = Color.Black,
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            ),
        )
    }

    Column(modifier = Modifier
        .padding(top = 100.dp)
        .fillMaxSize()
        .fillMaxHeight()) {

        /*tombol kembali*/
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
                .padding(top = 35.dp)
                .fillMaxSize()
                .fillMaxHeight()
        ) {


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {

//                image
                Image(
                    painter = painterResource(R.drawable.other_2),
                    contentDescription = "avatar",
                    contentScale = ContentScale.Fit,            // crop the image if it's not a square
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)                       // clip to the circle shape
                        .border(5.dp, Color.Gray, CircleShape)   // add a border (optional)
                )

//                Konten
                Column() {

                    Column(modifier = Modifier
                        .padding(top = 15.dp)
                        .shadow(
                            elevation = 2.dp,
                            shape = RoundedCornerShape(20.dp)
                        )
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .size(height = 80.dp, width = 370.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(color = Color.White)
                                    .padding(start = 20.dp)
                            ) {
                                Row (modifier = Modifier.align(Alignment.CenterStart)) {
                                    Icon(
                                        imageVector = Icons.Rounded.Face,
                                        contentDescription = "icon email"
                                    )
                                }
                                Row (modifier = Modifier
                                    .padding(start = 40.dp)
                                    .align(Alignment.CenterStart)) {
                                    Column () {
                                        Column {
                                            Text(text = "Nama Depan", style = MaterialTheme.typography.overline)
                                        }
                                        Column {
                                            Text(text = "firstname", style = MaterialTheme.typography.subtitle2)
                                        }
                                    }
                                }

                            }
                        }
                    }

                    Column(modifier = Modifier
                        .padding(top = 15.dp)
                        .shadow(
                            elevation = 2.dp,
                            shape = RoundedCornerShape(20.dp)
                        )
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .size(height = 80.dp, width = 370.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(color = Color.White)
                                    .padding(start = 20.dp)
                            ) {
                                Row (modifier = Modifier.align(Alignment.CenterStart)) {
                                    Icon(
                                        imageVector = Icons.Rounded.Face,
                                        contentDescription = "icon email"
                                    )
                                }
                                Row (modifier = Modifier
                                    .padding(start = 40.dp)
                                    .align(Alignment.CenterStart)) {
                                    Column () {
                                        Column {
                                            Text(text = "Last Name", style = MaterialTheme.typography.overline)
                                        }
                                        Column {
                                            Text(text = "lastname", style = MaterialTheme.typography.subtitle2)
                                        }
                                    }
                                }

                            }
                        }
                    }

                    Column(modifier = Modifier
                        .padding(top = 15.dp)
                        .shadow(
                            elevation = 2.dp,
                            shape = RoundedCornerShape(20.dp)
                        )
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .size(height = 80.dp, width = 370.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(color = Color.White)
                                    .padding(start = 20.dp)
                            ) {
                                Row (modifier = Modifier.align(Alignment.CenterStart)) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.key_form),
                                        contentDescription = "Key password"
                                    )
                                }
                                Row (modifier = Modifier
                                    .padding(start = 40.dp)
                                    .align(Alignment.CenterStart)) {
                                    Column () {
                                        Column {
                                            Text(text = "NIK", style = MaterialTheme.typography.overline)
                                        }
                                        Column {
                                            Text(text = "2340050420109623", style = MaterialTheme.typography.subtitle2,)
                                        }
                                    }
                                }

                            }
                        }
                    }

                    Column(modifier = Modifier
                        .padding(top = 15.dp)
                        .shadow(
                            elevation = 2.dp,
                            shape = RoundedCornerShape(20.dp)
                        )
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .size(height = 80.dp, width = 370.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(color = Color.White)
                                    .padding(start = 20.dp)
                            ) {
                                Row (modifier = Modifier.align(Alignment.CenterStart)) {
                                    Icon(
                                        imageVector = Icons.Rounded.Face,
                                        contentDescription = "icon email"
                                    )
                                }
                                Row (modifier = Modifier
                                    .padding(start = 40.dp)
                                    .align(Alignment.CenterStart)) {
                                    Column () {
                                        Column {
                                            Text(text = "Tanggal Lahir", style = MaterialTheme.typography.overline)
                                        }
                                        Column {
                                            Text(text = "18 September 2001", style = MaterialTheme.typography.subtitle2)
                                        }
                                    }
                                }

                            }
                        }
                    }

                    Column(modifier = Modifier
                        .padding(top = 15.dp)
                        .shadow(
                            elevation = 2.dp,
                            shape = RoundedCornerShape(20.dp)
                        )
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .size(height = 80.dp, width = 370.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(color = Color.White)
                                    .padding(start = 20.dp)
                            ) {
                                Row (modifier = Modifier.align(Alignment.CenterStart)) {
                                    Icon(
                                        imageVector = Icons.Rounded.Face,
                                        contentDescription = "icon email"
                                    )
                                }
                                Row (modifier = Modifier
                                    .padding(start = 40.dp)
                                    .align(Alignment.CenterStart)) {
                                    Column () {
                                        Column {
                                            Text(text = "Alamat Rumah", style = MaterialTheme.typography.overline)
                                        }
                                        Column {
                                            Text(text = "Jalan Mana Saja, Surabaya", style = MaterialTheme.typography.subtitle2)
                                        }
                                    }
                                }

                            }
                        }
                    }

                }


            }
        }
    }
}




//@Preview(showBackground = true)
//@Composable
//fun PreviewProfile2() {
//    Project3activityTheme {
////        Greeting2("Android")
////        OtherPage()
//        InfoPeserta(username = "so", password = "mad" , firstname = "oh" , lastname = "as")
//    }
//
//}