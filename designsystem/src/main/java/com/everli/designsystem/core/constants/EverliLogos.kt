package com.everli.designsystem.core.constants

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.everli.designsystem.core.R

/**
 * Object with all available logos resources in the design system
 */
object EverliLogos {

  val Apple: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_apple)

  val AppleMapsApp: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_apple_maps_app)

  val EverliApp: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_everli_app)

  val EverliHand: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_everli_hand)

  val EverliHorizontal: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_everli_horizontal)

  val EverliPlusHorizontal: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_everli_plus_horizontal)

  val EverliVertical: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_everli_vertical)

  val Facebook: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_facebook)

  val Google: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_google)

  val GoogleMapsApp: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_google_maps_app)

  val PaymentAmex: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_payment_amex)

  val PaymentApplePay: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_payment_apple_pay)

  val PaymentBlik: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_payment_blik)

  val PaymentGooglePay: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_payment_google_pay)

  val PaymentMastercard: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_payment_mastercard)

  val PaymentPaypal: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_payment_paypal)

  val PaymentVisa: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_payment_visa)


  val PoweredByGoogle: Painter
    @Composable
    get() = painterResource(id = R.drawable.logo_pwrd_by_google)

}
