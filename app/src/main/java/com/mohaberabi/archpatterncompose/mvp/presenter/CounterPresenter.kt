package com.mohaberabi.archpatterncompose.mvp.presenter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.mohaberabi.archpatterncompose.mvp.model.CounterModel
import com.mohaberabi.archpatterncompose.mvp.view.CounterView


class CounterPresenter(
    private val model: CounterModel,
    private val view: CounterView,
) {


    var count by mutableIntStateOf(model.count)
        private set

    fun increment() {
        model.count++
        count = model.count
        view.updateCount(model.count)
    }

    fun decrement() {
        model.count--
        count = model.count
        view.updateCount(model.count)
    }
}

@Composable
fun rememberCounterPresenter(
    model: CounterModel,
    view: CounterView,
): CounterPresenter {
    return remember(model, view) {
        CounterPresenter(model, view)
    }
}