package com.mohaberabi.archpatterncompose.design_pattern.singleton

import android.util.Log


class AppDatabase2 private constructor() {


    companion object {
        val instance: AppDatabase2 = AppDatabase2()
    }


    fun insert() {
        Log.d("db", "data inserted")
    }
}