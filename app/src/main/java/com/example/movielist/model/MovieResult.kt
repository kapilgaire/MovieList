package com.example.movielist.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieResult(


    @SerializedName("status")
    @Expose
    var status: String? = null,

    @SerializedName("status_message")
    @Expose

    var statusMessage: String? = null,

    @SerializedName("data")
    @Expose

    var movieData: MovieData? = null


)