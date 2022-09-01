package com.everli.designsystem.core.constants

enum class EverliTextStyle(val designName: String) {

  TITLE_1_BOLD("title_1_bold"),
  TITLE_2_BOLD("title_2_bold"),
  TITLE_2_SEMIBOLD("title_2_semibold"),
  TITLE_3_BOLD("title_3_bold"),
  TITLE_3_SEMIBOLD("title_3_semibold"),
  TITLE_4_BOLD("title_4_bold"),
  TITLE_4_SEMIBOLD("title_4_semibold"),
  TITLE_4_REGULAR("title_4_regular"),
  SUBTITLE_SEMIBOLD("subtitle_semibold"),
  SUBTITLE_REGULAR("subtitle_regular"),
  BODY_SEMIBOLD("body_semibold"),
  BODY_REGULAR("body_regular"),
  BODY_SMALL_SEMIBOLD("body_small_semibold"),
  BODY_SMALL_REGULAR("body_small_regular"),
  CAPTION_SEMIBOLD("caption_semibold"),
  CAPTION_REGULAR("caption_regular");

  companion object {

    /**
     * Convert a resource name as string to a [EverliTextStyle]
     * If the conversion fails, [fallback] will be returned
     * If [fallback] is not provided, [BODY_REGULAR] will be returned
     *
     * @param name name of the text style e.g. "title_1_bold"
     * @param fallback used in case the conversion fails, default value [BODY_REGULAR]
     * @return [EverliTextStyle] for given [name] or [fallback]
     */
    fun fromString(name: String, fallback: EverliTextStyle = BODY_REGULAR): EverliTextStyle {
      return values().associateBy(EverliTextStyle::designName)[name] ?: fallback
    }

  }

  override fun toString(): String = designName

}
