package com.rainbow.airplane.ui.view


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rainbow.airplane.R
import com.rainbow.airplane.utils.FontUtil.ScoreFontFamily


@Composable
fun GameStart() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        Image(
            painter = painterResource(id = R.drawable.sprite_title),
            contentScale = ContentScale.FillWidth,
            contentDescription = null,
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally)
                .width(300.dp)
                .wrapContentHeight()
        )


        TextButton(
            onClick = { },
            modifier = Modifier
                .weight(1f)
                .padding(20.dp)
                .wrapContentSize()
                .align(Alignment.CenterHorizontally)
                .background(Color.Transparent),
            border = BorderStroke(1.dp, Color.DarkGray),
            content = {
                Text(
                    text = stringResource(id = R.string.start_game),
                    modifier = Modifier
                        .padding(start = 4.dp)
                        .wrapContentWidth(Alignment.End),
                    style = MaterialTheme.typography.h5,
                    color = Color.Black,
                    fontFamily = ScoreFontFamily
                )
            }
        )

    }
}

@Preview
@Composable
fun PreviewGameStart() {
    Background()
    GameStart()
}