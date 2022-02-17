package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class StateColor(
  val disabled: Color,
  val enabled: Color,
) {
  fun colorFor(isEnabled: Boolean): Color {
    return if (isEnabled) {
      enabled
    } else {
      disabled
    }
  }
}
