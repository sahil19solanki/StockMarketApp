package com.android.stockmarketappjp.domain.repository

import com.android.stockmarketappjp.domain.model.CompanyInfo
import com.android.stockmarketappjp.domain.model.CompanyListing
import com.android.stockmarketappjp.domain.model.IntradayInfo
import com.android.stockmarketappjp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}