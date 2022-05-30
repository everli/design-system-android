package com.everli.designsystem.theme

import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.theme.StateColor
import io.kotest.core.spec.style.FunSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

val dummyStateColor = StateColor(
  enabled = Color.Red,
  disabled = Color.Gray,
  pressed = Color.Green,
)

class StateColorTest : FunSpec(
  {

    listOf(
      true to dummyStateColor.enabled,
      false to dummyStateColor.disabled,
    ).forEach { (enabled, expectedColor) ->
      test("forEnabled: $enabled should be $expectedColor") {
        dummyStateColor.forEnabled(enabled) shouldBe expectedColor
      }
    }

    listOf(
      true to dummyStateColor.pressed,
      false to dummyStateColor.enabled,
    ).forEach { (pressed, expectedColor) ->
      test("forPressed: $pressed should be $expectedColor") {
        dummyStateColor.forPressed(pressed) shouldBe expectedColor
      }
    }

    listOf(
      row(a = true, b = true, c = dummyStateColor.pressed),
      row(a = true, b = true, c = dummyStateColor.pressed),
      row(a = true, b = true, c = dummyStateColor.pressed),
    ).forEach { (enabled, pressed, expectedColor) ->
      test("forEnabledAndPressed enabled: $enabled, pressed: $pressed should be $expectedColor") {
        dummyStateColor.forEnabledAndPressed(enabled, pressed) shouldBe expectedColor
      }
    }

    test("merge, should merge values and return combined values") {
      StateColor(
        enabled = Color.Black
      ).merge(
        StateColor(
          disabled = Color.Red
        ).merge(
          StateColor(
            pressed = Color.Green
          )
        )
      ) shouldBe StateColor(
        enabled = Color.Black,
        disabled = Color.Red,
        pressed = Color.Green,
      )
    }
  }
)
