package com.example.pruebatecnicawhiz.home.data.model

import com.google.gson.annotations.SerializedName

data class Pokemon(
    @SerializedName("name")
    val name: String = "",
    @SerializedName("url")
    val url: String = ""
)

data class PokemonList(
    @SerializedName("results")
    val results: List<Pokemon> = listOf()
)