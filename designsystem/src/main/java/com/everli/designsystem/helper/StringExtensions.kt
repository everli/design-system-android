package com.everli.designsystem.helper

import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.constants.EverliColor
import com.everli.designsystem.utilities.extensions.fromHex

/**
 * Converts a string to [Color]
 * If the string is null, [fallback] will be returned
 * If the conversion fails (invalid string), [fallback] will be returned
 *
 * By default [fallback] is [EverliColor.BLACK_100]
 */
fun String?.toColor(fallback: EverliColor = EverliColor.BLACK_100): Color {
  return this?.let { Color.fromHex(this, fallback.toColor()) } ?: fallback.toColor()
}
