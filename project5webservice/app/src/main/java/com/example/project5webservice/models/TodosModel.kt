package com.example.project5webservice.models

import com.google.gson.annotations.SerializedName

data class TodosModel(
    @SerializedName("userId") //untuk memberi tahu, camel case userId sama nilainya dengan userid
    var userId: Int,

    @SerializedName("id")
    var id: Int,

    @SerializedName("title")
    var title: String,

    @SerializedName("completed")
    var completed: Boolean
)
