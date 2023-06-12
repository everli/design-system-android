package com.everli.designsystem.utilities.extensions

import androidx.compose.ui.text.AnnotatedString
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

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
  },
)
