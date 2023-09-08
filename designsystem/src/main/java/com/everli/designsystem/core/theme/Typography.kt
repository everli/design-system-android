package com.everli.designsystem.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import com.everli.designsystem.core.constants.EverliTypography

@Immutable
data class Title1(
  val bold: TextStyle,
)

@Immutable
data class Title2(
  val bold: TextStyle,
  val semibold: TextStyle,
)

@Immutable
data class Title3(
  val bold: TextStyle,
  val semibold: TextStyle,
)

@Immutable
data class Title4(
  val bold: TextStyle,
  val semibold: TextStyle,
  val regular: TextStyle,
)

@Immutable
data class Subtitle(
  val semibold: TextStyle,
  val regular: TextStyle,
)

@Immutable
data class Body(
  val semibold: TextStyle,
  val regular: TextStyle,
)

@Immutable
data class BodySmall(
  val semibold: TextStyle,
  val regular: TextStyle,
)

@Immutable
data class Caption(
  val semibold: TextStyle,
  val regular: TextStyle,
)

@Immutable
data class CaptionSmall(
  val semibold: TextStyle,
  val regular: TextStyle,
)

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
  val captionSmall: CaptionSmall,
)

// Default
val DefaultTypography = EverliTypography(
  title1 = Title1(
    bold = EverliTypography.Title1.Bold,
  ),
  title2 = Title2(
    bold = EverliTypography.Title2.Bold,
    semibold = EverliTypography.Title2.Semibold,
  ),
  title3 = Title3(
    bold = EverliTypography.Title3.Bold,
    semibold = EverliTypography.Title3.Semibold,
  ),
  title4 = Title4(
    bold = EverliTypography.Title4.Bold,
    semibold = EverliTypography.Title4.Semibold,
    regular = EverliTypography.Title4.Regular,
  ),
  subtitle = Subtitle(
    semibold = EverliTypography.Subtitle.Semibold,
    regular = EverliTypography.Subtitle.Regular,
  ),
  body = Body(
    semibold = EverliTypography.Body.Semibold,
    regular = EverliTypography.Body.Regular,
  ),
  bodySmall = BodySmall(
    semibold = EverliTypography.BodySmall.Semibold,
    regular = EverliTypography.BodySmall.Regular,
  ),
  caption = Caption(
    semibold = EverliTypography.Caption.Semibold,
    regular = EverliTypography.Caption.Regular,
  ),
  captionSmall = CaptionSmall(
    semibold = EverliTypography.CaptionSmall.Semibold,
    regular = EverliTypography.CaptionSmall.Regular,
  ),
)
