package com.example.examenappmoviles.viewmodel


import androidx.lifecycle.ViewModel
import com.example.examenappmoviles.model.UserUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class UserViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(UserUiState(name = "Ana López"))

    val uiState: StateFlow<UserUiState> = _uiState.asStateFlow()

    fun toggleFollow() {
        _uiState.update { currentState ->
            currentState.copy(isFollowing = !currentState.isFollowing)
        }
    }
}