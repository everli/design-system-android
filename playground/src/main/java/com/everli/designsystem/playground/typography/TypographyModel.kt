package com.everli.designsystem.playground.typography

import androidx.compose.ui.text.TextStyle
import com.everli.designsystem.core.ui.theme.DefaultEverliTypography

data class TypographyModel(
  val name: String,
  val style: TextStyle,
)

val typographyModels = mapOf(
  "Title 1" to listOf(
    TypographyModel(
      name = "Title1 Bold Brand - title1Bold",
      style = DefaultEverliTypography.title1Bold
    ),
  ),
  "Title2" to listOf(
    TypographyModel(
      name = "Title2 Bold Brand - title2Bold",
      style = DefaultEverliTypography.title2Bold
    ),
    TypographyModel(
      name = "Title2 Semibold - title2Semibold",
      style = DefaultEverliTypography.title2Semibold
    ),
  ),
  "Title3" to listOf(
    TypographyModel(
      name = "Title3 Bold Brand - title3Bold",
      style = DefaultEverliTypography.title3Bold
    ),
    TypographyModel(
      name = "Title3 Semibold - title3Semibold",
      style = DefaultEverliTypography.title3Semibold
    ),
  ),
  "Title4" to listOf(
    TypographyModel(
      name = "Title4 Bold Brand - title4Bold",
      style = DefaultEverliTypography.title4Bold
    ),
    TypographyModel(
      name = "Title4 Semibold - title4Semibold",
      style = DefaultEverliTypography.title4Semibold
    ),
    TypographyModel(
      name = "Title4 Regular - title4Regular",
      style = DefaultEverliTypography.title4Regular
    ),
  ),
  "Subtitle" to
      listOf(
        TypographyModel(
          name = "Subtitle Semibold - subtitleSemibold",
          style = DefaultEverliTypography.subtitleSemibold
        ),
        TypographyModel(
          name = "Subtitle Regular - subtitleRegular",
          style = DefaultEverliTypography.subtitleRegular
        ),
      ),
  "Body" to
      listOf(
        TypographyModel(
          name = "Body Semibold - bodySemibold",
          style = DefaultEverliTypography.bodySemibold
        ),
        TypographyModel(
          name = "Body Regular - bodyRegular",
          style = DefaultEverliTypography.bodyRegular
        ),
      ),
  "Body Small" to
      listOf(
        TypographyModel(
          name = "Body Small Semibold - bodySmallSemibold",
          style = DefaultEverliTypography.bodySmallSemibold
        ),
        TypographyModel(
          name = "Body Small Regular - bodySmallRegular",
          style = DefaultEverliTypography.bodySmallRegular
        ),
      ),
  "Caption" to
      listOf(
        TypographyModel(
          name = "Caption Semibold - captionSemibold",
          style = DefaultEverliTypography.captionSemibold
        ),
        TypographyModel(
          name = "Caption Regular - captionRegular",
          style = DefaultEverliTypography.captionRegular
        ),
      ),
)
