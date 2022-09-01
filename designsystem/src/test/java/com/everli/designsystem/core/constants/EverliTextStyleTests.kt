package com.everli.designsystem.core.constants

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

internal class EverliTextStyleTests : FunSpec(
  {
    listOf(
      "title_1_bold" to EverliTextStyle.TITLE_1_BOLD,
      "title_2_bold" to EverliTextStyle.TITLE_2_BOLD,
      "title_2_semibold" to EverliTextStyle.TITLE_2_SEMIBOLD,
      "title_3_bold" to EverliTextStyle.TITLE_3_BOLD,
      "title_3_semibold" to EverliTextStyle.TITLE_3_SEMIBOLD,
      "title_4_bold" to EverliTextStyle.TITLE_4_BOLD,
      "title_4_semibold" to EverliTextStyle.TITLE_4_SEMIBOLD,
      "title_4_regular" to EverliTextStyle.TITLE_4_REGULAR,
      "subtitle_semibold" to EverliTextStyle.SUBTITLE_SEMIBOLD,
      "subtitle_regular" to EverliTextStyle.SUBTITLE_REGULAR,
      "body_semibold" to EverliTextStyle.BODY_SEMIBOLD,
      "body_regular" to EverliTextStyle.BODY_REGULAR,
      "body_small_semibold" to EverliTextStyle.BODY_SMALL_SEMIBOLD,
      "body_small_regular" to EverliTextStyle.BODY_SMALL_REGULAR,
      "caption_semibold" to EverliTextStyle.CAPTION_SEMIBOLD,
      "caption_regular" to EverliTextStyle.CAPTION_REGULAR,
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
  }
)
