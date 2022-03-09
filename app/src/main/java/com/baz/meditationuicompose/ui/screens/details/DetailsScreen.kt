package com.baz.meditationuicompose.ui.screens.details


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.baz.meditationuicompose.R
import com.baz.meditationuicompose.ui.composable.Feature
import com.baz.meditationuicompose.ui.theme.*
import com.baz.meditationuicompose.ui.util.standardQuadFromTo

//@Preview
@ExperimentalFoundationApi
@Composable
fun DetailsScreen(feature: Feature) {

    BoxWithConstraints(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {

        Column {
//        1
            ToolbarSection()

//        2
            TittleSection(feature)

//        3
            PlayingSection(
                feature = Feature(
                    title = "Sleep meditation",
                    R.drawable.ic_headphone,
                    BlueViolet1,
                    BlueViolet2,
                    BlueViolet3,
                    description = "Ease the mind into a restful night's sleep with these deep, amblent tones",
                    type = "Sleep music",
                    totalTime = "45min",
                    totalSaved = 12542,
                    totalListening = 43453
                )
            )

//        4
            PlayingDetailsSection(
                feature = Feature(
                    title = "Sleep meditation",
                    R.drawable.ic_headphone,
                    BlueViolet1,
                    BlueViolet2,
                    BlueViolet3,
                    description = "Ease the mind into a restful night's sleep with these deep, amblent tones",
                    type = "Sleep music",
                    totalTime = "45min",
                    totalSaved = 12542,
                    totalListening = 43453
                )
            )

//        5
            RelatedSection()
        }
    }
}

@Composable
fun RelatedSection() {

}

@Composable
fun PlayingDetailsSection(feature: Feature) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
//            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                modifier = Modifier
                    .padding(end = 16.dp),
                text = feature.type,
                style = MaterialTheme.typography.subtitle1.merge(
                    other = TextStyle(Color.Gray)
                )
            )

            Canvas(
                modifier = Modifier
                    .size(18.dp)
            ) {

                drawCircle(color = Color.Gray, radius = size.width / 16)
            }

            Text(
                modifier = Modifier.padding(start = 16.dp),
                text = feature.totalTime,
                style = MaterialTheme.typography.subtitle1.merge(
                    other = TextStyle(Color.Gray)
                )
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {

            Text(
                text = feature.description,
                style = MaterialTheme.typography.subtitle1
                    .merge(other = TextStyle(color = Color.Gray))
            )
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.ic_star),
                    tint = Color.White,
                    modifier = Modifier.size(24.dp),
                    contentDescription = "saved"
                )

                Text(
                    modifier = Modifier.padding(start = 16.dp),
                    text = "${feature.totalSaved}",
                    style = MaterialTheme.typography.subtitle1
                        .merge(other = TextStyle(color = Color.White))
                )
            }

            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.ic_headphone),
                    tint = Color.White,
                    modifier = Modifier.size(18.dp),
                    contentDescription = "saved"
                )


                Text(
                    modifier = Modifier.padding(start = 16.dp),
                    text = "${feature.totalListening}",
                    style = MaterialTheme.typography.subtitle1
                        .merge(other = TextStyle(color = Color.White))
                )
            }
        }
    }
}

@Composable
fun PlayingSection(feature: Feature) {

    BoxWithConstraints(
        modifier = Modifier
            .padding(7.5.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(feature.darkColor)
    ) {
        val width = constraints.maxWidth
        val height = constraints.maxHeight

        // Medium colored path
        val mediumColoredPoint1 = Offset(0f, height * 0.3f)
        val mediumColoredPoint2 = Offset(width * 0.1f, height * 0.35f)
        val mediumColoredPoint3 = Offset(width * 0.4f, height * 0.05f)
        val mediumColoredPoint4 = Offset(width * 0.75f, height * 0.7f)
        val mediumColoredPoint5 = Offset(width * 1.4f, -height.toFloat())

        val mediumColoredPath = Path().apply {
            moveTo(mediumColoredPoint1.x, mediumColoredPoint1.y)
            standardQuadFromTo(mediumColoredPoint1, mediumColoredPoint2)
            standardQuadFromTo(mediumColoredPoint2, mediumColoredPoint3)
            standardQuadFromTo(mediumColoredPoint3, mediumColoredPoint4)
            standardQuadFromTo(mediumColoredPoint4, mediumColoredPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }

        // Light colored path
        val lightPoint1 = Offset(0f, height * 0.35f)
        val lightPoint2 = Offset(width * 0.1f, height * 0.4f)
        val lightPoint3 = Offset(width * 0.3f, height * 0.35f)
        val lightPoint4 = Offset(width * 0.65f, height.toFloat())
        val lightPoint5 = Offset(width * 1.4f, -height.toFloat() / 3f)

        val lightColoredPath = Path().apply {
            moveTo(lightPoint1.x, lightPoint1.y)
            standardQuadFromTo(lightPoint1, lightPoint2)
            standardQuadFromTo(lightPoint2, lightPoint3)
            standardQuadFromTo(lightPoint3, lightPoint4)
            standardQuadFromTo(lightPoint4, lightPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }
        Canvas(
            modifier = Modifier
                .fillMaxSize()
        ) {
            drawPath(
                path = mediumColoredPath,
                color = feature.mediumColor
            )
            drawPath(
                path = lightColoredPath,
                color = feature.lightColor
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Transparent)
                .padding(15.dp)
        ) {

            Icon(
                painter = painterResource(id = feature.iconId),
                contentDescription = feature.title,
                tint = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomStart)
//                    .size(24.dp)
                    .padding(vertical = 4.dp)
            )
            Text(
                text = "Start",
                color = TextWhite,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable {
                        // Handle the click
                    }
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(10.dp))
                    .background(ButtonBlue)
                    .padding(vertical = 6.dp, horizontal = 15.dp)
            )
        }
    }
}

@Composable
fun TittleSection(feature: Feature) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.Start

    ) {

        Text(
            text = feature.title,
            style = MaterialTheme.typography.h2
                .merge(other = TextStyle(color = Color.White, fontWeight = FontWeight.W400))
        )

        Text(
            text = feature.description.ifEmpty { "Best practice medications" },
            style = MaterialTheme.typography.body1
                .merge(other = TextStyle(color = Color.White))
        )
    }
}


//@Preview
@Composable
fun ToolbarSection() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Icon(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "back arrow",
            tint = Color.White,
            modifier = Modifier.size(18.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_star_border),
            contentDescription = "back arrow",
            tint = Color.White,
            modifier = Modifier.size(18.dp)
        )

    }
}
