package com.example.movielist

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.example.movielist.model.MovieResult
import com.example.movielist.model.adapter.MovieAdapter

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        val api = ApiInterface.create()

        api.getMovieList(20, 1).enqueue(object : Callback<MovieResult> {
            override fun onFailure(call: Call<MovieResult>?, t: Throwable?) {

                toast(t?.message!!)
            }

            override fun onResponse(call: Call<MovieResult>, response: Response<MovieResult>) {
                val movieResult = response.body()
                val movieData = movieResult?.movieData
                val movieList = movieData?.movieList
                val layoutManager = GridLayoutManager(applicationContext, 2)
                val adapter = MovieAdapter(applicationContext, movieList)
                movi_list_rv.layoutManager = layoutManager
                movi_list_rv.adapter = adapter

            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
