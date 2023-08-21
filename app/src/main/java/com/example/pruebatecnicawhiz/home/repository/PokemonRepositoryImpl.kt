package com.example.pruebatecnicawhiz.home.repository

import com.example.pruebatecnicawhiz.home.data.model.PokemonList
import com.example.pruebatecnicawhiz.home.data.remote.PokemonDataSource

class PokemonRepositoryImpl(private val dataSource:PokemonDataSource):PokemonRepository {

    override suspend fun getPokemonList(): PokemonList = dataSource.getPokemonList()

}