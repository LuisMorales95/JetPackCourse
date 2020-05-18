package com.luiz.jetpackcourse.navigationComponentChallenge

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.luiz.jetpackcourse.R
import com.luiz.jetpackcourse.databinding.FragmentEmailChBinding

class EmailChFragment : Fragment() {

    private lateinit var binding: FragmentEmailChBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_email_ch, container, false)
        val name = requireArguments().getString("input_name")
        binding.emailChNext.setOnClickListener {
            if (!TextUtils.isEmpty(binding.emailChEmail.text.toString())){
                val bundle = bundleOf(
                    "input_name" to name,
                    "input_email" to binding.emailChEmail.text.toString()
                )
                it.findNavController().navigate(R.id.action_emailFragment_to_welcomeChFragment, bundle)
            } else {
                Toast.makeText(activity, "Please enter your email",Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }

}
