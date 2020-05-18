package com.luiz.jetpackcourse.navigationComponentChallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.luiz.jetpackcourse.R
import com.luiz.jetpackcourse.databinding.FragmentHomeChBinding

class HomeChFragment : Fragment() {

    private lateinit var binding: FragmentHomeChBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_ch, container, false)
        binding.homeSignUp.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeChFragment_to_nameFragment)
        }
        binding.homeTerms.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeChFragment_to_termsChFragment)
        }
        return binding.root
    }

}
