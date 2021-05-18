package com.demo.kotlindemo.viewsadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.demo.kotlindemo.R
import com.demo.kotlindemo.model.Movies
import com.squareup.picasso.Picasso

class MoviesAdapter(val movieList:List<Movies>):RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {

    val view=LayoutInflater.from(parent.context).inflate(R.layout.movies_item,parent,false)

     return MoviesViewHolder(view)

    }
    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
      val movie=  movieList[position]
        holder.nametext.text=movie.name
        Picasso.get().load(movie.imageUrl).into(holder.movieImg)
    }


    override fun getItemCount(): Int {
     return   movieList.size
    }

    class MoviesViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val nametext:TextView
        val movieImg:ImageView
        init {
            nametext=view.findViewById(R.id.nametext)
            movieImg=view.findViewById(R.id.movieImg)
        }

    }


}


