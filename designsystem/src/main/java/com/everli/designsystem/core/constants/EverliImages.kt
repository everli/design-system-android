package com.everli.designsystem.core.constants

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.everli.designsystem.core.R

/**
 * Object with all available image resources in the design system
 */
object EverliImages {

  val BenefitDistance: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_benefit_distance)

  val BenefitSaving: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_benefit_saving)

  val BenefitTime: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_benefit_time)

  val BenefitWeight: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_benefit_weight)

  val Delivery: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_delivery)

  val DeliveryFast: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_delivery_fast)

  val FeeCash: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_fee_cash)

  val FeeService: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_fee_service)

  val FeeSurcharge: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_fee_surcharge)

  val Items: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_items)

  val Piggy: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_piggy)

}
