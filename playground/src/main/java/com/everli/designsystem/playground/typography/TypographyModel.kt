package com.everli.designsystem.playground.typography

import androidx.compose.ui.text.TextStyle
import com.everli.designsystem.core.constants.EverliTypography

data class TypographyModel(
  val name: String,
  val style: TextStyle,
)

val typographyModels = mapOf(
  "Title 1" to listOf(
    TypographyModel(
      name = "Title1 Bold",
      style = EverliTypography.Title1.Bold
    ),
  ),
  "Title2" to listOf(
    TypographyModel(
      name = "Title2 Bold",
      style = EverliTypography.Title2.Bold
    ),
    TypographyModel(
      name = "Title2 Semibold",
      style = EverliTypography.Title2.Semibold
    ),
  ),
  "Title3" to listOf(
    TypographyModel(
      name = "Title3 Bold",
      style = EverliTypography.Title3.Bold
    ),
    TypographyModel(
      name = "Title3 Semibold",
      style = EverliTypography.Title3.Semibold
    ),
  ),
  "Title4" to listOf(
    TypographyModel(
      name = "Title4 Bold",
      style = EverliTypography.Title4.Bold
    ),
    TypographyModel(
      name = "Title4 Semibold",
      style = EverliTypography.Title4.Semibold
    ),
    TypographyModel(
      name = "Title4 Regular",
      style = EverliTypography.Title4.Regular
    ),
  ),
  "Subtitle" to
    listOf(
      TypographyModel(
        name = "Subtitle Semibold",
        style = EverliTypography.Subtitle.Semibold
      ),
      TypographyModel(
        name = "Subtitle Regular",
        style = EverliTypography.Subtitle.Regular
      ),
    ),
  "Body" to
    listOf(
      TypographyModel(
        name = "Body Semibold",
        style = EverliTypography.Body.Semibold
      ),
      TypographyModel(
        name = "Body Regular",
        style = EverliTypography.Body.Regular
      ),
    ),
  "Body Small" to
    listOf(
      TypographyModel(
        name = "Body Small Semibold",
        style = EverliTypography.BodySmall.Semibold
      ),
      TypographyModel(
        name = "Body Small Regular",
        style = EverliTypography.BodySmall.Regular
      ),
    ),
  "Caption" to
    listOf(
      TypographyModel(
        name = "Caption Semibold",
        style = EverliTypography.Caption.Semibold
      ),
      TypographyModel(
        name = "Caption Regular",
        style = EverliTypography.Caption.Regular
      ),
    ),
)
