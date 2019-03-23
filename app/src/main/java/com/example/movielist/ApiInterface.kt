package com.example.movielist

import com.example.movielist.Utils.Constant
import com.example.movielist.model.MovieResult
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("list_movies.json")
    fun getMovieList(@Query("limit") limit: Int, @Query("page") page: Int): Call<MovieResult>

    companion object Factory {

        fun  create(): ApiInterface {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constant.BASE_URL)
                .build()
            return  retrofit.create(ApiInterface::class.java)

        }
    }
}