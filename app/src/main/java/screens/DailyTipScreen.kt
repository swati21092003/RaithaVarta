package com.example.raithavarta.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.raithavarta.data.tipsList

@Composable
fun DailyTipScreen(navController: NavController) {
    var selectedCrop by remember { mutableStateOf("Paddy") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text("Daily Crop Tips", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Button(onClick = { selectedCrop = "Paddy" }) {
                Text("Paddy")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = { selectedCrop = "Tomato" }) {
                Text("Tomato")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        tipsList.filter { it.crop == selectedCrop }.forEach { tip ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 15.dp)
            ) {
                Column(modifier = Modifier.padding(15.dp)) {
                    Text("Crop: ${tip.crop}")
                    Text("English: ${tip.englishTip}")
                    Text("Kannada: ${tip.kannadaTip}")
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                navController.navigate("home")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Back to Dashboard")
        }
    }
}