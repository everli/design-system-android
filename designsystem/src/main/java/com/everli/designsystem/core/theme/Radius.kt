package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class RadiusTheme(
  val small: Dp,
  val medium: Dp,
  val large: Dp,
  val full: Dp,
)

// Default
val DefaultRadiusTheme = RadiusTheme(
  small = 3.dp,
  medium = 8.dp,
  large = 16.dp,
  full = 40.dp,
)
