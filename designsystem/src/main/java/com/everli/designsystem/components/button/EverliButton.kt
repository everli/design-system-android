package com.everli.designsystem.components.button

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.helper.TestTags
import com.everli.designsystem.helper.applyIf
import com.everli.designsystem.helper.empty

/**
 * Wrapper for all buttons
 * Use [EverliButton.Button] for full control
 * or use variant specific such as [EverliButton.Primary]
 * or brand specific such as [EverliButton.Facebook]
 */
object EverliButton {

  /**
   * Button Component with custom content as parameter via [content]
   * Wrapper for [EverliButtonInternal]
   *
   * @param onClick called when pressed
   * @param modifier modifier to be applied to the button
   * @param variant enum value to describe the button, used to set colors and other attributes
   * @param buttonStyle enum value to describe the button style, used to set layout attributes
   * @param size enum value, used to set sizes for the container, text and icon
   * @param enabled controls the button state
   * @param content content to be shown inside the button
   */
  @Composable
  fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    variant: ButtonVariant = ButtonVariant.PRIMARY,
    buttonStyle: ButtonStyle = ButtonStyle.FILL,
    size: ButtonSize = ButtonSize.MEDIUM,
    enabled: Boolean = true,
    content: @Composable (RowScope.() -> Unit) = { },
  ) {
    EverliButtonInternal(
      onClick = onClick,
      modifier = modifier,
      variant = variant,
      buttonStyle = buttonStyle,
      size = size,
      enabled = enabled,
      content = content,
    )
  }

  /**
   * Button Component with support for [text] and [icon]
   * Wrapper for [EverliButtonInternal]
   *
   * @param onClick called when pressed
   * @param modifier modifier to be applied to the button
   * @param variant enum value to describe the button, used to set colors and other attributes
   * @param buttonStyle enum value to describe the button style, used to set layout attributes
   * @param size enum value, used to set sizes for the container, text and icon
   * @param enabled controls the button state
   * @param text text value to be displayed in case there's no content, default is empty string
   * @param icon if provided, the icon will be at the given [iconPosition] with default left
   * @param iconPosition position where [icon] will be rendered
   * @param contentDescription if provided, will be used for the icon content description for accessibility
   */
  @Composable
  fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    variant: ButtonVariant = ButtonVariant.PRIMARY,
    buttonStyle: ButtonStyle = ButtonStyle.FILL,
    size: ButtonSize = ButtonSize.MEDIUM,
    enabled: Boolean = true,
    text: String = String.empty,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    contentDescription: String? = null,
  ) {

    // handle pressed for icon
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val iconColors = iconColors(variant = variant, style = buttonStyle)
    // used later to configure some paddings
    val isIconOnly = icon != null && text.isEmpty()

    val iconContent: @Composable () -> Unit = {
      icon?.let {
        Icon(
          painter = icon,
          tint = iconColors.forEnabledAndPressed(enabled, isPressed),
          contentDescription = contentDescription,
          modifier = Modifier
            .applyIf(!isIconOnly) { Modifier.padding(iconPosition.padding()) }
            .size(size.iconSize())
            .testTag(TestTags.Button.ICON),
        )
      }
    }

    EverliButtonInternal(
      onClick = onClick,
      modifier = modifier,
      variant = variant,
      buttonStyle = buttonStyle,
      size = size,
      enabled = enabled,
      contentPadding = size.padding(isLink = variant.isLink(), isIconOnly = isIconOnly),
      shape = variant.shape(isIconOnly = isIconOnly),
    ) {
      Row(
        verticalAlignment = Alignment.CenterVertically
      ) {
        if (iconPosition.isLeft()) {
          iconContent()
        }

        if (text.isNotEmpty()) {
          Text(
            text = text,
            style = size.textStyle(variant.isLink()),
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.testTag(TestTags.Button.TEXT)
          )
        }

        if (iconPosition.isRight()) {
          iconContent()
        }
      }
    }
  }

  @Composable
  fun Primary(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    buttonStyle: ButtonStyle = ButtonStyle.FILL,
    size: ButtonSize = ButtonSize.MEDIUM,
    enabled: Boolean = true,
    content: @Composable (RowScope.() -> Unit) = { },
  ) {
    Button(
      onClick = onClick,
      modifier = modifier,
      variant = ButtonVariant.PRIMARY,
      buttonStyle = buttonStyle,
      size = size,
      enabled = enabled,
      content = content,
    )
  }

  @Composable
  fun Primary(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = String.empty,
    buttonStyle: ButtonStyle = ButtonStyle.FILL,
    size: ButtonSize = ButtonSize.MEDIUM,
    enabled: Boolean = true,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    contentDescription: String? = null,
  ) {
    Button(
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
    )
  }

  @Composable
  fun Special(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    buttonStyle: ButtonStyle = ButtonStyle.FILL,
    size: ButtonSize = ButtonSize.MEDIUM,
    enabled: Boolean = true,
    content: @Composable (RowScope.() -> Unit) = { },
  ) {
    Button(
      onClick = onClick,
      modifier = modifier,
      variant = ButtonVariant.SPECIAL,
      buttonStyle = buttonStyle,
      size = size,
      enabled = enabled,
      content = content,
    )
  }

  @Composable
  fun Special(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = String.empty,
    buttonStyle: ButtonStyle = ButtonStyle.FILL,
    size: ButtonSize = ButtonSize.MEDIUM,
    enabled: Boolean = true,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    contentDescription: String? = null,
  ) {
    Button(
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
    )
  }

  @Composable
  fun Link(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = String.empty,
    size: ButtonSize = ButtonSize.MEDIUM,
    enabled: Boolean = true,
    icon: Painter? = null,
    iconPosition: IconPosition = IconPosition.LEFT,
    contentDescription: String? = null,
  ) {
    Button(
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
    )
  }

  /**
   * Internal Button Component used to share implementation between different buttons
   * Wrapper for Material [Button]
   *
   * @param onClick called when pressed
   * @param modifier modifier to be applied to the button
   * @param variant enum value to describe the button, used to set colors and other attributes
   * @param buttonStyle enum value to describe the button style, used to set layout attributes
   * @param size enum value, used to set sizes for the container, text and icon
   * @param enabled controls the button state
   * @param interactionSource the [MutableInteractionSource] representing the stream of
   * [Interaction]s for this Button. You can create and pass in your own remembered
   * [MutableInteractionSource] if you want to observe [Interaction]s and customize the
   * appearance/behavior of this Button in different [Interaction]s.
   * @param content content to be shown inside the button
   */
  @OptIn(ExperimentalMaterialApi::class)
  @Composable
  internal fun EverliButtonInternal(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    variant: ButtonVariant = ButtonVariant.PRIMARY,
    buttonStyle: ButtonStyle = ButtonStyle.FILL,
    size: ButtonSize = ButtonSize.MEDIUM,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    contentPadding: PaddingValues = size.padding(isLink = variant.isLink()),
    shape: Shape = variant.shape(isIconOnly = false),
    content: @Composable (RowScope.() -> Unit) = { },
  ) {

    // handle pressed
    val isPressed by interactionSource.collectIsPressedAsState()

    // get colors based on params
    val backgroundColors = backgroundColors(variant = variant, style = buttonStyle)
    val borderColors = borderColors(variant = variant, style = buttonStyle)
    val textColors = textColors(variant = variant, style = buttonStyle)

    // TODO: LocalRippleTheme TBD, need to talk with Ric
    // LocalMinimumTouchTargetEnforcement set to false to override Material behavior
    CompositionLocalProvider(
      LocalRippleTheme provides ClearRippleTheme,
      LocalMinimumTouchTargetEnforcement provides false,
    ) {
      Button(
        onClick = onClick,
        enabled = enabled,
        shape = shape,
        border = buttonStyle.border(borderColors.forEnabled(enabled)),
        interactionSource = interactionSource,
        elevation = null,
        contentPadding = contentPadding,
        colors = ButtonDefaults.buttonColors(
          backgroundColor = backgroundColors.forPressed(isPressed),
          disabledBackgroundColor = backgroundColors.forEnabled(enabled),
          contentColor = textColors.forPressed(isPressed),
          disabledContentColor = textColors.forEnabled(enabled)
        ),
        modifier = modifier.then( // N.B. order is very important
          Modifier
            .defaultMinSize(minHeight = 1.dp, minWidth = 1.dp) // done to override material default min sizes
            .applyIf(
              condition = variant.isBrand().and(isPressed.or(enabled.not())),
              modifier = Modifier.alpha(EverliTheme.button.color.overlay)
            )
            .testTag(TestTags.Button.CONTAINER)
        ),
      ) {
        content()
      }
    }
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
