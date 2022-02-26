package com.baz.meditationuicompose.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.baz.meditationuicompose.R
import com.baz.meditationuicompose.ui.theme.ButtonBlue
import com.baz.meditationuicompose.ui.theme.LightRed
import com.baz.meditationuicompose.ui.theme.TextWhite

@Preview
@Composable
fun InSpotLight(
    color: Color = LightRed
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(16.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(color)
            .padding(horizontal = 16.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {

        Column {
            Text(
                text = "Daily Thought",
                style = MaterialTheme.typography.h2
            )
            Text(
                text = "Meditation • 3-10 min",
                style = MaterialTheme.typography.body1,
                color = TextWhite
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(ButtonBlue)
                .padding(8.dp)
        ) {

            Icon(painter = painterResource(id = R.drawable.ic_play),
                contentDescription ="Play now",
                tint = Color.White,
                modifier = Modifier
                    .size(24.dp)
                    .padding(4.dp)
            )
        }
    }

}