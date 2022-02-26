package com.baz.meditationuicompose.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.baz.meditationuicompose.ui.theme.ButtonBlue
import com.baz.meditationuicompose.ui.theme.DarkerButtonBlue
import com.baz.meditationuicompose.ui.theme.TextWhite

@Preview
@Composable
fun ChipSelection(
    chips: List<String>
//    = emptyList()
    = listOf("Sweet sleep", "Insomnia", "Depression")
) {

    var selectedChipIndex by remember {
        mutableStateOf(0)
    }

    LazyRow {
        items(chips.size) {
            Box(contentAlignment = Alignment.Center, modifier = Modifier
                .padding(15.dp)
                .clickable { selectedChipIndex = it }
                .clip(RoundedCornerShape(8.dp))
                .background(
                    if (selectedChipIndex == it) ButtonBlue
                    else DarkerButtonBlue
                )
                .padding(8.dp)
            ) {
                Text(text = chips[it], color = TextWhite)
            }
        }
    }
}