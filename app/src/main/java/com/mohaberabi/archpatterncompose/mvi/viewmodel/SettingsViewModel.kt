package com.mohaberabi.archpatterncompose.mvi.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.mohaberabi.archpatterncompose.mvi.model.SettingsModel

class SettingsViewModel(
    private val settingsModel: SettingsModel = SettingsModel(),
) : ViewModel() {


    var state by mutableStateOf(settingsModel)
        private set

    fun processesIntent(intent: SettingsIntent) {
        when (intent) {
            SettingsIntent.ToggleNotifications -> state =
                state.copy(allowNotifications = !state.allowNotifications)

            SettingsIntent.ToggleTheme -> state =
                state.copy(darkTheme = !state.darkTheme)

        }

    }
}