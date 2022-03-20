package com.everli.designsystem.components.button

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import com.everli.designsystem.helper.empty

/**
 * Wrapper for [EverliButton] setting the [ButtonVariant] to [ButtonVariant.PRIMARY]
 */
@Composable
fun PrimaryButton(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = String.empty,
  buttonStyle: ButtonStyle = ButtonStyle.FILL,
  size: ButtonSize = ButtonSize.MEDIUM,
  enabled: Boolean = true,
  icon: Painter? = null,
  iconPosition: IconPosition = IconPosition.LEFT,
  contentDescription: String? = null,
  content: @Composable (RowScope.() -> Unit)? = null,
) {
  EverliButton(
    onClick = onClick,
    modifier = modifier,
    text = text,
    variant = ButtonVariant.PRIMARY,
    buttonStyle = buttonStyle,
    size = size,
    enabled = enabled,
    icon = icon,
    iconPosition = iconPosition,
    contentDescription = contentDescription,
    content = content,
  )
}

/**
 * Wrapper for [EverliButton] setting the [ButtonVariant] to [ButtonVariant.SPECIAL]
 */
@Composable
fun SpecialButton(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = String.empty,
  buttonStyle: ButtonStyle = ButtonStyle.FILL,
  size: ButtonSize = ButtonSize.MEDIUM,
  enabled: Boolean = true,
  icon: Painter? = null,
  iconPosition: IconPosition = IconPosition.LEFT,
  contentDescription: String? = null,
  content: @Composable (RowScope.() -> Unit)? = null,
) {
  EverliButton(
    onClick = onClick,
    modifier = modifier,
    text = text,
    variant = ButtonVariant.SPECIAL,
    buttonStyle = buttonStyle,
    size = size,
    enabled = enabled,
    icon = icon,
    iconPosition = iconPosition,
    contentDescription = contentDescription,
    content = content,
  )
}

/**
 * Wrapper for [EverliButton] setting the [ButtonVariant] to [ButtonVariant.LINK]
 * and limiting the style only to [ButtonStyle.FLAT]
 */
@Composable
fun LinkButton(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = String.empty,
  size: ButtonSize = ButtonSize.MEDIUM,
  enabled: Boolean = true,
  icon: Painter? = null,
  iconPosition: IconPosition = IconPosition.LEFT,
  contentDescription: String? = null,
  content: @Composable (RowScope.() -> Unit)? = null,
) {
  EverliButton(
    onClick = onClick,
    modifier = modifier,
    text = text,
    variant = ButtonVariant.LINK,
    buttonStyle = ButtonStyle.FLAT,
    size = size,
    enabled = enabled,
    icon = icon,
    iconPosition = iconPosition,
    contentDescription = contentDescription,
    content = content,
  )
}
