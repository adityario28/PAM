package com.example.project3activity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project3activity.R
import com.example.project3activity.models.ArticleViewModel
import com.example.project3activity.ui.theme.Project3activityTheme
import com.example.project3activity.ui.theme.Shapes
import java.util.*

@Composable
fun ArticleScreen(va : ArticleViewModel){

    var title by remember {
        mutableStateOf("")
    }

    var authors by remember {
        mutableStateOf("")
    }

    var time by remember {
        mutableStateOf("")
    }

    var content by remember {
        mutableStateOf("")
    }

    var lang = Locale.getDefault().getLanguage()

    LaunchedEffect(
        Unit,
        block = {
            va.getArticleList()
        }
    )

    if(lang == "in") {
        for (index in va.articleList) {
            if (index.id.toString() == "1") {
                title = index.title
                authors = index.authors
                time = index.time
                content = index.content
            }
        }
    }
    else{
        for (index in va.articleList) {
            if (index.id.toString() == "2") {
                title = index.title
                authors = index.authors
                time = index.time
                content = index.content
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
//            .background(colorResource(id = R.color.purple_700))
//            .wrapContentSize(Alignment.Center)
    ) {
        Column(
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        ) {
                Image(painter = painterResource(id = R.drawable.hero_news), contentDescription = "Article")
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
        ) {
            Text(
                text = title, style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            ))
        }
        
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 4.dp)) {
            Row {
                Icon(painter = painterResource(id = R.drawable.person), contentDescription = "Author", modifier = Modifier.size(16.dp))

                Text(text = authors,
                    modifier = Modifier
                        .padding(start = 2.dp)
                    ,style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                ))

                Icon(painter = painterResource(id = R.drawable.date), contentDescription = "Date", modifier = Modifier
                    .size(20.dp)
                    .padding(start = 8.dp))
                
                Text(text = time,
                modifier = Modifier
                    .padding(start = 2.dp),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                )
                )
                
            }

        }

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
//            .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 68.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(text = content, style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Justify,
                lineHeight = 24.sp
            )
            )

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
//fun PreviewArticle() {
//    Project3activityTheme {
////        Greeting2("Android")
//        ArticleScreen()
//    }
//
//}