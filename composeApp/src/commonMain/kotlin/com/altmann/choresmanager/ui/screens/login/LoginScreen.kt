package com.altmann.choresmanager.ui.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.ui.screens.components.fields.ValidatedTextField
import kotlinx.coroutines.launch

@Composable
fun LoginScreen(
    loginViewModel: LoginViewModel,
    screenState: MutableState<Int>
) {

    var email by remember { mutableStateOf("") }
    var login by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var emailError by remember { mutableStateOf<String?>(null) }
    var loginError by remember { mutableStateOf<String?>(null) }
    var nameError by remember { mutableStateOf<String?>(null) }
    var passwordError by remember { mutableStateOf<String?>(null) }

    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val loginMessage = loginViewModel.loginMessage.collectAsState()
    val signupMessage = loginViewModel.signupMessage.collectAsState()
    val failed = loginViewModel.error.collectAsState()
    var signup by remember { mutableStateOf(false) }

    val hasError = if (signup) {
        emailError != null || nameError != null || passwordError != null
    } else {
        loginError != null || passwordError != null
    }

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState) { data ->
                Box(
                    modifier = Modifier.fillMaxSize()
                        .padding(top = 16.dp),
                    contentAlignment = Alignment.TopCenter
                ) {
                    Surface(
                        color = MaterialTheme.colorScheme.secondaryContainer,
                        shape = RoundedCornerShape(12.dp),
                        tonalElevation = 6.dp,
                        modifier = Modifier
                            .padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(horizontal = 16.dp, vertical = 12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = data.visuals.message,
                                color = MaterialTheme.colorScheme.onSecondaryContainer,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                }
            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "Welcome to Chores Manager!", style = LocalTextStyle.current.merge(
                    TextStyle(
                        color = MaterialTheme.colorScheme.onBackground,
                        fontSize = MaterialTheme.typography.headlineLarge.fontSize
                    )
                ), modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 64.dp)
            )
            Column {

                Text(
                    if (!signup) "Log in!" else "Sign up!", modifier = Modifier
                        .padding(bottom = 16.dp)
                        .align(Alignment.CenterHorizontally),
                    style = LocalTextStyle.current.merge(
                        TextStyle(
                            color = MaterialTheme.colorScheme.onBackground,
                            fontSize = MaterialTheme.typography.headlineMedium.fontSize
                        )
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))
                Surface(
                    color = MaterialTheme.colorScheme.surface,
                    tonalElevation = 8.dp,
                    shadowElevation = 4.dp,
                    modifier = Modifier.width(IntrinsicSize.Min),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        if (signup) {
                            ValidatedTextField(
                                text = email,
                                onValueChange = {
                                    email = it
                                },
                                validator = { input ->
                                    val error = when {
                                        input.isEmpty() -> "Email cannot be empty"
                                        !input.contains("@") -> "Invalid email format"
                                        else -> null
                                    }
                                    emailError = error
                                    error
                                },
                                label = "Email"
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            ValidatedTextField(
                                text = name,
                                onValueChange = {
                                    name = it
                                },
                                validator = { input ->
                                    val error = when {
                                        input.isEmpty() -> "Name cannot be empty"
                                        else -> null
                                    }
                                    nameError = error
                                    error
                                },
                                label = "Name"
                            )
                        } else {
                            ValidatedTextField(
                                text = login,
                                onValueChange = {
                                    login = it
                                },
                                validator = { input ->
                                    val error = when {
                                        input.isEmpty() -> "Email cannot be empty"
                                        else -> null
                                    }
                                    loginError = error
                                    error
                                },
                                label = "Email"
                            )
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        ValidatedTextField(
                            text = password,
                            onValueChange = { password = it },
                            label = "Password",
                            validator = { input ->
                                val error = when {
                                    signup && input.length < 6 -> "Password must be at least 6 characters"
                                    !signup && input.isEmpty() -> {
                                        "Password cannot be empty"
                                    }

                                    else -> null
                                }
                                passwordError = error
                                error
                            },
                            visualTransformation = PasswordVisualTransformation()
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Row() {
                            Button(
                                onClick = {
                                    signup = !signup
                                    email = ""
                                    name = ""
                                },
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = if (!signup) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.secondaryContainer,
                                    contentColor = if (!signup) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(if (!signup) "Signup!" else "Cancel")
                            }
                            Spacer(modifier = Modifier.width(16.dp))
                            Button(
                                onClick = {
                                    if (!signup) {
                                        loginViewModel.authenticate(login, password)
                                    } else {
                                        loginViewModel.register(
                                            name = name,
                                            email = email,
                                            password = password
                                        )
                                    }
                                },
                                enabled = !hasError,
                                shape = RoundedCornerShape(8.dp),
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(if (!signup) "Login" else "Signup")
                            }
                        }
                        if (failed.value) {
                            val isSignup = if (signupMessage.value.isEmpty()) {
                                false
                            } else {
                                true
                            }
                            AlertDialog(
                                onDismissRequest = { loginViewModel.reset() },
                                title = { Text(if (isSignup) "Signup Failed" else "Login Failed") },
                                text = { Text(if (isSignup) signupMessage.value else loginMessage.value) },
                                confirmButton = {
                                    Button(
                                        onClick = { loginViewModel.reset() },
                                        shape = RoundedCornerShape(8.dp)
                                    ) {
                                        Text("OK")
                                    }
                                }
                            )
                        }
                    }
                }
                when (loginMessage.value) {
                    "Success" -> {
                        screenState.value = 1 // Navigate to HomeScreen
                    }

                    "Loading" -> {
                        Spacer(modifier = Modifier.height(16.dp))
                        CircularProgressIndicator(
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    }
                }
                when (signupMessage.value) {
                    "Success" -> {
                        scope.launch {
                            snackbarHostState.showSnackbar("User created successfully!")
                        }
                        signup = false
                        email = ""
                        name = ""
                        password = ""
                        loginViewModel.reset()
                    }

                    "Loading" -> {
                        Spacer(modifier = Modifier.height(16.dp))
                        CircularProgressIndicator(
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    }
                }
            }
        }

    }
}

