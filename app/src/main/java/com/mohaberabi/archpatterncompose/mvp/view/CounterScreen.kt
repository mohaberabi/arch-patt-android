package com.mohaberabi.archpatterncompose.mvp.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.mohaberabi.archpatterncompose.mvp.presenter.CounterPresenter


@Composable
fun CounterScreen(
    modifier: Modifier = Modifier,
    presenter: CounterPresenter,
) {

 
    Scaffold(
        modifier = modifier,
    ) {

            padding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
        ) {


            Row {

                TextButton(
                    onClick = { presenter.increment() },
                ) {
                    Text(
                        "Add"
                    )
                }
                Text(
                    text = "${presenter.count}", textAlign = TextAlign.Center,
                )

                TextButton(
                    onClick = { presenter.decrement() },
                ) {
                    Text(
                        "Minus"
                    )
                }
            }


        }
    }
}