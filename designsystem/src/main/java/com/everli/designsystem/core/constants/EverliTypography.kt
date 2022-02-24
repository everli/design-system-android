package com.everli.designsystem.core.constants

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.everli.designsystem.core.R

/**
 * All TextStyles constants provided by the design system
 */
object EverliTypography {

  // Font Families
  private val Fira = FontFamily(
    Font(R.font.fira_regular, FontWeight.Normal),
    Font(R.font.fira_semibold, FontWeight.SemiBold),
    Font(R.font.fira_bold, FontWeight.Bold),
  )

  private val Isidora = FontFamily(
    Font(R.font.isidora_bold, FontWeight.Bold),
  )

  object Title1 {

    val Bold = TextStyle(
      fontSize = 48.sp,
      fontWeight = FontWeight.Bold,
      fontFamily = Isidora,
      lineHeight = 68.sp,
    )
  }

  object Title2 {

    private val title2LineHeight = 52.sp

    val Bold = TextStyle(
      fontSize = 37.sp,
      fontWeight = FontWeight.Bold,
      fontFamily = Isidora,
      lineHeight = title2LineHeight,
    )

    val Semibold = TextStyle(
      fontSize = 36.sp,
      fontWeight = FontWeight.SemiBold,
      fontFamily = Fira,
      lineHeight = title2LineHeight,
    )
  }

  object Title3 {

    private val title3LineHeight = 40.sp

    val Bold = TextStyle(
      fontSize = 29.sp,
      fontWeight = FontWeight.Bold,
      fontFamily = Isidora,
      lineHeight = title3LineHeight,
    )
    val Semibold = TextStyle(
      fontSize = 28.sp,
      fontWeight = FontWeight.SemiBold,
      fontFamily = Fira,
      lineHeight = title3LineHeight,
    )
  }

  object Title4 {

    private val title4LineHeight = 32.sp
    private val title4FontSize = 22.sp

    val Bold = TextStyle(
      fontSize = 23.sp,
      fontWeight = FontWeight.Bold,
      fontFamily = Isidora,
      lineHeight = title4LineHeight,
    )
    val Semibold = TextStyle(
      fontSize = title4FontSize,
      fontWeight = FontWeight.SemiBold,
      fontFamily = Fira,
      lineHeight = title4LineHeight,
    )
    val Regular = TextStyle(
      fontSize = title4FontSize,
      fontWeight = FontWeight.Normal,
      fontFamily = Fira,
      lineHeight = title4LineHeight,
    )
  }

  object Subtitle {

    private val subtitleLineHeight = 28.sp
    private val subtitleFontSize = 18.sp

    val Semibold = TextStyle(
      fontSize = subtitleFontSize,
      fontWeight = FontWeight.SemiBold,
      fontFamily = Fira,
      lineHeight = subtitleLineHeight,
    )
    val Regular = TextStyle(
      fontSize = subtitleFontSize,
      fontWeight = FontWeight.Normal,
      fontFamily = Fira,
      lineHeight = subtitleLineHeight,
    )
  }

  object Body {

    private val bodyLineHeight = 24.sp
    private val bodyFontSize = 16.sp

    val Semibold = TextStyle(
      fontSize = bodyFontSize,
      fontWeight = FontWeight.SemiBold,
      fontFamily = Fira,
      lineHeight = bodyLineHeight,
    )
    val Regular = TextStyle(
      fontSize = bodyFontSize,
      fontWeight = FontWeight.Normal,
      fontFamily = Fira,
      lineHeight = bodyLineHeight,
    )
  }

  object BodySmall {

    private val bodySmallLineHeight = 22.sp
    private val bodySmallFontSize = 14.sp

    val Semibold = TextStyle(
      fontSize = bodySmallFontSize,
      fontWeight = FontWeight.SemiBold,
      fontFamily = Fira,
      lineHeight = bodySmallLineHeight,
    )
    val Regular = TextStyle(
      fontSize = bodySmallFontSize,
      fontWeight = FontWeight.Normal,
      fontFamily = Fira,
      lineHeight = bodySmallLineHeight,
    )
  }

  object Caption {

    private val captionLineHeight = 18.sp
    private val captionFontSize = 12.sp

    val Semibold = TextStyle(
      fontSize = captionFontSize,
      fontWeight = FontWeight.SemiBold,
      fontFamily = Fira,
      lineHeight = captionLineHeight,
    )
    val Regular = TextStyle(
      fontSize = captionFontSize,
      fontWeight = FontWeight.Normal,
      fontFamily = Fira,
      lineHeight = captionLineHeight,
    )
  }
}
