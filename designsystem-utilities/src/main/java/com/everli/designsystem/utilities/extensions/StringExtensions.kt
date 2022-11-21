package com.everli.designsystem.utilities.extensions

import android.graphics.Color
import androidx.annotation.ColorInt
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.graphics.Color as ComposeColor

val String.Companion.empty: String
  get() = ""

val String.Companion.whitespace: String
  get() = " "

val String.Companion.questionMark: String
  get() = "?"

fun String?.orEmpty() = this ?: String.empty

fun String.toAnnotatedString() = AnnotatedString(this)

fun String?.toAnnotatedStringOrNull(): AnnotatedString? {
  return if (this == null) {
    null
  } else {
    AnnotatedString(this)
  }
}

@ColorInt
fun String.toColorInt(@ColorInt fallback: Int? = null) = try {
  Color.parseColor(this)
} catch (exception: Exception) {
  fallback ?: throw exception
}

fun String?.toColor(fallback: ComposeColor = Black): ComposeColor {
  return this?.let { androidx.compose.ui.graphics.Color.fromHex(this, fallback) } ?: fallback
}
