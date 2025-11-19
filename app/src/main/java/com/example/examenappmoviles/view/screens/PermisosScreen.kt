package com.example.examenappmoviles.view.screens

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext

@Composable
fun PermisosScreen(){
    val context = LocalContext.current

    var permissionStatusText by remember { mutableStateOf("Permiso de Ubicación no solicitado.") }

    var networkStatusText by remember { mutableStateOf("Estado de red no verificado.") }

    val locationPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission(),
        onResult = { isGranted: Boolean ->
            if (isGranted) {
                permissionStatusText = "Permiso de Ubicación concedido."
            } else {
                permissionStatusText = "Permiso de Ubicación denegado."
            }
        }
    )
}