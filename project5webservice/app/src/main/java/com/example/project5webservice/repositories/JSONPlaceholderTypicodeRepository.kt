package com.example.project5webservice.repositories

import com.example.project5webservice.models.TodosModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface JSONPlaceholderTypicodeRepository {
    @GET("todos")

    suspend fun getTodos(): List<TodosModel>


    companion object {
        var _apiClient: JSONPlaceholderTypicodeRepository? = null

        fun getClient(): JSONPlaceholderTypicodeRepository {
            if (_apiClient == null) {
                _apiClient = Retrofit.Builder()
                    .baseUrl("https://jsonplaceholder.typicode.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(JSONPlaceholderTypicodeRepository::class.java)
            }

            return _apiClient!!;
        }


    }

}