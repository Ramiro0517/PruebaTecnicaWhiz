package com.example.pruebatecnicawhiz.home.ui.pokemonEvolutionary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pruebatecnicawhiz.R
import com.example.pruebatecnicawhiz.databinding.FragmentEvolutionaryLineBinding


class PokemonEvolutionaryLineFragment : Fragment(R.layout.fragment_evolutionary_line) {


    private lateinit var binding: FragmentEvolutionaryLineBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentEvolutionaryLineBinding.bind(view)
    }

}