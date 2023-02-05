package com.example.project3activity

import android.content.Intent.getIntent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Space
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.BoxScopeInstance.matchParentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.Role.Companion.Image
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


                    Greeting(username)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hi,",
        style = TextStyle(
            fontSize = 18.sp
        ),
    modifier = Modifier
        .padding(start = 16.dp, top = 83.dp))
    Text(text = "$name",
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        ),
        modifier = Modifier
            .padding(start = 16.dp, top = 104.dp))
}

@Composable
fun Hero() {
//    val username = getIntent().getStringExtra("username") ?: ""
    val ctx = LocalContext.current
//    Column(modifier = Modifier
//        .padding(start = 16.dp, top = 80.dp)) {
//        Text(text = "Hi, Brando Bocil")
////        Greeting(username)
//    }

    Image(
        painter = painterResource(id = R.drawable.pattern),
        contentDescription = "pattern",
        contentScale = ContentScale.Crop,
        modifier = Modifier
//                .width(width = 528.dp)
//            .fillMaxWidth()
//                    .fillMaxSize()
            .padding(bottom = 80.dp)
            .width(width = 400.dp)
            .height(height = 85.dp)
//            .clip(shape = RoundedCornerShape(30.dp)
            )
Column(modifier = Modifier.padding(start = 320.dp, top = 26.dp)) {
    Image(painter = painterResource(id = R.drawable.ava), contentDescription = "avatar",
        modifier = Modifier
            .size(58.dp)
//            .padding(start = 70.dp)
    )
}

//    Button(onClick = { /*TODO*/ }) {
//
//    }


    Column(
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 130.dp)
    ) {
        Box(
            modifier = Modifier
                .width(width = 400.dp)
                .height(height = 300.dp)
//                .padding(
//                    top = 95.dp
//                )
        ) {
            Image(

                painter = painterResource(id = R.drawable.hero_news),
                contentDescription = "Hero-news-img",
                contentScale = ContentScale.Crop,
                modifier = Modifier
//                .width(width = 528.dp)
                    .fillMaxWidth()
//                    .fillMaxSize()
                    .height(height = 190.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
            )
            Text(
                text = "Pasien Jamur Cordyceps Makin Bertambah",
                color = Color.White,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier
                    .padding(start = 19.dp, top = 157.dp)
            )
        }
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
//        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
//Baris pertama
        Column(

            modifier = Modifier
                .padding(top = 330.dp)
        )
        {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
//                    .padding(8.dp)

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
                        .size(size = 80.dp)
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
                        Toast.makeText(
                            ctx,
                            "Menu Konsultasi belum dibuat juga gann",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 80.dp)
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
                        Toast.makeText(
                            ctx,
                            "Menu Location belum dibuat juga gann",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 80.dp)
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
                        Toast.makeText(
                            ctx,
                            "Menu Reg-JKN belum dibuat juga gann",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 80.dp)
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
//                    .padding(8.dp)

            ) {
                Button(
                    onClick = {
                        Toast.makeText(
                            ctx,
                            "Menu Informasi Peserta belum dibuat juga gann",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 80.dp)
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
                                .width(width = 50.dp)
                                .height(height = 38.dp)
                        )

                        Spacer(
                            modifier = Modifier
                                .height(2.dp)
                        )


                        Text(
                            text = "Informasi  Peserta",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp,
                            lineHeight = 11.sp,
                            modifier = Modifier
                                .padding(top = 2.dp)
                        )
                    }

                }

                Button(
                    onClick = {
                        Toast.makeText(
                            ctx,
                            "Menu Daftar Layanan belum dibuat juga gann",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 80.dp)
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
                            text = "Daftar" + "      " +
                                    "Layanan",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp,
                            lineHeight = 11.sp
                        )
                    }

                }


                Button(
                    onClick = {
                        Toast.makeText(
                            ctx,
                            "Menu Informasi Klinik belum dibuat juga gann",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    contentPadding = PaddingValues(),
                    modifier = Modifier

                        .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                        .defaultMinSize(1.dp, minHeight = 1.dp)
                        .size(size = 80.dp)
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
                            text = "Informasi" + "      " + "Klinik",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp,
                            lineHeight = 11.sp
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
                        .size(size = 80.dp)
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
                                .height(0.dp)
                        )


                        Text(
                            text = "Menu" + "         " + "Lainnya",
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp,
                            lineHeight = 11.sp
                        )
                    }
                }
            }
        }
    }



    //Next part start here
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
//            .fillMaxWidth()
            .padding(start = 16.dp, top = 535.dp, end = 16.dp)
    ) {
        Text(
            text = "Riwayat Aktifitas",
            color = Color.Black,
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Start
            )
        )

