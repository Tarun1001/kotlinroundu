package com.example.kotlinroundu

import com.google.gson.annotations.SerializedName

data class Translation(
    @SerializedName("translatedText") val translatedText: String
)