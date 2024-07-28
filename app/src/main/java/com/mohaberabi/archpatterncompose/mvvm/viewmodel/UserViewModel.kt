package com.mohaberabi.archpatterncompose.mvvm.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.mohaberabi.archpatterncompose.mvvm.model.UserModel


class UserViewModel(
) : ViewModel() {


    var name by mutableStateOf("")
        private set

    var lastName by mutableStateOf("")
        private set
    var email by mutableStateOf("")
        private set
    var username by mutableStateOf("")
        private set


    fun nameChanged(name: String) {
        this.name = name
    }

    fun lastNameChanged(lastName: String) {
        this.lastName = lastName
    }

    fun emailChanged(email: String) {
        this.email = email
    }

    fun userNameChanged(username: String) {
        this.username = username
    }


}