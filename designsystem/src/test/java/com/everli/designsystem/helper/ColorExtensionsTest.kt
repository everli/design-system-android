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

    listOf(
      "white" to EverliColors.White,
      "walter-white" to EverliColors.White,
      "gray-10" to EverliColors.Gray10,
      "gray-15" to EverliColors.Gray15,
      "gray-40" to EverliColors.Gray40,
      "gray-80" to EverliColors.Gray80,
      "gray-100" to EverliColors.Gray100,
      "black-100" to EverliColors.Black100,
      "violet-black" to EverliColors.Black100,
      "red-20" to EverliColors.Red20,
      "red-100" to EverliColors.Red100,
      "red-hot" to EverliColors.Red100,
      "violet-100" to EverliColors.Violet100,
      "purple-rain" to EverliColors.Violet100,
      "teal-20" to EverliColors.Teal20,
      "teal-100" to EverliColors.Teal100,
      "teal-waves" to EverliColors.Teal100,
      "blue-100" to EverliColors.Blue100,
      "blue-plus" to EverliColors.Blue100,
      "green-10" to EverliColors.Green10,
      "green-100" to EverliColors.Green100,
      "everli-green" to EverliColors.Green100,
      "green-110" to EverliColors.Green110,
      "deep-green" to EverliColors.Green110,
      "yellow-20" to EverliColors.Yellow20,
      "yellow-100" to EverliColors.Yellow100,
      "yellow-sun" to EverliColors.Yellow100,
      "navy-100" to EverliColors.Navy100,
      "link" to EverliColors.Navy100,
      "navy-110" to EverliColors.Navy110,
    ).forEach { (name, color) ->
      test("$name should be converted to $color") {
        Color.fromName(name) shouldBe color
      }
    }

    listOf(
      "",
      "nice-color",
      "best color",
      "123",
      "#FFFFFF",
      "#ffffff",
    ).forEach { name ->
      test("Invalid $name, without fallback, should return Color.White") {
        Color.fromName(name) shouldBe EverliColors.White
      }
    }

    listOf(
      "" to EverliColors.Red100,
      "nice-color" to EverliColors.Green100,
      "best color" to EverliColors.Red100,
      "123" to EverliColors.White,
      "#FFFFFF" to EverliColors.Black100,
      "#ffffff" to EverliColors.Yellow100,
    ).forEach { (name, fallback) ->
      test("Invalid $name, with fallback, should be converted to $fallback") {
        Color.fromName(name, fallback) shouldBe fallback
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
