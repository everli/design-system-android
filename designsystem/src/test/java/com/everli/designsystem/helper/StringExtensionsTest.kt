package com.everli.designsystem.helper

import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.constants.EverliColor
import com.everli.designsystem.utilities.extensions.toColor
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.robolectric.RobolectricTest
import io.kotest.matchers.shouldBe

@RobolectricTest
class StringExtensionsTest : FunSpec(
  {
    listOf(
      "#FFFFFF" to EverliColor.WHITE.toColor(),
      "#FFDC325F" to EverliColor.RED_100.toColor(),
      "#DC325F" to EverliColor.RED_100.toColor(),
      "#ffdc325f" to EverliColor.RED_100.toColor(),
      "#dc325f" to EverliColor.RED_100.toColor(),
      null to Color.Black,
    ).forEach { (value, expected) ->
      test("When $value.toEverliColor(), valid hex, should convert to $expected") {
        value.toColor() shouldBe expected
      }
    }

    listOf(
      "FFFFFF" to EverliColor.RED_100,
      "#0x000000" to EverliColor.GREEN_100,
      "#123" to EverliColor.YELLOW_100,
      "abc" to EverliColor.APPLE,
      "" to EverliColor.TRANSPARENT,
    ).forEach { (value, fallback) ->
      test("When $value.toColor(), invalid hex with fallback, should convert to $fallback") {
        value.toColor(fallback) shouldBe fallback.toColor()
      }
    }
  },
)
