package com.everli.designsystem.helper

import com.everli.designsystem.R
import com.everli.designsystem.core.constants.EverliColor
import com.everli.designsystem.core.constants.EverliColors
import io.kotest.core.spec.style.FunSpec
import io.kotest.extensions.robolectric.RobolectricTest
import io.kotest.matchers.shouldBe

@RobolectricTest
internal class EverliColorExtensionsTest : FunSpec(
  {
    listOf(
      EverliColor.WHITE to EverliColors.White,
      EverliColor.TRANSPARENT to EverliColors.Transparent,
      EverliColor.GRAY_10 to EverliColors.Gray10,
      EverliColor.GRAY_15 to EverliColors.Gray15,
      EverliColor.GRAY_40 to EverliColors.Gray40,
      EverliColor.GRAY_80 to EverliColors.Gray80,
      EverliColor.GRAY_100 to EverliColors.Gray100,
      EverliColor.BLACK_100 to EverliColors.Black100,
      EverliColor.RED_20 to EverliColors.Red20,
      EverliColor.RED_100 to EverliColors.Red100,
      EverliColor.RED_110 to EverliColors.Red110,
      EverliColor.PURPLE_100 to EverliColors.Purple100,
      EverliColor.TEAL_20 to EverliColors.Teal20,
      EverliColor.TEAL_100 to EverliColors.Teal100,
      EverliColor.BLUE_100 to EverliColors.Blue100,
      EverliColor.GREEN_10 to EverliColors.Green10,
      EverliColor.GREEN_100 to EverliColors.Green100,
      EverliColor.GREEN_110 to EverliColors.Green110,
      EverliColor.YELLOW_20 to EverliColors.Yellow20,
      EverliColor.YELLOW_100 to EverliColors.Yellow100,
      EverliColor.ORANGE_100 to EverliColors.Orange100,
      EverliColor.NAVY_100 to EverliColors.Navy100,
      EverliColor.NAVY_110 to EverliColors.Navy110,
      EverliColor.FACEBOOK to EverliColors.Facebook,
      EverliColor.GOOGLE to EverliColors.Google,
      EverliColor.APPLE to EverliColors.Apple,
      EverliColor.BLIK to EverliColors.Blik,
      null to EverliColors.Transparent,
    ).forEach { (everliColor, color) ->
      test("$everliColor should be converted to $color") {
        everliColor.toColor() shouldBe color
      }
    }

    listOf(
      EverliColor.WHITE to R.color.white,
      EverliColor.TRANSPARENT to R.color.transparent,
      EverliColor.GRAY_10 to R.color.gray_10,
      EverliColor.GRAY_15 to R.color.gray_40,
      EverliColor.GRAY_40 to R.color.gray_40,
      EverliColor.GRAY_80 to R.color.gray_80,
      EverliColor.GRAY_100 to R.color.gray_100,
      EverliColor.BLACK_100 to R.color.black_100,
      EverliColor.RED_20 to R.color.red_20,
      EverliColor.RED_100 to R.color.red_100,
      EverliColor.RED_110 to R.color.red_110,
      EverliColor.PURPLE_100 to R.color.purple_100,
      EverliColor.TEAL_20 to R.color.teal_20,
      EverliColor.TEAL_100 to R.color.teal_100,
      EverliColor.BLUE_100 to R.color.blue_100,
      EverliColor.GREEN_10 to R.color.green_10,
      EverliColor.GREEN_100 to R.color.green_100,
      EverliColor.GREEN_110 to R.color.green_110,
      EverliColor.YELLOW_20 to R.color.yellow_20,
      EverliColor.YELLOW_100 to R.color.yellow_100,
      EverliColor.ORANGE_100 to R.color.orange_100,
      EverliColor.NAVY_100 to R.color.navy_100,
      EverliColor.NAVY_110 to R.color.navy_110,
      EverliColor.FACEBOOK to R.color.facebook,
      EverliColor.GOOGLE to R.color.google,
      EverliColor.APPLE to R.color.apple,
      EverliColor.BLIK to R.color.blik,
      null to R.id.none,
    ).forEach { (everliColor, resourceId) ->
      test("$everliColor should be converted to $resourceId") {
        everliColor.toResourceId() shouldBe resourceId
      }
    }

  },
)
