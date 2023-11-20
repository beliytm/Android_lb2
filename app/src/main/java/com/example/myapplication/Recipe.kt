package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe(val name: String, val type: String, val year: String, val studio: String) :
    Parcelable {

    init {
        name
        type
        year
        studio
    }
}
