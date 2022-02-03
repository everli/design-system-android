package com.everli.designsystem.core.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.dp

@Immutable
data class EverliShapes(
  val roundedCornersButton: CornerBasedShape,
)

val DefaultEverliShapes = EverliShapes(
  roundedCornersButton = RoundedCornerShape(8.dp),
)
