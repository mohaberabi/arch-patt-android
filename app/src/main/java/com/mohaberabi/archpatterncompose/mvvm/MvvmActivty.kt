package com.mohaberabi.archpatterncompose.mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.mohaberabi.archpatterncompose.mvvm.view.LoginScreen
import com.mohaberabi.archpatterncompose.mvvm.viewmodel.UserViewModel


class MvvmActivity : ComponentActivity() {
    override fun onCreate(
        savedInstanceState: Bundle?,
    ) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {

            val userViewModel by viewModels<UserViewModel>()
            LoginScreen(
                viewModel = userViewModel,
            )
        }
    }
}