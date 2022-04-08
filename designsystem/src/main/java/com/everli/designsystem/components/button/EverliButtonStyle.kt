package com.everli.designsystem.components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.core.theme.StateColor
import com.everli.designsystem.helper.ifUnspecified
import com.everli.designsystem.helper.toRoundedShape

/**
 * Get text style based on [ButtonSize]
 * Special case for [ButtonVariant.LINK] via [isLink]
 * The styles will be fetched from [EverliTheme.button]
 */
@Composable
internal fun ButtonSize.textStyle(isLink: Boolean = false): TextStyle {
  return when (this) {
    ButtonSize.SMALL -> EverliTheme.button.text.small
    ButtonSize.MEDIUM -> EverliTheme.button.text.medium
    ButtonSize.LARGE -> if (isLink) EverliTheme.button.text.link.large else EverliTheme.button.text.large
  }
}

/**
 * Get icon size based on [ButtonSize]
 * The sizes will be fetched from [EverliTheme.icon]
 */
@Composable
internal fun ButtonSize.iconSize(): Dp {
  return when (this) {
    ButtonSize.SMALL -> EverliTheme.icon.size.small
    ButtonSize.MEDIUM -> EverliTheme.icon.size.medium
    ButtonSize.LARGE -> EverliTheme.icon.size.medium
  }
}

/**
 * Get content padding based on [ButtonSize]
 * Special cases for [isLink] and [isIconOnly]
 * The sizes are not fetched from the theme
 */
@Composable
internal fun ButtonSize.padding(isLink: Boolean, isIconOnly: Boolean = false): PaddingValues {
  // icon only, keep square look
  if (isIconOnly) {
    return when (this) {
      ButtonSize.SMALL -> PaddingValues(8.dp)
      ButtonSize.MEDIUM -> PaddingValues(10.dp)
      ButtonSize.LARGE -> PaddingValues(14.dp)
    }
  }

  // else apply padding
  return when (this) {
    ButtonSize.SMALL -> PaddingValues(
      horizontal = if (isLink) 0.dp else 12.dp,
      vertical = 6.dp,
    )
    ButtonSize.MEDIUM -> PaddingValues(
      horizontal = if (isLink) 0.dp else 16.dp,
      vertical = 10.dp,
    )
    ButtonSize.LARGE -> PaddingValues(
      horizontal = if (isLink) 0.dp else 16.dp,
      vertical = if (isLink) 10.dp else 12.dp,
    )
  }
}

/**
 * Get border based on [ButtonStyle]
 * At the moment, only [ButtonStyle.OUTLINE] will be created with border
 */
@Composable
internal fun ButtonStyle.border(color: Color): BorderStroke? {
  return when (this) {
    ButtonStyle.OUTLINE -> BorderStroke(1.dp, color)
    else -> null
  }
}

/**
 * Get background colors based on [ButtonVariant] and [ButtonStyle]
 *
 * The order in which the colors are applied is the following:
 * 1. [EverliTheme.button.color.{variant}.{style}.background] -> variant specific colors
 * 2. [EverliTheme.button.color.{style}.background] -> button style colors
 *
 * That is, if colors in [1] are [Color.Unspecified] they will be merged with colors in [2]
 *
 * Set [1] for granular control over the variant
 * Or use [2] for generic/shared colors
 *
 * Special case for [ButtonVariant.LINK], the colors will always be transparent
 *
 */
@Composable
internal fun backgroundColors(
  variant: ButtonVariant,
  style: ButtonStyle,
): StateColor {
  with(EverliTheme.button.color) {
    return when (variant) {
      ButtonVariant.PRIMARY -> when (style) {
        ButtonStyle.FILL -> primary.fill.background.merge(fill.background)
        ButtonStyle.OUTLINE -> primary.outline.background.merge(outline.background)
        ButtonStyle.FLAT -> primary.flat.background.merge(transparent.background)
      }
      ButtonVariant.SPECIAL -> when (style) {
        ButtonStyle.FILL -> special.fill.background.merge(fill.background)
        ButtonStyle.OUTLINE -> special.outline.background.merge(outline.background)
        ButtonStyle.FLAT -> special.flat.background.merge(transparent.background)
      }
      ButtonVariant.LINK -> transparent.background
      ButtonVariant.FACEBOOK -> when (style) {
        ButtonStyle.FILL -> facebook.fill.background.merge(fill.background)
        ButtonStyle.OUTLINE -> facebook.outline.background.merge(outline.background)
        else -> StateColor() // not supported
      }
      ButtonVariant.GOOGLE -> when (style) {
        ButtonStyle.FILL -> google.fill.background.merge(fill.background)
        ButtonStyle.OUTLINE -> google.outline.background.merge(outline.background)
        else -> StateColor() // not supported
      }
      ButtonVariant.APPLE -> when (style) {
        ButtonStyle.FILL -> apple.fill.background.merge(fill.background)
        ButtonStyle.OUTLINE -> apple.outline.background.merge(outline.background)
        else -> StateColor() // not supported
      }
      ButtonVariant.BLIK -> when (style) {
        ButtonStyle.FILL -> blik.fill.background.merge(fill.background)
        ButtonStyle.OUTLINE -> blik.outline.background.merge(outline.background)
        else -> StateColor() // not supported
      }
    }
  }
}

