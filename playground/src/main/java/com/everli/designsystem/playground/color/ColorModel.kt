package com.everli.designsystem.playground.color

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.graphics.ColorUtils
import com.everli.designsystem.core.constants.EverliColor
import com.everli.designsystem.core.constants.EverliColors

fun textColor(color: Color): Color {
  val contrast = ColorUtils.calculateContrast(color.toArgb(), EverliColors.White.toArgb())
  return if (contrast > 1.5f) {
    EverliColors.White
  } else {
    Color.Black
  }
}

data class ColorModel(
  val name: String,
  val color: Color,
  val textColor: Color = textColor(color = color),
)

val colors = EverliColor.values()
  .filter { color -> color != EverliColor.TRANSPARENT }
  .map { color ->
    ColorModel(name = color.designName, color = color.color, textColor = textColor(color.color))
  }

