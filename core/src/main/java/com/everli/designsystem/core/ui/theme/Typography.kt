package com.everli.designsystem.core.ui.theme

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

// Title 1
@Immutable
data class Title1(
  val boldBrand: TextStyle,
)

private val title1 = Title1(
  boldBrand = TextStyle(
    fontSize = 48.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = Isidora,
    lineHeight = 68.sp,
  ),
)

// Title 2
@Immutable
data class Title2(
  val boldBrand: TextStyle,
  val semibold: TextStyle,
)

private val title2LineHeight = 52.sp

private val title2 = Title2(
  boldBrand = TextStyle(
    fontSize = 37.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = Isidora,
    lineHeight = title2LineHeight,
  ),
  semibold = TextStyle(
    fontSize = 36.sp,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = title2LineHeight,
  ),
)

// Title 3
@Immutable
data class Title3(
  val boldBrand: TextStyle,
  val semibold: TextStyle,
)

private val title3LineHeight = 40.sp

private val title3 = Title3(
  boldBrand = TextStyle(
    fontSize = 29.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = Isidora,
    lineHeight = title3LineHeight,
  ),
  semibold = TextStyle(
    fontSize = 28.sp,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = title3LineHeight,
  ),
)

// Title 4
@Immutable
data class Title4(
  val boldBrand: TextStyle,
  val semibold: TextStyle,
  val regular: TextStyle,
)

private val title4LineHeight = 32.sp
private val title4FontSize = 22.sp

private val title4 = Title4(
  boldBrand = TextStyle(
    fontSize = 23.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = Isidora,
    lineHeight = title4LineHeight,
  ),
  semibold = TextStyle(
    fontSize = title4FontSize,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = title4LineHeight,
  ),
  regular = TextStyle(
    fontSize = title4FontSize,
    fontWeight = FontWeight.Normal,
    fontFamily = Fira,
    lineHeight = title4LineHeight,
  ),
)

// Subtitle
@Immutable
data class Subtitle(
  val semibold: TextStyle,
  val regular: TextStyle,
)

private val subtitleLineHeight = 28.sp
private val subtitleFontSize = 18.sp

private val subtitle = Subtitle(
  semibold = TextStyle(
    fontSize = subtitleFontSize,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = subtitleLineHeight,
  ),
  regular = TextStyle(
    fontSize = subtitleFontSize,
    fontWeight = FontWeight.Normal,
    fontFamily = Fira,
    lineHeight = subtitleLineHeight,
  ),
)

// Body
@Immutable
data class Body(
  val semibold: TextStyle,
  val regular: TextStyle,
)

private val bodyLineHeight = 24.sp
private val bodyFontSize = 16.sp

private val body = Body(
  semibold = TextStyle(
    fontSize = bodyFontSize,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = bodyLineHeight,
  ),
  regular = TextStyle(
    fontSize = bodyFontSize,
    fontWeight = FontWeight.Normal,
    fontFamily = Fira,
    lineHeight = bodyLineHeight,
  ),
)

// Body Small
@Immutable
data class BodySmall(
  val semibold: TextStyle,
  val regular: TextStyle,
)

private val bodySmallLineHeight = 22.sp
private val bodySmallFontSize = 18.sp

private val bodySmall = BodySmall(
  semibold = TextStyle(
    fontSize = bodySmallFontSize,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = bodySmallLineHeight,
  ),
  regular = TextStyle(
    fontSize = bodySmallFontSize,
    fontWeight = FontWeight.Normal,
    fontFamily = Fira,
    lineHeight = bodySmallLineHeight,
  ),
)

// Caption
@Immutable
data class Caption(
  val semibold: TextStyle,
  val regular: TextStyle,
)

private val captionLineHeight = 18.sp
private val captionFontSize = 12.sp

private val caption = Caption(
  semibold = TextStyle(
    fontSize = captionFontSize,
    fontWeight = FontWeight.SemiBold,
    fontFamily = Fira,
    lineHeight = captionLineHeight,
  ),
  regular = TextStyle(
    fontSize = captionFontSize,
    fontWeight = FontWeight.Normal,
    fontFamily = Fira,
    lineHeight = captionLineHeight,
  ),
)

// Everli Typography
@Immutable
data class EverliTypography(
  val title1: Title1,
  val title2: Title2,
  val title3: Title3,
  val title4: Title4,
  val subtitle: Subtitle,
  val body: Body,
  val bodySmall: BodySmall,
  val caption: Caption,
)

val DefaultEverliTypography = EverliTypography(
  title1 = title1,
  title2 = title2,
  title3 = title3,
  title4 = title4,
  subtitle = subtitle,
  body = body,
  bodySmall = bodySmall,
  caption = caption,
)
