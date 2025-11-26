package com.altmann.choresmanager.viewmodels

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.altmann.choresmanager.models.user.User
import com.altmann.choresmanager.models.chores.Chore
import com.altmann.choresmanager.models.chores.college.CollegeChore
import com.altmann.choresmanager.models.user.Achievement
import com.altmann.choresmanager.network.ApiResult
import com.altmann.choresmanager.network.model.response.UserResponse
import com.altmann.choresmanager.repository.ChoreRepository
import com.altmann.choresmanager.repository.UserRepository
import com.altmann.choresmanager.utils.AchievementHelper
import com.altmann.choresmanager.utils.CalendarHelper
import com.altmann.choresmanager.utils.ResponseToChore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.datetime.DatePeriod
import kotlinx.datetime.LocalDate
import kotlinx.datetime.minus
import kotlinx.datetime.plus

class SharedChoreViewModel(private val choreRepository: ChoreRepository, private val userRepository: UserRepository) : ViewModel() {
    private val _anchor =
        MutableStateFlow(CalendarHelper.today().let { LocalDate(it.year, it.month, 1) })
    val anchor = _anchor.asStateFlow()

    private val _mappedChores = MutableStateFlow<Map<LocalDate, List<Chore>>>(emptyMap())
    val mappedChores = _mappedChores.asStateFlow()

    private val _chores = MutableStateFlow<List<Chore>>(emptyList())
    val chores = _chores.asStateFlow()

    private val _newAchievements = MutableStateFlow<List<Achievement>>(emptyList())
    val newAchievements = _newAchievements.asStateFlow()

    private val _user = MutableStateFlow(
        User(
            userId = 1,
            name = "Your name",
            email = "default@email.com",
            birthday = LocalDate(2004, 9, 5),
            profileImage = null,
            color = Color.Magenta
        )
    )
    val user = _user.asStateFlow()

    private val _enabledChores = MutableStateFlow<List<Chore>>(emptyList())
    val enabledChores = _enabledChores.asStateFlow()

    init {
        // Auto-remap whenever anchor or enabled list changes
//        viewModelScope.launch(Dispatchers.Default) {
//            combine(anchor, enabledChores) { _, _ -> } // values are read inside remap
//                .collect { remapChores() }
//        }
    }

    fun loginUser(newUser: User) {
        _user.value = newUser
    }

    fun updateTheme(isDarkTheme: Boolean) {
        _user.update { it.copy(isDarkTheme = isDarkTheme) }
        updateUser(user.value)
    }

    fun updateColor(newColor: Color) {
        _user.update { it.copy(color = newColor) }
        updateUser(user.value)
    }

    fun updateApiChore(chore : Chore) = viewModelScope.launch {
        val updatedChore = ResponseToChore.toResponse(chore)
        val result = choreRepository.updateChore(user.value.userId, updatedChore)
        when (result) {
            is ApiResult.Success -> {
                print("Chore updated successfully")
            }

            is ApiResult.Error -> {
                print(result.message)
            }
        }
    }

    fun updateUser(user : User) = viewModelScope.launch {
        val updatedUser = UserResponse(
            id = user.userId,
            name = user.name,
            email = user.email,
            birthdate = user.birthday,
            profileImage = user.profileImage,
            currentExp = user.currentExp,
            achievements = user.achievements,
            levelUpThreshold = user.lvlUpThreshold,
            level = user.level,
            completedChores = user.completedChores,
            createdChores = user.createdChores,
            color = user.color,
            isDarkTheme = user.isDarkTheme
        )
        val result = userRepository.updateUser(updatedUser)
        when (result) {
            is ApiResult.Success -> {
//                print("User updated successfully")
            }

            is ApiResult.Error -> {
                print(result.message)
            }
        }
    }

    fun addChore(chore: Chore) = viewModelScope.launch {
        val result = choreRepository.addChore(user.value.userId, chore)
        when (result) {
            is ApiResult.Success -> {
                val addedChore = ResponseToChore.toChore(result.data)
                _chores.value = _chores.value.plus(addedChore)
                _enabledChores.value = _enabledChores.value.plus(addedChore)
                _user.update { it.copy(createdChores = it.createdChores + 1) }
                updateAchievements(chore)
            }

            is ApiResult.Error -> {
                print(result.message)
            }
        }
    }

