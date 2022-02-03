package com.everli.designsystem.playground.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import com.everli.designsystem.playground.color.ColorsList
import com.everli.designsystem.playground.color.tokenColors

@ExperimentalFoundationApi
@Composable
fun TokensPlayground() {
  ColorsList(colors = tokenColors())
}
