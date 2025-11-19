package com.example.examenappmoviles.view.screens

import androidx.compose.foundation.layout.Column // <--- Importante
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding // Opcional para márgenes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examenappmoviles.ui.components.LocationPermissionComponent
import com.example.examenappmoviles.view.components.UserCard
import com.example.examenappmoviles.viewmodel.UserViewModel

@Composable
fun UserScreen(
    viewModel: UserViewModel = viewModel()
) {
    val state by viewModel.uiState.collectAsState()

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        UserCard(
            name = state.name,
            isFollowing = state.isFollowing,
            onFollowClick = { viewModel.toggleFollow() }
        )

        Spacer(modifier = Modifier.height(50.dp))

        LocationPermissionComponent()
    }
}