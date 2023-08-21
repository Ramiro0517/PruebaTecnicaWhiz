package com.example.pruebatecnicawhiz.home.data.service

import com.example.pruebatecnicawhiz.home.application.AppConstants
import com.example.pruebatecnicawhiz.home.data.model.PokemonList
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("pokemon")
    suspend  fun getPokemonList(@Query("limit")limit:String): PokemonList

}


object RetrofitClient {

    val webservice by lazy {
        Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(WebService::class.java)
    }

}