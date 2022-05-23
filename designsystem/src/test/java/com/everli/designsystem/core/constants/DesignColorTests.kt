package com.everli.designsystem.core.constants

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

internal class DesignColorTests : FunSpec({

  listOf(
    "white" to EverliColor.WHITE,
    "gray-10" to EverliColor.GRAY_10,
    "gray-15" to EverliColor.GRAY_15,
    "gray-40" to EverliColor.GRAY_40,
    "gray-80" to EverliColor.GRAY_80,
    "gray-100" to EverliColor.GRAY_100,
    "black-100" to EverliColor.BLACK_100,
    "red-20" to EverliColor.RED_20,
    "red-100" to EverliColor.RED_100,
    "red-110" to EverliColor.RED_110,
    "purple-100" to EverliColor.PURPLE_100,
    "teal-20" to EverliColor.TEAL_20,
    "teal-100" to EverliColor.TEAL_100,
    "blue-100" to EverliColor.BLUE_100,
    "green-10" to EverliColor.GREEN_10,
    "green-100" to EverliColor.GREEN_100,
    "green-110" to EverliColor.GREEN_110,
    "yellow-20" to EverliColor.YELLOW_20,
    "yellow-100" to EverliColor.YELLOW_100,
    "navy-100" to EverliColor.NAVY_100,
    "navy-110" to EverliColor.NAVY_110,
    "facebook" to EverliColor.FACEBOOK,
    "google" to EverliColor.GOOGLE,
    "apple" to EverliColor.APPLE,
    "blik" to EverliColor.BLIK,
  ).forEach { (name, color) ->
    test("$name should be converted to $color") {
      EverliColor.fromString(name) shouldBe color
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
    test("Invalid $name, without fallback, should return ${EverliColor.WHITE}") {
      EverliColor.fromString(name) shouldBe EverliColor.WHITE
    }
  }

  listOf(
    "" to EverliColor.RED_100,
    "nice-color" to EverliColor.GREEN_100,
    "best color" to EverliColor.GREEN_110,
    "123" to EverliColor.WHITE,
    "#FFFFFF" to EverliColor.BLACK_100,
    "#ffffff" to EverliColor.YELLOW_100,
  ).forEach { (name, fallback) ->
    test("Invalid $name, with fallback, should be converted to $fallback") {
      EverliColor.fromString(name, fallback) shouldBe fallback
    }
  }

})
