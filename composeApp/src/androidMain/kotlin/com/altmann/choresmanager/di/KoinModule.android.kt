package com.altmann.choresmanager.di

import com.altmann.choresmanager.local.AndroidDatabaseDriverFactory
import com.altmann.choresmanager.local.DatabaseDriverFactory
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

actual val targetModule = module {
    single<DatabaseDriverFactory> {
        AndroidDatabaseDriverFactory(androidContext())
    }
}