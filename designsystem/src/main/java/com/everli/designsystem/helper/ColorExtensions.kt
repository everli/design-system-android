package com.everli.designsystem.helper

import androidx.compose.ui.graphics.Color

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
 * Chain colors values until a color != [Color.Unspecified] is found
 * Most used when working with tokens to provide fallback values
 * E.g. building up a color from local to global token:
 * localColor.ifUnspecified(componentColor).ifUnspecified(globalColor)
 *
 * @param fallback [Color] to be returned if [this] is [Color.Unspecified]
 * @return [Color] with either [fallback] or [Color.Unspecified]
 */
fun Color.ifUnspecified(fallback: Color): Color {
  return if (this == Color.Unspecified) {
    fallback
  } else {
    this
  }
}
