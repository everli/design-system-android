package com.everli.designsystem.core.constants

/**
 * All colors constants provided by the design system
 * This class can be used as a bridge between backend and clients for deserialization
 *
 * @property designName used by design team in Figma
 */
enum class EverliColor(val designName: String) {

  WHITE(designName = "white"),
  TRANSPARENT(designName = "transparent"),

  GRAY_10(designName = "gray-10"),
  GRAY_15(designName = "gray-15"),
  GRAY_40(designName = "gray-40"),
  GRAY_80(designName = "gray-80"),
  GRAY_100(designName = "gray-100"),

  BLACK_100(designName = "black-100"),

  RED_20(designName = "red-20"),
  RED_100(designName = "red-100"),
  RED_110(designName = "red-110"),

  PURPLE_100(designName = "purple-100"),

  TEAL_20(designName = "teal-20"),
  TEAL_100(designName = "teal-100"),

  BLUE_20(designName = "blue-20"),
  BLUE_100(designName = "blue-100"),

  GREEN_10(designName = "green-10"),
  GREEN_100(designName = "green-100"),
  GREEN_110(designName = "green-110"),

  YELLOW_20(designName = "yellow-20"),
  YELLOW_100(designName = "yellow-100"),

  ORANGE_100(designName = "orange-100"),

  NAVY_100(designName = "navy-100"),
  NAVY_110(designName = "navy-110"),

  FACEBOOK(designName = "facebook"),
  GOOGLE(designName = "google"),
  APPLE(designName = "apple"),
  BLIK(designName = "blik");

  companion object {

    /**
     * Convert a color name as string to a [EverliColor]
     * Can be used only for design system based colors
     * If the conversion fails, [fallback] will be returned
     * If [fallback] is not provided, [EverliColor.WHITE] will be returned
     *
     * @param name name of the color e.g. "black-100"
     * @param fallback used in case the conversion fails, default value [EverliColor.WHITE]
     * @return [EverliColor] for given [name] or [fallback]
     */
    fun fromString(name: String, fallback: EverliColor = WHITE): EverliColor {
      return values().associateBy(EverliColor::designName)[name] ?: fallback
    }

  }

  override fun toString(): String = designName

}
