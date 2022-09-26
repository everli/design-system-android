package com.everli.designsystem.helper

import com.everli.designsystem.R
import com.everli.designsystem.core.constants.EverliTextStyle
import com.everli.designsystem.core.constants.EverliTypography
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.robolectric.RobolectricTest
import io.kotest.matchers.shouldBe

@RobolectricTest
internal class EverliTextStyleExtensionsTest : FunSpec(
  {
    listOf(
      EverliTextStyle.TITLE_1_BOLD to EverliTypography.Title1.Bold,
      EverliTextStyle.TITLE_2_BOLD to EverliTypography.Title2.Bold,
      EverliTextStyle.TITLE_2_SEMIBOLD to EverliTypography.Title2.Semibold,
      EverliTextStyle.TITLE_3_BOLD to EverliTypography.Title3.Bold,
      EverliTextStyle.TITLE_3_SEMIBOLD to EverliTypography.Title3.Semibold,
      EverliTextStyle.TITLE_4_BOLD to EverliTypography.Title4.Bold,
      EverliTextStyle.TITLE_4_SEMIBOLD to EverliTypography.Title4.Semibold,
      EverliTextStyle.TITLE_4_REGULAR to EverliTypography.Title4.Regular,
      EverliTextStyle.SUBTITLE_SEMIBOLD to EverliTypography.Subtitle.Semibold,
      EverliTextStyle.SUBTITLE_REGULAR to EverliTypography.Subtitle.Regular,
      EverliTextStyle.BODY_SEMIBOLD to EverliTypography.Body.Semibold,
      EverliTextStyle.BODY_REGULAR to EverliTypography.Body.Regular,
      EverliTextStyle.BODY_SMALL_SEMIBOLD to EverliTypography.BodySmall.Semibold,
      EverliTextStyle.BODY_SMALL_REGULAR to EverliTypography.BodySmall.Regular,
      EverliTextStyle.CAPTION_SEMIBOLD to EverliTypography.Caption.Semibold,
      EverliTextStyle.CAPTION_REGULAR to EverliTypography.Caption.Regular,
    ).forEach { (everliTextStyle, textStyle) ->
      test("$everliTextStyle should be converted to $textStyle") {
        everliTextStyle.toTextStyle() shouldBe textStyle
      }
    }

    listOf(
      EverliTextStyle.TITLE_1_BOLD to R.style.EverliTypography_Title1_Bold,
      EverliTextStyle.TITLE_2_BOLD to R.style.EverliTypography_Title2_Bold,
      EverliTextStyle.TITLE_2_SEMIBOLD to R.style.EverliTypography_Title2_Semibold,
      EverliTextStyle.TITLE_3_BOLD to R.style.EverliTypography_Title3_Bold,
      EverliTextStyle.TITLE_3_SEMIBOLD to R.style.EverliTypography_Title3_Semibold,
      EverliTextStyle.TITLE_4_BOLD to R.style.EverliTypography_Title4_Bold,
      EverliTextStyle.TITLE_4_SEMIBOLD to R.style.EverliTypography_Title4_Semibold,
      EverliTextStyle.TITLE_4_REGULAR to R.style.EverliTypography_Title4_Regular,
      EverliTextStyle.SUBTITLE_SEMIBOLD to R.style.EverliTypography_Subtitle_Semibold,
      EverliTextStyle.SUBTITLE_REGULAR to R.style.EverliTypography_Subtitle_Regular,
      EverliTextStyle.BODY_SEMIBOLD to R.style.EverliTypography_Body_Semibold,
      EverliTextStyle.BODY_REGULAR to R.style.EverliTypography_Body_Regular,
      EverliTextStyle.BODY_SMALL_SEMIBOLD to R.style.EverliTypography_BodySmall_Semibold,
      EverliTextStyle.BODY_SMALL_REGULAR to R.style.EverliTypography_BodySmall_Regular,
      EverliTextStyle.CAPTION_SEMIBOLD to R.style.EverliTypography_Caption_Semibold,
      EverliTextStyle.CAPTION_REGULAR to R.style.EverliTypography_Caption_Regular,
    ).forEach { (everliTextStyle, resourceId) ->
      test("$everliTextStyle should be converted to $resourceId") {
        everliTextStyle.toResourceId() shouldBe resourceId
      }
    }
  },
)
