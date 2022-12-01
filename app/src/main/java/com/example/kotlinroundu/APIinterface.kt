package com.example.kotlinroundu

import retrofit2.Call
import retrofit2.http.GET

interface APIinterface {
    @GET(value = "INR")
    fun getData(): Call<MyData>
}