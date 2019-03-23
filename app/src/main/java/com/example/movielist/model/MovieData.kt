package com.example.movielist.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieData(
    @SerializedName("movie_count")
    @Expose
    var movieCount: Int? = null,

    @SerializedName("limit")
    @Expose
    var limit: Int? = null,

    @SerializedName("page_number")
    @Expose
    var pageNumber: Int? = null,

    @SerializedName("movies")
    @Expose
    var movieList: List<Movie>? = null
)