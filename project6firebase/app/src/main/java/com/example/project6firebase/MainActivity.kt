package com.example.project6firebase

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.launch
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.project6firebase.ui.theme.Project6firebaseTheme
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import java.io.ByteArrayOutputStream
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project6firebaseTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen(onSubmitActionEvent = ::uploadImage)
                }
            }
        }
    }
    private fun uploadImage(img: ImageBitmap){
        val fStorage = Firebase.storage
        val storageRef = fStorage.reference

        val fileName = SimpleDateFormat("yyyMMddHHmm'.png'").format(Date())
        val ref = storageRef.child("images/$fileName")

        val stream = ByteArrayOutputStream()
        img.asAndroidBitmap().compress(Bitmap.CompressFormat.PNG, 100, stream)
        val image = stream.toByteArray()

        var uploadTask = ref.putBytes(image)

        val urlTask = uploadTask.continueWithTask { task ->
            if (!task.isSuccessful) {
                task.exception?.let {
                    throw it
                }
            }
            ref.downloadUrl
        }.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val downloadUri = task.result
                Toast.makeText(applicationContext, downloadUri.toString(), Toast.LENGTH_LONG).show()
            } else {
                // Handle failures
                // ...
            }
        }
    }
}

@Composable
fun MainScreen (
    onSubmitActionEvent: (img: ImageBitmap) -> Unit
){

    val lContext = LocalContext.current
    var captionText by remember { mutableStateOf("") }
    var takenImage by remember {
        mutableStateOf(
            BitmapFactory.decodeResource(lContext.resources, R.drawable.no_image).asImageBitmap()
        )
    }

    val takePictureContract = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.TakePicturePreview(),
        onResult = { _takenImageBitmap ->
            takenImage = _takenImageBitmap.asImageBitmap()
        }
    )

    Column(modifier = Modifier.padding(4.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(bitmap = takenImage, contentDescription = "",
                modifier = Modifier
                    .size(120.dp)
                    .padding(end = 4.dp)
                    .clickable {
                        takePictureContract.launch()
                    })
            Column(modifier = Modifier.fillMaxWidth()) {
                TextField(value = captionText, onValueChange = { captionText = it})
                Button(onClick = { onSubmitActionEvent(takenImage) }) {
                    Text(text = "Submit")
                }
            }
        }
    }

}


//@Preview(showBackground = true)
//@Composable
//fun MainScreenPreview(){
//    MainScreen()
//}