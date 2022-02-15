package com.everli.designsystem.playground.typography

import androidx.compose.ui.text.TextStyle
import com.everli.designsystem.core.theme.DefaultTypography

data class TypographyModel(
  val name: String,
  val style: TextStyle,
)

val typographyModels = mapOf(
  "Title 1" to listOf(
    TypographyModel(
      name = "Title1 Bold",
      style = DefaultTypography.title1Bold
    ),
  ),
  "Title2" to listOf(
    TypographyModel(
      name = "Title2 Bold",
      style = DefaultTypography.title2Bold
    ),
    TypographyModel(
      name = "Title2 Semibold",
      style = DefaultTypography.title2Semibold
    ),
  ),
  "Title3" to listOf(
    TypographyModel(
      name = "Title3 Bold",
      style = DefaultTypography.title3Bold
    ),
    TypographyModel(
      name = "Title3 Semibold",
      style = DefaultTypography.title3Semibold
    ),
  ),
  "Title4" to listOf(
    TypographyModel(
      name = "Title4 Bold",
      style = DefaultTypography.title4Bold
    ),
    TypographyModel(
      name = "Title4 Semibold",
      style = DefaultTypography.title4Semibold
    ),
    TypographyModel(
      name = "Title4 Regular",
      style = DefaultTypography.title4Regular
    ),
  ),
  "Subtitle" to
      listOf(
        TypographyModel(
          name = "Subtitle Semibold",
          style = DefaultTypography.subtitleSemibold
        ),
        TypographyModel(
          name = "Subtitle Regular",
          style = DefaultTypography.subtitleRegular
        ),
      ),
  "Body" to
      listOf(
        TypographyModel(
          name = "Body Semibold",
          style = DefaultTypography.bodySemibold
        ),
        TypographyModel(
          name = "Body Regular",
          style = DefaultTypography.bodyRegular
        ),
      ),
  "Body Small" to
      listOf(
        TypographyModel(
          name = "Body Small Semibold",
          style = DefaultTypography.bodySmallSemibold
        ),
        TypographyModel(
          name = "Body Small Regular",
          style = DefaultTypography.bodySmallRegular
        ),
      ),
  "Caption" to
      listOf(
        TypographyModel(
          name = "Caption Semibold",
          style = DefaultTypography.captionSemibold
        ),
        TypographyModel(
          name = "Caption Regular",
          style = DefaultTypography.captionRegular
        ),
      ),
)
