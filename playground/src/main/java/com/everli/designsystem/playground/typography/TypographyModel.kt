package com.everli.designsystem.playground.typography

import androidx.compose.ui.text.TextStyle
import com.everli.designsystem.core.theme.DefaultEverliTypography

data class TypographyModel(
  val name: String,
  val style: TextStyle,
)

val typographyModels = mapOf(
  "Title 1" to listOf(
    TypographyModel(
      name = "Title1 Bold",
      style = DefaultEverliTypography.title1Bold
    ),
  ),
  "Title2" to listOf(
    TypographyModel(
      name = "Title2 Bold",
      style = DefaultEverliTypography.title2Bold
    ),
    TypographyModel(
      name = "Title2 Semibold",
      style = DefaultEverliTypography.title2Semibold
    ),
  ),
  "Title3" to listOf(
    TypographyModel(
      name = "Title3 Bold",
      style = DefaultEverliTypography.title3Bold
    ),
    TypographyModel(
      name = "Title3 Semibold",
      style = DefaultEverliTypography.title3Semibold
    ),
  ),
  "Title4" to listOf(
    TypographyModel(
      name = "Title4 Bold",
      style = DefaultEverliTypography.title4Bold
    ),
    TypographyModel(
      name = "Title4 Semibold",
      style = DefaultEverliTypography.title4Semibold
    ),
    TypographyModel(
      name = "Title4 Regular",
      style = DefaultEverliTypography.title4Regular
    ),
  ),
  "Subtitle" to
      listOf(
        TypographyModel(
          name = "Subtitle Semibold",
          style = DefaultEverliTypography.subtitleSemibold
        ),
        TypographyModel(
          name = "Subtitle Regular",
          style = DefaultEverliTypography.subtitleRegular
        ),
      ),
  "Body" to
      listOf(
        TypographyModel(
          name = "Body Semibold",
          style = DefaultEverliTypography.bodySemibold
        ),
        TypographyModel(
          name = "Body Regular",
          style = DefaultEverliTypography.bodyRegular
        ),
      ),
  "Body Small" to
      listOf(
        TypographyModel(
          name = "Body Small Semibold",
          style = DefaultEverliTypography.bodySmallSemibold
        ),
        TypographyModel(
          name = "Body Small Regular",
          style = DefaultEverliTypography.bodySmallRegular
        ),
      ),
  "Caption" to
      listOf(
        TypographyModel(
          name = "Caption Semibold",
          style = DefaultEverliTypography.captionSemibold
        ),
        TypographyModel(
          name = "Caption Regular",
          style = DefaultEverliTypography.captionRegular
        ),
      ),
)
