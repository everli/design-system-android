package com.everli.designsystem.components.button

import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.robolectric.RobolectricTest

@RobolectricTest
class EverliButtonUnitTests : FunSpec(
  {
    test("pos") {
      IconPosition.LEFT.padding()
    }
  }
)
