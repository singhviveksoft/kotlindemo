package com.demo.kotlindemo.activity

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(startingValue:Int):ViewModel() {
 private   var total=MutableLiveData<Int>()
     val totalData:LiveData<Int>
    get() = total
    init {
        total.value=startingValue
    }
   fun settotal(nos:Int){
       total.value=total.value?.plus(nos)
    }
    @BindingAdapter("app:imgUrl")
fun imgUrl(view:View,string: String){

}
}