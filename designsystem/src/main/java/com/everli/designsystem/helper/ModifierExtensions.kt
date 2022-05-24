package com.everli.designsystem.helper

import androidx.compose.ui.Modifier

/**
 * Apply a [Modifier] if a given condition is meet
 *
 * @param modifier modifier to be applied
 * @param predicate to match condition
 *
 * @return [this].then([modifier]) if the [predicate] is meet, [this] without applying [modifier]
 */
fun Modifier.applyIf(modifier: Modifier, predicate: () -> Boolean) : Modifier {
  return if (predicate()) {
    this.then(modifier)
  } else {
    this
  }
}

/**
 * Apply a [Modifier] if a given condition is meet
 *
 * @param modifier modifier to be applied
 * @param condition to match
 *
 * @return [this].then([modifier]) if the [condition] is meet, [this] without applying [modifier]
 */
fun Modifier.applyIf(modifier: Modifier, condition: Boolean) : Modifier {
  return if (condition) {
    this.then(modifier)
  } else {
    this
  }
}
