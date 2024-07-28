package com.mohaberabi.archpatterncompose.mvc.controller

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.mohaberabi.archpatterncompose.mvc.model.QuoteService


class QuoteController(
    private val api: QuoteService,
) {


    suspend fun getQuote() = api.getQuote()

}


@Composable
fun rememberQuoteController(
    api: QuoteService = QuoteService(),
): QuoteController {
    return remember {
        QuoteController(api)
    }
}