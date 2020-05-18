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
import androidx.navigation.fragment.FragmentNavigator
import com.luiz.jetpackcourse.R
import com.luiz.jetpackcourse.databinding.FragmentNameChBinding


class NameChFragment : Fragment() {

    private lateinit var binding: FragmentNameChBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_name_ch, container, false)
        binding.nameChNext.setOnClickListener {
            if (!TextUtils.isEmpty(binding.nameChName.text.toString())){
                val bundle = bundleOf("input_name" to binding.nameChName.text.toString())
                it.findNavController().navigate(R.id.action_nameFragment_to_emailFragment, bundle)
            }else{
                Toast.makeText(activity,"Please enter  your name", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }

}
