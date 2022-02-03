package com.everli.designsystem.components.button

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.core.theme.StateColor
import com.everli.designsystem.helper.empty

/**
 * Button Component, wrapper for Material [Button]
 *
 *
 * @param onClick called when pressed
 * @param modifier modifier to be applied to the button
 * note that by default the height is already set according to [EverliTheme.dimensions] via [Modifier.requiredHeight]
 * @param text text value to be displayed in case there's no content, default is empty string
 * @param variant enum value to describe the button, used to set colors and other attributes
 * @param style enum value, used to set width, height and text style
 * @param width used to control button width
 * @param enabled controls the button state
 * @param content content to be shown inside
 * if no content is provided, a simple [Text] with given [text] will be rendered
 */
@Composable
fun Button(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = String.empty,
  variant: ButtonVariant = ButtonVariant.PRIMARY,
  style: ButtonStyle = ButtonStyle.DEFAULT,
  width: Dp = EverliTheme.dimensions.button.minWidth,
  enabled: Boolean = true,
  content: @Composable RowScope.() -> Unit = { Text(text = text, style = style.textStyle()) },
) {
  Button(
    onClick = onClick,
    enabled = enabled,
    content = content,
    shape = EverliTheme.shapes.roundedCornersButton,
    colors = ButtonDefaults.buttonColors(
      backgroundColor = variant.backgroundColors().enabled,
      disabledBackgroundColor = variant.backgroundColors().disabled,
      contentColor = variant.textColors().enabled,
      disabledContentColor = variant.textColors().disabled),
    modifier = modifier.then(
      Modifier
        .requiredHeight(style.minHeight())
        .width(width)),
  )
}

/**
 * Used to control button background and test colors
 * For more details see [ButtonVariant.backgroundColors] [ButtonVariant.textColors]
 */
enum class ButtonVariant {

  PRIMARY
}

/**
 * Used to control button height, width and text size
 * For more details see [ButtonStyle.minHeight] [ButtonStyle.textStyle]
 */
enum class ButtonStyle {

  SMALL,
  DEFAULT,
  LARGE,
}

@Composable
fun ButtonStyle.minHeight(): Dp {
  return when (this) {
    ButtonStyle.SMALL -> EverliTheme.dimensions.button.minHeightSmall
    ButtonStyle.DEFAULT -> EverliTheme.dimensions.button.minHeightDefault
    ButtonStyle.LARGE -> EverliTheme.dimensions.button.minHeightDefault
  }
}

@Composable
fun ButtonStyle.textStyle(): TextStyle {
  return when (this) {
    ButtonStyle.SMALL -> EverliTheme.typography.bodySmallSemibold
    ButtonStyle.DEFAULT -> EverliTheme.typography.bodySemibold
    ButtonStyle.LARGE -> EverliTheme.typography.title4Bold
  }
}

@Composable
fun ButtonVariant.backgroundColors(): StateColor {
  return when (this) {
    ButtonVariant.PRIMARY -> StateColor(
      enabled = EverliTheme.colors.buttons.primary.background.enabled,
      disabled = EverliTheme.colors.buttons.primary.background.disabled,
    )
  }
}

@Composable
fun ButtonVariant.textColors(): StateColor {
  return when (this) {
    ButtonVariant.PRIMARY -> StateColor(
      enabled = EverliTheme.colors.buttons.primary.text.enabled,
      disabled = EverliTheme.colors.buttons.primary.text.disabled,
    )
  }
}
