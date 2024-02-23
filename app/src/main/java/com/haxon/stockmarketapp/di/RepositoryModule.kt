package com.haxon.stockmarketapp.di

import com.haxon.stockmarketapp.data.csv.CSVParser
import com.haxon.stockmarketapp.data.csv.CompanyListingParser
import com.haxon.stockmarketapp.data.csv.IntradayInfoParser
import com.haxon.stockmarketapp.data.repository.StockRepositoryImpl
import com.haxon.stockmarketapp.domain.model.CompanyListing
import com.haxon.stockmarketapp.domain.model.IntradayInfo
import com.haxon.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingParser: CompanyListingParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository

}