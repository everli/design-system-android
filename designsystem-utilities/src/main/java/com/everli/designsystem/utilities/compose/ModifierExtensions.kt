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
 * Padding
 */
