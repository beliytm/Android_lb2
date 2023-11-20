package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(val name: String, val description: String, val age: String) : Parcelable
