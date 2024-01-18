package com.everli.designsystem.core.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Root Composable that provides all LocalProviders with all values need by the design system components.
 * All parameters should map 1:1 design tokens provided by design
 *
 * @param typography all text styles used in the design system
 * @param radiusTheme global radius tokens
 * @param textTheme global text tokens
 * @param iconTheme global icon tokens
 * @param materialColors colors to override default material ones if needed
 * @param materialTypography text styles to override default material ones if needed
 * @param materialShapes shapes to override default material ones if needed
 * @param content content ot be rendered inside
 */
@Composable
fun EverliTheme(
  typography: EverliTypography = EverliTheme.typography,
  radiusTheme: RadiusTheme = EverliTheme.radius,
  iconTheme: IconTheme = EverliTheme.icon,
  textTheme: TextTheme = EverliTheme.text,
  materialColors: Colors = MaterialTheme.colors,
  materialTypography: Typography = MaterialTheme.typography,
  materialShapes: Shapes = MaterialTheme.shapes,
  content: @Composable () -> Unit,
) {
  CompositionLocalProvider(
    LocalTypography provides typography,
    LocalRadiusTheme provides radiusTheme,
    LocalTextTheme provides textTheme,
    LocalIconTheme provides iconTheme,
  ) {
    MaterialTheme(
      colors = materialColors,
      typography = materialTypography,
      shapes = materialShapes,
      content = content,
    )
  }
}

/**
 * Utility data class used to pass around required theme components
 * to create a [EverliTheme] with all props defaulting to design system default values:
 * [DefaultTypography]
 * [DefaultTextTheme]
 * [DefaultIconTheme]
 */
data class EverliThemeComponents(
  val everliTypography: EverliTypography = DefaultTypography,
  val radiusTheme: RadiusTheme = DefaultRadiusTheme,
  val textTheme: TextTheme = DefaultTextTheme,
  val iconTheme: IconTheme = DefaultIconTheme,
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
    radiusTheme = DefaultRadiusTheme,
    iconTheme = DefaultIconTheme,
    textTheme = DefaultTextTheme,
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

  val radius: RadiusTheme
    @Composable
    @ReadOnlyComposable
    get() = LocalRadiusTheme.current

  val text: TextTheme
    @Composable
    @ReadOnlyComposable
    get() = LocalTextTheme.current

  val icon: IconTheme
    @Composable
    @ReadOnlyComposable
    get() = LocalIconTheme.current
}

private val LocalTypography = staticCompositionLocalOf<EverliTypography> {
  error("No EverliTypography provided")
}

private val LocalRadiusTheme = staticCompositionLocalOf<RadiusTheme> {
  error("No RadiusTheme provided")
}

private val LocalTextTheme = staticCompositionLocalOf<TextTheme> {
  error("No TextTheme provided")
}

private val LocalIconTheme = staticCompositionLocalOf<IconTheme> {
  error("No IconTheme provided")
}

/**
 * A Material [Colors] implementation which sets all colors to [debugColor] to discourage usage of
 * [MaterialTheme.colors] in favor of [EverliTheme] tokens.
 */
internal fun debugColors(
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
  isLight = !darkTheme,
)