//        Box(modifier = Modifier.background(Image(asset = ImageAsset)))

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF4ECB71)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .fillMaxWidth()
                    .height(108.dp),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 20.dp,
                    pressedElevation = 15.dp,
                    disabledElevation = 0.dp,
                    hoveredElevation = 15.dp,
                    focusedElevation = 10.dp
                )
            )
            {
//                Image(painter = painterResource(id = R.drawable.pattern_recent_button),
//                    contentDescription = null,
//                    modifier = Modifier
//                    .matchParentSize(),
//                    contentScale = ContentScale.Crop)
                Row(modifier = Modifier
                    .padding(end = 79.dp)) {


                    Column(
                    ) {
                        Text(
                            text = "Periksa Rutin Bulanan",
                            color = Color.White,
                            textAlign = TextAlign.Left,
//                        lineHeight = 12.sp,
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
//                            .weight(weight = 0.25f)
//                            .height(10.dp)
//                            .padding(bottom = .dp)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Row(
                            modifier = Modifier
                                .padding(top = 2.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.dr_icon_recent),
                                contentDescription = "Vector", tint = Color.White
                            )

                            Text(
                                text = "dr. H. Boyke Dian Nugraha, SpOG MARS",
                                color = Color.White,
//                    lineHeight = 95.sp,
                                style = TextStyle(
                                    fontSize = 12.sp
                                ),
                                modifier = Modifier
                                    .padding(start = 6.dp)
//                            .fillMaxWidth()

                            )
                        }

                        Spacer(modifier = Modifier.height(2.dp))

                        Row(
                            modifier = Modifier
                                .padding(top = 2.dp, start = 3.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.location_icon_recent),
                                contentDescription = "Location", tint = Color.White
                            )

                            Text(
                                text = "Cempaka 23, RS St. Elisabeth, Semarang",
                                color = Color.White,
//                    lineHeight = 95.sp,
                                style = TextStyle(
                                    fontSize = 12.sp
                                ),
                                modifier = Modifier
                                    .padding(start = 6.dp)
//                            .fillMaxWidth()

                            )
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Row(
                            modifier = Modifier
                                .padding(top = 2.dp, start = 2.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.time_icon_recent),
                                contentDescription = "Time", tint = Color.White
                            )

                            Text(
                                text = "13:15-14:45, 25 Januari 2023 ",
                                color = Color.White,
//                    lineHeight = 95.sp,
                                style = TextStyle(
                                    fontSize = 12.sp
                                ),
                                modifier = Modifier
                                    .padding(start = 5.dp)
//                            .fillMaxWidth()

                            )
                        }
                    }
//                    Image(
//                    painter = painterResource(id = R.drawable.character_1),
//                    contentDescription = "Character-icon",
//                    modifier = Modifier
//                        .padding(start = 4.dp)
//                        .width(width = 5.dp)
//                        .height(height = 5.dp)
//                )
                }
//                Image(
//                    painter = painterResource(id = R.drawable.character_1),
//                    contentDescription = "Character-icon",
//                    modifier = Modifier
//                        .width(width = 12.dp)
//                        .height(height = 12.dp)
//                )
                Row(modifier = Modifier
                    .padding(start = 2.dp, top = 4.dp, bottom = 2.dp, end = 2.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.character_1),
                        contentDescription = "Character-icon",
                        modifier = Modifier
                            .width(width = 12.dp)
                            .height(height = 12.dp)
                    )
                }
            }


        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF4ECB71)),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                .fillMaxWidth()
                .height(108.dp),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 20.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp,
                hoveredElevation = 15.dp,
                focusedElevation = 10.dp
            )
        )
        {
//                Image(painter = painterResource(id = R.drawable.pattern_recent_button),
//                    contentDescription = null,
//                    modifier = Modifier
//                    .matchParentSize(),
//                    contentScale = ContentScale.Crop)
            Row(modifier = Modifier
                .padding(end = 79.dp)) {


                Column(
                ) {
                    Text(
                        text = "Sirkumsisi (Sunat)",
                        color = Color.White,
                        textAlign = TextAlign.Left,
//                        lineHeight = 12.sp,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
//                            .weight(weight = 0.25f)
//                            .height(10.dp)
//                            .padding(bottom = .dp)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row(
                        modifier = Modifier
                            .padding(top = 2.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.dr_icon_recent),
                            contentDescription = "Vector", tint = Color.White
                        )

                        Text(
                            text = "dr. Teuku Adifitrian, Sp.BP-RE.",
                            color = Color.White,
//                    lineHeight = 95.sp,
                            style = TextStyle(
                                fontSize = 12.sp
                            ),
                            modifier = Modifier
                                .padding(start = 6.dp)
//                            .fillMaxWidth()

                        )
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Row(
                        modifier = Modifier
                            .padding(top = 2.dp, start = 3.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.location_icon_recent),
                            contentDescription = "Location", tint = Color.White
                        )

                        Text(
                            text = "Berlian 103, Siloam Hospitals Semarang",
                            color = Color.White,
//                    lineHeight = 95.sp,
                            style = TextStyle(
                                fontSize = 12.sp
                            ),
                            modifier = Modifier
                                .padding(start = 6.dp)
//                            .fillMaxWidth()

                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Row(
                        modifier = Modifier
                            .padding(top = 2.dp, start = 2.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.time_icon_recent),
                            contentDescription = "Time", tint = Color.White
                        )

                        Text(
                            text = "10:00-11:15, 16 September 2022",
                            color = Color.White,
//                    lineHeight = 95.sp,
                            style = TextStyle(
                                fontSize = 12.sp
                            ),
                            modifier = Modifier
                                .padding(start = 5.dp)
//                            .fillMaxWidth()

                        )
                    }
                }
            }
//                Image(
//                    painter = painterResource(id = R.drawable.character_1),
//                    contentDescription = "Character-icon",
//                    modifier = Modifier
//                        .width(width = 12.dp)
//                        .height(height = 12.dp)
//                )
            Row(modifier = Modifier
                .padding(start = 2.dp, top = 4.dp, bottom = 2.dp, end = 2.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.character_1),
                    contentDescription = "Character-icon",
                    modifier = Modifier
                        .width(width = 12.dp)
                        .height(height = 12.dp)
                )
            }
        }
        }
    }







@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Project3activityTheme {
        Greeting("admin")
        Hero()
    }
}

