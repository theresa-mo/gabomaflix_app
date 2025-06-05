package com.example.gabomaflix_app.network

import retrofit2.http.GET

interface ApiService {
    @GET("most-popular?page=1")
    suspend fun getPopularSeries(): SeriesResponse
}

