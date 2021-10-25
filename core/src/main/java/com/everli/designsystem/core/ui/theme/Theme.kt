package com.everli.designsystem.core.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Composable
fun EverliTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
  // check for darkTheme in case of future dark theme
  val colors = LightColorPalette
  val typography = defaultTypography

  // N.B. currently we extend MaterialTheme, with time we will end up replacing it
  CompositionLocalProvider(
    LocalEverliColors provides colors,
    LocalCustomTypography provides typography) {
    MaterialTheme(
      content = content
    )
  }

}

private val LocalEverliColors = staticCompositionLocalOf<EverliColors> {
  error("No EverliColors provided")
}

val LocalCustomTypography = staticCompositionLocalOf<EverliTypography> {
  error("No EverliTypography provided")
}

private val LightColorPalette = EverliColors(
  white = White,
  gray10 = Gray10,
  gray40 = Gray40,
  gray80 = Gray80,
  gray100 = Gray100,
  black100 = Black100,
  red20 = Red20,
  red100 = Red100,
  violet100 = Violet100,
  teal20 = Teal20,
  teal100 = Teal100,
  blue100 = Blue100,
  green10 = Green10,
  green100 = Green100,
  green110 = Green110,
  yellow20 = Yellow20,
  yellow100 = Yellow100,
  link100 = Link100
)

// Define here semantic colors (e.g. primary, link, etc...) as we progress in the design system
// For now we will just copy paste the normal colors -> to be replaced with actual semantic ones
@Immutable
data class EverliColors(
  val white: Color,
  val gray10: Color,
  val gray40: Color,
  val gray80: Color,
  val gray100: Color,
  val black100: Color,
  val red20: Color,
  val red100: Color,
  val violet100: Color,
  val teal20: Color,
  val teal100: Color,
  val blue100: Color,
  val green10: Color,
  val green100: Color,
  val green110: Color,
  val yellow20: Color,
  val yellow100: Color,
  val link100: Color
)
