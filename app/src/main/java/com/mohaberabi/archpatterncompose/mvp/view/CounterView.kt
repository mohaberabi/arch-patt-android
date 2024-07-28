package com.mohaberabi.archpatterncompose.mvp.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

interface CounterView {
    fun updateCount(count: Int)
}


@Composable
fun rememberCounterView(
    onUpdateView: (Int) -> Unit,
): CounterView {
    return remember {
        object : CounterView {
            override fun updateCount(count: Int) {
                onUpdateView(count)
            }
        }
    }
}