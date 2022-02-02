package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class EverliDimensions(
  val button: ButtonDimensions,
)

@Immutable
data class ButtonDimensions(
  val minWidth: Dp,
  val minHeightSmall: Dp,
  val minHeightDefault: Dp,
  val minHeightLarge: Dp,
)

val DefaultEverliDimensions = EverliDimensions(
  button = ButtonDimensions(
    minWidth = 112.dp,
    minHeightSmall = 36.dp,
    minHeightDefault = 44.dp,
    minHeightLarge = 48.dp,
  )
)
