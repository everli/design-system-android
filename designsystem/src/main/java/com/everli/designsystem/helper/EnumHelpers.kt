package com.everli.designsystem.helper

/**
 * Return enum value or fallback value based on enum ordinal value (int value)
 *
 * @param value ordinal int value
 * @param fallback fallback value to be returned if [value] is not in the defined [T] enum
 *
 * @return
 */
inline fun <reified T : Enum<T>> enumValueOfOrFallback(value: Int, fallback: T): T {
  return enumValues<T>().firstOrNull { it.ordinal == value } ?: fallback
}
