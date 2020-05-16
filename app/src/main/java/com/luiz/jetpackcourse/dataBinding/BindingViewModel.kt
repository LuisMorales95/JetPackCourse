package com.luiz.jetpackcourse.dataBinding

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BindingViewModel(var defaultValue: Int) : ViewModel(), Observable {
    private var total = MutableLiveData<Int>()
    val dataTotal: LiveData<Int>
        get() = total
    @Bindable
    val input = MutableLiveData<String>()

    init {
        total.value = defaultValue
        input.value = "0"
    }

    fun add() {
        total.value = total.value?.plus(input.value?.trim()?.toInt() ?: 0)
    }

    fun increase() {
        total.value = total.value?.plus(1)
    }


    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }
}