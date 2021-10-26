package com.everli.designsystem.core.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.everli.designsystem.core.R

private val Fira = FontFamily(
  Font(R.font.fira_regular, FontWeight.Normal),
  Font(R.font.fira_semibold, FontWeight.SemiBold),
  Font(R.font.fira_bold, FontWeight.Bold)
)

@Immutable
data class EverliTypography(
  val largeTitle: TextStyle,
  val title1: TextStyle,
  val title2: TextStyle,
  val title3: TextStyle,
  val headline: TextStyle,
  val body: TextStyle,
  val callout: TextStyle,
  val subhead: TextStyle,
  val footnote: TextStyle,
  val caption1: TextStyle,
  val caption2: TextStyle,
)

val defaultTypography = EverliTypography(
  largeTitle = TextStyle(
    fontFamily = Fira,
    fontSize = 34.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 41.sp
  ),
  title1 = TextStyle(
    fontFamily = Fira,
    fontSize = 28.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 34.sp
  ),
  title2 = TextStyle(
    fontFamily = Fira,
    fontSize = 22.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 28.sp
  ),
  title3 = TextStyle(
    fontFamily = Fira,
    fontSize = 20.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 25.sp
  ),
  headline = TextStyle(
    fontFamily = Fira,
    fontSize = 17.sp,
    fontWeight = FontWeight.SemiBold,
    lineHeight = 22.sp
  ),
  body = TextStyle(
    fontFamily = Fira,
    fontSize = 17.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 22.sp
  ),
  callout = TextStyle(
    fontFamily = Fira,
    fontSize = 16.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 21.sp
  ),
  subhead = TextStyle(
    fontFamily = Fira,
    fontSize = 15.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 20.sp
  ),
  footnote = TextStyle(
    fontFamily = Fira,
    fontSize = 13.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 18.sp
  ),
  caption1 = TextStyle(
    fontFamily = Fira,
    fontSize = 12.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 16.sp
  ),
  caption2 = TextStyle(
    fontFamily = Fira,
    fontSize = 11.sp,
    fontWeight = FontWeight.Normal,
    lineHeight = 13.sp
  ),
)
