package com.example.gabomaflix_app.model

data class SeriesResponse(
    val tv_shows: List<TvShow>
)

data class TvShow(
    val name: String,
    val image_thumbnail_path: String
)