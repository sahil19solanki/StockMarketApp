package com.android.stockmarketappjp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.android.stockmarketappjp.data.local.CompanyListingEntity
import com.android.stockmarketappjp.data.local.StockDao

@Database(
    entities = [CompanyListingEntity::class],
    version = 1
)
abstract class StockDatabase: RoomDatabase() {
    abstract val dao: StockDao
}