package com.mohaberabi.archpatterncompose.mvi.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import com.mohaberabi.archpatterncompose.mvi.viewmodel.SettingsIntent
import com.mohaberabi.archpatterncompose.mvi.viewmodel.SettingsViewModel


@Composable
fun SettingsScreen(
    modifier: Modifier = Modifier,
    viewModel: SettingsViewModel,
) {


    Scaffold(
        modifier = modifier,
    ) {


            padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {

                Text(text = "Allow notifications ")
                Switch(
                    checked = viewModel.state.allowNotifications,
                    onCheckedChange = { viewModel.processesIntent(SettingsIntent.ToggleNotifications) })
            }



            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {

                Text(text = "Allow dark theme ")
                Switch(
                    checked = viewModel.state.darkTheme,
                    onCheckedChange = { viewModel.processesIntent(SettingsIntent.ToggleTheme) })
            }
        }
    }

}