package com.everli.designsystem.utilities.extensions

fun Boolean.toInt() = if (this) 1 else 0

fun Boolean?.isTrue() = this == true

fun Boolean?.isFalse() = this == false

fun Boolean?.isNullOrTrue() = !isFalse()

fun Boolean?.isNullOrFalse() = !isTrue()

fun Boolean?.orFalse() = this ?: false
