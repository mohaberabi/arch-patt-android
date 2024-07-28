package com.mohaberabi.archpatterncompose.mvi.viewmodel


sealed interface SettingsIntent {


    data object ToggleTheme : SettingsIntent

    data object ToggleNotifications : SettingsIntent
}