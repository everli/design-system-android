package com.everli.designsystem.utilities.extensions

import android.content.res.TypedArray
import androidx.annotation.StyleableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.core.content.res.getColorOrThrow

fun TypedArray.getStringOrEmpty(@StyleableRes index: Int): String {
  return getString(index) ?: String.empty
}

fun TypedArray.getBooleanOrTrue(@StyleableRes index: Int): Boolean {
  return getBoolean(index, true)
}

fun TypedArray.getBooleanOrFalse(@StyleableRes index: Int): Boolean {
  return getBoolean(index, false)
}

fun TypedArray.getResourceIdOrNull(@StyleableRes index: Int): Int? {
  getResourceId(index, -1).also { resId ->
    return if (resId == -1) {
      null
    } else {
      resId
    }
  }
}

fun TypedArray.getComposeColor(
  @StyleableRes index: Int,
  fallbackColor: Color = Color.Unspecified,
): Color = if (hasValue(index)) Color(getColorOrThrow(index)) else fallbackColor

fun TypedArray.getDp(
  @StyleableRes index: Int,
  density: Density,
  fallbackDp: Dp,
): Dp {
  return if (hasValue(index)) {
    with(density) { getDimension(index, 0f).toDp() }
  } else {
    fallbackDp
  }
}
