package com.mohaberabi.archpatterncompose.mvp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.remember
import com.mohaberabi.archpatterncompose.mvp.model.CounterModel
import com.mohaberabi.archpatterncompose.mvp.presenter.rememberCounterPresenter
import com.mohaberabi.archpatterncompose.mvp.view.CounterScreen
import com.mohaberabi.archpatterncompose.mvp.view.rememberCounterView

class MvpActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            val model = remember {
                CounterModel()
            }

            val view = rememberCounterView {
                model.count = it
            }
            val presenter = rememberCounterPresenter(
                model = model,
                view = view,
            )
            CounterScreen(
                presenter = presenter,
            )
        }
    }


}