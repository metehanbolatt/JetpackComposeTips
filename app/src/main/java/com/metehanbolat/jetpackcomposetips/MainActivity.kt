package com.metehanbolat.jetpackcomposetips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.jetpackcomposetips.ui.theme.JetpackComposeTipsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTipsTheme {

            }
        }
    }

}




