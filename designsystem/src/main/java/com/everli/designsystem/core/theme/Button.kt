package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.everli.designsystem.core.constants.EverliColors

@Immutable
data class ButtonTheme(
  val text: ButtonTextStyles,
  val icon: ButtonIconStyles,
  val color: ButtonsColors,
)

@Immutable
data class ButtonTextStyles(
  // generic
  val small: TextStyle,
  val medium: TextStyle,
  val large: TextStyle,
  val color: ButtonTextColors = ButtonTextColors(),
  // variant specific
  val link: ButtonLinkTextStyles,
)

@Immutable
data class ButtonTextColors(
  // generic
  val disabled: Color = Color.Unspecified,
  val enabled: Color = Color.Unspecified,
  val pressed: Color = Color.Unspecified,
  // variant specific
  val link: StateColor = StateColor(),
)

@Immutable
data class ButtonLinkTextStyles(
  val large: TextStyle,
)

@Immutable
data class ButtonIconStyles(
  val color: ButtonIconColors = ButtonIconColors(),
)

@Immutable
data class ButtonIconColors(
  // generic
  val disabled: Color = Color.Unspecified,
  val enabled: Color = Color.Unspecified,
  val pressed: Color = Color.Unspecified,
  // variant specific
  val link: StateColor = StateColor(),
)

@Immutable
data class ButtonsColors(
  // generic styles
  val fill: ButtonColors = ButtonColors(),
  val outline: ButtonColors = ButtonColors(),
  val transparent: ButtonColors = ButtonColors(),
  // variant specific
  val primary: ButtonVariantValues<ButtonColors>,
  val special: ButtonVariantValues<ButtonColors>,
)

@Immutable
data class ButtonVariantValues<T>(
  val fill: T,
  val outline: T,
  val flat: T,
)

@Immutable
data class ButtonColors(
  val background: StateColor = StateColor(),
  val border: StateColor = StateColor(),
)

// Default
val DefaultButtonTheme = ButtonTheme(
  text = ButtonTextStyles(
    small = DefaultTypography.bodySmallSemibold,
    medium = DefaultTypography.bodySemibold,
    large = DefaultTypography.subtitleSemibold,
    color = ButtonTextColors(
      disabled = EverliColors.Gray80,
      link = StateColor(
        enabled = EverliColors.Navy100,
        pressed = EverliColors.Navy110,
      )
    ),
    link = ButtonLinkTextStyles(
      large = DefaultTypography.title4Regular,
    ),
  ),
  icon = ButtonIconStyles(
    color = ButtonIconColors(
      disabled = EverliColors.Gray80,
      link = StateColor(
        enabled = EverliColors.Navy100,
        pressed = EverliColors.Navy110,
      )
    )
  ),
  color = ButtonsColors(
    transparent = ButtonColors(
      background = StateColor(
        enabled = EverliColors.Transparent,
        disabled = EverliColors.Transparent,
      )
    ),
    fill = ButtonColors(
      background = StateColor(
        disabled = EverliColors.Gray15,
      )
    ),
    outline = ButtonColors(
      border = StateColor(
        disabled = EverliColors.Gray40,
      )
    ),
    primary = ButtonVariantValues(
      fill = ButtonColors(
        background = StateColor(
          enabled = EverliColors.Green100,
          pressed = EverliColors.Green110,
        ),
      ),
      outline = ButtonColors(
        background = StateColor(
          pressed = EverliColors.Green10,
        ),
        border = StateColor(
          enabled = EverliColors.Green100,
        ),
      ),
      flat = ButtonColors(
        background = StateColor(
          pressed = EverliColors.Green10,
        ),
      ),
    ),
    special = ButtonVariantValues(
      fill = ButtonColors(
        background = StateColor(
          enabled = EverliColors.Red100,
          pressed = EverliColors.Red110,
        ),
      ),
      outline = ButtonColors(
        background = StateColor(
          pressed = EverliColors.Red20,
        ),
        border = StateColor(
          enabled = EverliColors.Red100,
        ),
      ),
      flat = ButtonColors(
        background = StateColor(
          pressed = EverliColors.Red20,
        ),
      ),
    ),
  ),
)
