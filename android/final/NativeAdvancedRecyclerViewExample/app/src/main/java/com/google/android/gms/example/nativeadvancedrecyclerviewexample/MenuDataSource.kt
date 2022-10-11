package com.google.android.gms.example.nativeadvancedrecyclerviewexample

import android.content.Context
import androidx.paging.PositionalDataSource

class MenuDataSource(
    context: Context
) : PositionalDataSource<MenuItem>() {
    override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<MenuItem>) {

    }

    override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<MenuItem>) {
        TODO("Not yet implemented")
    }

}