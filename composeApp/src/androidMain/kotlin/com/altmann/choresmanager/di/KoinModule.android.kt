package com.altmann.choresmanager.di

import com.altmann.choresmanager.database.UserDao
import com.altmann.choresmanager.local.AndroidDatabaseDriverFactory
import com.altmann.choresmanager.local.DatabaseDriverFactory
import com.altmann.choresmanager.ui.screens.calendar.CalendarViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.viewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

actual val targetModule = module {
    single<DatabaseDriverFactory> {
        AndroidDatabaseDriverFactory(androidContext())
    }
}