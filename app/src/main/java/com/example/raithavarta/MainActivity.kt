package com.example.raithavarta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.raithavarta.navigation.AppNavigation
import com.example.raithavarta.ui.theme.RaithaVartaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RaithaVartaTheme {
                AppNavigation()
            }
        }
    }
}