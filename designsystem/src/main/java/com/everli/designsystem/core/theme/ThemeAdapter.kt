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
 * [Radius] -> fully
 * [Dimensions] -> fully
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
    radius = theme.radius,
    dimensions = theme.dimensions,
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
      val radius = Radius(
        medium = ta.getDp(R.styleable.EverliTheme_radiusMedium, density, DefaultRadius.medium)
      )

      // other dimensions
      val dimensions = Dimensions(
        button = ButtonDimensions(
          minWidth = ta.getDp(R.styleable.EverliTheme_dimensionButtonMinWidth,
                              density,
                              DefaultDimensions.button.minWidth),
        )
      )

      // typo - not supported
      val everliTypography = DefaultTypography

      // button
      val buttonTheme = ButtonTheme(
        radius = radius.medium,
        size = ButtonSizeValues(
          small = ta.getDp(R.styleable.EverliTheme_buttonSizeSmall, density, DefaultButtonTheme.size.small),
          medium = ta.getDp(R.styleable.EverliTheme_buttonSizeMedium, density, DefaultButtonTheme.size.medium),
          large = ta.getDp(R.styleable.EverliTheme_buttonSizeLarge, density, DefaultButtonTheme.size.large),
        ),
        text = ButtonSizeValues(
          small = DefaultTypography.bodySmallSemibold,
          medium = DefaultTypography.bodySemibold,
          large = DefaultTypography.subtitleSemibold,
        ),
        color = ButtonsColors(
          primary = ButtonColors(
            background = StateColor(
              enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorPrimaryBackgroundEnabled,
                                           DefaultButtonTheme.color.primary.background.enabled),
              disabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorPrimaryBackgroundDisabled,
                                            DefaultButtonTheme.color.primary.background.disabled),
            ),
            text = StateColor(
              enabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorPrimaryTextEnabled,
                                           DefaultButtonTheme.color.primary.text.enabled),
              disabled = ta.getComposeColor(R.styleable.EverliTheme_buttonColorPrimaryTextDisabled,
                                            DefaultButtonTheme.color.primary.text.disabled),
            ),
          ),
        ),
      )

      everliThemeComponents = EverliThemeComponents(
        everliTypography = everliTypography,
        buttonTheme = buttonTheme,
        radius = radius,
        dimensions = dimensions,
      )

      return everliThemeComponents
    }
  }
}
