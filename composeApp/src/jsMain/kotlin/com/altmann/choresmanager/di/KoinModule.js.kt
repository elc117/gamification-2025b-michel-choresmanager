package com.altmann.choresmanager.di

import com.altmann.choresmanager.local.DatabaseDriverFactory
import com.altmann.choresmanager.local.JsDatabaseDriverFactory
import com.altmann.choresmanager.ui.screens.calendar.CalendarViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

actual val targetModule = module {
    single<DatabaseDriverFactory> {
        JsDatabaseDriverFactory()
    }
}