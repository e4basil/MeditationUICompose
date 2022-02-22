package com.baz.meditationuicompose.ui.screens.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.baz.meditationuicompose.ui.composable.*
import com.baz.meditationuicompose.ui.theme.DeepBlue

@Preview
@ExperimentalFoundationApi
@Composable
fun HomeScreen() {

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
            FeaturedEvents()

//            5
            BottomMenu()

        }
    }

}



