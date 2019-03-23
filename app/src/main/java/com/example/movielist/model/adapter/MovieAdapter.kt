package com.example.movielist.model.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movielist.R
import com.example.movielist.model.Movie
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_layout.view.*
import java.lang.Exception

class MovieAdapter(val context: Context, val movieList: List<Movie>?) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    override fun onBindViewHolder(viewHolder: MyViewHolder, position: Int) {
        viewHolder?.bindItems(movieList?.get(position))

    }

    override fun getItemCount(): Int {

        return movieList?.size!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.movie_layout, parent, false)
        return MyViewHolder(view)
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(movie: Movie?) {

            itemView.movie_name_tv.text = movie?.title_long
            itemView.progress_bar.visibility = View.VISIBLE

            Picasso.get().load(movie?.large_cover_image).into(itemView.movie_image_iv, object : Callback {
                override fun onSuccess() {
                    itemView.progress_bar.visibility = View.GONE

                }

                override fun onError(e: Exception?) {

                }
            })
        }
    }
}