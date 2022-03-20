package com.everli.designsystem.components.button

import androidx.compose.material.Text
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.platform.app.InstrumentationRegistry
import com.everli.designsystem.core.constants.EverliIcons
import com.everli.designsystem.core.theme.DefaultButtonTheme
import com.everli.designsystem.core.theme.DefaultIconTheme
import com.everli.designsystem.core.theme.DefaultTextTheme
import com.everli.designsystem.core.theme.DefaultTheme
import com.everli.designsystem.core.theme.StateColor
import com.everli.designsystem.helper.TestTags
import com.everli.designsystem.helper.ifUnspecified
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.Rule
import org.junit.Test

class EverliButtonTests {

  @get:Rule
  val rule = createComposeRule()

  companion object {

    const val TEST_BUTTON_TEXT = "Button"
    const val TEST_CUSTOM_CONTENT = "custom_content"
  }

  @Test
  fun when_button_with_text_with_icon_both_should_be_visible() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        DefaultTheme {
          PrimaryButton(
            onClick = { /*TODO*/ },
            text = TEST_BUTTON_TEXT,
            icon = EverliIcons.Checkmark,
          )
        }
      }
    }

    rule.onNodeWithTag(TestTags.Button.CONTAINER, true)
      .assertIsDisplayed()
      .assertHasClickAction()
      .assertIsEnabled()

    rule.onNodeWithTag(TestTags.Button.TEXT, true)
      .assertIsDisplayed()

    rule.onNodeWithTag(TestTags.Button.ICON, true)
      .assertIsDisplayed()
  }

  @Test
  fun when_button_with_text_no_icon_only_text_should_be_visible() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        DefaultTheme {
          PrimaryButton(
            onClick = { /*TODO*/ },
            text = TEST_BUTTON_TEXT,
          )
        }
      }
    }

    rule.onNodeWithTag(TestTags.Button.CONTAINER, true)
      .assertIsDisplayed()
      .assertHasClickAction()
      .assertIsEnabled()

    rule.onNodeWithTag(TestTags.Button.TEXT, true)
      .assertIsDisplayed()

    rule.onNodeWithTag(TestTags.Button.ICON, true)
      .assertDoesNotExist()
  }

  @Test
  fun when_no_text_but_custom_content_it_should_be_visible() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        DefaultTheme {
          PrimaryButton(
            onClick = { /*TODO*/ },
          ) {
            Text(modifier = Modifier.testTag(TEST_CUSTOM_CONTENT), text = TEST_BUTTON_TEXT)
          }
        }
      }
    }

    rule.onNodeWithTag(TestTags.Button.CONTAINER, true)
      .assertIsDisplayed()
      .assertHasClickAction()
      .assertIsEnabled()

    rule.onNodeWithTag(TestTags.Button.TEXT, true)
      .assertDoesNotExist()

    rule.onNodeWithTag(TestTags.Button.ICON, true)
      .assertDoesNotExist()

    rule.onNodeWithTag(TEST_CUSTOM_CONTENT, true)
      .assertIsDisplayed()
  }

  @Test
  fun when_button_disabled_assert_it() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        DefaultTheme {
          PrimaryButton(
            onClick = { /*TODO*/ },
            text = TEST_BUTTON_TEXT,
            icon = EverliIcons.Checkmark,
            enabled = false,
          )
        }
      }
    }

    rule.onNodeWithTag(TestTags.Button.CONTAINER, true)
      .assertIsDisplayed()
      .assertHasClickAction()
      .assertIsNotEnabled()
  }

  @Test
  fun text_style_should_be_based_on_theme() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        DefaultTheme {
          ButtonSize.SMALL.textStyle(variant = ButtonVariant.PRIMARY) shouldBe DefaultButtonTheme.text.small
          ButtonSize.MEDIUM.textStyle(variant = ButtonVariant.PRIMARY) shouldBe DefaultButtonTheme.text.medium
          ButtonSize.LARGE.textStyle(variant = ButtonVariant.PRIMARY) shouldBe DefaultButtonTheme.text.large
          ButtonSize.LARGE.textStyle(variant = ButtonVariant.LINK) shouldBe DefaultButtonTheme.text.link.large
        }
      }
    }
  }

  @Test
  fun icon_size_should_be_based_on_theme() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        DefaultTheme {
          ButtonSize.SMALL.iconSize() shouldBe DefaultIconTheme.size.small
          ButtonSize.MEDIUM.iconSize() shouldBe DefaultIconTheme.size.medium
          ButtonSize.LARGE.iconSize() shouldBe DefaultIconTheme.size.medium
        }
      }
    }
  }

  @Test
  fun border_should_be_null_for_non_outline() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        DefaultTheme {
          ButtonStyle.FILL.border(color = Color.Red) shouldBe null
          ButtonStyle.FLAT.border(color = Color.Red) shouldBe null
          ButtonStyle.OUTLINE.border(color = Color.Red) shouldNotBe null
        }
      }
    }
  }

  @Test
  fun background_colors_should_be_based_on_theme() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        DefaultTheme {
          with(DefaultButtonTheme.color) {
            backgroundColors(ButtonVariant.PRIMARY, ButtonStyle.FILL) shouldBe
                primary.fill.background.merge(fill.background)
            backgroundColors(ButtonVariant.PRIMARY, ButtonStyle.OUTLINE) shouldBe
                primary.outline.background.merge(outline.background)
            backgroundColors(ButtonVariant.PRIMARY, ButtonStyle.FLAT) shouldBe
                primary.flat.background.merge(transparent.background)

            backgroundColors(ButtonVariant.SPECIAL, ButtonStyle.FILL) shouldBe
                special.fill.background.merge(fill.background)
            backgroundColors(ButtonVariant.SPECIAL, ButtonStyle.OUTLINE) shouldBe
                special.outline.background.merge(outline.background)
            backgroundColors(ButtonVariant.SPECIAL, ButtonStyle.FLAT) shouldBe
                special.flat.background.merge(transparent.background)

            backgroundColors(ButtonVariant.LINK, ButtonStyle.FILL) shouldBe transparent.background
            backgroundColors(ButtonVariant.LINK, ButtonStyle.OUTLINE) shouldBe transparent.background
            backgroundColors(ButtonVariant.LINK, ButtonStyle.FLAT) shouldBe transparent.background
          }
        }
      }
    }
  }

  @Test
  fun border_colors_should_be_based_on_theme() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        DefaultTheme {
          with(DefaultButtonTheme.color) {
            borderColors(ButtonVariant.PRIMARY, ButtonStyle.OUTLINE) shouldBe
                primary.outline.border.merge(outline.border)
            borderColors(ButtonVariant.PRIMARY, ButtonStyle.FILL) shouldBe StateColor()
            borderColors(ButtonVariant.PRIMARY, ButtonStyle.FLAT) shouldBe StateColor()

            borderColors(ButtonVariant.SPECIAL, ButtonStyle.OUTLINE) shouldBe
                special.outline.border.merge(outline.border)
            borderColors(ButtonVariant.SPECIAL, ButtonStyle.FILL) shouldBe StateColor()
            borderColors(ButtonVariant.SPECIAL, ButtonStyle.FLAT) shouldBe StateColor()

            borderColors(ButtonVariant.LINK, ButtonStyle.FILL) shouldBe StateColor()
            borderColors(ButtonVariant.LINK, ButtonStyle.OUTLINE) shouldBe StateColor()
            borderColors(ButtonVariant.LINK, ButtonStyle.FLAT) shouldBe StateColor()
          }
        }
      }
    }
  }

  @Test
  fun text_colors_should_be_based_on_theme() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        DefaultTheme {
          with(DefaultButtonTheme.text.color) {
            textColors(ButtonVariant.PRIMARY, ButtonStyle.FILL) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultTextTheme.color.negative),
              disabled = disabled.ifUnspecified(DefaultTextTheme.color.negative),
              pressed = pressed.ifUnspecified(DefaultTextTheme.color.negative),
            )

            textColors(ButtonVariant.PRIMARY, ButtonStyle.OUTLINE) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultTextTheme.color.primary),
              disabled = disabled.ifUnspecified(DefaultTextTheme.color.primary),
              pressed = pressed.ifUnspecified(DefaultTextTheme.color.primary),
            )

            textColors(ButtonVariant.PRIMARY, ButtonStyle.FLAT) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultTextTheme.color.primary),
              disabled = disabled.ifUnspecified(DefaultTextTheme.color.primary),
              pressed = pressed.ifUnspecified(DefaultTextTheme.color.primary),
            )

            textColors(ButtonVariant.SPECIAL, ButtonStyle.FILL) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultTextTheme.color.negative),
              disabled = disabled.ifUnspecified(DefaultTextTheme.color.negative),
              pressed = pressed.ifUnspecified(DefaultTextTheme.color.negative),
            )

            textColors(ButtonVariant.SPECIAL, ButtonStyle.OUTLINE) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultTextTheme.color.primary),
              disabled = disabled.ifUnspecified(DefaultTextTheme.color.primary),
              pressed = pressed.ifUnspecified(DefaultTextTheme.color.primary),
            )

            textColors(ButtonVariant.SPECIAL, ButtonStyle.FLAT) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultTextTheme.color.special),
              disabled = disabled.ifUnspecified(DefaultTextTheme.color.special),
              pressed = pressed.ifUnspecified(DefaultTextTheme.color.special),
            )

            textColors(ButtonVariant.LINK, ButtonStyle.FILL) shouldBe StateColor(
              enabled = link.enabled.ifUnspecified(enabled),
              disabled = link.disabled.ifUnspecified(disabled),
              pressed = link.pressed.ifUnspecified(pressed),
            )

            textColors(ButtonVariant.LINK, ButtonStyle.OUTLINE) shouldBe StateColor(
              enabled = link.enabled.ifUnspecified(enabled),
              disabled = link.disabled.ifUnspecified(disabled),
              pressed = link.pressed.ifUnspecified(pressed),
            )

            textColors(ButtonVariant.LINK, ButtonStyle.FLAT) shouldBe StateColor(
              enabled = link.enabled.ifUnspecified(enabled),
              disabled = link.disabled.ifUnspecified(disabled),
              pressed = link.pressed.ifUnspecified(pressed),
            )
          }
        }
      }
    }
  }

  @Test
  fun icon_colors_should_be_based_on_theme() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        DefaultTheme {
          with(DefaultButtonTheme.icon.color) {
            iconColors(ButtonVariant.PRIMARY, ButtonStyle.FILL) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultIconTheme.color.light),
              disabled = disabled.ifUnspecified(DefaultIconTheme.color.light),
              pressed = pressed.ifUnspecified(DefaultIconTheme.color.light),
            )

            iconColors(ButtonVariant.PRIMARY, ButtonStyle.OUTLINE) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultIconTheme.color.dark),
              disabled = disabled.ifUnspecified(DefaultIconTheme.color.dark),
              pressed = pressed.ifUnspecified(DefaultIconTheme.color.dark),
            )

            iconColors(ButtonVariant.PRIMARY, ButtonStyle.FLAT) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultIconTheme.color.dark),
              disabled = disabled.ifUnspecified(DefaultIconTheme.color.dark),
              pressed = pressed.ifUnspecified(DefaultIconTheme.color.dark),
            )

            textColors(ButtonVariant.SPECIAL, ButtonStyle.FILL) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultIconTheme.color.light),
              disabled = disabled.ifUnspecified(DefaultIconTheme.color.light),
              pressed = pressed.ifUnspecified(DefaultIconTheme.color.light),
            )

            textColors(ButtonVariant.SPECIAL, ButtonStyle.OUTLINE) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultIconTheme.color.dark),
              disabled = disabled.ifUnspecified(DefaultIconTheme.color.dark),
              pressed = pressed.ifUnspecified(DefaultIconTheme.color.dark),
            )

            textColors(ButtonVariant.SPECIAL, ButtonStyle.FLAT) shouldBe StateColor(
              enabled = enabled.ifUnspecified(DefaultIconTheme.color.special),
              disabled = disabled.ifUnspecified(DefaultIconTheme.color.special),
              pressed = pressed.ifUnspecified(DefaultIconTheme.color.special),
            )

            textColors(ButtonVariant.LINK, ButtonStyle.FILL) shouldBe StateColor(
              enabled = link.enabled.ifUnspecified(enabled),
              disabled = link.disabled.ifUnspecified(disabled),
              pressed = link.pressed.ifUnspecified(pressed),
            )

            textColors(ButtonVariant.LINK, ButtonStyle.OUTLINE) shouldBe StateColor(
              enabled = link.enabled.ifUnspecified(enabled),
              disabled = link.disabled.ifUnspecified(disabled),
              pressed = link.pressed.ifUnspecified(pressed),
            )

            textColors(ButtonVariant.LINK, ButtonStyle.FLAT) shouldBe StateColor(
              enabled = link.enabled.ifUnspecified(enabled),
              disabled = link.disabled.ifUnspecified(disabled),
              pressed = link.pressed.ifUnspecified(pressed),
            )
          }
        }
      }
    }
  }

}
