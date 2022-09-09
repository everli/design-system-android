package com.everli.designsystem.helper

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.everli.designsystem.R
import com.everli.designsystem.core.constants.EverliTextStyle
import com.everli.designsystem.core.constants.EverliTypography

/**
 * Return a compose [TextStyle] based on [EverliTextStyle]
 */
fun EverliTextStyle.toTextStyle(): TextStyle {
  return when (this) {
    EverliTextStyle.TITLE_1_BOLD -> EverliTypography.Title1.Bold
    EverliTextStyle.TITLE_2_BOLD -> EverliTypography.Title2.Bold
    EverliTextStyle.TITLE_2_SEMIBOLD -> EverliTypography.Title2.Semibold
    EverliTextStyle.TITLE_3_BOLD -> EverliTypography.Title3.Bold
    EverliTextStyle.TITLE_3_SEMIBOLD -> EverliTypography.Title3.Semibold
    EverliTextStyle.TITLE_4_BOLD -> EverliTypography.Title4.Bold
    EverliTextStyle.TITLE_4_SEMIBOLD -> EverliTypography.Title4.Semibold
    EverliTextStyle.TITLE_4_REGULAR -> EverliTypography.Title4.Regular
    EverliTextStyle.SUBTITLE_SEMIBOLD -> EverliTypography.Subtitle.Semibold
    EverliTextStyle.SUBTITLE_REGULAR -> EverliTypography.Subtitle.Regular
    EverliTextStyle.BODY_SEMIBOLD -> EverliTypography.Body.Semibold
    EverliTextStyle.BODY_REGULAR -> EverliTypography.Body.Regular
    EverliTextStyle.BODY_SMALL_SEMIBOLD -> EverliTypography.BodySmall.Semibold
    EverliTextStyle.BODY_SMALL_REGULAR -> EverliTypography.BodySmall.Regular
    EverliTextStyle.CAPTION_SEMIBOLD -> EverliTypography.Caption.Semibold
    EverliTextStyle.CAPTION_REGULAR -> EverliTypography.Caption.Regular
  }
}

/**
 * Return a resource id based on [EverliTextStyle]
 */
fun EverliTextStyle.toResourceId(): Int {
  return when (this) {
    EverliTextStyle.TITLE_1_BOLD -> R.style.EverliTypography_Title1_Bold
    EverliTextStyle.TITLE_2_BOLD -> R.style.EverliTypography_Title2_Bold
    EverliTextStyle.TITLE_2_SEMIBOLD -> R.style.EverliTypography_Title2_Semibold
    EverliTextStyle.TITLE_3_BOLD -> R.style.EverliTypography_Title3_Bold
    EverliTextStyle.TITLE_3_SEMIBOLD -> R.style.EverliTypography_Title3_Semibold
    EverliTextStyle.TITLE_4_BOLD -> R.style.EverliTypography_Title4_Bold
    EverliTextStyle.TITLE_4_SEMIBOLD -> R.style.EverliTypography_Title4_Semibold
    EverliTextStyle.TITLE_4_REGULAR -> R.style.EverliTypography_Title4_Regular
    EverliTextStyle.SUBTITLE_SEMIBOLD -> R.style.EverliTypography_Subtitle_Semibold
    EverliTextStyle.SUBTITLE_REGULAR -> R.style.EverliTypography_Subtitle_Regular
    EverliTextStyle.BODY_SEMIBOLD -> R.style.EverliTypography_Body_Semibold
    EverliTextStyle.BODY_REGULAR -> R.style.EverliTypography_Body_Regular
    EverliTextStyle.BODY_SMALL_SEMIBOLD -> R.style.EverliTypography_BodySmall_Semibold
    EverliTextStyle.BODY_SMALL_REGULAR -> R.style.EverliTypography_BodySmall_Regular
    EverliTextStyle.CAPTION_SEMIBOLD -> R.style.EverliTypography_Caption_Semibold
    EverliTextStyle.CAPTION_REGULAR -> R.style.EverliTypography_Caption_Regular
  }
}
