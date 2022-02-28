package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import com.everli.designsystem.core.constants.EverliTypography

@Immutable
data class EverliTypography(
  val title1Bold: TextStyle,
  val title2Bold: TextStyle,
  val title2Semibold: TextStyle,
  val title3Bold: TextStyle,
  val title3Semibold: TextStyle,
  val title4Bold: TextStyle,
  val title4Semibold: TextStyle,
  val title4Regular: TextStyle,
  val subtitleSemibold: TextStyle,
  val subtitleRegular: TextStyle,
  val bodySemibold: TextStyle,
  val bodyRegular: TextStyle,
  val bodySmallSemibold: TextStyle,
  val bodySmallRegular: TextStyle,
  val captionSemibold: TextStyle,
  val captionRegular: TextStyle,
)

// Default
val DefaultTypography = EverliTypography(
  title1Bold = EverliTypography.Title1.Bold,
  title2Bold = EverliTypography.Title2.Bold,
  title2Semibold = EverliTypography.Title2.Semibold,
  title3Bold = EverliTypography.Title3.Bold,
  title3Semibold = EverliTypography.Title3.Semibold,
  title4Bold = EverliTypography.Title4.Bold,
  title4Semibold = EverliTypography.Title4.Semibold,
  title4Regular = EverliTypography.Title4.Regular,
  subtitleSemibold = EverliTypography.Subtitle.Semibold,
  subtitleRegular = EverliTypography.Subtitle.Regular,
  bodySemibold = EverliTypography.Body.Semibold,
  bodyRegular = EverliTypography.Body.Regular,
  bodySmallSemibold = EverliTypography.BodySmall.Semibold,
  bodySmallRegular = EverliTypography.BodySmall.Regular,
  captionSemibold = EverliTypography.Caption.Semibold,
  captionRegular = EverliTypography.Caption.Regular,
)
