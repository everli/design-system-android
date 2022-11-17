package com.everli.designsystem.components.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.everli.designsystem.core.constants.EverliResources
import com.everli.designsystem.utilities.extensions.empty

@Composable
fun EverliButton.Facebook(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = String.empty,
  style: BrandButtonStyle = BrandButtonStyle.FILL,
  size: BrandButtonSize = BrandButtonSize.MEDIUM,
  enabled: Boolean = true,
  iconPosition: IconPosition = IconPosition.LEFT,
  contentDescription: String? = null,
) {
  Button(
    onClick = onClick,
    modifier = modifier,
    text = text,
    variant = ButtonVariant.FACEBOOK,
    buttonStyle = style.toButtonStyle(),
    size = size.toButtonSize(),
    enabled = enabled,
    icon = EverliResources.Logos.Facebook,
    iconPosition = iconPosition,
    contentDescription = contentDescription,
  )
}

@Composable
fun EverliButton.Google(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = String.empty,
  style: BrandButtonStyle = BrandButtonStyle.FILL,
  size: BrandButtonSize = BrandButtonSize.MEDIUM,
  enabled: Boolean = true,
  iconPosition: IconPosition = IconPosition.LEFT,
  contentDescription: String? = null,
) {
  Button(
    onClick = onClick,
    modifier = modifier,
    text = text,
    variant = ButtonVariant.GOOGLE,
    buttonStyle = style.toButtonStyle(),
    size = size.toButtonSize(),
    enabled = enabled,
    icon = EverliResources.Logos.Google,
    iconPosition = iconPosition,
    contentDescription = contentDescription,
  )
}

@Composable
fun EverliButton.Apple(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = String.empty,
  style: BrandButtonStyle = BrandButtonStyle.FILL,
  size: BrandButtonSize = BrandButtonSize.MEDIUM,
  enabled: Boolean = true,
  iconPosition: IconPosition = IconPosition.LEFT,
  contentDescription: String? = null,
) {
  Button(
    onClick = onClick,
    modifier = modifier,
    text = text,
    variant = ButtonVariant.APPLE,
    buttonStyle = style.toButtonStyle(),
    size = size.toButtonSize(),
    enabled = enabled,
    icon = EverliResources.Logos.Apple,
    iconPosition = iconPosition,
    contentDescription = contentDescription,
  )
}

@Composable
fun EverliButton.Blik(
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
  text: String = String.empty,
  style: BrandButtonStyle = BrandButtonStyle.FILL,
  size: BrandButtonSize = BrandButtonSize.MEDIUM,
  enabled: Boolean = true,
  iconPosition: IconPosition = IconPosition.LEFT,
  contentDescription: String? = null,
) {
  Button(
    onClick = onClick,
    modifier = modifier,
    text = text,
    variant = ButtonVariant.BLIK,
    buttonStyle = style.toButtonStyle(),
    size = size.toButtonSize(),
    enabled = enabled,
    icon = EverliResources.Logos.PaymentBlik,
    iconPosition = iconPosition,
    contentDescription = contentDescription,
  )
}
