package com.demo.kotlindemo.`interface`

import com.demo.kotlindemo.model.Movies
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
const val BASE_URL="https://howtodoandroid.com/"
interface Api {

    @GET("movielist.json")
suspend    fun getMovie():Response<List<Movies>>

    companion object{


        var retrofitService:Api?=null
        fun getInstance() : Api {

            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(Api::class.java)
            }
            return retrofitService!!
        }
    }
}