package com.everli.designsystem.utilities.compose

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.paddingTop(value: Dp = 0.dp) = padding(top = value)
fun Modifier.paddingBottom(value: Dp = 0.dp) = padding(bottom = value)
fun Modifier.paddingStart(value: Dp = 0.dp) = padding(start = value)
fun Modifier.paddingEnd(value: Dp = 0.dp) = padding(end = value)

fun Modifier.paddingVertical(value: Dp = 0.dp) = padding(vertical = value)
fun Modifier.paddingHorizontal(value: Dp = 0.dp) = padding(horizontal = value)
