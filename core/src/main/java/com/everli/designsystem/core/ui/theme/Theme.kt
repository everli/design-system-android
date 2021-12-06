package com.everli.designsystem.core.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

@Composable
fun EverliTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
  // check for darkTheme in case of future dark theme
  val colors = LightColorPalette
  val typography = DefaultEverliTypography

  // N.B. currently we extend MaterialTheme, with time we will end up replacing it
  CompositionLocalProvider(
    LocalEverliColors provides colors,
    LocalEverliTypography provides typography) {
    MaterialTheme(
      colors = debugColors(),
      content = content
    )
  }

}

object EverliTheme {
  val colors: EverliColors
    @Composable
    get() = LocalEverliColors.current

  val typography: EverliTypography
    @Composable
    get() = LocalEverliTypography.current
}

private val LocalEverliColors = staticCompositionLocalOf<EverliColors> {
  error("No EverliColors provided")
}

val LocalEverliTypography = staticCompositionLocalOf<EverliTypography> {
  error("No EverliTypography provided")
}
