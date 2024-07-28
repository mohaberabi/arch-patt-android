package com.mohaberabi.archpatterncompose.design_pattern.factory


enum class ProgrammingLangType {
    Java,
    Kotlin,
    Dart
}

interface ProgrammingLanguage {
    fun helloWorld()
}


class JavaProgrammingLanguage : ProgrammingLanguage {
    override fun helloWorld() {
        println("System.out.println(Hello World !)")
    }
}


class DartProgrammingLanguage : ProgrammingLanguage {
    override fun helloWorld() {
        println("print(Hello World !)")
    }


}


class KotlinProgrammingLanguage : ProgrammingLanguage {
    override fun helloWorld() {
        println(" println(Hello World !)")
    }
}