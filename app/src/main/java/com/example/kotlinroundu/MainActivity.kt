package com.example.kotlinroundu

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinroundu.trasnslator.ApiClient
import com.example.kotlinroundu.trasnslator.GoogleTranslateServiceInterface
import com.example.kotlinroundu.trasnslator.RequestModel
import com.example.kotlinroundu.trasnslator.TranslatedResponse
import okhttp3.Callback
import okhttp3.MediaType
import retrofit2.Call
import retrofit2.Response
import java.lang.Exception
import kotlin.concurrent.thread


const val  BASE_URL="https://google-translate1.p.rapidapi.com/language/"
class MainActivity : AppCompatActivity() {



    private  lateinit var  txtBaseCurrency:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        thread {
            translate()
            //this is a new comment for azuredevopts
        }


    }
    fun  translate() {
        try {
            val client = ApiClient.getInstance()
            val translateAPi = client.create(GoogleTranslateServiceInterface::class.java)
            //val mediaType = MediaType.parse("application/x-www-form-urlencoded")
            val mediaType = MediaType.parse("application/x-www-form-urlencoded")
            val request =  RequestModel("Hello brother","hi","en")
            val call = translateAPi.translate("Hello%2C%20world!", "es", "en",
                "application/x-www-form-urlencoded",
                "17a0f6dc6emsh3ee85638850c407p16260ejsneffc483805fb",
                "google-translate1.p.rapidapi.com")
           /* call.enqueue(object : Callback<TranslatedResponse>,
                retrofit2.Callback<TranslatedResponse> {
                override fun onResponse(
                    call: Call<TranslatedResponse>,
                    response: Response<TranslatedResponse>
                ) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<TranslatedResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })*/
            // call.enqueue(object :Callback)

            //Log.i("Response", "translate: okbro")

        }
        catch (e: Exception){
            println(e)
        }

    }
    fun frameRequest(){



    }





}