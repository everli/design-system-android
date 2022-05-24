package com.everli.designsystem;

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.platform.app.InstrumentationRegistry
import com.everli.designsystem.R
import com.everli.designsystem.core.constants.EverliColors
import io.kotest.matchers.shouldBe
import org.junit.Rule
import org.junit.Test

class SampleComposeTest {

  @get:Rule
  val rule = createComposeRule()

  @Test
  fun res_colors_should_be_equal_to_compose_colors() {
    val context = InstrumentationRegistry.getInstrumentation().targetContext

    rule.setContent {
      CompositionLocalProvider(LocalContext provides context) {
        colorResource(id = R.color.white) shouldBe EverliColors.White

        colorResource(id = R.color.gray_10) shouldBe EverliColors.Gray10
        colorResource(id = R.color.gray_15) shouldBe EverliColors.Gray15
        colorResource(id = R.color.gray_40) shouldBe EverliColors.Gray40
        colorResource(id = R.color.gray_80) shouldBe EverliColors.Gray80
        colorResource(id = R.color.gray_100) shouldBe EverliColors.Gray100

        colorResource(id = R.color.black_100) shouldBe EverliColors.Black100

        colorResource(id = R.color.red_20) shouldBe EverliColors.Red20
        colorResource(id = R.color.red_100) shouldBe EverliColors.Red100

        colorResource(id = R.color.violet_100) shouldBe EverliColors.Violet100

        colorResource(id = R.color.teal_20) shouldBe EverliColors.Teal20
        colorResource(id = R.color.teal_100) shouldBe EverliColors.Teal100

        colorResource(id = R.color.blue_100) shouldBe EverliColors.Blue100

        colorResource(id = R.color.green_10) shouldBe EverliColors.Green10
        colorResource(id = R.color.green_100) shouldBe EverliColors.Green100
        colorResource(id = R.color.green_110) shouldBe EverliColors.Green110

        colorResource(id = R.color.yellow_20) shouldBe EverliColors.Yellow20
        colorResource(id = R.color.yellow_100) shouldBe EverliColors.Yellow100

        colorResource(id = R.color.navy_100) shouldBe EverliColors.Navy100
        colorResource(id = R.color.navy_110) shouldBe EverliColors.Navy110

        colorResource(id = R.color.facebook) shouldBe EverliColors.Facebook
        colorResource(id = R.color.google) shouldBe EverliColors.Google
        colorResource(id = R.color.apple) shouldBe EverliColors.Apple
        colorResource(id = R.color.blik) shouldBe EverliColors.Blik
      }
    }
  }

}
