package com.example.kotlinroundu.trasnslator

import retrofit2.Call
import retrofit2.http.*

//Create a service interface
interface GoogleTranslateServiceInterface {


    @POST("language/translate/v2")
    fun translate(@Body body: String, @Query("target") target: String,
                  @Query("source") source: String, @Header("content-type") contentType: String,
                  @Header("X-RapidAPI-Key") key: String,
                  @Header("X-RapidAPI-Host") host: String): Call<TranslatedResponse>
}