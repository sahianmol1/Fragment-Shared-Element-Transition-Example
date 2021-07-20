package com.example.sharedelementtransitionfragmentexample

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sharedelementtransitionfragmentexample.databinding.FragmentBigImageBinding

class BigImageFragment : Fragment() {

        private lateinit var binding: FragmentBigImageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBigImageBinding.inflate(inflater, container, false)

        val sharedElementTransition = TransitionInflater.from(requireContext())
            .inflateTransition(
                android.R.transition.move
            )

        sharedElementEnterTransition = sharedElementTransition
        sharedElementReturnTransition = sharedElementTransition

        return binding.root
    }

}