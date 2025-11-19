package com.example.examenappmoviles.ui.components

import android.Manifest
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LocationPermissionComponent(
    modifier: Modifier = Modifier
) {

    var permissionStatusText by remember { mutableStateOf("Permiso no solicitado") }
    var isGranted by remember { mutableStateOf(false) }

    val locationPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission(),
        onResult = { granted: Boolean ->
            isGranted = granted
            permissionStatusText = if (granted) {
                "¡Permiso de Ubicación CONCEDIDO! "
            } else {
                "Permiso de Ubicación DENEGADO "
            }
        }
    )

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = if(isGranted) Color(0xFFE7F9E7) else Color(0xFFF9E7E7) // Verde o Rojo claro
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = permissionStatusText,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Button(
                onClick = {
                    locationPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
                }
            ) {
                Text("Solicitar Ubicación")
            }
        }
    }
}