package com.baz.meditationuicompose.ui.screens.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.baz.meditationuicompose.R
import com.baz.meditationuicompose.ui.composable.*
import com.baz.meditationuicompose.ui.theme.*

//@Preview
@ExperimentalFoundationApi
@Composable
fun HomeScreen(navigateToDetails: (Feature) -> Unit) {

    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {


        Column {

//            1
            GreetingSection()

//            2
            ChipSelection()

//            3
            InSpotLight()

//            4
            FeaturedEvents(
                navigateToDetails,
                features = listOf(
                    Feature(
                        title = "Sleep meditation",
                        R.drawable.ic_headphone,
                        BlueViolet1,
                        BlueViolet2,
                        BlueViolet3
                    ),
                    Feature(
                        title = "Tips for sleeping",
                        R.drawable.ic_videocam,
                        LightGreen1,
                        LightGreen2,
                        LightGreen3
                    ),
                    Feature(
                        title = "Night island",
                        R.drawable.ic_headphone,
                        OrangeYellow1,
                        OrangeYellow2,
                        OrangeYellow3
                    ),
                    Feature(
                        title = "Calming sounds",
                        R.drawable.ic_headphone,
                        Beige1,
                        Beige2,
                        Beige3
                    )
                )
            )

        }

        //            5
        BottomMenu(
            items = listOf(
                BottomMenuContent(
                    "Home",
                    R.drawable.ic_home
                ),
                BottomMenuContent(
                    "Meditate",
                    R.drawable.ic_bubble
                ),
                BottomMenuContent(
                    "Sleep",
                    R.drawable.ic_moon
                ),
                BottomMenuContent(
                    "Music",
                    R.drawable.ic_music
                ),
                BottomMenuContent(
                    "Profile",
                    R.drawable.ic_profile
                ),
            ),
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }

}



