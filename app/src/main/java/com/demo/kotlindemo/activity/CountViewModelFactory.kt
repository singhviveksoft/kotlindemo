package com.demo.kotlindemo.activity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CountViewModelFactory(val counter:Int):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CountViewModel::class.java)){
            return CountViewModel(counter) as T
        }
        throw IllegalArgumentException("Un Known View Model")
    }
}