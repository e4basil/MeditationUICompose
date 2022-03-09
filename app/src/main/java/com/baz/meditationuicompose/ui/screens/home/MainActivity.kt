package com.baz.meditationuicompose.ui.screens.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.baz.meditationuicompose.ui.screens.details.DetailsActivity
import com.baz.meditationuicompose.ui.theme.MeditationUIComposeTheme

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIComposeTheme {
                HomeScreen(){
                    startActivity(
                        DetailsActivity.newIntent(this,it)
                    )
                }
            }
        }
    }
}
