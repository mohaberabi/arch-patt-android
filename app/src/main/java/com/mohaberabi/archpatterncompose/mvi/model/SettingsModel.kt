package com.mohaberabi.archpatterncompose.mvi.model


data class SettingsModel(
    val darkTheme: Boolean = true,
    val allowNotifications: Boolean = true,
)