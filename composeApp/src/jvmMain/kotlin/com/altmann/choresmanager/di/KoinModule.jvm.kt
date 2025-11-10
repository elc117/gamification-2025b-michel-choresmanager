package com.altmann.choresmanager.di

import com.altmann.choresmanager.local.DatabaseDriverFactory
import com.altmann.choresmanager.local.DesktopDatabaseDriverFactory
import org.koin.dsl.module

actual val targetModule = module {
    single<DatabaseDriverFactory> {
        DesktopDatabaseDriverFactory()
    }
}