package com.everli.designsystem.core.theme

import androidx.compose.material.CheckboxColors
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

val White = Color.White

val Gray10 = Color(0xFFF8F7F8)
val Gray15 = Color(0xFFEBE7EB)
val Gray40 = Color(0xFFE3DFE3)
val Gray80 = Color(0xFF9E8f9E)
val Gray100 = Color(0xFF756075)

val Black100 = Color(0xFF302030)

val Red20 = Color(0xFFFFCEDC)
val Red100 = Color(0xFFDC325F)

val Violet100 = Color(0xFF8A3264)

val Teal20 = Color(0xFFDAF4F4)
val Teal100 = Color(0xFF46C6C6)

val Blue100 = Color(0xFF006E81)

val Green10 = Color(0xFFD6FFC2)
val Green100 = Color(0xFF64C828)
val Green110 = Color(0xFF3CA000)

val Yellow20 = Color(0xFFFFF6DC)
val Yellow100 = Color(0xFFFFD050)

val Link100 = Color(0xFF1A73E8)

// Design system "brand" names
val WalterWhite = White
val VioletBlack = Black100
val RedHot = Red100
val PurpleRain = Violet100
val TealWaves = Teal100
val BluePlus = Blue100
val EverliGreen = Green100
val DeepGreen = Green110
val YellowSun = Yellow100
val Link = Link100

// Colors data class Structures
@Immutable
data class EverliColors(
  val buttons: ButtonsColors,
  // tokens
)

data class ButtonsColors(
  val primaryButton: ButtonColors,
)

@Immutable
data class ButtonColors(
  val backgroundEnabled: Color,
  val backgroundDisabled: Color,
  val textEnabled: Color,
  val textDisabled: Color,
)

// Colors default values
val defaultButtonColors = ButtonsColors(
  primaryButton = ButtonColors(
    backgroundEnabled = Green100,
    backgroundDisabled = Gray15,
    textEnabled = White,
    textDisabled = Gray100,
  ),
)

val LightColorPalette = EverliColors(
  buttons = defaultButtonColors
)

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