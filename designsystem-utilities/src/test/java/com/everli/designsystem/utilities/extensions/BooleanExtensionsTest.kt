package com.everli.designsystem.utilities.extensions

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class BooleanExtensionsTest : FunSpec(
  {

    listOf(
      true to 1,
      false to 0,
    ).forEach { (boolean, int) ->
      test("when $boolean toInt(), should be converted to $int") {
        boolean.toInt() shouldBe int
      }
    }

    listOf(
      true to true,
      false to false,
      null to false,
    ).forEach { (boolean, expected) ->
      test("when $boolean isTrue(), should be $expected") {
        boolean.isTrue() shouldBe expected
      }
    }

    listOf(
      true to false,
      false to true,
      null to false,
    ).forEach { (boolean, expected) ->
      test("when $boolean isFalse(), should be $expected") {
        boolean.isFalse() shouldBe expected
      }
    }

    listOf(
      true to true,
      false to false,
      null to true,
    ).forEach { (boolean, expected) ->
      test("when $boolean isNullOrTrue(), should be $expected") {
        boolean.isNullOrTrue() shouldBe expected
      }
    }

    listOf(
      true to false,
      false to true,
      null to true,
    ).forEach { (boolean, expected) ->
      test("when $boolean isNullOrFalse(), should be $expected") {
        boolean.isNullOrFalse() shouldBe expected
      }
    }

    listOf(
      true to false,
      false to true,
      null to true,
    ).forEach { (boolean, expected) ->
      test("when $boolean isNullOrFalse(), should be $expected") {
        boolean.isNullOrFalse() shouldBe expected
      }
    }

  },
)
