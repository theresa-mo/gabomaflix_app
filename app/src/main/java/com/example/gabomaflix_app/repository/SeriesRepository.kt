package com.example.gabomaflix_app.repository

class SeriesRepository @Inject constructor(private val api: ApiService) {
    suspend fun fetchSeries(): SeriesResponse = api.getPopularSeries()
}