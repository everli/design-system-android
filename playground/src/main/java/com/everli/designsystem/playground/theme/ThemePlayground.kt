package com.everli.designsystem.playground.theme

import androidx.compose.runtime.Composable
import com.everli.designsystem.core.theme.Black100
import com.everli.designsystem.core.theme.ButtonColors
import com.everli.designsystem.core.theme.DefaultEverliDimensions
import com.everli.designsystem.core.theme.DefaultEverliShapes
import com.everli.designsystem.core.theme.DefaultEverliTypography
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.core.theme.Green10
import com.everli.designsystem.core.theme.LightColorPalette
import com.everli.designsystem.core.theme.Red20
import com.everli.designsystem.core.theme.StateColor
import com.everli.designsystem.core.theme.Teal20
import com.everli.designsystem.core.theme.Violet100
import com.everli.designsystem.core.theme.Yellow20

enum class Themes {
  DEFAULT,
  TOXIC_PINK,
  BLUE_WAVES,
}

@Composable
fun ThemePlaygroundContent(themes: Themes, content: @Composable () -> Unit) {
  val colors = when (themes) {
    Themes.DEFAULT -> {
      LightColorPalette
    }
    Themes.TOXIC_PINK -> {
      ToxicPinkColors
    }
    Themes.BLUE_WAVES -> {
      BlueWavesColors
    }
  }

  EverliTheme(
    colors = colors,
    typography = DefaultEverliTypography,
    dimensions = DefaultEverliDimensions,
    shapes = DefaultEverliShapes,
    content = content,
  )
}

val ToxicPinkColors = LightColorPalette.copy(
  buttons = LightColorPalette.buttons.copy(
    primary = ButtonColors(
      background = StateColor(
        enabled = Red20,
        disabled = Yellow20,
      ),
      text = StateColor(
        enabled = Violet100,
        disabled = Black100,
      )
    )
  ))

val BlueWavesColors = LightColorPalette.copy(
  buttons = LightColorPalette.buttons.copy(
    primary = ButtonColors(
      background = StateColor(
        enabled = Teal20,
        disabled = Green10,
      ),
      text = StateColor(
        enabled = Violet100,
        disabled = Yellow20,
      )
    )
  ))
