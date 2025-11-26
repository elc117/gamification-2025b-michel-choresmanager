package com.altmann.choresmanager.ui.screens.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.altmann.choresmanager.models.user.User
import com.altmann.choresmanager.network.ApiResult
import com.altmann.choresmanager.network.model.UserRequest
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

    private val _error = MutableStateFlow(false)
    val error = _error.asStateFlow()

    private val _signupMessage = MutableStateFlow("")
    val signupMessage = _signupMessage.asStateFlow()

    fun register(name: String, email: String, password: String) = viewModelScope.launch {
        _signupMessage.value = "Loading"
        val userRequest = UserRequest(name = name, email = email, password = password)
        val result = repository.registerUser(userRequest)
        when (result) {
            is ApiResult.Success -> {
                _signupMessage.value = "Success"
            }

            is ApiResult.Error -> {
                _signupMessage.value = "Error: ${result.message}"
                _error.value = true
            }
        }
    }

    fun authenticate(email: String, password: String) = viewModelScope.launch {
            _loginMessage.value = "Loading"
            val result = repository.authenticateUser(email, password)
            when (result) {
                is ApiResult.Success -> {
                    val userResponse = result.data
                    sharedChoreViewModel.loginUser(
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
                            createdChores = userResponse.createdChores,
                            color = userResponse.color,
                            isDarkTheme = userResponse.isDarkTheme
                        )
                    )
                    _loginMessage.value = "Success"
                }

                is ApiResult.Error -> {
                    _loginMessage.value = "Error: ${result.message}"
                    _error.value = true
                }
            }
        }

    fun reset() {
        _loginMessage.value = ""
        _signupMessage.value = ""
        _error.value = false
    }

}