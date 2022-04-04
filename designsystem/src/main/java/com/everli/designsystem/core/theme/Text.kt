package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.constants.EverliColors

@Immutable
data class TextTheme(
  val color: TextColors,
)

@Immutable
data class TextColors(
  val primary: Color,
  val negative: Color,
  val special: Color,
)

// Default
val DefaultTextTheme = TextTheme(
  color = TextColors(
    primary = EverliColors.Black100,
    negative = EverliColors.White,
    special = EverliColors.Red100,
  )
)
