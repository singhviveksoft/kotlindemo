package com.demo.kotlindemo.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demo.kotlindemo.model.Movies
import com.demo.kotlindemo.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesViewModel(val moviesRepository: MoviesRepository):ViewModel() {
    val movie=MutableLiveData<List<Movies>>()
    val movieList:LiveData<List<Movies>>
    get() = movie
    val errorMsg=MutableLiveData<String>()


   suspend fun getAllMovies(): Unit {
        coroutineScope {
         try {
          val response=   async(Dispatchers.IO)
             {
                    moviesRepository.getMovie()

             }
             movie.value=response.await().body()
         }  catch (ex:Exception){
             Log.i("movievm",ex.message.toString())
         }

        }


      //  val response=  moviesRepository.getMovie()
/*
        response.enqueue(object : Callback<List<Movies>>{
            override fun onFailure(call: Call<List<Movies>>, t: Throwable) {
                errorMsg.postValue(t.message)
            }

            override fun onResponse(call: Call<List<Movies>>, response: Response<List<Movies>>) {
               if (response.isSuccessful) {
                   movie.postValue(response.body())
               }
            }

        })
*/
    }

}