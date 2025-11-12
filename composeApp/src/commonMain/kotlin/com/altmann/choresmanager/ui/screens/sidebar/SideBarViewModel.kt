package com.altmann.choresmanager.ui.screens.sidebar

import androidx.lifecycle.ViewModel
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.viewmodels.SharedChoreViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.datetime.LocalDate

class SideBarViewModel(private val choreVM : SharedChoreViewModel) : ViewModel() {


    val chores = choreVM.chores

    fun enableDisableChore(chore: Chore) {
        choreVM.enableDisableChore(chore)
    }

    fun addChore(chore: Chore) {
        choreVM.addChore(chore)
    }
}