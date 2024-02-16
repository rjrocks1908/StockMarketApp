package com.haxon.stockmarketapp.domain.repository

import com.haxon.stockmarketapp.domain.model.CompanyListing
import com.haxon.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}