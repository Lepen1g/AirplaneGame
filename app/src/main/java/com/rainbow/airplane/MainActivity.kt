package com.rainbow.airplane

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rainbow.airplane.ui.theme.AirplaneTheme
import com.rainbow.airplane.ui.view.Background

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AirplaneGameApp()
        }
    }
}

@Composable
fun AirplaneGameApp() {
    AirplaneTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column {
                Background()
            }

        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewAirplaneGameApp() {
    AirplaneGameApp()
}
