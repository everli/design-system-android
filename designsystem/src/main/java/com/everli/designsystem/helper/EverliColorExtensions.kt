package com.everli.designsystem.helper

import androidx.compose.ui.graphics.Color
import com.everli.designsystem.R
import com.everli.designsystem.core.constants.EverliColor
import com.everli.designsystem.core.constants.EverliColors

/**
 * Return a [Color] based on [EverliColor]
 */
fun EverliColor.toColor(): Color {
  return when (this) {
    EverliColor.WHITE -> EverliColors.White
    EverliColor.TRANSPARENT -> EverliColors.Transparent
    EverliColor.GRAY_10 -> EverliColors.Gray10
    EverliColor.GRAY_15 -> EverliColors.Gray15
    EverliColor.GRAY_40 -> EverliColors.Gray40
    EverliColor.GRAY_80 -> EverliColors.Gray80
    EverliColor.GRAY_100 -> EverliColors.Gray100
    EverliColor.BLACK_100 -> EverliColors.Black100
    EverliColor.RED_20 -> EverliColors.Red20
    EverliColor.RED_100 -> EverliColors.Red100
    EverliColor.RED_110 -> EverliColors.Red110
    EverliColor.PURPLE_100 -> EverliColors.Purple100
    EverliColor.TEAL_20 -> EverliColors.Teal20
    EverliColor.TEAL_100 -> EverliColors.Teal100
    EverliColor.BLUE_100 -> EverliColors.Blue100
    EverliColor.GREEN_10 -> EverliColors.Green10
    EverliColor.GREEN_100 -> EverliColors.Green100
    EverliColor.GREEN_110 -> EverliColors.Green110
    EverliColor.YELLOW_20 -> EverliColors.Yellow20
    EverliColor.YELLOW_100 -> EverliColors.Yellow100
    EverliColor.ORANGE_100 -> EverliColors.Orange100
    EverliColor.NAVY_100 -> EverliColors.Navy100
    EverliColor.NAVY_110 -> EverliColors.Navy110
    EverliColor.FACEBOOK -> EverliColors.Facebook
    EverliColor.GOOGLE -> EverliColors.Google
    EverliColor.APPLE -> EverliColors.Apple
    EverliColor.BLIK -> EverliColors.Blik
  }
}

/**
 * Return a color resource id based on [EverliColor]
 */
fun EverliColor.toResourceId(): Int {
  return when (this) {
    EverliColor.WHITE -> R.color.white
    EverliColor.TRANSPARENT -> R.color.transparent
    EverliColor.GRAY_10 -> R.color.gray_10
    EverliColor.GRAY_15 -> R.color.gray_40
    EverliColor.GRAY_40 -> R.color.gray_40
    EverliColor.GRAY_80 -> R.color.gray_80
    EverliColor.GRAY_100 -> R.color.gray_100
    EverliColor.BLACK_100 -> R.color.black_100
    EverliColor.RED_20 -> R.color.red_20
    EverliColor.RED_100 -> R.color.red_100
    EverliColor.RED_110 -> R.color.red_110
    EverliColor.PURPLE_100 -> R.color.purple_100
    EverliColor.TEAL_20 -> R.color.teal_20
    EverliColor.TEAL_100 -> R.color.teal_100
    EverliColor.BLUE_100 -> R.color.blue_100
    EverliColor.GREEN_10 -> R.color.green_10
    EverliColor.GREEN_100 -> R.color.green_100
    EverliColor.GREEN_110 -> R.color.green_110
    EverliColor.YELLOW_20 -> R.color.yellow_20
    EverliColor.YELLOW_100 -> R.color.yellow_100
    EverliColor.ORANGE_100 -> R.color.orange_100
    EverliColor.NAVY_100 -> R.color.navy_100
    EverliColor.NAVY_110 -> R.color.navy_110
    EverliColor.FACEBOOK -> R.color.facebook
    EverliColor.GOOGLE -> R.color.google
    EverliColor.APPLE -> R.color.apple
    EverliColor.BLIK -> R.color.blik
  }
}

/**
 * Nullable override for [toColor]
 */
fun EverliColor?.toColor(fallback: Color = EverliColors.Transparent): Color {
  return this?.toColor() ?: fallback
}

/**
 * Nullable override for [toResourceId]
 */
fun EverliColor?.toResourceId(fallback: Int = R.id.none): Int {
  return this?.toResourceId() ?: fallback
}
