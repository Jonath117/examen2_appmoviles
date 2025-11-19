package com.example.examenappmoviles.view.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examenappmoviles.view.components.UserCard
import com.example.examenappmoviles.viewmodel.UserViewModel


@Composable
fun UserScreen(
    viewModel: UserViewModel = viewModel()
) {
    val state by viewModel.uiState.collectAsState()

    UserCard(
        name = state.name,
        isFollowing = state.isFollowing,
        onFollowClick = { viewModel.toggleFollow() }
    )
}