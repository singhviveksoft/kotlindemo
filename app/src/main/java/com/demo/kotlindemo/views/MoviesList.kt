package com.demo.kotlindemo.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.demo.kotlindemo.R
import com.demo.kotlindemo.`interface`.Api
import com.demo.kotlindemo.databinding.ActivityMainBinding
import com.demo.kotlindemo.databinding.ActivityMoviesListBinding
import com.demo.kotlindemo.model.Movies
import com.demo.kotlindemo.repository.MoviesRepository
import com.demo.kotlindemo.viewmodelfactory.MoviesFactory
import com.demo.kotlindemo.viewmodels.MoviesViewModel
import com.demo.kotlindemo.viewsadapter.MoviesAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MoviesList : AppCompatActivity() {
 lateinit var binding:ActivityMoviesListBinding
    lateinit var viewModel: MoviesViewModel
    val api= Api.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_movies_list)
        viewModel=ViewModelProvider(this,MoviesFactory(MoviesRepository(api))).get(MoviesViewModel::class.java)

        CoroutineScope(Dispatchers.Main).launch {
            viewModel.getAllMovies()

        }

        viewModel.movieList.observe(this, Observer {
        binding.movieRecyclerView.adapter=MoviesAdapter(it){
            Toast.makeText(this,"movie name ${it.name}",Toast.LENGTH_LONG).show()
        }
            binding.progressBar.visibility=View.INVISIBLE

        })

/*
        viewModel.errorMsg.observe(this, Observer {
            Toast.makeText(this,it,Toast.LENGTH_LONG).show()
        })
*/
    }


}