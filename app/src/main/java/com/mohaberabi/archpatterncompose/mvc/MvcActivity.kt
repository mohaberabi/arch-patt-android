package com.mohaberabi.archpatterncompose.mvc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mohaberabi.archpatterncompose.mvc.controller.rememberQuoteController
import com.mohaberabi.archpatterncompose.mvc.view.QuoteScreen

class MvcActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            var quote by remember {
                mutableStateOf("")
            }
            val controller = rememberQuoteController()


            LaunchedEffect(
                key1 = Unit,
            ) {
                quote = controller.getQuote().quote
            }

            if (quote.isNotEmpty()) {
                QuoteScreen(quote = quote)
            } else {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    CircularProgressIndicator()
                }
            }

        }
    }
}

