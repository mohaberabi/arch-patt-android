package com.mohaberabi.archpatterncompose.mvvm.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mohaberabi.archpatterncompose.mvvm.viewmodel.UserViewModel


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    viewModel: UserViewModel,
) {


    Scaffold {


            padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp)
        ) {


            TextField(
                value = viewModel.name,
                onValueChange = { viewModel.nameChanged(it) },
            )
            TextField(
                value = viewModel.lastName,
                onValueChange = { viewModel.lastNameChanged(it) },
            )
            TextField(
                value = viewModel.email,
                onValueChange = { viewModel.emailChanged(it) },
            )
            TextField(
                value = viewModel.username,
                onValueChange = { viewModel.userNameChanged(it) },
            )
        }
    }

}