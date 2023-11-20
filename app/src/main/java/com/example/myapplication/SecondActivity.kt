package com.example.myapplication

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val animalName = intent.getParcelableExtra("animal", Animal::class.java)
        val animalDescription = intent.getParcelableExtra("animal", Animal::class.java)
        val animalAge = intent.getParcelableExtra("animal", Animal::class.java)

        val textViewName = findViewById<TextView>(R.id.textView)
        val textViewDescription = findViewById<TextView>(R.id.textView2)
        val textViewAge = findViewById<TextView>(R.id.tvAge)

        textViewName.text = animalName?.name
        textViewDescription.text = animalDescription?.description
        textViewAge.text = animalAge?.age
    }
}