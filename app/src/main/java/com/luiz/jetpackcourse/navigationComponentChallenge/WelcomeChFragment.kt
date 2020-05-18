package com.luiz.jetpackcourse.navigationComponentChallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.luiz.jetpackcourse.R
import com.luiz.jetpackcourse.databinding.FragmentWelcomeChBinding


class WelcomeChFragment : Fragment() {
    private lateinit var binding : FragmentWelcomeChBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_welcome_ch, container, false)
        requireArguments().also {
            binding.welcomeChName.text = it.getString("input_name")
            binding.welcomeChEmail.text = it.getString("input_email")
        }
        binding.welcomeChTerms.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeChFragment_to_termsChFragment)
        }
        return binding.root
    }

}
