package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var viewTextHello : TextView
    private lateinit var editTextUsername : EditText
    private lateinit var editTextPassword : EditText
    private lateinit var buttonSignUp : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewTextHello = findViewById(R.id.textView2)
        editTextUsername = findViewById(R.id.username)
        editTextPassword = findViewById(R.id.password)
        buttonSignUp = findViewById(R.id.containedButton)

        viewTextHello.setText("Welcome, let's join us!")
        buttonSignUp.setOnClickListener(
            {
                val username =  editTextUsername.text
                viewTextHello.setText("Welcome, $username")
            }
        )

    }
}