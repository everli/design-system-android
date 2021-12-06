package com.everli.designsystem.core.helper

import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.ui.theme.Black100
import com.everli.designsystem.core.ui.theme.Blue100
import com.everli.designsystem.core.ui.theme.Gray10
import com.everli.designsystem.core.ui.theme.Gray100
import com.everli.designsystem.core.ui.theme.Gray15
import com.everli.designsystem.core.ui.theme.Gray40
import com.everli.designsystem.core.ui.theme.Gray80
import com.everli.designsystem.core.ui.theme.Green10
import com.everli.designsystem.core.ui.theme.Green100
import com.everli.designsystem.core.ui.theme.Green110
import com.everli.designsystem.core.ui.theme.Link100
import com.everli.designsystem.core.ui.theme.Red100
import com.everli.designsystem.core.ui.theme.Red20
import com.everli.designsystem.core.ui.theme.Teal100
import com.everli.designsystem.core.ui.theme.Teal20
import com.everli.designsystem.core.ui.theme.Violet100
import com.everli.designsystem.core.ui.theme.Yellow100
import com.everli.designsystem.core.ui.theme.Yellow20
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
    "gray-10" -> Gray10
    "gray-15" -> Gray15
    "gray-40" -> Gray40
    "gray-80" -> Gray80
    "gray-100" -> Gray100
    "black-100", "violet-black" -> Black100
    "red-20" -> Red20
    "red-100", "red-hot" -> Red100
    "violet-100", "purple-rain" -> Violet100
    "teal-20" -> Teal20
    "teal-100", "teal-waves" -> Teal100
    "blue-100", "blue-plus" -> Blue100
    "green-10" -> Green10
    "green-100", "everli-green" -> Green100
    "green-110", "deep-green" -> Green110
    "yellow-20" -> Yellow20
    "yellow-100", "yellow-sun" -> Yellow100
    "link-100", "link" -> Link100
    else -> fallbackColor
  }
}
