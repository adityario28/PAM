package com.example.project3activity

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
//import androidx.compose.ui.semantics.Role.Companion.Image
//import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project3activity.ui.theme.Project3activityTheme
//import android.media.Image as Image1

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContent {
            Project3activityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val username = getIntent().getStringExtra("username") ?: ""


                    Greeting(username.capitalize())
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun Hero() {
    val ctx = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .width(width = 380.dp)
                .height(height = 300.dp)
                .padding(
                    top = 95.dp
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.hero_news),
                contentDescription = "Hero-news-img",
                contentScale = ContentScale.Crop,
                modifier = Modifier
//                .width(width = 328.dp)
                    .fillMaxWidth()
                    .height(height = 179.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
            )
            Text(
                text = "Pasien Jamur Cordyceps Makin Bertambah",
                color = Color.White,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier
                    .padding(start = 18.dp, top = 150.dp)
            )
        }
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
//        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
//Baris pertama
        Column(

            modifier = Modifier
                .padding(top = 300.dp)
        )
        {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {
                Button(
                    onClick = {
                        Toast.makeText(ctx, "Belum dibuat gann", Toast.LENGTH_SHORT).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffd0342c)),
                    contentPadding = PaddingValues(),
                    modifier = Modifier

                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 74.dp)
                )

                {
                    Column(

                        modifier = Modifier
                            .height(200.dp)
                            .padding(horizontal = 0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.ambulancce_icon_1),
                            contentDescription = "Ambulance-icon",

                            modifier = Modifier
                                .width(width = 48.dp)
                                .height(height = 38.dp)
                        )

                        Spacer(
                            modifier = Modifier
                                .height(3.dp)
                        )


                        Text(
                            text = "Ambulance",
                            color = Color.White,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp
                        )
                    }

                }

                Button(
                    onClick = {
                        Toast.makeText(ctx, "Menu Konsultasi belum dibuat juga gann", Toast.LENGTH_SHORT).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 74.dp)
                )

                {
                    Column(

                        modifier = Modifier
                            .height(200.dp)
                            .padding(horizontal = 0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.doctor_icon_1),
                            contentDescription = "doctor-icon",
                            modifier = Modifier
                                .width(width = 48.dp)
                                .height(height = 45.dp)
                        )

                        Spacer(
                            modifier = Modifier
                                .height(0.dp)
                        )


                        Text(
                            text = "Konsultasi",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp
                        )
                    }

                }


                Button(
                    onClick = {
                        Toast.makeText(ctx, "Menu Location belum dibuat juga gann", Toast.LENGTH_SHORT).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 74.dp)
                )
                {
                    Column(

                        modifier = Modifier
                            .height(200.dp)
                            .padding(horizontal = 0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.loc_icon),
                            contentDescription = "Location-icon",
                            modifier = Modifier
                                .width(width = 48.dp)
                                .height(height = 45.dp)
                        )

                        Spacer(
                            modifier = Modifier
                                .height(0.dp)
                        )


                        Text(
                            text = "Lokasi Faskes",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp
                        )
                    }

                }

                Button(
                    onClick = {
                        Toast.makeText(ctx, "Menu Reg-JKN belum dibuat juga gann", Toast.LENGTH_SHORT).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 74.dp)
                )
                {
                    Column(

                        modifier = Modifier
                            .height(200.dp)
                            .padding(horizontal = 0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.regjkn_icon),
                            contentDescription = "Registrasi-JKN-icon",
                            modifier = Modifier
                                .width(width = 48.dp)
                                .height(height = 45.dp)
                        )

                        Spacer(
                            modifier = Modifier
                                .height(0.dp)
                        )


                        Text(
                            text = "Daftar JKN",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp
                        )
                    }
                }
            }
        }


//Baris Kedua
        Column(
        )
        {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {
                Button(
                    onClick = {
                        Toast.makeText(ctx, "Menu Informasi Peserta belum dibuat juga gann", Toast.LENGTH_SHORT).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 74.dp)
                )
                {
                    Column(

                        modifier = Modifier
                            .height(200.dp)
                            .padding(horizontal = 0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.info_icon),
                            contentDescription = "Informasi-Peserta-icon",
                            modifier = Modifier
                                .width(width = 48.dp)
                                .height(height = 38.dp)
                        )

                        Spacer(
                            modifier = Modifier
                                .height(1.dp)
                        )


                        Text(
                            text = "Informasi Peserta",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp,
                            lineHeight = 10.sp
                        )
                    }

                }

                Button(
                    onClick = {
                        Toast.makeText(ctx, "Menu Daftar Layanan belum dibuat juga gann", Toast.LENGTH_SHORT).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 74.dp)
                )

                {
                    Column(

                        modifier = Modifier
                            .height(200.dp)
                            .padding(horizontal = 0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.reglay_icon),
                            contentDescription = "Daftar-Layanan-icon",
                            modifier = Modifier
                                .width(width = 48.dp)
                                .height(height = 45.dp)
                        )

                        Spacer(
                            modifier = Modifier
                                .height(0.dp)
                        )


                        Text(
                            text = "Daftar " +
                                    "Layanan",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp,
                            lineHeight = 2.sp
                        )
                    }

                }


                Button(
                    onClick = {
                        Toast.makeText(ctx, "Menu Informasi Klinik belum dibuat juga gann", Toast.LENGTH_SHORT).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier

                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 74.dp)
                )

                {
                    Column(

                        modifier = Modifier
                            .height(200.dp)
                            .padding(horizontal = 0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.rumkit_icon),
                            contentDescription = "Informasi-Klinik-icon",
                            modifier = Modifier
                                .width(width = 48.dp)
                                .height(height = 45.dp)
                        )

                        Spacer(
                            modifier = Modifier
                                .height(1.dp)
                        )


                        Text(
                            text = "Informasi Klinik",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp
                        )
                    }
                }

                Button(
                    onClick = {
                        Toast.makeText(ctx, "Menu Lainnya apalagi", Toast.LENGTH_SHORT).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier

                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 74.dp)
                )

                {
                    Column(

                        modifier = Modifier
                            .height(200.dp)
                            .padding(horizontal = 0.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.menu_icon),
                            contentDescription = "Menu-Lainnya-icon",
                            modifier = Modifier
                                .width(width = 48.dp)
                                .height(height = 45.dp)
                        )

                        Spacer(
                            modifier = Modifier
                                .height(1.dp)
                        )


                        Text(
                            text = "Menu Lainnya",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp
                        )
               }
                }
            }
        }
    }

    //Next part start here
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 520.dp, end = 16.dp)
    ){
        Text(text = "Riwayat Aktifitas",
        color = Color.Black,
        style = TextStyle(fontSize = 22.sp,
        fontWeight = FontWeight.SemiBold),
        modifier = Modifier
            .padding(start = 8.dp)
        )

        Column(){
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF4ECB71)),
                shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth())

            {

            }
        }
        
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Project3activityTheme {
//        Greeting("Android")
        Hero()
    }
}

