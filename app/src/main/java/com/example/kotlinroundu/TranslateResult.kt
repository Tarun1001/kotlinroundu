package com.example.kotlinroundu

import com.google.gson.annotations.SerializedName

data class TranslateResult(
    @SerializedName("data") val data: TranslateData
)