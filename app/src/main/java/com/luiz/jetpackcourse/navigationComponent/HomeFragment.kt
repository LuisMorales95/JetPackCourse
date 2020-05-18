package com.luiz.jetpackcourse.navigationComponent

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
import com.luiz.jetpackcourse.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.button2.setOnClickListener {
            if (!TextUtils.isEmpty(binding.editText2.text.toString())) {
                val bundle = bundleOf("user_input" to binding.editText2.text.toString())
                it.findNavController().navigate(R.id.action_homeFragment_to_detailFragment, bundle)
            } else {
                Toast.makeText(activity,"Please insert your name", Toast.LENGTH_LONG).show()
            }
        }
        return binding.root
    }

}
