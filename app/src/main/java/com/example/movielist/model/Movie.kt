package com.example.movielist.model

import com.google.gson.annotations.SerializedName


data class Movie(
    @SerializedName("id")
    val id: Int = 0,

    @SerializedName("url")
    val url: String? = null,

    @SerializedName("imbd_code")
    val imbd_code: String? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("title_english")
    val title_english: String? = null,


    @SerializedName("title_long")
    val title_long: String? = null,

    @SerializedName("slug")
    val slug: String? = null,

    @SerializedName("year")
    val year: Int? = null,

    @SerializedName("rating")
    val rating: Double? = null,

    @SerializedName("runtime")
    val runtime: Int? = null,


    @SerializedName("summary")
    val summary: String? = null,

    @SerializedName("description_full")
    val description_full: String? = null,

    @SerializedName("synopsis")
    val synopsis: String? = null,

    @SerializedName("yt_trailer_code")
    val yt_trailer_code: String? = null,


    @SerializedName("language")
    val language: String? = null,

    @SerializedName("mpa_rating")
    val mpa_rating: String? = null,

    @SerializedName("background_image")
    val background_image: String? = null,

    @SerializedName("background_image_original")
    val background_image_original: String? = null,

    @SerializedName("small_cover_image")
    val small_cover_image: String? = null,

    @SerializedName("medium_cover_image")
    val medium_cover_image: String? = null,

    @SerializedName("large_cover_image")
    val large_cover_image: String? = null,

    @SerializedName("state")
    val state: String? = null,


    @SerializedName("date_uploaded")
    val date_uploaded: String? = null,

    @SerializedName("date_uploaded_unix")
    val date_uploaded_unix: String? = null
)

