package com.example.pruebatecnicawhiz.home.data.remote

import com.example.pruebatecnicawhiz.home.application.AppConstants
import com.example.pruebatecnicawhiz.home.data.model.PokemonList
import com.example.pruebatecnicawhiz.home.data.service.WebService

class PokemonDataSource(private val webService: WebService) {

    suspend fun getPokemonList():PokemonList {
       return webService.getPokemonList(AppConstants.LIMIT)
    }
}