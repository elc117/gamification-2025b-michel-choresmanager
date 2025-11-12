package com.altmann.choresmanager.di

import com.altmann.choresmanager.database.UserDao
import com.altmann.choresmanager.local.LocalDatabase
import com.altmann.choresmanager.ui.screens.calendar.CalendarViewModel
import com.altmann.choresmanager.ui.screens.sidebar.SideBarViewModel
import com.altmann.choresmanager.viewmodels.SharedChoreViewModel
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module


expect val targetModule: Module

val sharedModule = module {
    single<UserDao> {
        UserDao(get())
    }
    single<LocalDatabase> { LocalDatabase(get()) }
    single<SharedChoreViewModel> {
        SharedChoreViewModel()
    }
    viewModelOf(::CalendarViewModel)
    viewModelOf(::SideBarViewModel)

}

fun initializeKoin(config: (KoinApplication.() -> Unit)? = null) {
    startKoin {
        modules(targetModule, sharedModule)
        config?.invoke(this)
    }
}