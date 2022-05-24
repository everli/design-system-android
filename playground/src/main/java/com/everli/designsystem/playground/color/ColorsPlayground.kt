package com.everli.designsystem.playground.color

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.everli.designsystem.core.constants.EverliColors
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun ColorItem(colorModel: ColorModel) {
  Card(
    backgroundColor = colorModel.color,
    elevation = 10.dp,
    modifier = Modifier
      .fillMaxWidth()
      .height(100.dp)
      .padding(16.dp)
  ) {
    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center,
    ) {
      Text(
        text = colorModel.name,
        color = colorModel.textColor,
        textAlign = TextAlign.Center,
      )
      Text(
        text = "(${"#" + Integer.toHexString(colorModel.color.toArgb()).uppercase()})",
        color = colorModel.textColor,
        textAlign = TextAlign.Center,
      )
    }
  }
}

@Composable
@ExperimentalFoundationApi
fun ColorsGrid(colors: List<ColorModel>) {
  LazyVerticalGrid(
    cells = GridCells.Fixed(2)
  ) {
    items(colors.size) { index ->
      ColorItem(colors[index])
    }
  }
}

@ExperimentalPagerApi
@ExperimentalFoundationApi
@Composable
fun ColorsPlayground() {
  Column {
    ColorsGrid(colors = colors)
  }
}

@ExperimentalFoundationApi
@Preview
@Composable
fun ColorGridP() {
  ColorsGrid(colors)
}
