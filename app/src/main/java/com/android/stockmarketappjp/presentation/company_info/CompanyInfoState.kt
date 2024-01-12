package com.android.stockmarketappjp.presentation.company_info

import com.android.stockmarketappjp.domain.model.CompanyInfo
import com.android.stockmarketappjp.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
