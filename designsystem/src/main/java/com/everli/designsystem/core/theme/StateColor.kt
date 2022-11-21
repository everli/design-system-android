package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.everli.designsystem.utilities.extensions.ifUnspecified

/**
 * Utility class to group colors for multiple state
 */
@Immutable
data class StateColor(
  val enabled: Color = Color.Unspecified,
  val disabled: Color = Color.Unspecified,
  val pressed: Color = Color.Unspecified,
) {

  /**
   * Returns either the [enabled] or [disabled] based on a flag
   *
   * @param isEnabled flag to be used
   * @return [enabled] if [isEnabled] is true, [disabled] otherwise
   */
  fun forEnabled(isEnabled: Boolean): Color {
    return if (isEnabled) {
      enabled
    } else {
      disabled
    }
  }

  /**
   * Returns either the [enabled] or [pressed] based on a flag
   *
   * @param isPressed flag to be used
   * @return [pressed] if [isPressed] is true, [enabled] otherwise
   */
  fun forPressed(isPressed: Boolean): Color {
    return if (isPressed) {
      pressed
    } else {
      enabled
    }
  }

  /**
   * Return the color based on enabled and pressed flags
   *
   * @param isEnabled enabled flag
   * @param isPressed pressed flag
   * @return [disabled] if [isEnabled] is false, then [pressed] if [isPressed] is true, [enabled] otherwise
   */
  fun forEnabledAndPressed(isEnabled: Boolean, isPressed: Boolean): Color {
    return if (!isEnabled) {
      disabled
    } else {
      forPressed(isPressed)
    }
  }

  /**
   * Create a new [StateColor] merging this class values with another [StateColor]
   * by replacing any [Color.Unspecified] values with values form [other]
   *
   * @param other [StateColor] to merge into this one
   * @return new [StateColor] with merged values
   */
  fun merge(other: StateColor): StateColor {
    return StateColor(
      enabled = this.enabled.ifUnspecified(other.enabled),
      disabled = this.disabled.ifUnspecified(other.disabled),
      pressed = this.pressed.ifUnspecified(other.pressed)
    )
  }
}
