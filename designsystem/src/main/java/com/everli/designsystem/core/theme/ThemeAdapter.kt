package com.everli.designsystem.core.theme

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Density
import androidx.core.content.res.use
import com.everli.designsystem.core.R
import com.everli.designsystem.helper.getComposeColor
import com.everli.designsystem.helper.getDp

/**
 * An implementation of [EverliTheme] that loads tokens from XML values
 * This is used for View components that wrap a Compose component to allow client to customize styles if needed
 *
 * Supported Tokens:
 * [ButtonTheme] -> everything apart from text style
 * [RadiusTheme] -> fully
 * [IconTheme] -> fully
 * [TextTheme] -> everything apart from text style
 * [EverliTypography] -> Not at the moment as it is quite hard to convert from xml style
 */
@Composable
fun ThemeAdapter(
  context: Context,
  density: Density = Density(context),
  content: @Composable () -> Unit,
) {
  val theme = ThemeAdapter.createFromContextTheme(context, density)

  EverliTheme(
    typography = theme.everliTypography,
    buttonTheme = theme.buttonTheme,
    radiusTheme = theme.radiusTheme,
    iconTheme = theme.iconTheme,
    textTheme = theme.textTheme,
    content = content,
  )
}

/**
 * Wrapper to allows a composable to use context theme or default [EverliTheme]
 */
@Composable
fun ThemeAdapterComposable(
  useCustomTheme: Boolean,
  context: Context,
  content: @Composable () -> Unit,
) {
  if (useCustomTheme) {
    ThemeAdapter(content = content, context = context)
  } else {
    DefaultTheme(content = content)
  }
}

/**
 * Factory object that creates a [EverliTheme] from declared values in current context theme
 */
internal object ThemeAdapter {

  private lateinit var everliThemeComponents: EverliThemeComponents

