package com.everli.designsystem.playground.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.everli.designsystem.components.button.EverliButton
import com.everli.designsystem.core.constants.EverliColors
import com.everli.designsystem.core.theme.DefaultButtonTheme
import com.everli.designsystem.core.theme.DefaultIconTheme
import com.everli.designsystem.core.theme.DefaultRadiusTheme
import com.everli.designsystem.core.theme.DefaultTextTheme
import com.everli.designsystem.core.theme.DefaultTheme
import com.everli.designsystem.core.theme.DefaultTypography
import com.everli.designsystem.core.theme.EverliTheme

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
    radiusTheme = DefaultRadiusTheme,
    iconTheme = DefaultIconTheme,
    textTheme = DefaultTextTheme,
    content = content,
  )
}

// TODO: ask Ric if this is part of the colors
val purple80 =  Color(0xFFB45A8C)
val purple20 =  Color(0xFFF3EBF0)

val SupplyButtonTheme = DefaultButtonTheme.copy(
  color = DefaultButtonTheme.color.copy(
    primary = DefaultButtonTheme.color.primary.copy(
      fill = DefaultButtonTheme.color.primary.fill.copy(
        background = DefaultButtonTheme.color.primary.fill.background.copy(
          enabled = EverliColors.Violet100,
          pressed = purple80,
        ),
      ),
      outline = DefaultButtonTheme.color.primary.outline.copy(
        background = DefaultButtonTheme.color.primary.outline.background.copy(
          pressed = purple20,
        ),
        border = DefaultButtonTheme.color.primary.outline.border.copy(
          enabled = purple80,
        ),
      ),
      flat = DefaultButtonTheme.color.primary.flat.copy(
        background = DefaultButtonTheme.color.primary.flat.background.copy(
          pressed = purple20,
        ),
      ),
    ),
  ),
)

@Preview
@Composable
fun InnerCustomTheme() {
  DefaultTheme {
    Column {
      // Default Theme
      EverliButton.Button(onClick = { /*TODO*/ }, text = "Default Theme")

      // Inner custom theme
      EverliTheme(
        buttonTheme = SupplyButtonTheme,
      ) {
        EverliButton.Button(onClick = { /*TODO*/ }, text = "Custom Theme")
      }
    }
  }
}
