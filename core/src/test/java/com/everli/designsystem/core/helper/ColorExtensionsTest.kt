package com.everli.designsystem.core.helper

import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.ui.theme.Black100
import com.everli.designsystem.core.ui.theme.Blue100
import com.everli.designsystem.core.ui.theme.Gray10
import com.everli.designsystem.core.ui.theme.Gray100
import com.everli.designsystem.core.ui.theme.Gray15
import com.everli.designsystem.core.ui.theme.Gray40
import com.everli.designsystem.core.ui.theme.Gray80
import com.everli.designsystem.core.ui.theme.Green10
import com.everli.designsystem.core.ui.theme.Green100
import com.everli.designsystem.core.ui.theme.Green110
import com.everli.designsystem.core.ui.theme.Link100
import com.everli.designsystem.core.ui.theme.Red100
import com.everli.designsystem.core.ui.theme.Red20
import com.everli.designsystem.core.ui.theme.Teal100
import com.everli.designsystem.core.ui.theme.Teal20
import com.everli.designsystem.core.ui.theme.Violet100
import com.everli.designsystem.core.ui.theme.White
import com.everli.designsystem.core.ui.theme.Yellow100
import com.everli.designsystem.core.ui.theme.Yellow20
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.robolectric.RobolectricTest
import io.kotest.matchers.shouldBe

@RobolectricTest
internal class ColorExtensionsTest : FunSpec(
  {

    listOf(
      "#FFFFFF" to White,
      "#FFFFFFFF" to White,
      "#ffffff" to White,
      "#FFffffff" to White,
      "#64C828" to Green100,
      "#FF64C828" to Green100,
      "#64c828" to Green100,
      "#FF64c828" to Green100,
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
        Color.fromHex(hex) shouldBe White
      }
    }

    listOf(
      "" to Red100,
      "1" to Green100,
      "123" to Red100,
      "ffffff" to White,
      "FFFFFF" to Black100,
      "#FFFFFFF" to Yellow100,
      "#FFFFF" to Red100,
    ).forEach { (hex, fallback) ->
      test("Invalid $hex, with fallback, should be converted to $fallback") {
        Color.fromHex(hex, fallback) shouldBe fallback
      }
    }

    listOf(
      "white" to White,
      "walter-white" to White,
      "gray-10" to Gray10,
      "gray-15" to Gray15,
      "gray-40" to Gray40,
      "gray-80" to Gray80,
      "gray-100" to Gray100,
      "black-100" to Black100,
      "violet-black" to Black100,
      "red-20" to Red20,
      "red-100" to Red100,
      "red-hot" to Red100,
      "violet-100" to Violet100,
      "purple-rain" to Violet100,
      "teal-20" to Teal20,
      "teal-100" to Teal100,
      "teal-waves" to Teal100,
      "blue-100" to Blue100,
      "blue-plus" to Blue100,
      "green-10" to Green10,
      "green-100" to Green100,
      "everli-green" to Green100,
      "green-110" to Green110,
      "deep-green" to Green110,
      "yellow-20" to Yellow20,
      "yellow-100" to Yellow100,
      "yellow-sun" to Yellow100,
      "link-100" to Link100,
      "link" to Link100
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
        Color.fromName(name) shouldBe White
      }
    }

    listOf(
      "" to Red100,
      "nice-color" to Green100,
      "best color" to Red100,
      "123" to White,
      "#FFFFFF" to Black100,
      "#ffffff" to Yellow100,
    ).forEach { (name, fallback) ->
      test("Invalid $name, with fallback, should be converted to $fallback") {
        Color.fromName(name, fallback) shouldBe fallback
      }
    }

  }
)
