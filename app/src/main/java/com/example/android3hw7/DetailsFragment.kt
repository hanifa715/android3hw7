package com.example.android3hw7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.android3hw7.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding
    private lateinit var dataFromCharacterFragment: Character
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        getData()

    }

    private fun getData() = with(binding){
        dataFromCharacterFragment = arguments?.getSerializable("key") as Character
        tvDetailsName.text = dataFromCharacterFragment.name
        tvDetailsAlive.text = dataFromCharacterFragment.alive
        Glide.with(tvDetailsImg).load(dataFromCharacterFragment.image).into(tvDetailsImg)
    }

}