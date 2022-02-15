package com.everli.designsystem.playground.color

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.graphics.ColorUtils
import com.everli.designsystem.core.constants.EverliColors
import com.everli.designsystem.core.theme.EverliTheme

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

val brandColors = listOf(
  ColorModel("Walter White", EverliColors.White),
  ColorModel("Gray 10", EverliColors.Gray10),
  ColorModel("Gray 15", EverliColors.Gray15),
  ColorModel("Gray 40", EverliColors.Gray40),
  ColorModel("Gray 80", EverliColors.Gray80),
  ColorModel("Gray 100", EverliColors.Gray100),
  ColorModel("Violet Black", EverliColors.Violet100),
  ColorModel("Red 20", EverliColors.Red20),
  ColorModel("Red Hot", EverliColors.Red100),
  ColorModel("Purple Rain", EverliColors.Violet100),
  ColorModel("Teal 20", EverliColors.Teal20),
  ColorModel("Teal Weaves", EverliColors.Teal100),
  ColorModel("Blue Plus", EverliColors.Blue100),
  ColorModel("Green 10", EverliColors.Green10),
  ColorModel("Everli Green", EverliColors.Green100),
  ColorModel("Deep Green", EverliColors.Green110),
  ColorModel("Yellow 20", EverliColors.Yellow20),
  ColorModel("Yellow Sun", EverliColors.Yellow100),
  ColorModel("Link", EverliColors.Link100),
)

val devColors = listOf(
  ColorModel("White", EverliColors.White),
  ColorModel("Gray 10", EverliColors.Gray10),
  ColorModel("Gray 15", EverliColors.Gray15),
  ColorModel("Gray 40", EverliColors.Gray40),
  ColorModel("Gray 80", EverliColors.Gray80),
  ColorModel("Gray 100", EverliColors.Gray100),
  ColorModel("Black 100", EverliColors.Violet100),
  ColorModel("Red 20", EverliColors.Red20),
  ColorModel("Red 100", EverliColors.Red100),
  ColorModel("Violet 100", EverliColors.Violet100),
  ColorModel("Teal 20", EverliColors.Teal20),
  ColorModel("Teal 100", EverliColors.Teal100),
  ColorModel("Blue 100", EverliColors.Blue100),
  ColorModel("Green 10", EverliColors.Green10),
  ColorModel("Green 100", EverliColors.Green100),
  ColorModel("Green 110", EverliColors.Green110),
  ColorModel("Yellow 20", EverliColors.Yellow20),
  ColorModel("Yellow 100", EverliColors.Yellow100),
  ColorModel("Link100", EverliColors.Link100),
)

@Composable
fun tokenColors() = listOf<ColorModel>(
//  ColorModel("EverliTheme.colors.buttons.primary.background.enabled", EverliTheme.colors.buttons.primary.background.enabled),
//  ColorModel("EverliTheme.colors.buttons.primary.background.disabled", EverliTheme.colors.buttons.primary.background.disabled),
//  ColorModel("EverliTheme.colors.buttons.primary.text.enabled", EverliTheme.colors.buttons.primary.text.enabled),
//  ColorModel("EverliTheme.colors.buttons.primary.text.disabled", EverliTheme.colors.buttons.primary.text.disabled),
)
