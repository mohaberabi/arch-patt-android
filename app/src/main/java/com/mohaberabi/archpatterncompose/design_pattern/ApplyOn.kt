package com.mohaberabi.archpatterncompose.design_pattern

import com.mohaberabi.archpatterncompose.design_pattern.builder.java_way.UserPrefs
import com.mohaberabi.archpatterncompose.design_pattern.builder.kotlin_way.kUserPrefs
import com.mohaberabi.archpatterncompose.design_pattern.factory.ProgrammingLangType
import com.mohaberabi.archpatterncompose.design_pattern.factory.ProgrammingLanguageFactory
import com.mohaberabi.archpatterncompose.design_pattern.singleton.AppDatabase
import com.mohaberabi.archpatterncompose.design_pattern.singleton.AppDatabase2


fun applyOn() {
    AppDatabase.instance.insert()
    AppDatabase2.instance.insert()


    val userPrefs = UserPrefs.Builder()
        .setName("mohab")
        .setLastName("mohab")
        .build()
    val userPrefsDsl = kUserPrefs {
        name = ""
        age = 12

    }
    ProgrammingLanguageFactory()
        .create(ProgrammingLangType.Kotlin)
        .apply { helloWorld() }
}




