package com.example.project3activity.models

import com.example.project3activity.repositories.UserPostRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {
    val retrofit = Retrofit.Builder()
        .baseUrl(" http://192.168.0.104:3000")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api = retrofit.create(UserPostRepository::class.java)
}