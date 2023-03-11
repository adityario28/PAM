package com.example.project3activity.ui.screens


import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
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
fun OtherPage(){
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
            text = "Menu Lainya",
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
                .padding(top = 5.dp)
                .fillMaxSize()
                .fillMaxHeight()
        ) {


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {

                Row() {
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        val a4 = Modifier
                            .size(50.dp)
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = button_big,
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffffffff)),

                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxWidth()) {
                                Image(
                                    painter = painterResource(id = R.drawable.other_bed),
                                    contentDescription = null,
                                    modifier = a4
                                )
                                Text(
                                    text = "Info Ketersediaan Tempat Tidur",
                                    style = MaterialTheme.typography.caption,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.padding(top = 2.dp)
                                )
                            }
                        }

                    }

                }

                Row() {
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        val a4 = Modifier
                            .size(50.dp)
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = button_big,
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffffffff)),

                            ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.other_2),
                                    contentDescription = null,
                                    modifier = a4
                                )
                                Text(
                                    text = "Info Jadwal Tindakan Operasi",
                                    style = MaterialTheme.typography.caption,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.padding(top = 2.dp)
                                )
                            }
                        }

                    }

                }

                Row() {
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        val a4 = Modifier
                            .size(50.dp)
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = button,
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffffffff)),

                            ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxWidth()) {
                                Image(
                                    painter = painterResource(id = R.drawable.other_3),
                                    contentDescription = null,
                                    modifier = a4
                                )
                                Text(
                                    text = "Info Riwayat Pelayanan",
                                    style = MaterialTheme.typography.caption,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.padding(top = 2.dp)
                                )
                            }
                        }

                    }

                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp, start = 15.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        val a4 = Modifier
                            .size(50.dp)
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = button,
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffffffff)),

                            ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.other_bed),
                                    contentDescription = null,
                                    modifier = a4
                                )
                                Text(
                                    text = "Skrining Mandiri Covid-19",
                                    style = MaterialTheme.typography.caption,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.padding(top = 2.dp)
                                )
                            }
                        }

                    }

                }

                Row() {
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        val a4 = Modifier
                            .size(50.dp)
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = button,
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffffffff)),

                            ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.other_bed),
                                    contentDescription = null,
                                    modifier = a4
                                )
                                Text(
                                    text = "Pentaftaran Auto Debit",
                                    style = MaterialTheme.typography.caption,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.padding(top = 2.dp)
                                )
                            }
                        }

                    }

                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp, start = 15.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        val a4 = Modifier
                            .size(50.dp)
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = button,
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffffffff)),

                            ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.other_bed),
                                    contentDescription = null,
                                    modifier = a4
                                )
                                Text(
                                    text = "Info Riwayat Pembayaran",
                                    style = MaterialTheme.typography.caption,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.padding(top = 2.dp)
                                )
                            }
                        }

                    }

                }
            }
        }
        }
}


@Preview(showBackground = true)
@Composable
fun PreviewProfile() {
    Project3activityTheme {
//        Greeting2("Android")
        OtherPage()
    }

}