/**
 * Get border colors based on [ButtonVariant] and [ButtonStyle]
 *
 * The order in which the colors are applied is the following:
 * 1. [EverliTheme.button.color.{variant}.{style}.border] -> variant specific colors
 * 2. [EverliTheme.button.color.{style}.border] -> button style colors
 *
 * That is, if colors in [1] are [Color.Unspecified] they will be merged with colors in [2]
 *
 * Set [1] for granular control over the variant
 * Or use [2] for generic/shared colors
 *
 * Special case for [ButtonVariant.LINK] and [ButtonVariant.BLIK], no border is used, a default [StateColor] is returned
 */
@Composable
internal fun borderColors(
  variant: ButtonVariant,
  style: ButtonStyle,
): StateColor {
  with(EverliTheme.button.color) {
    return when (variant) {
      ButtonVariant.PRIMARY -> when (style) {
        ButtonStyle.OUTLINE -> primary.outline.border.merge(outline.border)
        else -> StateColor()
      }
      ButtonVariant.SPECIAL -> when (style) {
        ButtonStyle.OUTLINE -> special.outline.border.merge(outline.border)
        else -> StateColor()
      }
      ButtonVariant.FACEBOOK -> when (style) {
        ButtonStyle.OUTLINE -> facebook.outline.border.merge(outline.borderDark)
        else -> StateColor()
      }
      ButtonVariant.GOOGLE -> when (style) {
        ButtonStyle.OUTLINE -> google.outline.border.merge(outline.borderDark)
        else -> StateColor()
      }
      ButtonVariant.APPLE -> when (style) {
        ButtonStyle.OUTLINE -> apple.outline.border.merge(outline.borderDark)
        else -> StateColor()
      }
      else -> StateColor()
    }
  }
}

/**
 * Get text colors based on [ButtonVariant] and [ButtonStyle]
 *
 * The order in which the colors are applied is the following:
 * 1. [EverliTheme.button.text.color] -> button specific text colors
 * 2. [EverliTheme.text.color]] -> global text colors
 *
 * That is, if colors in [1] are [Color.Unspecified] they will be merged with colors in [2]
 *
 * Set [1] for granular control over the variant
 * Or use [2] for generic/shared colors
 */
@Composable
internal fun textColors(
  variant: ButtonVariant,
  style: ButtonStyle,
): StateColor {
  with(EverliTheme.button.text.color) {
    return when (variant) {
      ButtonVariant.PRIMARY -> when (style) {
        ButtonStyle.FILL -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.text.color.negative),
          disabled = disabled.ifUnspecified(EverliTheme.text.color.negative),
          pressed = pressed.ifUnspecified(EverliTheme.text.color.negative),
        )
        else -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.text.color.primary),
          disabled = disabled.ifUnspecified(EverliTheme.text.color.primary),
          pressed = pressed.ifUnspecified(EverliTheme.text.color.primary),
        )
      }
      ButtonVariant.SPECIAL -> when (style) {
        ButtonStyle.FILL -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.text.color.negative),
          disabled = disabled.ifUnspecified(EverliTheme.text.color.negative),
          pressed = pressed.ifUnspecified(EverliTheme.text.color.negative),
        )
        ButtonStyle.OUTLINE -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.text.color.primary),
          disabled = disabled.ifUnspecified(EverliTheme.text.color.primary),
          pressed = pressed.ifUnspecified(EverliTheme.text.color.primary),
        )
        ButtonStyle.FLAT -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.text.color.special),
          disabled = disabled.ifUnspecified(EverliTheme.text.color.special),
          pressed = pressed.ifUnspecified(EverliTheme.text.color.special),
        )
      }
      ButtonVariant.LINK -> {
        StateColor(
          enabled = link.enabled.ifUnspecified(enabled),
          disabled = link.disabled.ifUnspecified(disabled),
          pressed = link.pressed.ifUnspecified(pressed),
        )
      }
      // we used the same text colors for all brands
      ButtonVariant.FACEBOOK,
      ButtonVariant.GOOGLE,
      ButtonVariant.APPLE,
      ButtonVariant.BLIK,
      -> when (style) {
        ButtonStyle.FILL -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.text.color.negative),
          disabled = disabled.ifUnspecified(EverliTheme.text.color.negative),
          pressed = pressed.ifUnspecified(EverliTheme.text.color.negative),
        )
        ButtonStyle.OUTLINE -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.text.color.primary),
          disabled = disabled.ifUnspecified(EverliTheme.text.color.primary),
          pressed = pressed.ifUnspecified(EverliTheme.text.color.primary),
        )
        ButtonStyle.FLAT -> StateColor() // not supported
      }
    }
  }
}

