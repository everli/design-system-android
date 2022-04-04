package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class RadiusTheme(
  val medium: Dp,
)

// Default
val DefaultRadiusTheme = RadiusTheme(
  medium = 8.dp,
)
