package com.luiz.jetpackcourse.dataBinding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class BindingViewModelProvider(private var defaultValue: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BindingViewModel::class.java)){
            return BindingViewModel(defaultValue) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}