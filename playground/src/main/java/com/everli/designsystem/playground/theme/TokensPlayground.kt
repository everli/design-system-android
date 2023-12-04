package com.everli.designsystem.playground.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@ExperimentalFoundationApi
@Composable
fun TokensPlayground() {
  // ColorsList(colors = tokenColors())
  Column(
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
      .fillMaxHeight()
      .fillMaxWidth(),
  ) {
    Text("\uD83D\uDEA7 Work in progress \uD83D\uDEA7", modifier = Modifier)
  }
}
