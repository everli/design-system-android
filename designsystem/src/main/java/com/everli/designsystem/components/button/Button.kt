package com.everli.designsystem.components.button

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.everli.designsystem.core.theme.EverliTheme

/**
 * Primary Button, wrapper for [Button]
 *
 * @param onClick called when pressed
 * @param modifier modifier to be applied to the button
 * note that by default width and height are already set according to [EverliTheme.dimensions]
 * @param text text value to be displayed in case there's no content, default is empty string
 * @param variant enum value to describe the button, this will set colors and dimensions
 * @param enabled controls the button state
 * @param content content to be shown inside
 * if no content is provided, a simple [Text] with given [text] will be rendered
 */
@Composable
fun PrimaryButton(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = "",
  variant: PrimaryButtonVariant = PrimaryButtonVariant.DEFAULT,
  enabled: Boolean = true,
  content: @Composable RowScope.() -> Unit = { Text(text = text, style = variant.textStyle()) },
) {
  Button(
    onClick = onClick,
    enabled = enabled,
    content = content,
    shape = EverliTheme.shapes.roundedCornersButton,
    colors = ButtonDefaults.buttonColors(
      backgroundColor = EverliTheme.colors.buttons.primaryButton.backgroundEnabled,
      disabledBackgroundColor = EverliTheme.colors.buttons.primaryButton.backgroundDisabled,
      contentColor = EverliTheme.colors.buttons.primaryButton.textEnabled,
      disabledContentColor = EverliTheme.colors.buttons.primaryButton.textDisabled),
    modifier = modifier.then(
      Modifier
        .requiredHeight(variant.minHeight())
        .requiredWidth(variant.minWidth())),
  )
}

enum class PrimaryButtonVariant {
  SMALL,
  DEFAULT,
  LARGE,
}

@Composable
fun PrimaryButtonVariant.minWidth(): Dp {
  return EverliTheme.dimensions.buttonDimensions.minWidth
}

@Composable
fun PrimaryButtonVariant.minHeight(): Dp {
  return when (this) {
    PrimaryButtonVariant.SMALL -> EverliTheme.dimensions.buttonDimensions.minHeightSmall
    PrimaryButtonVariant.DEFAULT -> EverliTheme.dimensions.buttonDimensions.minHeightDefault
    PrimaryButtonVariant.LARGE -> EverliTheme.dimensions.buttonDimensions.minHeightDefault
  }
}

@Composable
fun PrimaryButtonVariant.textStyle(): TextStyle {
  return when (this) {
    PrimaryButtonVariant.SMALL -> EverliTheme.typography.bodySmallSemibold
    PrimaryButtonVariant.DEFAULT -> EverliTheme.typography.bodySemibold
    PrimaryButtonVariant.LARGE -> EverliTheme.typography.title4Bold
  }
}
