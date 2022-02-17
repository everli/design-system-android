package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Radius(
  val medium: Dp,
)

// Default
val DefaultRadius = Radius(
  medium = 8.dp,
)
