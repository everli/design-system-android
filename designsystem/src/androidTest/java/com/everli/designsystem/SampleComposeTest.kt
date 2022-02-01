package com.everli.designsystem;

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.platform.app.InstrumentationRegistry
import com.everli.designsystem.core.R
import com.everli.designsystem.core.theme.Black100
import com.everli.designsystem.core.theme.Blue100
import com.everli.designsystem.core.theme.Gray10
import com.everli.designsystem.core.theme.Gray100
import com.everli.designsystem.core.theme.Gray15
import com.everli.designsystem.core.theme.Gray40
import com.everli.designsystem.core.theme.Gray80
import com.everli.designsystem.core.theme.Green10
import com.everli.designsystem.core.theme.Green100
import com.everli.designsystem.core.theme.Green110
import com.everli.designsystem.core.theme.Link100
import com.everli.designsystem.core.theme.Red100
import com.everli.designsystem.core.theme.Red20
import com.everli.designsystem.core.theme.Teal100
import com.everli.designsystem.core.theme.Teal20
import com.everli.designsystem.core.theme.Violet100
import com.everli.designsystem.core.theme.White
import com.everli.designsystem.core.theme.Yellow100
import com.everli.designsystem.core.theme.Yellow20
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
        colorResource(id = R.color.white) shouldBe White

        colorResource(id = R.color.gray_10) shouldBe Gray10
        colorResource(id = R.color.gray_15) shouldBe Gray15
        colorResource(id = R.color.gray_40) shouldBe Gray40
        colorResource(id = R.color.gray_80) shouldBe Gray80
        colorResource(id = R.color.gray_100) shouldBe Gray100

        colorResource(id = R.color.black_100) shouldBe Black100

        colorResource(id = R.color.red_20) shouldBe Red20
        colorResource(id = R.color.red_100) shouldBe Red100

        colorResource(id = R.color.violet_100) shouldBe Violet100

        colorResource(id = R.color.teal_20) shouldBe Teal20
        colorResource(id = R.color.teal_100) shouldBe Teal100

        colorResource(id = R.color.blue_100) shouldBe Blue100

        colorResource(id = R.color.green_10) shouldBe Green10
        colorResource(id = R.color.green_100) shouldBe Green100
        colorResource(id = R.color.green_110) shouldBe Green110

        colorResource(id = R.color.yellow_20) shouldBe Yellow20
        colorResource(id = R.color.yellow_100) shouldBe Yellow100

        colorResource(id = R.color.link_100) shouldBe Link100
      }
    }
  }

}
