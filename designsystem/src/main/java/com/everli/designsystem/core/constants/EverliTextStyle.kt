package com.everli.designsystem.core.constants

enum class EverliTextStyle(val designName: String) {

  TITLE_1_BOLD("title-1-bold"),
  TITLE_2_BOLD("title-2-bold"),
  TITLE_2_SEMIBOLD("title-2-semibold"),
  TITLE_3_BOLD("title-3-bold"),
  TITLE_3_SEMIBOLD("title-3-semibold"),
  TITLE_4_BOLD("title-4-bold"),
  TITLE_4_SEMIBOLD("title-4-semibold"),
  TITLE_4_REGULAR("title-4-regular"),
  SUBTITLE_SEMIBOLD("subtitle-semibold"),
  SUBTITLE_REGULAR("subtitle-regular"),
  BODY_SEMIBOLD("body-semibold"),
  BODY_REGULAR("body-regular"),
  BODY_SMALL_SEMIBOLD("body-small-semibold"),
  BODY_SMALL_REGULAR("body-small-regular"),
  CAPTION_SEMIBOLD("caption-semibold"),
  CAPTION_REGULAR("caption-regular");

  companion object {

    /**
     * Convert a text style name as string to a [EverliTextStyle]
     * If the conversion fails, [fallback] will be returned
     * If [fallback] is not provided, [BODY_REGULAR] will be returned
     *
     * @param name name of the text style e.g. "title-1-bold"
     * @param fallback used in case the conversion fails, default value [BODY_REGULAR]
     * @return [EverliTextStyle] for given [name] or [fallback]
     */
    fun fromString(name: String, fallback: EverliTextStyle = BODY_REGULAR): EverliTextStyle {
      return values().associateBy(EverliTextStyle::designName)[name] ?: fallback
    }

  }

  override fun toString(): String = designName

}
