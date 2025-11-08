package com.altmann.choresmanager.di

import com.altmann.choresmanager.database.UserDao
import com.altmann.choresmanager.local.DatabaseDriverFactory
import com.altmann.choresmanager.local.DesktopDatabaseDriverFactory
import com.altmann.choresmanager.ui.screens.calendar.CalendarViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

actual val targetModule = module {
    single<DatabaseDriverFactory> {
        DesktopDatabaseDriverFactory()
    }
}