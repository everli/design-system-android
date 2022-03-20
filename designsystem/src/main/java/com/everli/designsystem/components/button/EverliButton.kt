package com.everli.designsystem.components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.LocalMinimumTouchTargetEnforcement
import androidx.compose.material.Text
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.everli.designsystem.core.theme.DefaultTheme
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.core.theme.StateColor
import com.everli.designsystem.helper.TestTags
import com.everli.designsystem.helper.applyIf
import com.everli.designsystem.helper.empty
import com.everli.designsystem.helper.ifUnspecified

/**
 * Button Component, wrapper for Material [Button]
 *
 * @param onClick called when pressed
 * @param modifier modifier to be applied to the button
 * @param text text value to be displayed in case there's no content, default is empty string
 * @param variant enum value to describe the button, used to set colors and other attributes
 * @param buttonStyle enum value to describe the button style, used to set layout attributes
 * @param size enum value, used to set sizes for the container, text and icon
 * @param enabled controls the button state
 * @param icon if provided, the icon will be at the given [iconPosition] with default left
 * @param iconPosition position where [icon] will be rendered
 * @param contentDescription if provided, will be used for the icon content description for accessibility
 * @param content content to be shown inside the button, [content] will be shown only if [text] is empty
 */

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun EverliButton(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = String.empty,
  variant: ButtonVariant = ButtonVariant.PRIMARY,
  buttonStyle: ButtonStyle = ButtonStyle.FILL,
  size: ButtonSize = ButtonSize.MEDIUM,
  enabled: Boolean = true,
  icon: Painter? = null,
  iconPosition: IconPosition = IconPosition.LEFT,
  contentDescription: String? = null,
  content: @Composable (RowScope.() -> Unit)? = null,
) {

  // handle pressed
  val interactionSource = remember { MutableInteractionSource() }
  val isPressed by interactionSource.collectIsPressedAsState()

  // get colors based on params
  val backgroundColors = backgroundColors(variant = variant, style = buttonStyle)
  val borderColors = borderColors(variant = variant, style = buttonStyle)
  val textColors = textColors(variant = variant, style = buttonStyle)
  val iconColors = iconColors(variant = variant, style = buttonStyle)

  // used later to configure some paddings
  val isIconOnly = icon != null && text.isEmpty() && content == null

  val iconContent: @Composable () -> Unit = {
    icon?.let {
      Icon(
        painter = icon,
        tint = iconColors.forEnabledAndPressed(enabled, isPressed),
        contentDescription = contentDescription,
        modifier = Modifier
          .applyIf(Modifier.padding(iconPosition.padding())) { !isIconOnly }
          .size(size.iconSize())
          .testTag(TestTags.Button.ICON),
      )
    }
  }

  // TODO: LocalRippleTheme TBD, need to talk with Ric
  // LocalMinimumTouchTargetEnforcement set to false to override Material behavior
  CompositionLocalProvider(
    LocalRippleTheme provides ClearRippleTheme,
    LocalMinimumTouchTargetEnforcement provides false,
  ) {
    Button(
      onClick = onClick,
      enabled = enabled,
      shape = RoundedCornerShape(EverliTheme.radius.medium),
      border = buttonStyle.border(borderColors.forEnabled(enabled)),
      interactionSource = interactionSource,
      elevation = null,
      contentPadding = size.padding(variant, isIconOnly),
      colors = ButtonDefaults.buttonColors(
        backgroundColor = backgroundColors.forPressed(isPressed),
        disabledBackgroundColor = backgroundColors.forEnabled(enabled),
        contentColor = textColors.forPressed(isPressed),
        disabledContentColor = textColors.forEnabled(enabled)
      ),
      modifier = modifier.then( // N.B. order is very important
        Modifier
          .defaultMinSize(minHeight = 1.dp, minWidth = 1.dp) // done to override material default min sizes
          .testTag(TestTags.Button.CONTAINER)),
    ) {
      Row(
        verticalAlignment = Alignment.CenterVertically) {
        if (iconPosition == IconPosition.LEFT) {
          iconContent()
        }

        if (text.isNotEmpty()) {
          Text(
            text = text,
            style = size.textStyle(variant),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.testTag(TestTags.Button.TEXT)
          )
        } else {
          content?.let { it() }
        }

        if (iconPosition == IconPosition.RIGHT) {
          iconContent()
        }
      }
    }
  }
}

enum class ButtonVariant {

  PRIMARY,
  SPECIAL,
  LINK,

}

enum class ButtonStyle {

  FILL,
  OUTLINE,
  FLAT,

}

enum class ButtonSize {

  LARGE,
  MEDIUM,
  SMALL;

}

enum class IconPosition {

  LEFT,
  RIGHT,

}

/**
 * Get text style based on [ButtonSize] and [ButtonVariant]
 * The styles will be fetched from [EverliTheme.button]
 */
@Composable
internal fun ButtonSize.textStyle(variant: ButtonVariant): TextStyle {
  return when (this) {
    ButtonSize.SMALL -> EverliTheme.button.text.small
    ButtonSize.MEDIUM -> EverliTheme.button.text.medium
    ButtonSize.LARGE -> when (variant) {
      ButtonVariant.LINK -> EverliTheme.button.text.link.large
      else -> EverliTheme.button.text.large
    }
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
 * Get content padding based on [ButtonSize], [ButtonVariant] and if the button is icon only
 * The sizes are not fetched from the theme
 */
@Composable
internal fun ButtonSize.padding(variant: ButtonVariant, isIconOnly: Boolean): PaddingValues {
  val noHorizontalPadding = variant == ButtonVariant.LINK

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
      horizontal = if (noHorizontalPadding) 0.dp else 12.dp,
      vertical = 6.dp,
    )
    ButtonSize.MEDIUM -> PaddingValues(
      horizontal = if (noHorizontalPadding) 0.dp else 16.dp,
      vertical = 10.dp,
    )
    ButtonSize.LARGE -> PaddingValues(
      horizontal = if (noHorizontalPadding) 0.dp else 16.dp,
      vertical = 12.dp,
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
 * Special case for [ButtonVariant.LINK], no border is used, a default [StateColor] is returned
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
    }
  }
}

internal fun IconPosition.padding(): PaddingValues {
  return when (this) {
    IconPosition.LEFT -> PaddingValues(end = 8.dp)
    IconPosition.RIGHT -> PaddingValues(start = 8.dp)
  }
}

// TODO: check with Ric if this is what we want
object ClearRippleTheme : RippleTheme {

  @Composable
  override fun defaultColor(): Color = Color.Transparent

  @Composable
  override fun rippleAlpha() = RippleAlpha(
    draggedAlpha = 0.0f,
    focusedAlpha = 0.0f,
    hoveredAlpha = 0.0f,
    pressedAlpha = 0.0f,
  )
}
