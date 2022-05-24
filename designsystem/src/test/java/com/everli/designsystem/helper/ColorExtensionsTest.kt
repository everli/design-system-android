package com.everli.designsystem.helper

import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.constants.EverliColors
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.robolectric.RobolectricTest
import io.kotest.matchers.shouldBe

@RobolectricTest
internal class ColorExtensionsTest : FunSpec(
  {

    listOf(
      "#FFFFFF" to EverliColors.White,
      "#FFFFFFFF" to EverliColors.White,
      "#ffffff" to EverliColors.White,
      "#FFffffff" to EverliColors.White,
      "#64C828" to EverliColors.Green100,
      "#FF64C828" to EverliColors.Green100,
      "#64c828" to EverliColors.Green100,
      "#FF64c828" to EverliColors.Green100,
    ).forEach { (hex, color) ->
      test("$hex should be converted to $color") {
        Color.fromHex(hex) shouldBe color
      }
    }

    listOf(
      "",
      "1",
      "123",
      "ffffff",
      "FFFFFF",
      "#FFFFFFF",
      "#FFFFF",
    ).forEach { hex ->
      test("When converting: $hex, without fallback, should return Color.White") {
        Color.fromHex(hex) shouldBe EverliColors.White
      }
    }

    listOf(
      "" to EverliColors.Red100,
      "1" to EverliColors.Green100,
      "123" to EverliColors.Red100,
      "ffffff" to EverliColors.White,
      "FFFFFF" to EverliColors.Black100,
      "#FFFFFFF" to EverliColors.Yellow100,
      "#FFFFF" to EverliColors.Red100,
    ).forEach { (hex, fallback) ->
      test("Invalid $hex, with fallback, should be converted to $fallback") {
        Color.fromHex(hex, fallback) shouldBe fallback
      }
    }

    test("ifUnspecified, should return first non-unspecified color") {
      Color.Unspecified
        .ifUnspecified(Color.Unspecified)
        .ifUnspecified(Color.Unspecified)
        .ifUnspecified(EverliColors.Red20) shouldBe EverliColors.Red20
    }

    test("ifUnspecified, no color should return first unspecified") {
      Color.Unspecified
        .ifUnspecified(Color.Unspecified)
        .ifUnspecified(Color.Unspecified) shouldBe Color.Unspecified
    }

  }
)
