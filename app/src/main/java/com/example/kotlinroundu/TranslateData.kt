package com.example.kotlinroundu

import com.google.gson.annotations.SerializedName

data class TranslateData(
    @SerializedName("translations") val translations: List<Translation>
)