package com.example.kotlinroundu

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/*class ApiClient {
    val baseUrl = "https://translation.googleapis.com"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            // we need to add converter factory to
            // convert JSON object to Java object
            .build()
    }
}*/
class ApiClient {

    companion object {

        private lateinit var retrofit: Retrofit

        fun getInstance(): Retrofit {

            val BASE_URL = "https://translation.googleapis.com"



            val httpClient = OkHttpClient.Builder()

            retrofit = Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build()).build()

            return retrofit
        }
    }
}
