package com.mohaberabi.archpatterncompose.design_pattern.factory

class ProgrammingLanguageFactory {
    fun create(type: ProgrammingLangType) = when (type) {
        ProgrammingLangType.Java -> JavaProgrammingLanguage()
        ProgrammingLangType.Kotlin -> KotlinProgrammingLanguage()
        ProgrammingLangType.Dart -> DartProgrammingLanguage()
    }
}