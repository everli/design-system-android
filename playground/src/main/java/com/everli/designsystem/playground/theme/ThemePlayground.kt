package com.everli.designsystem.playground.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.everli.designsystem.components.button.EverliButton
import com.everli.designsystem.core.constants.EverliColors
import com.everli.designsystem.core.theme.ButtonColors
import com.everli.designsystem.core.theme.DefaultButtonTheme
import com.everli.designsystem.core.theme.DefaultDimensions
import com.everli.designsystem.core.theme.DefaultRadius
import com.everli.designsystem.core.theme.DefaultTheme
import com.everli.designsystem.core.theme.DefaultTypography
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.core.theme.StateColor

enum class Themes {
  DEMAND,
  SUPPLY,
}

@Composable
fun ThemePlaygroundContent(themes: Themes, content: @Composable () -> Unit) {
  val buttonTheme = when (themes) {
    Themes.DEMAND -> {
      DefaultButtonTheme
    }
    Themes.SUPPLY -> {
      SupplyButtonTheme
    }
  }

  EverliTheme(
    buttonTheme = buttonTheme,
    typography = DefaultTypography,
    dimensions = DefaultDimensions,
    radius = DefaultRadius,
    content = content,
  )
}

val SupplyButtonTheme = DefaultButtonTheme.copy(
  color = DefaultButtonTheme.color.copy(
    primary = ButtonColors(
      background = StateColor(
        enabled = EverliColors.Violet100,
        disabled = EverliColors.Gray15,
      ),
      text = StateColor(
        enabled = EverliColors.White,
        disabled = EverliColors.Gray100,
      )
    )
  ))

@Preview
@Composable
fun InnerCustomTheme() {
  DefaultTheme {
    Column {
      // Default Theme
      EverliButton(onClick = { /*TODO*/ }, text = "Default Theme")

      // Inner custom theme
      EverliTheme(
        buttonTheme = SupplyButtonTheme,
      ) {
        EverliButton(onClick = { /*TODO*/ }, text = "Custom Theme")
      }
    }
  }
}