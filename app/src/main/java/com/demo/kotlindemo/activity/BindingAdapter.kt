package com.demo.kotlindemo.activity

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("app:imgUrl")
fun ImageView.imgUrl( string: String){
Picasso.get().load(string).into(this)
}