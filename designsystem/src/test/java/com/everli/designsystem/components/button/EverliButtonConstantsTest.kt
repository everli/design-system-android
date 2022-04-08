package com.everli.designsystem.components.button

import com.everli.designsystem.helper.DummyEnum
import com.everli.designsystem.helper.enumValueOfOrFallback
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

internal class EverliButtonConstantsTest : FunSpec(
  {
    listOf(
      ButtonVariant.PRIMARY to false,
      ButtonVariant.SPECIAL to false,
      ButtonVariant.LINK to true,
      ButtonVariant.FACEBOOK to false,
      ButtonVariant.GOOGLE to false,
      ButtonVariant.APPLE to false,
      ButtonVariant.BLIK to false,
    ).forEach { (variant, expected) ->
      test("ButtonVariant.isLink() for $variant should be $expected") {
        variant.isLink() shouldBe expected
      }
    }

    listOf(
      ButtonVariant.PRIMARY to false,
      ButtonVariant.SPECIAL to false,
      ButtonVariant.LINK to false,
      ButtonVariant.FACEBOOK to true,
      ButtonVariant.GOOGLE to true,
      ButtonVariant.APPLE to true,
      ButtonVariant.BLIK to true,
    ).forEach { (variant, expected) ->
      test("ButtonVariant.isBrand() for $variant should be $expected") {
        variant.isBrand() shouldBe expected
      }
    }

    listOf(
      IconPosition.LEFT to true,
      IconPosition.RIGHT to false,
    ).forEach { (position, expected) ->
      test("IconPosition.isLeft() for $position should be $expected") {
        position.isLeft() shouldBe expected
      }
    }

    listOf(
      IconPosition.LEFT to false,
      IconPosition.RIGHT to true,
    ).forEach { (position, expected) ->
      test("IconPosition.isRight() for $position should be $expected") {
        position.isRight() shouldBe expected
      }
    }

    listOf(
      BrandButtonSize.LARGE to ButtonSize.LARGE,
      BrandButtonSize.MEDIUM to ButtonSize.MEDIUM,
    ).forEach { (size, expected) ->
      test("BrandButtonSize.toButtonSize() for $size should be $expected") {
        size.toButtonSize() shouldBe expected
      }
    }

    listOf(
      BrandButtonStyle.FILL to ButtonStyle.FILL,
      BrandButtonStyle.OUTLINE to ButtonStyle.OUTLINE,
    ).forEach { (style, expected) ->
      test("BrandButtonStyle.toButtonStyle() for $style should be $expected") {
        style.toButtonStyle() shouldBe expected
      }
    }
  }
)
