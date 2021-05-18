package com.demo.kotlindemo.repository

import com.demo.kotlindemo.`interface`.Api

class MoviesRepository(val api:Api) {
  fun getMovie()=  api.getMovie()

}