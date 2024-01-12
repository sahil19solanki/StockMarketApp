package com.android.stockmarketappjp.data.mapper

import com.android.stockmarketappjp.data.local.CompanyListingEntity
import com.android.stockmarketappjp.data.remote.dto.CompanyInfoDto
import com.android.stockmarketappjp.domain.model.CompanyInfo
import com.android.stockmarketappjp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}