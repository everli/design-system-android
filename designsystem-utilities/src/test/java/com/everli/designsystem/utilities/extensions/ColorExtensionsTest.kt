package com.everli.designsystem.utilities.extensions

import androidx.compose.ui.graphics.Color
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.robolectric.RobolectricTest
import io.kotest.matchers.shouldBe

@RobolectricTest
internal class ColorExtensionsTest : FunSpec(
  {

    listOf(
      "#FFFFFF" to Color.White,
      "#FFFFFFFF" to Color.White,
      "#ffffff" to Color.White,
      "#FFffffff" to Color.White,
      "#FF0000" to Color.Red,
      "#FFFF0000" to Color.Red,
      "#ff0000" to Color.Red,
      "#ffff0000" to Color.Red,
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
        Color.fromHex(hex) shouldBe Color.White
      }
    }

    listOf(
      "" to Color.Red,
      "1" to Color.Red,
      "123" to Color.Red,
      "ffffff" to Color.Red,
      "FFFFFF" to Color.Red,
      "#FFFFFFF" to Color.Red,
      "#FFFFF" to Color.Red,
    ).forEach { (hex, fallback) ->
      test("Invalid $hex, with fallback, should be converted to $fallback") {
        Color.fromHex(hex, fallback) shouldBe fallback
      }
    }

    test("ifUnspecified, should return first non-unspecified color") {
      Color.Unspecified
        .ifUnspecified(Color.Unspecified)
        .ifUnspecified(Color.Unspecified)
        .ifUnspecified(Color.Red) shouldBe Color.Red
    }

    test("ifUnspecified, no color should return first unspecified") {
      Color.Unspecified
        .ifUnspecified(Color.Unspecified)
        .ifUnspecified(Color.Unspecified) shouldBe Color.Unspecified
    }

  },
)
