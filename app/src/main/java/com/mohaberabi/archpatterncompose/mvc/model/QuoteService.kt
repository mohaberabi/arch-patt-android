package com.mohaberabi.archpatterncompose.mvc.model

import kotlinx.coroutines.delay


class QuoteService {
    suspend fun getQuote(): QuoteModel {
        delay(1000L)
        return QuoteModel()
    }
}