package com.example.kotlinroundu

import retrofit2.Call
import retrofit2.http.*

//Create a service interface
interface GoogleTranslateService {

    @GET("/language/translate/v2/languages")
   suspend fun translate(
        @Query("key") key: String,
        @Query("source") source: String,
        @Query("target") target: String,
        @Query("q") q: String
    ): Call<TranslateResult>

    @POST("language/translate/v2")
    fun getTranslatedText(
        @Field("q") q: String,
        @Field("target") target: String,
        @Field("source") source: String
    ): Call<TranslatedData>
}