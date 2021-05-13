package com.demo.kotlindemo.Activity

import androidx.lifecycle.ViewModel

class DemoViewModel : ViewModel() {
    private var count=0

  fun  getCurrentCount():Int{
      return count

  }

}