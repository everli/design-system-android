package com.everli.designsystem.components.button

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.core.theme.StateColor
import com.everli.designsystem.helper.empty

/**
 * Button Component, wrapper for Material [Button]
 *
 * @param onClick called when pressed
 * @param modifier modifier to be applied to the button
 * note that by default the height is already set according to [EverliTheme.dimensions] via [Modifier.requiredHeight]
 * @param text text value to be displayed in case there's no content, default is empty string
 * @param variant enum value to describe the button, used to set colors and other attributes
 * @param size enum value, used to set width, height and text style
 * @param width used to control button width, can also be controlled via [modifier]
 * @param enabled controls the button state
 * @param icon if provided, the icon will be rendered on the left with a min size of 24x24
 * @param contentDescription if provided, will be used for the icon content description for accessibility
 * @param content content to be shown inside the button
 * if no content is provided, a simple [Text] with given [text] will be rendered
 */
@Composable
fun EverliButton(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = String.empty,
  variant: ButtonVariant = ButtonVariant.PRIMARY,
  size: ButtonSize = ButtonSize.MEDIUM,
  width: Dp = EverliTheme.dimensions.button.minWidth,
  enabled: Boolean = true,
  icon: Painter? = null,
  contentDescription: String? = null,
  content: @Composable RowScope.() -> Unit = { },
) {
  Button(
    onClick = onClick,
    enabled = enabled,
    shape = RoundedCornerShape(EverliTheme.radius.medium),
    colors = ButtonDefaults.buttonColors(
      backgroundColor = variant.backgroundColors().enabled,
      disabledBackgroundColor = variant.backgroundColors().disabled,
      contentColor = variant.textColors().enabled,
      disabledContentColor = variant.textColors().disabled),
    modifier = modifier.then(
      Modifier
        .requiredHeight(size.minHeight())
        .defaultMinSize(minWidth = width)),
  ) {
    Row(verticalAlignment = Alignment.CenterVertically) {
      icon?.let {
        Icon(
          painter = icon,
          tint = variant.textColors().colorFor(enabled),
          contentDescription = contentDescription,
          modifier = Modifier
            .padding(end = 8.dp)
            .requiredHeight(24.dp)
            .requiredWidth(24.dp),
        )
      }
      if (text.isNotEmpty()) {
        Text(text = text, style = size.textStyle())
      }
      content()
    }
  }
}

/**
 * Used to control button background and test colors
 * For more details see [ButtonVariant.backgroundColors] [ButtonVariant.textColors]
 */
enum class ButtonVariant {

  PRIMARY;

  companion object {
    fun getByValue(value: Int) = values().firstOrNull { it.ordinal == value } ?: PRIMARY
  }

}

/**
 * Used to control button height, width and text size
 * For more details see [ButtonSize.minHeight] [ButtonSize.textStyle]
 */
enum class ButtonSize {

  SMALL,
  MEDIUM,
  LARGE;

  companion object {
    fun getByValue(value: Int) = values().firstOrNull { it.ordinal == value } ?: MEDIUM
  }

}

@Composable
fun ButtonSize.minHeight(): Dp {
  return when (this) {
    ButtonSize.SMALL -> EverliTheme.button.size.small
    ButtonSize.MEDIUM -> EverliTheme.button.size.medium
    ButtonSize.LARGE -> EverliTheme.button.size.large
  }
}

@Composable
fun ButtonSize.textStyle(): TextStyle {
  return when (this) {
    ButtonSize.SMALL -> EverliTheme.button.text.small
    ButtonSize.MEDIUM -> EverliTheme.button.text.medium
    ButtonSize.LARGE -> EverliTheme.button.text.large
  }
}

@Composable
fun ButtonVariant.backgroundColors(): StateColor {
  return when (this) {
    ButtonVariant.PRIMARY -> StateColor(
      enabled = EverliTheme.button.color.primary.background.enabled,
      disabled = EverliTheme.button.color.primary.background.disabled,
    )
  }
}

@Composable
fun ButtonVariant.textColors(): StateColor {
  return when (this) {
    ButtonVariant.PRIMARY -> StateColor(
      enabled = EverliTheme.button.color.primary.text.enabled,
      disabled = EverliTheme.button.color.primary.text.disabled,
    )
  }
}
