package com.mohaberabi.archpatterncompose.design_pattern.singleton

import android.util.Log


class AppDatabase private constructor() {


    companion object {
        private lateinit var _instance: AppDatabase
        val instance: AppDatabase
            get() {
                if (!Companion::_instance.isInitialized) {
                    _instance = AppDatabase()
                }
                return _instance
            }
    }

    fun insert() {
        Log.d("db", "data inserted")
    }
}