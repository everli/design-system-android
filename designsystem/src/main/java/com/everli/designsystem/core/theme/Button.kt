package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.everli.designsystem.core.constants.EverliColors

@Immutable
data class ButtonTheme(
  val radius: Dp,
  val size: ButtonStyleValues<Dp>,
  val text: ButtonStyleValues<TextStyle>,
  val color: ButtonsColors,
)

@Immutable
data class ButtonStyleValues<T>(
  val small: T,
  val medium: T,
  val large: T,
)

@Immutable
data class ButtonsColors(
  val primary: ButtonColors,
)

@Immutable
data class ButtonColors(
  val background: StateColor,
  val text: StateColor,
)

// Default
val DefaultButtonTheme = ButtonTheme(
  radius = DefaultRadius.medium,
  size = ButtonStyleValues(
    small = 36.dp,
    medium = 44.dp,
    large = 48.dp,
  ),
  text = ButtonStyleValues(
    small = DefaultTypography.bodySmallSemibold,
    medium = DefaultTypography.bodySemibold,
    large = DefaultTypography.subtitleSemibold,
  ),
  color = ButtonsColors(
    primary = ButtonColors(
      background = StateColor(
        enabled = EverliColors.Green100,
        disabled = EverliColors.Gray15,
      ),
      text = StateColor(
        enabled = EverliColors.White,
        disabled = EverliColors.Gray100,
      ),
    ),
  ),
)
