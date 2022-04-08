package com.everli.designsystem.helper

import io.kotest.core.spec.style.FunSpec

enum class DummyEnum {
  RED,
  BLUE,
  YELLOW,
}

class EnumHelpersTest : FunSpec(
  {
    listOf(
      0 to DummyEnum.RED,
      1 to DummyEnum.BLUE,
      2 to DummyEnum.YELLOW,
      3 to DummyEnum.RED,
      -1 to DummyEnum.RED,
      999 to DummyEnum.RED,
    ).forEach { (ordinal, value) ->
      test("enumValueOfOrFallback for $ordinal should be expected $value") {
        enumValueOfOrFallback(ordinal, DummyEnum.RED)
      }
    }
  }
)
