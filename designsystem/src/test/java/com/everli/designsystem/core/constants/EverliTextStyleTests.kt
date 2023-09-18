package com.everli.designsystem.core.constants

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

internal class EverliTextStyleTests : FunSpec(
  {
    listOf(
      "title-1-bold" to EverliTextStyle.TITLE_1_BOLD,
      "title-2-bold" to EverliTextStyle.TITLE_2_BOLD,
      "title-2-semibold" to EverliTextStyle.TITLE_2_SEMIBOLD,
      "title-3-bold" to EverliTextStyle.TITLE_3_BOLD,
      "title-3-semibold" to EverliTextStyle.TITLE_3_SEMIBOLD,
      "title-4-bold" to EverliTextStyle.TITLE_4_BOLD,
      "title-4-semibold" to EverliTextStyle.TITLE_4_SEMIBOLD,
      "title-4-regular" to EverliTextStyle.TITLE_4_REGULAR,
      "subtitle-semibold" to EverliTextStyle.SUBTITLE_SEMIBOLD,
      "subtitle-regular" to EverliTextStyle.SUBTITLE_REGULAR,
      "body-semibold" to EverliTextStyle.BODY_SEMIBOLD,
      "body-regular" to EverliTextStyle.BODY_REGULAR,
      "body-small-semibold" to EverliTextStyle.BODY_SMALL_SEMIBOLD,
      "body-small-regular" to EverliTextStyle.BODY_SMALL_REGULAR,
      "caption-semibold" to EverliTextStyle.CAPTION_SEMIBOLD,
      "caption-regular" to EverliTextStyle.CAPTION_REGULAR,
      "caption-small-semibold" to EverliTextStyle.CAPTION_SMALL_SEMIBOLD,
      "caption-small-regular" to EverliTextStyle.CAPTION_SMALL_REGULAR,
    ).forEach { (name, textStyle) ->
      test("$name should be converted to $textStyle") {
        EverliTextStyle.fromString(name) shouldBe textStyle
      }
    }

    listOf(
      "",
      "title-99",
      "123",
      " ",
      "title1@@",
    ).forEach { name ->
      test("Invalid $name, without fallback, should return ${EverliTextStyle.BODY_REGULAR}") {
        EverliTextStyle.fromString(name) shouldBe EverliTextStyle.BODY_REGULAR
      }
    }

    listOf(
      "" to EverliTextStyle.BODY_SMALL_REGULAR,
      "title-99" to EverliTextStyle.TITLE_4_BOLD,
      "123" to EverliTextStyle.SUBTITLE_REGULAR,
      " " to EverliTextStyle.TITLE_4_REGULAR,
      "title1@@" to EverliTextStyle.TITLE_2_BOLD,
    ).forEach { (name, fallback) ->
      test("Invalid $name, with fallback, should be converted to $fallback") {
        EverliTextStyle.fromString(name, fallback) shouldBe fallback
      }
    }
  },
)
