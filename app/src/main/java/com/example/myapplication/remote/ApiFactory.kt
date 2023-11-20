package com.example.myapplication.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
//    const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
//
//    private val retrofit: Retrofit = createRetrofit()
//    val weatherApi: WeatherApiInterface = retrofit.create(WeatherApiInterface::class.java)
//
//    private fun createRetrofit(): Retrofit {
//
//        val interceptor = HttpLoggingInterceptor()
//        interceptor.level = HttpLoggingInterceptor.Level.BODY
//
//        val client: OkHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()
//
//        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).client(client).addConverterFactory(GsonConverterFactory.create()).build()
//
//        return retrofit
//    }
}