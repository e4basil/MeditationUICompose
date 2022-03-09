package com.baz.meditationuicompose.ui.screens.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.baz.meditationuicompose.ui.composable.Feature
import com.baz.meditationuicompose.ui.theme.MeditationUIComposeTheme

@ExperimentalFoundationApi
class DetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIComposeTheme {
                DetailsScreen(feature)
            }
        }
    }


    private val feature: Feature by lazy {
        intent?.getSerializableExtra(featureID) as Feature
    }

    companion object {

        private const val featureID = "feature_id"
        fun newIntent(context: Context, feature: Feature) =
            Intent(context, DetailsActivity::class.java).apply {
                putExtra(featureID, feature)
            }
    }
}
