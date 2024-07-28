package com.mohaberabi.archpatterncompose.mvi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.mohaberabi.archpatterncompose.mvi.view.SettingsScreen
import com.mohaberabi.archpatterncompose.mvi.viewmodel.SettingsViewModel


class MviActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewmodel by viewModels<SettingsViewModel>()
            SettingsScreen(
                viewModel = viewmodel,
            )
        }
    }
}