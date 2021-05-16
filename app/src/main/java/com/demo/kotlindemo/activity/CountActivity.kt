package com.demo.kotlindemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.demo.kotlindemo.R
import com.demo.kotlindemo.databinding.ActivityCountBinding

class CountActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCountBinding
    private lateinit var viewModel: CountViewModel
    private lateinit var viewFactory: CountViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_count)
        viewFactory=CountViewModelFactory(0)
        viewModel=ViewModelProvider(this,viewFactory).get(CountViewModel::class.java)
     //
        binding.myViewModel=viewModel
        binding.lifecycleOwner=this
//        viewModel.countData.observe(this, Observer {
//            binding.counttextView.text=it.toString()
//
//        })


//        binding.button.setOnClickListener {
//            viewModel.getCurrentcount()
//        }

    }

}