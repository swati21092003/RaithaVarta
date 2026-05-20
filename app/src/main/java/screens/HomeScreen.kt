package com.example.raithavarta.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE8F5E9))
            .padding(20.dp)
    ) {
        Text(
            text = "Welcome to Raitha-Varta",
            style = MaterialTheme.typography.headlineSmall,
            color = Color(0xFF1B5E20)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text("Today's Agriculture Tip")
                Spacer(modifier = Modifier.height(10.dp))
                Text("Spray neem solution early morning to protect crops from pests.")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate("tips") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("View Daily Tips")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate("expert") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ask Expert")
        }
    }
}