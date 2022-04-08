package com.everli.designsystem.components.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import com.everli.designsystem.helper.empty

@Composable
fun EverliButton.Facebook(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = String.empty,
  style: BrandButtonStyle = BrandButtonStyle.FILL,
  size: BrandButtonSize = BrandButtonSize.MEDIUM,
  enabled: Boolean = true,
  icon: Painter? = null,
  iconPosition: IconPosition = IconPosition.LEFT,
  contentDescription: String? = null,
) {
  EverliButton(
    onClick = onClick,
    modifier = modifier,
    text = text,
    variant = ButtonVariant.FACEBOOK,
    buttonStyle = style.toButtonStyle(),
    size = size.toButtonSize(),
    enabled = enabled,
    icon = icon,
    iconPosition = iconPosition,
    contentDescription = contentDescription,
  )
}
