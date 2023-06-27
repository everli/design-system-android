package com.everli.designsystem.utilities.extensions

import android.graphics.Color
import io.kotest.matchers.shouldBe
import androidx.compose.ui.graphics.Color as ComposeColor
import org.junit.Test

class StringExtensionsTest {

  @Test
  fun when_toColorInt_should_convert_to_color() {
    "#ffffff".toColorInt() shouldBe Color.WHITE
    "#888888".toColorInt() shouldBe Color.GRAY
    "#00000000".toColorInt() shouldBe Color.TRANSPARENT
  }

  @Test
  fun when_toColorInt_invalid_should_convert_to_fallback() {
    "123".toColorInt(Color.WHITE) shouldBe Color.WHITE
    "#fdsfsdf1".toColorInt(Color.WHITE) shouldBe Color.WHITE
    "#1234414".toColorInt(Color.WHITE) shouldBe Color.WHITE
    "".toColorInt(Color.WHITE) shouldBe Color.WHITE
  }

  @Test
  fun when_toColor_should_convert_to_color() {
    "#FFFFFF".toColor() shouldBe ComposeColor.White
    "#FFFF0000".toColor() shouldBe ComposeColor.Red
    "#ff0000".toColor() shouldBe ComposeColor.Red
    "#FF00FF00".toColor() shouldBe ComposeColor.Green
    "#ff00ff00".toColor() shouldBe ComposeColor.Green
  }

  @Test
  fun when_toColor_invalid_should_convert_to_fallback() {
    "FFFFFF".toColor(fallback = ComposeColor.White) shouldBe ComposeColor.White
    "$23".toColor(fallback = ComposeColor.White) shouldBe ComposeColor.White
    "".toColor(fallback = ComposeColor.White) shouldBe ComposeColor.White
    "1234".toColor(fallback = ComposeColor.White) shouldBe ComposeColor.White
  }

}
