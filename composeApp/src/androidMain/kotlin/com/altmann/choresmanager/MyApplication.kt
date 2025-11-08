package com.altmann.choresmanager

import android.app.Application
import com.altmann.choresmanager.di.initializeKoin
import org.koin.android.ext.koin.androidContext

class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        initializeKoin (
            config = { androidContext(this@MyApplication)}
        )
    }
}