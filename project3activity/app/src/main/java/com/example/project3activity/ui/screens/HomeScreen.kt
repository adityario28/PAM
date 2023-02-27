package com.example.project3activity.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project3activity.ui.theme.Project3activityTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import com.example.project3activity.R


@Composable
fun Greeting(name: String) {
    Text(text = "Hi,",
        style = TextStyle(
            fontSize = 18.sp
        ),
        modifier = Modifier
            .padding(start = 19.dp, top = 83.dp))
    Text(text = "$name",
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        ),
        modifier = Modifier
            .padding(start = 18.dp, top = 104.dp))
}

@Composable
fun DotsIndicator(
    totalDots: Int,
    selectedIndex: Int
) {

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(), horizontalArrangement = Arrangement.Center
    ) {

        items(totalDots) { index ->
            if (index == selectedIndex) {
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(CircleShape)
                        .background(color = Color(0xFF00CBA9))
                )
            } else {
                Box(
                    modifier = Modifier
                        .size(10.dp)
                        .clip(CircleShape)
                        .background(color = Color(0xFFA1A1A1))
                )
            }

            if (index != totalDots - 1) {
                Spacer(modifier = Modifier.padding(horizontal = 2.dp))
            }
        }
    }
}


@Composable
fun Hero(username: String) {

    val ctx = LocalContext.current

//Pattern
    Image(
        painter = painterResource(id = R.drawable.pattern),
        contentDescription = "pattern",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(bottom = 80.dp)
            .width(width = 400.dp)
            .height(height = 85.dp)
    )


    //Avatar
    Column(modifier = Modifier.padding(start = 320.dp, top = 26.dp)) {
        Image(painter = painterResource(id = R.drawable.ava), contentDescription = "avatar",
            modifier = Modifier
                .size(58.dp)
        )

    }

    Column(modifier = Modifier.padding(start = 16.dp, top = 40.dp)) {

            Text(
                text = "Hello, ",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal
                ),
                modifier = Modifier
                    .padding(top = 45.dp)
            )
    }

    Column(modifier = Modifier.padding(start = 16.dp, top = 57.dp)) {

        Text(
            text = username,
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .padding(top = 45.dp)
        )

    }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 130.dp)
    ) {
        Box(
            modifier = Modifier
                .width(width = 400.dp)
                .height(height = 300.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.hero_news),
                contentDescription = "Hero-news-img",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height = 190.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
            )
            Text(
                text = stringResource(id = R.string.News_Headline),
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

    //dot indicator
    Column(modifier = Modifier
        .padding(top = 325.dp)) {
        DotsIndicator(totalDots = 5, selectedIndex = 0)
    }


//    LazyRow(modifier = Modifier
//        .fillMaxWidth()
//        .wrapContentHeight(),
//        horizontalArrangement = Arrangement.Center
//    ){
//        if (index == 0) {
//            Box(
//                modifier = Modifier
//                    .size(10.dp)
//                    .clip(CircleShape)
//                    .background(color = Color.DarkGray)
//            )
//        } else {
//            Box(
//                modifier = Modifier
//                    .size(10.dp)
//                    .clip(CircleShape)
//                    .background(color = Color.LightGray)
//            )
//        }
//    }



    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(top = 330.dp)
        )
        {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
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
                            text = stringResource(id = R.string.label_icon1),
                            color = Color.White,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 12.sp
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
                            text = stringResource(id = R.string.label_icon2),
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 12.sp
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
                            text = stringResource(id = R.string.label_icon3),
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 12.sp
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
                            text = stringResource(id = R.string.label_icon4),
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 12.sp
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
                            text = stringResource(id = R.string.label_icon5),
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 12.sp,
                            lineHeight = 11.sp
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
                            text = stringResource(id = R.string.label_icon6),
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 12.sp,
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
                            text = stringResource(id = R.string.label_icon7),
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 12.sp,
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
                                .height(2.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.label_icon8),
                            color = Color.Black,
                            style = TextStyle(
                                fontWeight = FontWeight.Medium
                            ),
                            textAlign = TextAlign.Center,
                            fontSize = 12.sp,
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
            text = stringResource(id = R.string.History),
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
                .padding(end = 79.dp),
//                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                ) {
                    Text(
                        text = stringResource(id = R.string.History_Button_1_title),
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
                            text = stringResource(id = R.string.History_Button_1_dr),
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
                            text = stringResource(id = R.string.History_Button_1_loc),
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
                            text = stringResource(id = R.string.History_Button_1_time),
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
//                Row(modifier = Modifier
//                    .padding(start = 2.dp, top = 4.dp, bottom = 2.dp, end = 2.dp)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.character_1),
//                        contentDescription = "Character-icon",
//                        modifier = Modifier
//                            .width(width = 12.dp)
//                            .height(height = 12.dp)
//                    )
//                }
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
                        text = stringResource(id = R.string.History_Button_2_title),
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
                            text = stringResource(id = R.string.History_Button_2_dr),
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
                            text = stringResource(id = R.string.History_Button_2_loc),
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
                            text = stringResource(id = R.string.History_Button_2_time),
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

    Column(modifier = Modifier
        .padding(start = 16.dp, top = 562.dp)
        .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.End
    ) {
        Image(
            painter = painterResource(id = R.drawable.character_1),
            contentDescription = "Character-icon",
            modifier = Modifier
                .padding(end = 8.dp)
                .size(120.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.character_2),
            contentDescription = "Character-icon-2",
            modifier = Modifier
//                .padding(end= 5.dp)
                .offset(x = 10.dp)
                .size(120.dp)

        )


    }



}


//@Composable
//fun BottomNavbar(){
//
//    var bottomState by remember {
//        mutableStateOf("Home")
//    }
//
//
//    Scaffold(
//        content = {
//            Greeting(name = "admin")
//            Hero()
//        },
//        bottomBar = {
//            BottomNavigation(
//                backgroundColor = Color.White,
//                contentColor = Color(0xFF868686),
////                modifier = Modifier
////                    .padding(horizontal = 20.dp)
//            ) {
//                BottomNavigationItem(
//                    selected = bottomState == "Home",
//                    onClick = { bottomState == "Home"},
//                    label = { Text(text = stringResource(id = R.string.Nav_Home), color = Color(0xFF4ECB71)) },
//                    icon = { Icon(painter = painterResource(id = R.drawable.navbar_home), contentDescription = null, modifier = Modifier.size(22.dp), tint = Color(0xFF4ECB71)) }
//                )
//                BottomNavigationItem(
//                    selected = bottomState == "Lokasi",
//                    onClick = { bottomState == "Lokasi"},
//                    label = { Text(text = stringResource(id = R.string.Nav_Loc)) },
//                    icon = { Icon(painter = painterResource(id = R.drawable.navbar_lokasi), contentDescription = null, modifier = Modifier.size(22.dp)) }
//                )
//                FloatingActionButton(
//                    onClick = { bottomState == "Janji Temu"},
//                    backgroundColor = Color(0xFF4ECB71 )
//                ){
//                    Icon(painter = painterResource(id = R.drawable.navbar_janji_temu), contentDescription = null, modifier = Modifier
//                        .size(20.dp)
//                        .offset(y = -13.dp), tint = Color.White)
//                    Text(text = stringResource(id = R.string.Nav_Res), style = TextStyle(fontSize = 11.sp), lineHeight = 10.sp, color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.offset(y = 8.dp))
//                }
//                BottomNavigationItem(
//                    selected = bottomState == "FAQ",
//                    onClick = { bottomState == "FAQ"},
//                    label = { Text(text = stringResource(id = R.string.Nav_FAQ)) },
//                    icon = { Icon(painter = painterResource(id = R.drawable.navbar_faq), contentDescription = null, modifier = Modifier.size(22.dp)) }
//                )
//                BottomNavigationItem(
//                    selected = bottomState == "Kartu",
//                    onClick = { bottomState == "Kartu"},
//                    label = { Text(text = stringResource(id = R.string.Nav_card)) },
//                    icon = { Icon(painter = painterResource(id = R.drawable.navbar_kartu), contentDescription = null, modifier = Modifier.size(22.dp)) }
//                )
//            }
//        }
//    )
//}
//
//
//
//@Composable
//fun centerbutton(scope: CoroutineScope,
//                 scaffoldState: ScaffoldState
//){
//    FloatingActionButton(onClick = { scope.launch { scaffoldState.snackbarHostState.showSnackbar("Janji Temu", actionLabel = "Janji Temu", duration = SnackbarDuration.Indefinite) } }) {
//
//    }
//
//}




//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    Project3activityTheme {
////        Greeting("admin")
////        Hero()
//        BottomNavbar()
//    }
//}