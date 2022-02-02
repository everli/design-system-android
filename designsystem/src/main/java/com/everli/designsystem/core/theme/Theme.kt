package com.everli.designsystem.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

@Composable
fun EverliTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
  // check for darkTheme in case of future dark theme
  val colors = LightColorPalette
  val typography = DefaultEverliTypography
  val shapes = DefaultEverliShapes
  val dimensions = DefaultEverliDimensions

  // N.B. currently we extend MaterialTheme, with time we might end up replacing it
  CompositionLocalProvider(
    LocalEverliColors provides colors,
    LocalEverliTypography provides typography,
    LocalEverliDimensions provides dimensions,
    LocalEverliShapes provides shapes,
  ) {
    MaterialTheme(
      colors = debugColors(),
      content = content
    )
  }

}

/**
 * Contains functions to access the current values in the given composable hierarchy
 * This will be used in other components to access default values of the theme.
 *
 * Those components will work as long as in the hierarchy a actual [CompositionLocalProvider]
 * is provided with the below contents.
 *
 * Usually you would use the [EverliTheme] composition function as root OR implement your custom Theme
 */
object EverliTheme {

  val colors: EverliColors
    @Composable
    @ReadOnlyComposable
    get() = LocalEverliColors.current

  val typography: EverliTypography
    @Composable
    @ReadOnlyComposable
    get() = LocalEverliTypography.current

  val dimensions: EverliDimensions
    @Composable
    @ReadOnlyComposable
    get() = LocalEverliDimensions.current

  val shapes: EverliShapes
    @Composable
    @ReadOnlyComposable
    get() = LocalEverliShapes.current
}

private val LocalEverliColors = staticCompositionLocalOf<EverliColors> {
  error("No EverliColors provided")
}

val LocalEverliTypography = staticCompositionLocalOf<EverliTypography> {
  error("No EverliTypography provided")
}

val LocalEverliDimensions = staticCompositionLocalOf<EverliDimensions> {
  error("No EverliDimensions provided")
}

val LocalEverliShapes = staticCompositionLocalOf<EverliShapes> {
  error("No EverliShapes provided")
}
