package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.everli.designsystem.core.constants.EverliColors

@Immutable
data class IconTheme(
  val size: IconSizes,
  val color: IconColors,
)

@Immutable
data class IconSizes(
  val small: Dp,
  val medium: Dp,
)

@Immutable
data class IconColors(
  val light: Color,
  val dark: Color,
  val special: Color,
)

// Default
val DefaultIconTheme = IconTheme(
  size = IconSizes(
    small = 18.dp,
    medium = 24.dp,
  ),
  color = IconColors(
    light = EverliColors.White,
    dark = EverliColors.Black100,
    special = EverliColors.Red100
  ),
)
