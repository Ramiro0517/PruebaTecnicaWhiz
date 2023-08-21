package com.example.pruebatecnicawhiz.home.repository

import com.example.pruebatecnicawhiz.home.data.model.PokemonList

interface PokemonRepository {

    suspend  fun getPokemonList(): PokemonList
}