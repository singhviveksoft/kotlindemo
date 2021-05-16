package com.demo.kotlindemo.activity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MainViewModelFactory(val startingValue:Int):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
           return MainViewModel(startingValue) as T
        }
        throw IllegalArgumentException("UnKnow view model")

    }
}