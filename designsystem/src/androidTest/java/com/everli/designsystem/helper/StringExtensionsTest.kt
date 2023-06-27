package com.everli.designsystem.helper

import com.everli.designsystem.core.constants.EverliColor
import io.kotest.matchers.shouldBe
import org.junit.Test

class StringExtensionsTest {

  @Test
  fun when_string_to_color_should_return_color() {
    "#FFFFFF".toColor() shouldBe EverliColor.WHITE.toColor()
    "#FFDC325F".toColor() shouldBe EverliColor.RED_100.toColor()
    "#DC325F".toColor() shouldBe EverliColor.RED_100.toColor()
    "#ffdc325f".toColor() shouldBe EverliColor.RED_100.toColor()
    "#dc325f".toColor() shouldBe EverliColor.RED_100.toColor()
  }

  @Test
  fun when_string_to_color_invalid_should_return_fallback() {
    "FFFFFF".toColor(fallback = EverliColor.GREEN_100) shouldBe EverliColor.GREEN_100.toColor()
    "#0x00000".toColor(fallback = EverliColor.GREEN_100) shouldBe EverliColor.GREEN_100.toColor()
    "#123".toColor(fallback = EverliColor.GREEN_100) shouldBe EverliColor.GREEN_100.toColor()
    "abc".toColor(fallback = EverliColor.GREEN_100) shouldBe EverliColor.GREEN_100.toColor()
    "".toColor(fallback = EverliColor.GREEN_100) shouldBe EverliColor.GREEN_100.toColor()
  }

}
