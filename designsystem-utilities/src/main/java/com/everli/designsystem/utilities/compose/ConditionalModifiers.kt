package com.everli.designsystem.utilities.compose

import androidx.compose.ui.Modifier

/**
 * Apply a [Modifier] if a given condition is meet
 *
 * @param condition to match condition
 * @param modifier modifier to be applied
 *
 * @return [modifier] if the [condition] is meet, else [this] without applying [modifier]
 */
fun Modifier.applyIf(condition: Boolean, modifier: Modifier.() -> Modifier): Modifier {
  return if (condition) {
    modifier()
  } else {
    this
  }
}

/**
 * Apply a [Modifier] if a given condition is meet
 *
 * @param condition to match condition
 * @param modifier modifier to be applied
 *
 * @return [modifier] if the [condition] is meet, else [this] without applying [modifier]
 */
fun Modifier.applyIf(condition: Boolean, modifier: Modifier): Modifier {
  return if (condition) {
    then(modifier)
  } else {
    this
  }
}

/**
 * Apply a [Modifier] if the value to apply is not null
 *
 * @param value to apply
 * @param modifier modifier to be applied
 *
 * @return [modifier] if the [value] is not null, else [this] without applying [modifier]
 */
fun <T> Modifier.applyIfNotNull(value: T?, modifier: Modifier.(T) -> Modifier): Modifier {
  return value?.let { modifier(value) } ?: this
}