  fun createFromContextTheme(
    context: Context,
    density: Density,
  ): EverliThemeComponents {

    if (::everliThemeComponents.isInitialized) {
      return everliThemeComponents
    }

    context.obtainStyledAttributes(R.styleable.EverliTheme).use { ta ->
      // radius
      val radiusTheme = RadiusTheme(
        medium = ta.getDp(R.styleable.EverliTheme_radiusMedium, density, DefaultRadiusTheme.medium),
        full = ta.getDp(R.styleable.EverliTheme_radiusFull, density, DefaultRadiusTheme.full)
      )

      // text
      val textTheme = TextTheme(
        color = TextColors(
          primary = ta.getComposeColor(R.styleable.EverliTheme_textColorPrimary, DefaultTextTheme.color.primary),
          negative = ta.getComposeColor(R.styleable.EverliTheme_textColorNegative, DefaultTextTheme.color.negative),
          special = ta.getComposeColor(R.styleable.EverliTheme_textColorSpecial, DefaultTextTheme.color.special),
        ),
      )

      // icon
      val iconTheme = IconTheme(
        size = IconSizes(
          small = ta.getDp(R.styleable.EverliTheme_iconSizeSmall, density, DefaultIconTheme.size.small),
          medium = ta.getDp(R.styleable.EverliTheme_iconSizeMedium, density, DefaultIconTheme.size.medium),
        ),
        color = IconColors(
          light = ta.getComposeColor(R.styleable.EverliTheme_iconColorLight, DefaultIconTheme.color.light),
          dark = ta.getComposeColor(R.styleable.EverliTheme_iconColorDark, DefaultIconTheme.color.dark),
          special = ta.getComposeColor(R.styleable.EverliTheme_iconColorSpecial, DefaultIconTheme.color.special),
        ),
      )

      // button
      val buttonTheme = ButtonTheme(
        text = ButtonTextStyles(
          small = DefaultButtonTheme.text.small,
          medium = DefaultButtonTheme.text.medium,
          large = DefaultButtonTheme.text.large,
          color = ButtonTextColors(
            disabled = ta.getComposeColor(R.styleable.EverliTheme_buttonTextColorDisabled,
                                          DefaultButtonTheme.text.color.disabled),
            link = StateColor(
              enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonTextLinkEnabled,
                                           DefaultButtonTheme.text.color.link.enabled),
              pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonTextLinkPressed,
                                           DefaultButtonTheme.text.color.link.pressed),
            ),
          ),
          link = DefaultButtonTheme.text.link
        ),
        icon = ButtonIconStyles(
          color = ButtonIconColors(
            disabled = ta.getComposeColor(R.styleable.EverliTheme_buttonIconColorDisabled,
                                          DefaultButtonTheme.icon.color.disabled),
            link = StateColor(
              enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonIconColorLinkEnabled,
                                           DefaultButtonTheme.icon.color.link.enabled),
              pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonIconColorLinkPressed,
                                           DefaultButtonTheme.icon.color.link.pressed),
            ),
            facebook = FacebookButtonIconColors(
              outline = StateColor(
                enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonIconColorFacebookOutlineEnabled,
                                             DefaultButtonTheme.icon.color.facebook.outline.enabled),
              ),
            ),
          ),
        ),
        color = ButtonsColors(
          transparent = ButtonColors(
            background = StateColor(
              enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorTransparentBackgroundEnabled,
                                           DefaultButtonTheme.color.transparent.background.enabled),
              disabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorTransparentBackgroundDisabled,
                                            DefaultButtonTheme.color.transparent.background.disabled),
            ),
          ),
          fill = ButtonColors(
            background = StateColor(
              disabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorFillBackgroundDisabled,
                                            DefaultButtonTheme.color.fill.background.disabled),
            ),
          ),
          outline = OutlineButtonColors(
            border = StateColor(
              disabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorOutlineBorderDisabled,
                                            DefaultButtonTheme.color.outline.border.disabled),
            ),
            borderDark = DefaultButtonTheme.color.outline.borderDark,
          ),
          primary = ButtonVariantValues(
            fill = ButtonColors(
              background = StateColor(
                enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorPrimaryFillBackgroundEnabled,
                                             DefaultButtonTheme.color.primary.fill.background.enabled),
                pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonColorPrimaryFillBackgroundPressed,
                                             DefaultButtonTheme.color.primary.fill.background.pressed),
              ),
            ),
            outline = ButtonColors(
              background = StateColor(
                pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonColorPrimaryOutlineBackgroundPressed,
                                             DefaultButtonTheme.color.primary.outline.background.pressed),
              ),
              border = StateColor(
                enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorPrimaryOutlineBorderEnabled,
                                             DefaultButtonTheme.color.primary.outline.border.enabled),
              ),
            ),
            flat = ButtonColors(
              background = StateColor(
                pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonColorPrimaryFlatBackgroundPressed,
                                             DefaultButtonTheme.color.primary.flat.background.pressed),
              ),
            ),
          ),
          special = ButtonVariantValues(
            fill = ButtonColors(
              background = StateColor(
                enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorSpecialFillBackgroundEnabled,
                                             DefaultButtonTheme.color.special.fill.background.enabled),
                pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonColorSpecialFillBackgroundPressed,
                                             DefaultButtonTheme.color.special.fill.background.pressed),
              ),
            ),
            outline = ButtonColors(
              background = StateColor(
                pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonColorSpecialOutlineBackgroundPressed,
                                             DefaultButtonTheme.color.special.outline.background.pressed),
              ),
              border = StateColor(
                enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorSpecialOutlineBorderEnabled,
                                             DefaultButtonTheme.color.special.outline.border.enabled),
              ),
            ),
            flat = ButtonColors(
              background = StateColor(
                pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonColorSpecialFlatBackgroundPressed,
                                             DefaultButtonTheme.color.special.flat.background.pressed),
              ),
            ),
          ),
          facebook = ButtonVariantValues.withColors().copy(
            fill = ButtonColors(
              background = StateColor(
                enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorFacebookFillBackgroundEnabled,
                                             DefaultButtonTheme.color.facebook.fill.background.enabled),
                pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonColorFacebookFillBackgroundPressed,
                                             DefaultButtonTheme.color.facebook.fill.background.pressed),
              ),
            ),
          ),
          google = ButtonVariantValues.withColors().copy(
            fill = ButtonColors(
              background = StateColor(
                enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorGoogleFillBackgroundEnabled,
                                             DefaultButtonTheme.color.google.fill.background.enabled),
                pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonColorGoogleFillBackgroundPressed,
                                             DefaultButtonTheme.color.google.fill.background.pressed),
              ),
            ),
          ),
          apple = ButtonVariantValues.withColors().copy(
            fill = ButtonColors(
              background = StateColor(
                enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorAppleFillBackgroundEnabled,
                                             DefaultButtonTheme.color.apple.fill.background.enabled),
                pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonColorAppleFillBackgroundPressed,
                                             DefaultButtonTheme.color.apple.fill.background.pressed),
              ),
            ),
          ),
          blik = ButtonVariantValues.withColors().copy(
            fill = ButtonColors(
              background = StateColor(
                enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorBlikFillBackgroundEnabled,
                                             DefaultButtonTheme.color.blik.fill.background.enabled),
                pressed = ta.getComposeColor(R.styleable.EverliTheme_buttonColorBlikFillBackgroundPressed,
                                             DefaultButtonTheme.color.blik.fill.background.pressed),
              ),
            ),
          ),
          overlay = DefaultButtonTheme.color.overlay,
        ),
      )

      everliThemeComponents = EverliThemeComponents(
        everliTypography = DefaultTypography,
        buttonTheme = buttonTheme,
        radiusTheme = radiusTheme,
        iconTheme = iconTheme,
        textTheme = textTheme,
      )

      return everliThemeComponents
    }
  }
}
