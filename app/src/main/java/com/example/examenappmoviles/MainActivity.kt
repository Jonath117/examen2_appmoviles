package com.example.examenappmoviles

import android.R.attr.button
import android.R.attr.onClick
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examenappmoviles.ui.theme.ExamenAppMovilesTheme
import com.example.examenappmoviles.view.components.UserCard
import com.example.examenappmoviles.view.screens.UserScreen

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenAppMovilesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerpadding ->
                    UserScreen()
                }
            }
        }
    }
}

//@Composable
//fun UserCard(){
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp, vertical = 50.dp),
//        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
//    ){
//        Row(modifier = Modifier.padding(16.dp))
//        {
//            Column(modifier = Modifier)
//            {
//                Text(text = "Icon")
//
//                Text(text = "Nombre")
//
//                Text(text = "EstadoIcon")
//
//                Button(onClick = {/*accion*/}) {
//                    Text(text = "Seguir")
//                }
//            }
//
//        }
//    }
//}