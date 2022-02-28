package com.everli.designsystem.core.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Root Composable tha provides all LocalProviders with all values
 * need by the design system components.
 *
 * All parameters should map 1:1 design tokens
 *
 * @param typography all text styles used in the design system
 * @param buttonTheme button tokens
 * @param dimensions misc. dimension not yet tokenized
 * @param radius global radius tokens
 * @param content content ot be rendered inside
 */
@Composable
fun EverliTheme(
  typography: EverliTypography = EverliTheme.typography,
  buttonTheme: ButtonTheme = EverliTheme.button,
  dimensions: Dimensions = EverliTheme.dimensions,
  radius: Radius = EverliTheme.radius,
  content: @Composable() () -> Unit,
) {
  // N.B. currently we extend MaterialTheme, with time we might end up replacing it
  CompositionLocalProvider(
    LocalTypography provides typography,
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
 * Utility data class used to pass around required theme components
 * to create a [EverliTheme] with all props defaulting to design sytsem default values:
 * [DefaultTypography]
 * [DefaultButtonTheme]
 * [DefaultDimensions]
 * [DefaultRadius]
 */
data class EverliThemeComponents(
  val everliTypography: EverliTypography = DefaultTypography,
  val buttonTheme: ButtonTheme = DefaultButtonTheme,
  val dimensions: Dimensions = DefaultDimensions,
  val radius: Radius = DefaultRadius,
)

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

  val typography: EverliTypography
    @Composable
    @ReadOnlyComposable
    get() = LocalTypography.current

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

private val LocalTypography = staticCompositionLocalOf<EverliTypography> {
  error("No EverliTypography provided")
}

private val LocalDimensions = staticCompositionLocalOf<Dimensions> {
  error("No Dimensions provided")
}

private val LocalRadius = staticCompositionLocalOf<Radius> {
  error("No Radius provided")
}

/**
 * A Material [Colors] implementation which sets all colors to [debugColor] to discourage usage of
 * [MaterialTheme.colors] in favor of [EverliTheme] tokens.
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
