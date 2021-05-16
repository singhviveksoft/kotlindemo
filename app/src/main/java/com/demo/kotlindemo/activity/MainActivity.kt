package com.demo.kotlindemo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.demo.kotlindemo.R
import com.demo.kotlindemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var   binding: ActivityMainBinding
    lateinit var model: MainViewModel
    lateinit var modelFactory: MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        modelFactory = MainViewModelFactory(125)
        model = ViewModelProvider(this, modelFactory).get(MainViewModel::class.java)
        binding.lifecycleOwner = this

        binding.viewModel = model
        //   binding.countTxt.text=model.gettotal().toString()
//        model.totalData.observe(this, Observer {
//            binding.countTxt.text=it.toString()
//        })
        binding.button.setOnClickListener {
            if (!TextUtils.isEmpty(binding.nosEditText.text.toString())) {
                model.settotal(binding.nosEditText.text.toString().toInt())
            }
//
//         //   binding.countTxt.text=model.gettotal().toString()
        }

        binding.countButton.setOnClickListener {
            val intent = Intent(this, CountActivity::class.java)
            startActivity(intent)
        }
    }

}
