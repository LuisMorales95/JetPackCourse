package com.luiz.jetpackcourse.navigationComponentChallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.luiz.jetpackcourse.R
import com.luiz.jetpackcourse.databinding.FragmentTermsChBinding

/**
 * A simple [Fragment] subclass.
 */
class TermsChFragment : Fragment() {
    private lateinit var binding: FragmentTermsChBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_terms_ch, container, false)
        return binding.root
    }

}
