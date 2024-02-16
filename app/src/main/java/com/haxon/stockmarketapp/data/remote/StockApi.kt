package com.haxon.stockmarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListing(
        @Query("apiKey") apiKey: String = API_KEY
    ): ResponseBody

    companion object {
        const val API_KEY = "GBCYACUNLLZ5GA7C"
        const val BASE_URL = "https://www.alphavantage.co"
    }
}