/**
 * Get icon colors based on [ButtonVariant] and [ButtonStyle]
 *
 * The order in which the colors are applied is the following:
 * 1. [EverliTheme.button.icon.color] -> button specific icon colors
 * 2. [EverliTheme.icon.color] -> global icon colors
 *
 * That is, if colors in [1] are [Color.Unspecified] they will be merged with colors in [2]
 *
 * Set [1] for granular control over the variant
 * Or use [2] for generic/shared colors
 */
@Composable
internal fun iconColors(
  variant: ButtonVariant,
  style: ButtonStyle,
): StateColor {
  with(EverliTheme.button.icon.color) {
    return when (variant) {
      ButtonVariant.PRIMARY -> when (style) {
        ButtonStyle.FILL -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.icon.color.light),
          disabled = disabled.ifUnspecified(EverliTheme.icon.color.light),
          pressed = pressed.ifUnspecified(EverliTheme.icon.color.light),
        )
        else -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.icon.color.dark),
          disabled = disabled.ifUnspecified(EverliTheme.icon.color.dark),
          pressed = pressed.ifUnspecified(EverliTheme.icon.color.dark),
        )
      }
      ButtonVariant.SPECIAL -> when (style) {
        ButtonStyle.FILL -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.icon.color.light),
          disabled = disabled.ifUnspecified(EverliTheme.icon.color.light),
          pressed = pressed.ifUnspecified(EverliTheme.icon.color.light),
        )
        ButtonStyle.OUTLINE -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.icon.color.dark),
          disabled = disabled.ifUnspecified(EverliTheme.icon.color.dark),
          pressed = pressed.ifUnspecified(EverliTheme.icon.color.dark),
        )
        ButtonStyle.FLAT -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.icon.color.special),
          disabled = disabled.ifUnspecified(EverliTheme.icon.color.special),
          pressed = pressed.ifUnspecified(EverliTheme.icon.color.special),
        )
      }
      ButtonVariant.LINK -> {
        StateColor(
          enabled = link.enabled.ifUnspecified(enabled),
          disabled = link.disabled.ifUnspecified(disabled),
          pressed = link.pressed.ifUnspecified(pressed),
        )
      }
      ButtonVariant.FACEBOOK -> when (style) {
        ButtonStyle.OUTLINE -> StateColor(
          enabled = facebook.outline.enabled.ifUnspecified(enabled),
          disabled = facebook.outline.disabled.ifUnspecified(disabled),
          pressed = facebook.outline.pressed.ifUnspecified(pressed),
        )
        else -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.icon.color.light),
          disabled = disabled.ifUnspecified(EverliTheme.icon.color.light),
          pressed = pressed.ifUnspecified(EverliTheme.icon.color.light),
        )
      }
      ButtonVariant.APPLE -> when (style) {
        ButtonStyle.OUTLINE -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.icon.color.dark),
          disabled = disabled.ifUnspecified(EverliTheme.icon.color.dark),
          pressed = pressed.ifUnspecified(EverliTheme.icon.color.dark),
        )
        else -> StateColor(
          enabled = enabled.ifUnspecified(EverliTheme.icon.color.light),
          disabled = disabled.ifUnspecified(EverliTheme.icon.color.light),
          pressed = pressed.ifUnspecified(EverliTheme.icon.color.light),
        )
      }
      ButtonVariant.GOOGLE,
      ButtonVariant.BLIK,
      -> StateColor()
    }
  }
}

internal fun IconPosition.padding(): PaddingValues {
  return when (this) {
    IconPosition.LEFT -> PaddingValues(end = 8.dp)
    IconPosition.RIGHT -> PaddingValues(start = 8.dp)
  }
}

@Composable
internal fun ButtonVariant.shape(isIconOnly: Boolean): Shape {
  return when (this) {
    ButtonVariant.PRIMARY,
    ButtonVariant.SPECIAL,
    ButtonVariant.LINK,
    -> EverliTheme.radius.medium.toRoundedShape()
    ButtonVariant.FACEBOOK,
    ButtonVariant.GOOGLE,
    ButtonVariant.APPLE,
    ButtonVariant.BLIK,
    -> if (isIconOnly) EverliTheme.radius.full.toRoundedShape() else EverliTheme.radius.medium.toRoundedShape()
  }
}
