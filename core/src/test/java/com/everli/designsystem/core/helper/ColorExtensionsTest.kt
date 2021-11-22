package com.everli.designsystem.core.helper

import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.ui.theme.Black100
import com.everli.designsystem.core.ui.theme.Blue100
import com.everli.designsystem.core.ui.theme.Gray10
import com.everli.designsystem.core.ui.theme.Gray100
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
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.robolectric.RobolectricTest
import io.kotest.matchers.shouldBe

@RobolectricTest
internal class ColorExtensionsTest : FunSpec(
  {

    listOf(
      "#FFFFFF" to Color.White,
      "#ffffff" to Color.White,
    ).forEach { (hex, color) ->
      test("$hex should be converted to $color") {
        Color.fromHex(hex) shouldBe color
      }
    }

    test("When converting from hex invalid argument, should throw IllegalArgumentException") {
      shouldThrow<IllegalArgumentException> {
        Color.fromHex("123")
      }
    }

    listOf(
      "white" to White,
      "walter-white" to White,
      "gray-10" to Gray10,
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

    test("When converting from name invalid argument, should throw IllegalArgumentException") {
      shouldThrow<IllegalArgumentException> {
        Color.fromName("supper-cool-color")
      }
    }

  }
)
