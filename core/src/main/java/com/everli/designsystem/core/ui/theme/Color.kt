package com.everli.designsystem.core.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.everli.designsystem.core.R

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

// Define here semantic colors (e.g. primary, link, etc...) as we progress in the design system
// For now we will just copy paste the normal colors -> to be replaced with actual semantic ones
@Immutable
data class EverliColors(
  val white: Color,
  val gray10: Color,
  val gray15: Color,
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
  val link100: Color,
)

// Color Palette
val LightColorPalette = EverliColors(
  white = White,
  gray10 = Gray10,
  gray15 = Gray15,
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

/**
 * A Material [Colors] implementation which sets all colors to [debugColor] to discourage usage of
 * [MaterialTheme.colors] in preference to [EverliTheme.colors].
 */
fun debugColors(
  darkTheme: Boolean = false,
  debugColor: Color = Color.Magenta
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
