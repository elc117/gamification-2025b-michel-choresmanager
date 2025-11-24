package com.altmann.choresmanager.ui.screens.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.altmann.choresmanager.models.user.User
import com.altmann.choresmanager.network.ApiResult
import com.altmann.choresmanager.repository.UserRepository
import com.altmann.choresmanager.viewmodels.SharedChoreViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LoginViewModel(
    private val repository: UserRepository,
    private val sharedChoreViewModel: SharedChoreViewModel
) : ViewModel() {

    private val _loginMessage = MutableStateFlow("")
    val loginMessage = _loginMessage.asStateFlow()

    private val _loginError = MutableStateFlow(false)
    val loginError = _loginError.asStateFlow()

    fun authenticate(email: String, password: String) = viewModelScope.launch {
            val result = repository.authenticateUser(email, password)
            when (result) {
                is ApiResult.Success -> {
                    val userResponse = result.data
                    sharedChoreViewModel.updateUser(
                        User(
                            userId = userResponse.id,
                            name = userResponse.name,
                            email = userResponse.email,
                            birthday = userResponse.birthdate,
                            profileImage = userResponse.profileImage,
                            currentExp = userResponse.currentExp,
                            achievements = userResponse.achievements,
                            lvlUpThreshold = userResponse.levelUpThreshold,
                            level = userResponse.level,
                            completedChores = userResponse.completedChores,
                            createdChores = userResponse.createdChores
                        )
                    )
                    _loginMessage.value = "Success"
                }

                is ApiResult.Error -> {
                    _loginMessage.value = "Error: ${result.message}"
                    _loginError.value = true
                }
            }
        }

    fun reset() {
        _loginMessage.value = ""
        _loginError.value = false
    }

}