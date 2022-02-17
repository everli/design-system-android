package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.everli.designsystem.core.R

// Font Families
private val Fira = FontFamily(
  Font(R.font.fira_regular, FontWeight.Normal),
  Font(R.font.fira_semibold, FontWeight.SemiBold),
  Font(R.font.fira_bold, FontWeight.Bold),
)

private val Isidora = FontFamily(
  Font(R.font.isidora_bold, FontWeight.Bold),
)

private val title2LineHeight = 52.sp

private val title3LineHeight = 40.sp

private val title4LineHeight = 32.sp

private val title4FontSize = 22.sp

private val subtitleLineHeight = 28.sp
private val subtitleFontSize = 18.sp

private val bodyLineHeight = 24.sp
private val bodyFontSize = 16.sp

private val bodySmallLineHeight = 22.sp
private val bodySmallFontSize = 14.sp

private val captionLineHeight = 18.sp
private val captionFontSize = 12.sp

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
  title1Bold = TextStyle(
    fontSize = 48.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = Isidora,
    lineHeight = 68.sp,
  ),
  title2Bold = TextStyle(
    fontSize = 37.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = Isidora,
    lineHeight = title2LineHeight,
  ),
  title2Semibold = TextStyle(
    fontSize = 36.sp,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = title2LineHeight,
  ),
  title3Bold = TextStyle(
    fontSize = 29.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = Isidora,
    lineHeight = title3LineHeight,
  ),
  title3Semibold = TextStyle(
    fontSize = 28.sp,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = title3LineHeight,
  ),
  title4Bold = TextStyle(
    fontSize = 23.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = Isidora,
    lineHeight = title4LineHeight,
  ),
  title4Semibold = TextStyle(
    fontSize = title4FontSize,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = title4LineHeight,
  ),
  title4Regular = TextStyle(
    fontSize = title4FontSize,
    fontWeight = FontWeight.Normal,
    fontFamily = Fira,
    lineHeight = title4LineHeight,
  ),
  subtitleSemibold = TextStyle(
    fontSize = subtitleFontSize,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = subtitleLineHeight,
  ),
  subtitleRegular = TextStyle(
    fontSize = subtitleFontSize,
    fontWeight = FontWeight.Normal,
    fontFamily = Fira,
    lineHeight = subtitleLineHeight,
  ),
  bodySemibold = TextStyle(
    fontSize = bodyFontSize,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = bodyLineHeight,
  ),
  bodyRegular = TextStyle(
    fontSize = bodyFontSize,
    fontWeight = FontWeight.Normal,
    fontFamily = Fira,
    lineHeight = bodyLineHeight,
  ),
  bodySmallSemibold = TextStyle(
    fontSize = bodySmallFontSize,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = bodySmallLineHeight,
  ),
  bodySmallRegular = TextStyle(
    fontSize = bodySmallFontSize,
    fontWeight = FontWeight.Normal,
    fontFamily = Fira,
    lineHeight = bodySmallLineHeight,
  ),
  captionSemibold = TextStyle(
    fontSize = captionFontSize,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = captionLineHeight,
  ),
  captionRegular = TextStyle(
    fontSize = captionFontSize,
    fontWeight = FontWeight.Normal,
    fontFamily = Fira,
    lineHeight = captionLineHeight,
  ),
)
