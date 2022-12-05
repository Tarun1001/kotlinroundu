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

        val call = service.translateText(
            text = "Hello",
            source = "en",
            target = "es"
        )
        call.enqueue(object : retrofit2.Callback<String?> {
            override fun onResponse(call: Call<String?>, response: Response<String?>) {
                if (response.isSuccessful) {

                    }
                }

            override fun onFailure(call: Call<String?>, t: Throwable) {
               // TODO("Not yet implemented")
            }
        })



    }



}