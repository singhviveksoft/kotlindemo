package com.demo.kotlindemo.viewmodelfactory

import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.demo.kotlindemo.repository.MoviesRepository
import com.demo.kotlindemo.viewmodels.MoviesViewModel

class MoviesFactory(val moviesRepository: MoviesRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
    if (modelClass.isAssignableFrom(MoviesViewModel::class.java))
    {
        return MoviesViewModel(moviesRepository) as T
    }
        throw IllegalArgumentException("Unknow MoviesViewModel ")
    }

}