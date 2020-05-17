package com.luiz.jetpackcourse.dataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.luiz.jetpackcourse.R
import com.luiz.jetpackcourse.databinding.ActivityBindingBinding

class BindingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityBindingBinding
    private lateinit var bindingViewModelProvider: BindingViewModelProvider
    private lateinit var viewModel: BindingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingViewModelProvider =
            BindingViewModelProvider(200)
        viewModel = ViewModelProvider(this).get(BindingViewModel::class.java)
        viewModel = ViewModelProvider(this, bindingViewModelProvider)[BindingViewModel::class.java]
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_binding
        )
        binding.viewModel = this.viewModel
        binding.lifecycleOwner = this

    }
}
