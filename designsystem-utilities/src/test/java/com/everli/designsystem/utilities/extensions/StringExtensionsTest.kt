package com.everli.designsystem.utilities.extensions

import android.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.robolectric.RobolectricTest
import io.kotest.matchers.shouldBe
import androidx.compose.ui.graphics.Color as ComposeColor

@RobolectricTest
class StringExtensionsTest : FunSpec(
  {
    test("When using String.empty, an empty string should be returned") {
      String.empty shouldBe ""
    }

    test("When using String.whitespace, a whitespace string should be returned") {
      String.whitespace shouldBe " "
    }

    test("When using String.questionMark, a questionMark string should be returned") {
      String.questionMark shouldBe "?"
    }

    listOf(
      null to String.empty,
      "abc" to "abc",
      String.empty to String.empty,
    ).forEach { (value, expected) ->
      test("When $value.orEmpty(), should be $expected") {
        value.orEmpty() shouldBe expected
      }
    }

    test("When toAnnotatedString(), should return AnnotatedString with given text") {
      "abc".toAnnotatedString() shouldBe AnnotatedString(text = "abc")
    }

    listOf(
      null to null,
      "abc" to AnnotatedString(text = "abc"),
    ).forEach { (value, expected) ->
      test("When $value.toAnnotatedStringOrNull(), should be $expected") {
        value.toAnnotatedStringOrNull() shouldBe expected
      }
    }

    listOf(
      "#ffffff" to Color.WHITE,
      "#888888" to Color.GRAY,
      "#00000000" to Color.TRANSPARENT,
    ).forEach { (value, expected) ->
      test("When $value.toColorInt(), valid hex, should be $expected") {
        value.toColorInt() shouldBe expected
      }
    }

    listOf(
      "aaaaa" to Color.WHITE,
      "#8881212888" to Color.GRAY,
      "" to Color.TRANSPARENT,
      "123" to Color.TRANSPARENT,
    ).forEach { (value, fallback) ->
      test("When $value.toColorInt(), invalid hex with fallback, should be $fallback") {
        value.toColorInt(fallback) shouldBe fallback
      }
    }

    listOf(
      "#FFFFFF" to ComposeColor.White,
      "#FFFF0000" to ComposeColor.Red,
      "#ff0000" to ComposeColor.Red,
      "#FF00FF00" to ComposeColor.Green,
      "#ff00ff00" to ComposeColor.Green,
      null to ComposeColor.Black,
    ).forEach { (value, expected) ->
      test("When $value.toColor(), valid hex, should convert to $expected") {
        value.toColor() shouldBe expected
      }
    }

    listOf(
      "FFFFFF" to ComposeColor.White,
      "#0x000000" to ComposeColor.Red,
      "#123" to ComposeColor.Red,
      "abc" to ComposeColor.Green,
      "" to ComposeColor.Green,
    ).forEach { (value, fallback) ->
      test("When $value.toColor(), invalid hex with fallback, should convert to $fallback") {
        value.toColor(fallback) shouldBe fallback
      }
    }
  },
)
