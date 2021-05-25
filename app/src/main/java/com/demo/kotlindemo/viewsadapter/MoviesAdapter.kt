package com.demo.kotlindemo.viewsadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.demo.kotlindemo.R
import com.demo.kotlindemo.databinding.MoviesItemBinding
import com.demo.kotlindemo.generated.callback.OnClickListener
import com.demo.kotlindemo.model.Movies
import com.squareup.picasso.Picasso

class MoviesAdapter(val movieList:List<Movies>,val clickListener:(Movies)->Unit):RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {

    val inflater=LayoutInflater.from(parent.context)
        val view=MoviesItemBinding.inflate(inflater,parent,false)

     return MoviesViewHolder(view)

    }
    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
      val movie=  movieList[position]
        holder.bind(movie)
        holder.itemView.setOnClickListener {
            Toast.makeText(it.context,"${movie.name}",Toast.LENGTH_LONG).show()
          //  clickListener(movie)
        }
//        holder.nametext.text=movie.name
//        Picasso.get().load(movie.imageUrl).into(holder.movieImg)
    }


    override fun getItemCount(): Int {
     return   movieList.size
    }

    class MoviesViewHolder(val binding: MoviesItemBinding):RecyclerView.ViewHolder(binding.root) {
//        val nametext:TextView
//        val movieImg:ImageView
//        init {
//            nametext=view.findViewById(R.id.nametext)
//            movieImg=view.findViewById(R.id.movieImg)
//        }

        fun bind(movieList:Movies){
        binding.movie=movieList

        }


    }


}


