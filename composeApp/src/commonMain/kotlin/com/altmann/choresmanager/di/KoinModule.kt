package com.altmann.choresmanager.di

import com.altmann.choresmanager.repository.UserRepository
import com.altmann.choresmanager.ui.screens.calendar.CalendarViewModel
import com.altmann.choresmanager.ui.screens.chore.addchorepopup.ChorePopupViewModel
import com.altmann.choresmanager.ui.screens.login.LoginViewModel
import com.altmann.choresmanager.ui.screens.sidebar.SideBarViewModel
import com.altmann.choresmanager.viewmodels.SharedChoreViewModel
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module


expect val targetModule: Module

val sharedModule = module {
    single<SharedChoreViewModel> {
        SharedChoreViewModel()
    }
    single<UserRepository> {
        UserRepository()
    }
    viewModelOf(::CalendarViewModel)
    viewModelOf(::SideBarViewModel)
    viewModelOf(::ChorePopupViewModel)
    viewModelOf(::LoginViewModel)

}

fun initializeKoin(config: (KoinApplication.() -> Unit)? = null) {
    startKoin {
        modules(targetModule, sharedModule)
        config?.invoke(this)
    }
}