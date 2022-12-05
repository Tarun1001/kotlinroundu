package com.example.kotlinroundu

import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Response


//const val  BASE_URL="https://open.er-api.com/v6/latest/"
class MainActivity : AppCompatActivity() {

    private  lateinit var  txtBaseCurrency:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = ApiClient.getInstance().create(GoogleTranslateService::class.java)

        val call: Call<TranslatedResoponse> = service.translateText(
            "q=Hello%2C%20world!&target=es&source=en",
            "c106642465mshc41bbbbcba77000p1a180ajsn61ecd1924dbc",
            "google-translate1.p.rapidapi.com"
        )
        val response = call.execute()
    }




}