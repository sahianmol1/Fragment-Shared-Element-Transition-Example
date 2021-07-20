package com.example.sharedelementtransitionfragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.sharedelementtransitionfragmentexample.databinding.FragmentSmallImageBinding


class SmallImageFragment : Fragment() {
    private lateinit var binding: FragmentSmallImageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSmallImageBinding.inflate(inflater, container, false)

        binding.apply {
            imgPokeApi.setOnClickListener {
                val extras = FragmentNavigatorExtras(imgPokeApi to "img_big")
                findNavController().navigate(
                    SmallImageFragmentDirections.actionSmallImageFragmentToBigImageFragment(),
                    extras
                )
            }

        }

        return binding.root
    }
}