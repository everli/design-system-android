package com.everli.designsystem.helper

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class StringExtensionsTest : FunSpec(
  {
    test("When using String.empty, an empty string should be returned") {
      String.empty shouldBe ""
    }
  }
)
