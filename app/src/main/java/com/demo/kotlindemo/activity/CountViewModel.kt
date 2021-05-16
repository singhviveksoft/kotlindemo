package com.demo.kotlindemo.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel(counter:Int):ViewModel() {
 private   var count=MutableLiveData<Int>()
    val countData:LiveData<Int>
    get() = count
    init {
        count.value=counter
    }

    fun getCurrentcount():Int?{
        count.value=count.value?.plus(1)
        return count.value
    }

}