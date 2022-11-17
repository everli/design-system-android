package com.everli.designsystem.utilities.extensions

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.Dp

/**
 * Creates a [RoundedCornerShape] from [this]
 */
fun Dp.toRoundedShape() = RoundedCornerShape(this)
