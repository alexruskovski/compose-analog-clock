package com.alexruskovski.analogclock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.alexruskovski.analogclock.ui.AnalogClockComposable
import com.alexruskovski.analogclock.ui.theme.AnalogClockTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnalogClockTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    var isClockRunning by remember {
                        mutableStateOf(true)
                    }
                    AnalogClockComposable(
                        modifier = Modifier.clickable {
                            isClockRunning = !isClockRunning
                        },
                        isClockRunning = isClockRunning
                    )
                }
            }
        }
    }
}