    fun updateChore(chore: Chore) {
        _chores.value = _chores.value.map { if (it.choreId == chore.choreId) chore else it }
        if (_enabledChores.value.any { it.choreId == chore.choreId }) {
            _enabledChores.value =
                _enabledChores.value.map { if (it.choreId == chore.choreId) chore else it }
        }
        updateApiChore(chore)
    }

    fun enableDisableChore(chore: Chore) {
        _enabledChores.value =
            if (!_enabledChores.value.contains(chore)) _enabledChores.value.plus(chore)
            else _enabledChores.value.minus(chore)
    }

    fun onNext() = _anchor.update { it.plus(DatePeriod(months = 1)) }

    fun onPrev() = _anchor.update { it.minus(DatePeriod(months = 1)) }

    fun markChoreFinished(choreId: Int, date: LocalDate) {
        _chores.value.find { it.choreId == choreId }?.let { chore ->
            if (date == chore.endDate) {
                chore.finishChore()
                _chores.value = _chores.value.map { if (it.choreId == choreId) chore else it }
                _enabledChores.value = _enabledChores.value.filter { it.choreId != choreId }
                // Update user completed chores
                addCompletedChoreToUser()
            } else {
                chore.choreException = chore.choreException.plus(date)
                if (chore::class == CollegeChore::class) {
                    (chore as CollegeChore).addAbsence()
                }
                _chores.value = _chores.value.map { if (it.choreId == choreId) chore else it }
                _enabledChores.value =
                    _enabledChores.value.map { if (it.choreId == choreId) chore else it }
            }
            // Update achievements
            updateAchievements(chore)
            updateApiChore(chore)
        }
        remapChores()
    }

    fun clearNewAchievements() {
        _newAchievements.value = emptyList()
    }

    fun addCompletedChoreToUser() {
        _user.value = _user.value.copy(
            completedChores = _user.value.completedChores + 1
        )
        _user.update { it.gainExp(10) }// Gain 10 XP per completed chore
    }

    fun levelUpUser() {
        _user.value.levelUp()
    }

    private fun updateAchievements(chore: Chore?) {
        AchievementHelper(
            user.value.achievements,
            completedChore = chore,
            completedChores = user.value.completedChores,
            createdChores = user.value.createdChores
        ).checkForNewAchievements()
            .let { (newAchievements, xp) ->
                if (newAchievements.isNotEmpty()) {
                    _user.update { currentUser ->
                        currentUser.copy(
                            achievements = currentUser.achievements.plus(newAchievements.map { it.id })
                        )
                    }
                    _newAchievements.value = newAchievements
                }
                _user.update { it.gainExp(xp) }
            }
    }

    private fun generateChoreMap(
        anchor: LocalDate,
        chores: List<Chore>
    ): Map<LocalDate, List<Chore>> {

        val daysInMonth = CalendarHelper.getDaysInMonth(anchor)

        return chores
            .flatMap { chore ->
                (1..daysInMonth).mapNotNull { day ->
                    val date = LocalDate(anchor.year, anchor.month, day)
                    if (
                        date >= chore.startDate &&
                        date <= chore.endDate &&
                        date.dayOfWeek in chore.daysOfWeek &&
                        !chore.isException(date) &&
                        !chore.finished // show only unfinished chores
                    ) {
                        date to chore
                    } else null
                }
            }
            .groupBy({ it.first }, { it.second })
    }

    fun remapChores() = viewModelScope.launch(Dispatchers.Default) {
        val previous = anchor.value.minus(DatePeriod(months = 1))
        val next = anchor.value.plus(DatePeriod(months = 1))

        val map = listOf(previous, anchor.value, next).flatMap { month ->
            generateChoreMap(
                month,
                enabledChores.value
            ).entries
        }
            // for each Entry(date, choreList), create a list of Pair(date, chore)
            .flatMap { (date, choreList) -> choreList.map { chore -> date to chore } }
            // group into Map<LocalDate, List<Chore>>
            .groupBy({ it.first }, { it.second })

        if (_mappedChores.value != map) {
            _mappedChores.update { if (map.entries == it.entries) it else map }
        }
    }

    fun getChores() = viewModelScope.launch {
        val result = choreRepository.getChores(user.value.userId)
        when (result) {
            is ApiResult.Success -> {
                val fetchedChores = result.data
                _chores.value = fetchedChores.map { fetchedChore ->
                    ResponseToChore.toChore(fetchedChore)
                }
                _enabledChores.value = _chores.value.filter { !it.deleted!! && !it.finished }
            }

            is ApiResult.Error -> {
                print(result.message)
            }
        }
    }

}