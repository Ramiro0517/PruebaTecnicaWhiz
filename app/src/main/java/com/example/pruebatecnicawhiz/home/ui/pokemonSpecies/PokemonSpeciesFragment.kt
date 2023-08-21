package com.example.pruebatecnicawhiz.home.ui.pokemonSpecies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pruebatecnicawhiz.R
import com.example.pruebatecnicawhiz.databinding.FragmentPokemonSpeciesBinding


class PokemonSpeciesFragment : Fragment(R.layout.fragment_pokemon_species) {

    private lateinit var binding: FragmentPokemonSpeciesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPokemonSpeciesBinding.bind(view)
    }


}