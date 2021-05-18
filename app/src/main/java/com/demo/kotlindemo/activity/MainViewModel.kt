package com.demo.kotlindemo.activity

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(startingValue:Int):ViewModel(){
    var imagePath="https://image.shutterstock.com/image-photo/mountain-landscape-hiking-trail-view-600w-1071252569.jpg"
 private   var total=MutableLiveData<Int>()
     val totalData:LiveData<Int>
    get() = total
    init {
        total.value=startingValue
    }
   fun settotal(nos:Int){
       total.value=total.value?.plus(nos)
    }

}