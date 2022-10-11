package com.google.android.gms.example.nativeadvancedrecyclerviewexample

import android.content.Context
import androidx.paging.DataSource

class DataSourceFactory(
    private val context: Context
) : DataSource.Factory<Int, MenuItem>{

    override fun create(): DataSource<Int, MenuItem> {
        return MenuDataSource(context)
    }
}