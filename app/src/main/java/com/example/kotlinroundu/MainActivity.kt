package com.example.kotlinroundu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

import java.io.InputStreamReader
import java.net.URL
import javax.net.ssl.HttpsURLConnection

const val  BASE_URL="https://open.er-api.com/v6/latest/"
class MainActivity : AppCompatActivity() {

    private  lateinit var  txtBaseCurrency:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getmydata()



    }

    private fun getmydata() {
      /*  val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
        retrofitBuilder.create<>(APIinterface::class.java)*/
    }

}