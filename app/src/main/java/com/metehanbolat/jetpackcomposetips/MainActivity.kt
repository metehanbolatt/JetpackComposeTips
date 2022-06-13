package com.metehanbolat.jetpackcomposetips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.metehanbolat.jetpackcomposetips.ui.theme.JetpackComposeTipsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTipsTheme {
                CompositionLocalProviderSample()
            }
        }
    }

    @Composable
    fun CompositionLocalProviderSample() {
        CompositionLocalProvider(LocalTextStyle provides TextStyle(fontSize = 24.sp)) {
            Column(
                modifier = Modifier.size(300.dp, 200.dp),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(text = "Text1")
                    Text(text = "Text2")
                }

                CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Text(text = "Text3")
                        Text(text = "Text4")
                    }
                }

                CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.disabled) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Text(text = "Text5")
                        Text(text = "Text6")
                    }
                }
            }
        }
    }

}




