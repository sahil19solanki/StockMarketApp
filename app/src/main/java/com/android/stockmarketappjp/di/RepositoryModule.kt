package com.android.stockmarketappjp.di

import com.android.stockmarketappjp.data.csv.CSVParser
import com.android.stockmarketappjp.data.csv.CompanyListingsParser
import com.android.stockmarketappjp.data.csv.IntradayInfoParser
import com.android.stockmarketappjp.data.repository.StockRepositoryImpl
import com.android.stockmarketappjp.domain.model.CompanyListing
import com.android.stockmarketappjp.domain.model.IntradayInfo
import com.android.stockmarketappjp.domain.repository.StockRepository
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
        companyListingsParser: CompanyListingsParser
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