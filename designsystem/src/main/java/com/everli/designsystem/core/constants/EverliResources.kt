package com.everli.designsystem.core.constants

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.everli.designsystem.R

/**
 * All resources available in the design system grouped by type
 */
object EverliResources {

  /**
   * All icons are by default 24x24 with Black100 tint
   * You can control size and tint using components such as the Icon
   */
  object Icons {

    val Add: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_add)

    val AddCircle: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_add_circle)

    val Alert: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_alert)

    val Announcement: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_announcement)

    val ArrowDownCircle: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_arrow_down_circle)

    val ArrowExternal: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_arrow_external)

    val ArrowLeft: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_arrow_left)

    val ArrowLeftCircle: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_arrow_left_circle)

    val ArrowRight: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_arrow_right)

    val ArrowRightCircle: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_arrow_right_circle)

    val ArrowTop: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_arrow_top)

    val ArrowTopCircle: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_arrow_top_circle)

    val AskQuestion: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_ask_question)

    val Basket: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_basket)

    val BasketCircle: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_basket_circle)

    val Cash: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_cash)

    val CashOut: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_cash_out)

    val Cashback: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_cashback)

    val CashbackPlus: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_cashback_plus)

    val Categories: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_categories)

    val Chat: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_chat)

    val Check: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_check)

    val CheckCircleFilled: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_check_circle_filled)

    val CheckCircleOutline: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_check_circle_outline)

    val ChevronDown: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_chevron_down)

    val ChevronLeft: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_chevron_left)

    val ChevronRight: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_chevron_right)

    val ChevronTop: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_chevron_top)

    val Clock: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_clock)

    val ClockFilled: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_clock_filled)

    val Contract: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_contract)

    val Cookie: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_cookie)

    val CreditCard: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_credit_card)

    val Delete: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_delete)

    val Delivery: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_delivery)

    val Docs: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_docs)

    val Dollar: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_dollar)

    val Download: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_download)

    val Edit: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_edit)

    val Email: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_email)

    val Empty: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_empty)

    val Euro: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_euro)

    val EyeHyde: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_eye_hyde)

    val EyeShow: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_eye_show)

    val FavoriteFilled: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_favorite_filled)

    val FavoriteOutline: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_favorite_outline)

    val Filters: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_filters)

    val FiltersMultiple: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_filters_multiple)

    val Flash: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_flash)

    val FlashCircle: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_flash_circle)

    val Forward: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_forward)

    val Gift: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_gift)

    val GiftCard: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_gift_card)

    val Gps: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_gps)

    val Help: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_help)

    val Home: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_home)

    val InfoCircleFilled: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_info_circle_filled)

    val InfoCircleOutline: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_info_circle_outline)

    val Invoice: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_invoice)

    val Label: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_label)

    val Link: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_link)

    val Menu: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_menu)

    val More: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_more)

    val Note: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_note)

    val Notifications: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_notifications)

    val Padlock: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_padlock)

    val PadlockCircle: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_padlock_circle)

    val Pos: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_pos)

    val PositionMarkFilled: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_position_mark_filled)

    val PositionMarkOutline: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_position_mark_outline)

    val QuestionCircleFilled: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_question_circle_filled)

    val QuestionCircleOutilne: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_question_circle_outilne)

    val Refund: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_refund)

    val Remove: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_remove)

    val Replacements: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_replacements)

    val Rocket: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_rocket)

    val Satisfaction: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_satisfaction)

    val Save: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_save)

    val Search: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_search)

    val Settings: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_settings)

    val ShieldConsents: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_shield_consents)

    val ShieldPrivacy: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_shield_privacy)

    val ShoppingList: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_shopping_list)

    val Star: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_star)

    val SupplyArmchair: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_supply_armchair)

    val SupplyBonusFire: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_supply_bonus_fire)

    val SupplyBonusStar: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_supply_bonus_star)

    val SupplyCalendar: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_supply_calendar)

    val SupplyCart: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_supply_cart)

    val SupplyMaternity: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_supply_maternity)

    val SupplyQuantity: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_supply_quantity)

    val SupplyReplacement: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_supply_replacement)

    val SupplyScooter: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_supply_scooter)

    val SupplySickness: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_supply_sickness)

    val SupplyStats: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_supply_stats)

    val User: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_user)

    val UserVerified: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_user_verified)

    val Wallet: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_wallet)

    val Write: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_write)

    val X: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_x)

    val XCircleFilled: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_x_circle_filled)

    val XCircleOutline: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_x_circle_outline)

    val Zoom: Painter
      @Composable
      get() = painterResource(id = R.drawable.ico_zoom)

  }

  object Logos {

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

    val Instagram: Painter
      @Composable
      get() = painterResource(id = R.drawable.logo_instagram)

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

    val PwrdByGoogle: Painter
      @Composable
      get() = painterResource(id = R.drawable.logo_pwrd_by_google)

    val Twitter: Painter
      @Composable
      get() = painterResource(id = R.drawable.logo_twitter)

    val Waze: Painter
      @Composable
      get() = painterResource(id = R.drawable.logo_waze)

  }

  object Images

}
