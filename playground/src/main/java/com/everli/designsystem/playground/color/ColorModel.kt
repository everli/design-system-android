package com.everli.designsystem.playground.color

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.graphics.ColorUtils
import com.everli.designsystem.core.theme.Blue100
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.core.theme.Gray10
import com.everli.designsystem.core.theme.Gray100
import com.everli.designsystem.core.theme.Gray15
import com.everli.designsystem.core.theme.Gray40
import com.everli.designsystem.core.theme.Gray80
import com.everli.designsystem.core.theme.Green10
import com.everli.designsystem.core.theme.Green100
import com.everli.designsystem.core.theme.Green110
import com.everli.designsystem.core.theme.Link100
import com.everli.designsystem.core.theme.Red100
import com.everli.designsystem.core.theme.Red20
import com.everli.designsystem.core.theme.Teal100
import com.everli.designsystem.core.theme.Teal20
import com.everli.designsystem.core.theme.Violet100
import com.everli.designsystem.core.theme.White
import com.everli.designsystem.core.theme.Yellow100
import com.everli.designsystem.core.theme.Yellow20

fun textColor(color: Color): Color {
  val contrast = ColorUtils.calculateContrast(color.toArgb(), White.toArgb())
  return if (contrast > 1.5f) {
    White
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
  ColorModel("Walter White", White),
  ColorModel("Gray 10", Gray10),
  ColorModel("Gray 15", Gray15),
  ColorModel("Gray 40", Gray40),
  ColorModel("Gray 80", Gray80),
  ColorModel("Gray 100", Gray100),
  ColorModel("Violet Black", Violet100),
  ColorModel("Red 20", Red20),
  ColorModel("Red Hot", Red100),
  ColorModel("Purple Rain", Violet100),
  ColorModel("Teal 20", Teal20),
  ColorModel("Teal Weaves", Teal100),
  ColorModel("Blue Plus", Blue100),
  ColorModel("Green 10", Green10),
  ColorModel("Everli Green", Green100),
  ColorModel("Deep Green", Green110),
  ColorModel("Yellow 20", Yellow20),
  ColorModel("Yellow Sun", Yellow100),
  ColorModel("Link", Link100),
)

val devColors = listOf(
  ColorModel("White", White),
  ColorModel("Gray 10", Gray10),
  ColorModel("Gray 15", Gray15),
  ColorModel("Gray 40", Gray40),
  ColorModel("Gray 80", Gray80),
  ColorModel("Gray 100", Gray100),
  ColorModel("Black 100", Violet100),
  ColorModel("Red 20", Red20),
  ColorModel("Red 100", Red100),
  ColorModel("Violet 100", Violet100),
  ColorModel("Teal 20", Teal20),
  ColorModel("Teal 100", Teal100),
  ColorModel("Blue 100", Blue100),
  ColorModel("Green 10", Green10),
  ColorModel("Green 100", Green100),
  ColorModel("Green 110", Green110),
  ColorModel("Yellow 20", Yellow20),
  ColorModel("Yellow 100", Yellow100),
  ColorModel("Link100", Link100),
)

@Composable
fun tokenColors() = listOf(
  ColorModel("EverliTheme.colors.buttons.primary.background.enabled", EverliTheme.colors.buttons.primary.background.enabled),
  ColorModel("EverliTheme.colors.buttons.primary.background.disabled", EverliTheme.colors.buttons.primary.background.disabled),
  ColorModel("EverliTheme.colors.buttons.primary.text.enabled", EverliTheme.colors.buttons.primary.text.enabled),
  ColorModel("EverliTheme.colors.buttons.primary.text.disabled", EverliTheme.colors.buttons.primary.text.disabled),
)
