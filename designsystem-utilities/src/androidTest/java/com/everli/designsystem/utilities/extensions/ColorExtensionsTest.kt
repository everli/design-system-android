package com.everli.designsystem.utilities.extensions

import androidx.compose.ui.graphics.Color
import io.kotest.matchers.shouldBe
import org.junit.Test

class ColorExtensionsTest {

  @Test
  fun when_color_from_hex_should_convert_to_color() {
    Color.fromHex("#FFFFFF") shouldBe Color.White
    Color.fromHex("#FFFFFFFF") shouldBe Color.White
    Color.fromHex("#ffffff") shouldBe Color.White
    Color.fromHex("#FFffffff") shouldBe Color.White
    Color.fromHex("#FF0000") shouldBe Color.Red
    Color.fromHex("#FFFF0000") shouldBe Color.Red
    Color.fromHex("#ff0000") shouldBe Color.Red
    Color.fromHex("#ffff0000") shouldBe Color.Red
  }

  @Test
  fun when_color_from_hex_invalid_should_convert_to_fallback() {
    Color.fromHex("#FFFFF") shouldBe Color.White
    Color.fromHex("#123") shouldBe Color.White
    Color.fromHex("abc") shouldBe Color.White
    Color.fromHex("") shouldBe Color.White
  }

  @Test
  fun ifUnspecified_should_return_first_color() {
    Color.Unspecified
      .ifUnspecified(Color.Unspecified)
      .ifUnspecified(Color.Unspecified)
      .ifUnspecified(Color.Red) shouldBe Color.Red
  }

  @Test
  fun ifUnspecified_no_color_should_return_unspecified() {
    Color.Unspecified
      .ifUnspecified(Color.Unspecified)
      .ifUnspecified(Color.Unspecified) shouldBe Color.Unspecified
  }

}
