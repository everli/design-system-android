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
  val facebook: FacebookButtonIconColors = FacebookButtonIconColors(),
)

@Immutable
data class FacebookButtonIconColors(
  val outline: StateColor = StateColor(),
)

@Immutable
data class ButtonsColors(
  // generic styles
  val fill: ButtonColors = ButtonColors(),
  val outline: OutlineButtonColors = OutlineButtonColors(),
  val transparent: ButtonColors = ButtonColors(),
  // variant specific
  val primary: ButtonVariantValues<ButtonColors> = ButtonVariantValues.withColors(),
  val special: ButtonVariantValues<ButtonColors> = ButtonVariantValues.withColors(),
  val facebook: ButtonVariantValues<ButtonColors> = ButtonVariantValues.withColors(),
  val google: ButtonVariantValues<ButtonColors> = ButtonVariantValues.withColors(),
  val apple: ButtonVariantValues<ButtonColors> = ButtonVariantValues.withColors(),
  val blik: ButtonVariantValues<ButtonColors> = ButtonVariantValues.withColors(),
  // misc
  val overlay: Float,
)

@Immutable
data class ButtonVariantValues<T>(
  val fill: T,
  val outline: T,
  val flat: T,
) {

  companion object {

    /**
     * Create default empty with [ButtonColors] to facilitate initialization
     */
    fun withColors() = ButtonVariantValues(
      fill = ButtonColors(),
      outline = ButtonColors(),
      flat = ButtonColors(),
    )

  }
}

@Immutable
data class ButtonColors(
  val background: StateColor = StateColor(),
  val border: StateColor = StateColor(),
)

@Immutable
data class OutlineButtonColors(
  val background: StateColor = StateColor(),
  val border: StateColor = StateColor(),
  // only used by brand variants
  val borderDark: StateColor = StateColor(),
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
      ),
      facebook = FacebookButtonIconColors(
        outline = StateColor(
          enabled = EverliColors.Facebook,
        ),
      ),
    ),
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
    outline = OutlineButtonColors(
      border = StateColor(
        disabled = EverliColors.Gray40,
      ),
      borderDark = StateColor(
        enabled = EverliColors.Black100,
        pressed = EverliColors.Black100,
      ),
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
    facebook = ButtonVariantValues.withColors().copy(
      fill = ButtonColors(
        background = StateColor(
          enabled = EverliColors.Facebook,
          pressed = EverliColors.Facebook,
        ),
      ),
    ),
    google = ButtonVariantValues.withColors().copy(
      fill = ButtonColors(
        background = StateColor(
          enabled = EverliColors.Google,
          pressed = EverliColors.Google,
        ),
      ),
    ),
    apple = ButtonVariantValues.withColors().copy(
      fill = ButtonColors(
        background = StateColor(
          enabled = EverliColors.Apple,
          pressed = EverliColors.Apple,
        ),
      ),
    ),
    blik = ButtonVariantValues.withColors().copy(
      fill = ButtonColors(
        background = StateColor(
          enabled = EverliColors.Blik,
          pressed = EverliColors.Blik,
        ),
      ),
    ),
    overlay = 0.4f,
  ),
)
