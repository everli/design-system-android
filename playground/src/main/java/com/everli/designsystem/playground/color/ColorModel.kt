package com.everli.designsystem.playground.color

import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.ui.theme.Blue100
import com.everli.designsystem.core.ui.theme.Gray10
import com.everli.designsystem.core.ui.theme.Gray100
import com.everli.designsystem.core.ui.theme.Gray15
import com.everli.designsystem.core.ui.theme.Gray40
import com.everli.designsystem.core.ui.theme.Gray80
import com.everli.designsystem.core.ui.theme.Green10
import com.everli.designsystem.core.ui.theme.Green100
import com.everli.designsystem.core.ui.theme.Green110
import com.everli.designsystem.core.ui.theme.Link100
import com.everli.designsystem.core.ui.theme.Red100
import com.everli.designsystem.core.ui.theme.Red20
import com.everli.designsystem.core.ui.theme.Teal100
import com.everli.designsystem.core.ui.theme.Teal20
import com.everli.designsystem.core.ui.theme.Violet100
import com.everli.designsystem.core.ui.theme.White
import com.everli.designsystem.core.ui.theme.Yellow100
import com.everli.designsystem.core.ui.theme.Yellow20

data class ColorModel(
  val name: String,
  val color: Color,
  val textColor: Color
)

val brandColors = listOf(
  ColorModel("Walter White", White, Color.Black),
  ColorModel("Gray 10", Gray10, Color.Black),
  ColorModel("Gray 15", Gray15, Color.Black),
  ColorModel("Gray 40", Gray40, Color.Black),
  ColorModel("Gray 80", Gray80, White),
  ColorModel("Gray 100", Gray100, White),
  ColorModel("Violet Black", Violet100, White),
  ColorModel("Red 20", Red20, Color.Black),
  ColorModel("Red Hot", Red100, White),
  ColorModel("Purple Rain", Violet100, White),
  ColorModel("Teal 20", Teal20, Color.Black),
  ColorModel("Teal Weaves", Teal100, White),
  ColorModel("Blue Plus", Blue100, White),
  ColorModel("Green 10", Green10, Color.Black),
  ColorModel("Everli Green", Green100, White),
  ColorModel("Deep Green", Green110, White),
  ColorModel("Yellow 20", Yellow20, Color.Black),
  ColorModel("Yellow Sun", Yellow100, Color.Black),
  ColorModel("Link", Link100, White),
)

val devColors = listOf(
  ColorModel("White", White, Color.Black),
  ColorModel("Gray 10", Gray10, Color.Black),
  ColorModel("Gray 15", Gray15, Color.Black),
  ColorModel("Gray 40", Gray40, Color.Black),
  ColorModel("Gray 80", Gray80, White),
  ColorModel("Gray 100", Gray100, White),
  ColorModel("Black 100", Violet100, White),
  ColorModel("Red 20", Red20, Color.Black),
  ColorModel("Red 100", Red100, White),
  ColorModel("Violet 100", Violet100, White),
  ColorModel("Teal 20", Teal20, Color.Black),
  ColorModel("Teal 100", Teal100, White),
  ColorModel("Blue 100", Blue100, White),
  ColorModel("Green 10", Green10, Color.Black),
  ColorModel("Green 100", Green100, White),
  ColorModel("Green 110", Green110, White),
  ColorModel("Yellow 20", Yellow20, Color.Black),
  ColorModel("Yellow 100", Yellow100, Color.Black),
  ColorModel("Link100", Link100, White),
)
