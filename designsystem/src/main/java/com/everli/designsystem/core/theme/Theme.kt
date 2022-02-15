package com.everli.designsystem.core.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Composable
fun EverliTheme(
  typography: Typography = EverliTheme.typography,
  buttonTheme: ButtonTheme = EverliTheme.button,
  dimensions: Dimensions = EverliTheme.dimensions,
  radius: Radius = EverliTheme.radius,
  content: @Composable() () -> Unit,
) {
  // N.B. currently we extend MaterialTheme, with time we might end up replacing it
  CompositionLocalProvider(
    LocalEverliTypography provides typography,
    LocalButtonTheme provides buttonTheme,
    LocalDimensions provides dimensions,
    LocalRadius provides radius,
  ) {
    MaterialTheme(
      colors = debugColors(),
      content = content,
    )
  }
}

/**
 * This is the default Theme provided by the design system
 * Used it as root of your composition tree or create a new Theme
 * either based on this one or from scratch
 */
@Composable
fun DefaultTheme(content: @Composable () -> Unit) {
  EverliTheme(
    typography = DefaultTypography,
    buttonTheme = DefaultButtonTheme,
    dimensions = DefaultDimensions,
    radius = DefaultRadius,
    content = content,
  )
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

  val typography: Typography
    @Composable
    @ReadOnlyComposable
    get() = LocalEverliTypography.current

  val button: ButtonTheme
    @Composable
    @ReadOnlyComposable
    get() = LocalButtonTheme.current

  val dimensions: Dimensions
    @Composable
    @ReadOnlyComposable
    get() = LocalDimensions.current

  val radius: Radius
    @Composable
    @ReadOnlyComposable
    get() = LocalRadius.current
}

private val LocalButtonTheme = staticCompositionLocalOf<ButtonTheme> {
  error("No ButtonTheme provided")
}

private val LocalEverliTypography = staticCompositionLocalOf<Typography> {
  error("No Typography provided")
}

private val LocalDimensions = staticCompositionLocalOf<Dimensions> {
  error("No Dimensions provided")
}

private val LocalRadius = staticCompositionLocalOf<Radius> {
  error("No Radius provided")
}

/**
 * A Material [Colors] implementation which sets all colors to [debugColor] to discourage usage of
 * [MaterialTheme.colors] in preference to [EverliTheme.colors].
 */
fun debugColors(
  darkTheme: Boolean = false,
  debugColor: Color = Color.Magenta,
) = Colors(
  primary = debugColor,
  primaryVariant = debugColor,
  secondary = debugColor,
  secondaryVariant = debugColor,
  background = debugColor,
  surface = debugColor,
  error = debugColor,
  onPrimary = debugColor,
  onSecondary = debugColor,
  onBackground = debugColor,
  onSurface = debugColor,
  onError = debugColor,
  isLight = !darkTheme
)
