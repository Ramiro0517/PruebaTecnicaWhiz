package com.example.pruebatecnicawhiz.home.ui.pokemonSkills

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pruebatecnicawhiz.R
import com.example.pruebatecnicawhiz.databinding.FragmentPokemonSkillsBinding


class PokemonSkillsFragment : Fragment(R.layout.fragment_pokemon_skills) {

    private lateinit var binding: FragmentPokemonSkillsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPokemonSkillsBinding.bind(view)
    }

}