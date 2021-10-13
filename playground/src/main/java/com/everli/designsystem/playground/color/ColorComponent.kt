package com.everli.designsystem.playground.color

import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.ui.theme.Blue100
import com.everli.designsystem.core.ui.theme.Gray10
import com.everli.designsystem.core.ui.theme.Gray100
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

data class ColorComponent(
  val name: String,
  val color: Color,
  val textColor: Color
)

val brandColors = listOf(
  ColorComponent("Walter White", White, Color.Black),
  ColorComponent("Gray 10", Gray10, Color.Black),
  ColorComponent("Gray 40", Gray40, Color.Black),
  ColorComponent("Gray 80", Gray80, White),
  ColorComponent("Gray 100", Gray100, White),
  ColorComponent("Violet Black", Violet100, White),
  ColorComponent("Red 20", Red20, Color.Black),
  ColorComponent("Red Hot", Red100, White),
  ColorComponent("Purple Rain", Violet100, White),
  ColorComponent("Teal 20", Teal20, Color.Black),
  ColorComponent("Teal Weaves", Teal100, White),
  ColorComponent("Blue Plus", Blue100, White),
  ColorComponent("Green 10", Green10, Color.Black),
  ColorComponent("Everli Green", Green100, White),
  ColorComponent("Deep Green", Green110, White),
  ColorComponent("Yellow 20", Yellow20, Color.Black),
  ColorComponent("Yellow Sun", Yellow100, Color.Black),
  ColorComponent("Link", Link100, White),
)

val devColors = listOf(
  ColorComponent("White", White, Color.Black),
  ColorComponent("Gray 10", Gray10, Color.Black),
  ColorComponent("Gray 40", Gray40, Color.Black),
  ColorComponent("Gray 80", Gray80, White),
  ColorComponent("Gray 100", Gray100, White),
  ColorComponent("Black 100", Violet100, White),
  ColorComponent("Red 20", Red20, Color.Black),
  ColorComponent("Red 100", Red100, White),
  ColorComponent("Violet 100", Violet100, White),
  ColorComponent("Teal 20", Teal20, Color.Black),
  ColorComponent("Teal 100", Teal100, White),
  ColorComponent("Blue 100", Blue100, White),
  ColorComponent("Green 10", Green10, Color.Black),
  ColorComponent("Green 100", Green100, White),
  ColorComponent("Green 110", Green110, White),
  ColorComponent("Yellow 20", Yellow20, Color.Black),
  ColorComponent("Yellow 100", Yellow100, Color.Black),
  ColorComponent("Link100", Link100, White),
)
