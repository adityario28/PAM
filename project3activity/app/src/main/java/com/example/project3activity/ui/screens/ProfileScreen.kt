package com.example.project3activity.ui.screens

import android.graphics.Paint.Align
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project3activity.R
import com.example.project3activity.ui.theme.Project3activityTheme

@Composable
fun ProfileScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
//            .background(colorResource(id = R.color.purple_700))
//            .wrapContentSize(Alignment.Center)
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 48.dp)
            ) {
                Card(border = BorderStroke(width = 2.dp, color = colorResource(id = R.color.bg_splash)), shape = RoundedCornerShape(40.dp)) {
                    Image(painter = painterResource(id = R.drawable.ava_square), contentDescription = "Avatar", modifier = Modifier.height(60.dp))

                }

                Spacer(modifier = Modifier.width(8.dp))

                Column(modifier = Modifier
                    .align(Alignment.CenterVertically)) {
                    Text(text = "username",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    )

                    Text(text = "lastname",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Thin
                    ))

                }

            }


            Spacer(modifier = Modifier.height(16.dp))

            Divider(modifier = Modifier.height(1.dp), color = Color.Gray)

            Row(modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 12.dp)
                .fillMaxWidth())
            {
                Image(painter = painterResource(id = R.drawable.doctor_icon_1), contentDescription = "doctor profile", modifier = Modifier.size(28.dp))
                
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 8.dp)
                        .weight(1f),
                    text = stringResource(id = R.string.profile_1),
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        color = Color.Black
                    ))

                Icon(imageVector = Icons.Rounded.ArrowForward, contentDescription = "Arrow Right", modifier = Modifier.align(Alignment.CenterVertically) )
            }

            Divider(modifier = Modifier.height(1.dp), color = Color.Gray)

            Row(modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 12.dp)
                .fillMaxWidth())
            {
                Image(painter = painterResource(id = R.drawable.info_icon), contentDescription = "info profile", modifier = Modifier.size(28.dp))

                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 8.dp)
                        .weight(1f),
                    text = stringResource(id = R.string.profile_2),
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        color = Color.Black
                    ))

                Icon(imageVector = Icons.Rounded.ArrowForward, contentDescription = "Arrow Right", modifier = Modifier.align(Alignment.CenterVertically) )
            }

            Divider(modifier = Modifier.height(1.dp), color = Color.Gray)

            Row(modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 12.dp)
                .fillMaxWidth())
            {
                Image(painter = painterResource(id = R.drawable.rumkit_icon), contentDescription = "clinic info profile", modifier = Modifier.size(28.dp))

                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 8.dp)
                        .weight(1f),
                    text = stringResource(id = R.string.profile_3),
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        color = Color.Black
                    ))

                Icon(imageVector = Icons.Rounded.ArrowForward, contentDescription = "Arrow Right", modifier = Modifier.align(Alignment.CenterVertically) )
            }

            Divider(modifier = Modifier.height(1.dp), color = Color.Gray)

            Row(modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 12.dp)
                .fillMaxWidth())
            {
                Image(painter = painterResource(id = R.drawable.loc_icon), contentDescription = "doctor profile", modifier = Modifier.size(28.dp))

                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 8.dp)
                        .weight(1f),
                    text = stringResource(id = R.string.profile_4),
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        color = Color.Black
                    ))

                Icon(imageVector = Icons.Rounded.ArrowForward, contentDescription = "Arrow Right", modifier = Modifier.align(Alignment.CenterVertically) )
            }

            Divider(modifier = Modifier.height(1.dp), color = Color.Gray)


        }
//        Text(
//            text = "Profile Screen",
//            fontWeight = FontWeight.Bold,
//            color = Color.White,
//            modifier = Modifier.align(Alignment.CenterHorizontally),
//            textAlign = TextAlign.Center,
//            fontSize = 20.sp
//        )

    }
}


//@Preview(showBackground = true)
//@Composable
//fun PreviewProfile() {
//    Project3activityTheme {
////        Greeting2("Android")
//        ProfileScreen()
//    }
//
//}