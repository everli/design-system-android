package com.everli.designsystem.helper

import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.constants.EverliColors
import java.lang.Exception

/**
 * Convert a hex value string to a [Color]
 * If the conversion fails, [fallbackColor] will be returned
 * If [fallbackColor] is not provided, [Color.White] will be returned
 *
 * @param hexValue hex value e.g. #FFFFFF, #ffd6ffc2
 * @param fallbackColor used in case the conversion fails, default value [Color.White]
 * @return [Color] for given [hexValue] or [fallbackColor]
 */
fun Color.Companion.fromHex(hexValue: String, fallbackColor: Color = White): Color {
  return try {
    Color(android.graphics.Color.parseColor(hexValue))
  } catch (exception: Exception) {
    fallbackColor
  }
}

/**
 * Convert a color name as string to a [Color]
 * Can be used only for design system based colors
 * If the conversion fails, [fallbackColor] will be returned
 * If [fallbackColor] is not provided, [Color.White] will be returned
 *
 * @param name name of the color e.g. "black-100"
 * @param fallbackColor used in case the conversion fails, default value [Color.White]
 * @return [Color] for given [name] or [fallbackColor]
 */
fun Color.Companion.fromName(name: String, fallbackColor: Color = White): Color {
  return when (name) {
    "white", "walter-white" -> White
    "gray-10" -> EverliColors.Gray10
    "gray-15" -> EverliColors.Gray15
    "gray-40" -> EverliColors.Gray40
    "gray-80" -> EverliColors.Gray80
    "gray-100" -> EverliColors.Gray100
    "black-100", "violet-black" -> EverliColors.Black100
    "red-20" -> EverliColors.Red20
    "red-100", "red-hot" -> EverliColors.Red100
    "violet-100", "purple-rain" -> EverliColors.Violet100
    "teal-20" -> EverliColors.Teal20
    "teal-100", "teal-waves" -> EverliColors.Teal100
    "blue-100", "blue-plus" -> EverliColors.Blue100
    "green-10" -> EverliColors.Green10
    "green-100", "everli-green" -> EverliColors.Green100
    "green-110", "deep-green" -> EverliColors.Green110
    "yellow-20" -> EverliColors.Yellow20
    "yellow-100", "yellow-sun" -> EverliColors.Yellow100
    "navy-100", "link" -> EverliColors.Navy100
    "navy-110" -> EverliColors.Navy110
    "facebook" -> EverliColors.Facebook
    "google" -> EverliColors.Google
    "apple" -> EverliColors.Apple
    "blink" -> EverliColors.Blink
    else -> fallbackColor
  }
}

/**
 * Chain colors values until a color != [Color.Unspecified] is found
 * Most used when working with tokens to provide fallback values
 * E.g. building up a color from local to global token:
 * localColor.ifUnspecified(componentColor).ifUnspecified(globalColor)
 *
 * @param fallback [Color] to be returned if [this] is [Color.Unspecified]
 * @return [Color] with either [fallback] or [Color.Unspecified]
 */
fun Color.ifUnspecified(fallback: Color) : Color {
  return if (this == Color.Unspecified) {
    fallback
  } else {
    this
  }
}

