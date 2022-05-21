package com.everli.designsystem.core.constants

import androidx.annotation.ColorRes
import androidx.compose.ui.graphics.Color
import com.everli.designsystem.core.R

/**
 * All colors constants provided by the design system
 * Also see [EverliColors] for compose only alternative
 *
 * This class can be used as a bridge between backend and clients for deserialization
 *
 * @property designName used by design team
 * @property id color resource id
 * @property color compose value
 */
enum class EverliColor(val designName: String, @ColorRes val id: Int, val color: Color) {

  WHITE(designName = "white", id = R.color.white, color = EverliColors.White),
  TRANSPARENT(designName = "transparent", id = R.color.transparent, color = Color.Transparent),

  GRAY_10(designName = "gray-10", id = R.color.gray_10, color = EverliColors.Gray10),
  GRAY_15(designName = "gray-15", id = R.color.gray_15, color = EverliColors.Gray15),
  GRAY_40(designName = "gray-40", id = R.color.gray_40, color = EverliColors.Gray40),
  GRAY_80(designName = "gray-80", id = R.color.gray_80, color = EverliColors.Gray80),
  GRAY_100(designName = "gray-100", id = R.color.gray_100, color = EverliColors.Gray100),

  BLACK_100(designName = "black-100", id = R.color.black_100, color = EverliColors.Black100),

  RED_20(designName = "red-20", id = R.color.red_20, color = EverliColors.Black100),
  RED_100(designName = "red-100", id = R.color.red_100, color = EverliColors.Black100),
  RED_110(designName = "red-110", id = R.color.red_110, color = EverliColors.Black100),

  PURPLE_100(designName = "purple-100", id = R.color.purple_100, color = EverliColors.Purple100),

  TEAL_20(designName = "teal-20", id = R.color.teal_20, color = EverliColors.Teal20),
  TEAL_100(designName = "teal-100", id = R.color.teal_100, color = EverliColors.Teal100),

  BLUE_100(designName = "blue-100", id = R.color.blue_100, color = EverliColors.Blue100),

  GREEN_10(designName = "green-10", id = R.color.green_10, color = EverliColors.Green10),
  GREEN_100(designName = "green-100", id = R.color.green_100, color = EverliColors.Green100),
  GREEN_110(designName = "green-110", id = R.color.green_110, color = EverliColors.Green110),

  YELLOW_20(designName = "yellow-20", id = R.color.yellow_20, color = EverliColors.Yellow20),
  YELLOW_100(designName = "yellow-100", id = R.color.yellow_100, color = EverliColors.Yellow100),

  NAVY_100(designName = "navy-100", id = R.color.navy_100, color = EverliColors.Navy100),
  NAVY_110(designName = "navy-110", id = R.color.navy_110, color = EverliColors.Navy110),

  FACEBOOK(designName = "facebook", id = R.color.facebook, color = EverliColors.Facebook),
  GOOGLE(designName = "google", id = R.color.google, color = EverliColors.Google),
  APPLE(designName = "apple", id = R.color.apple, color = EverliColors.Apple),
  BLIK(designName = "blik", id = R.color.blik, color = EverliColors.Blik);

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
