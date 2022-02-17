package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// TODO: dimensions that are not yet tokenized
//  could be removed in the future and split in their own sub tokens class similar to Radius
@Immutable
data class Dimensions(
  val button: ButtonDimensions,
)

@Immutable
data class ButtonDimensions(
  val minWidth: Dp,
)

// Default
val DefaultDimensions = Dimensions(
  button = ButtonDimensions(
    minWidth = 112.dp,
  )
)
