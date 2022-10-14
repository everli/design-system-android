package com.everli.designsystem.utilities.compose

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.paddingTop(value: Dp = 0.dp) = this.then(padding(top = value))
fun Modifier.paddingBottom(value: Dp = 0.dp) = this.then(padding(bottom = value))
fun Modifier.paddingStart(value: Dp = 0.dp) = this.then(padding(start = value))
fun Modifier.paddingEnd(value: Dp = 0.dp) = this.then(padding(end = value))

fun Modifier.paddingVertical(value: Dp = 0.dp) = this.then(padding(top = value, bottom = value))
fun Modifier.paddingHorizontal(value: Dp = 0.dp) = this.then(padding(start = value, end = value))
