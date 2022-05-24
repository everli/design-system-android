package com.everli.designsystem.helper

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.everli.designsystem.R
import com.everli.designsystem.core.constants.EverliResource
import com.everli.designsystem.core.constants.EverliResources

/**
 * Return a [Painter] based on [EverliResource]
 */
@Composable
fun EverliResource.toPainter(): Painter {
  return when (this) {
    EverliResource.ICO_ADD -> EverliResources.Icons.Add
    EverliResource.ICO_ADD_CIRCLE -> EverliResources.Icons.AddCircle
    EverliResource.ICO_ALERT -> EverliResources.Icons.Alert
    EverliResource.ICO_ANNOUNCEMENT -> EverliResources.Icons.Announcement
    EverliResource.ICO_ARROW_DOWN_CIRCLE -> EverliResources.Icons.ArrowDownCircle
    EverliResource.ICO_ARROW_EXTERNAL -> EverliResources.Icons.ArrowExternal
    EverliResource.ICO_ARROW_LEFT -> EverliResources.Icons.ArrowLeft
    EverliResource.ICO_ARROW_LEFT_CIRCLE -> EverliResources.Icons.ArrowLeftCircle
    EverliResource.ICO_ARROW_RIGHT -> EverliResources.Icons.ArrowRight
    EverliResource.ICO_ARROW_RIGHT_CIRCLE -> EverliResources.Icons.ArrowRightCircle
    EverliResource.ICO_ARROW_TOP_CIRCLE -> EverliResources.Icons.ArrowTopCircle
    EverliResource.ICO_ASK_QUESTION -> EverliResources.Icons.AskQuestion
    EverliResource.ICO_BASKET -> EverliResources.Icons.Basket
    EverliResource.ICO_BASKET_CIRCLE -> EverliResources.Icons.BasketCircle
    EverliResource.ICO_CASH -> EverliResources.Icons.Cash
    EverliResource.ICO_CASHBACK -> EverliResources.Icons.Cashback
    EverliResource.ICO_CASHBACK_PLUS -> EverliResources.Icons.CashbackPlus
    EverliResource.ICO_CATEGORIES -> EverliResources.Icons.Categories
    EverliResource.ICO_CHAT -> EverliResources.Icons.Chat
    EverliResource.ICO_CHECK -> EverliResources.Icons.Check
    EverliResource.ICO_CHECK_CIRCLE_FILLED -> EverliResources.Icons.CheckCircleFilled
    EverliResource.ICO_CHECK_CIRCLE_OUTLINE -> EverliResources.Icons.CheckCircleOutline
    EverliResource.ICO_CHEVRON_DOWN -> EverliResources.Icons.ChevronDown
    EverliResource.ICO_CHEVRON_LEFT -> EverliResources.Icons.ChevronLeft
    EverliResource.ICO_CHEVRON_RIGHT -> EverliResources.Icons.ChevronRight
    EverliResource.ICO_CHEVRON_TOP -> EverliResources.Icons.ChevronTop
    EverliResource.ICO_CLOCK -> EverliResources.Icons.Clock
    EverliResource.ICO_CLOCK_FILLED -> EverliResources.Icons.ClockFilled
    EverliResource.ICO_CONTRACT -> EverliResources.Icons.Contract
    EverliResource.ICO_COOKIE -> EverliResources.Icons.Cookie
    EverliResource.ICO_CREDIT_CARD -> EverliResources.Icons.CreditCard
    EverliResource.ICO_DELETE -> EverliResources.Icons.Delete
    EverliResource.ICO_DELIVERY -> EverliResources.Icons.Delivery
    EverliResource.ICO_DOCS -> EverliResources.Icons.Docs
    EverliResource.ICO_DOWNLOAD -> EverliResources.Icons.Download
    EverliResource.ICO_EDIT -> EverliResources.Icons.Edit
    EverliResource.ICO_EMAIL -> EverliResources.Icons.Email
    EverliResource.ICO_EMPTY -> EverliResources.Icons.Empty
    EverliResource.ICO_FAVORITE_FILLED -> EverliResources.Icons.FavoriteFilled
    EverliResource.ICO_FAVORITE_OUTLINE -> EverliResources.Icons.FavoriteOutline
    EverliResource.ICO_FILTERS -> EverliResources.Icons.Filters
    EverliResource.ICO_FILTERS_MULTIPLE -> EverliResources.Icons.FiltersMultiple
    EverliResource.ICO_FLASH -> EverliResources.Icons.Flash
    EverliResource.ICO_FLASH_CIRCLE -> EverliResources.Icons.FlashCircle
    EverliResource.ICO_FORWARD -> EverliResources.Icons.Forward
    EverliResource.ICO_GIFT -> EverliResources.Icons.Gift
    EverliResource.ICO_GIFT_CARD -> EverliResources.Icons.GiftCard
    EverliResource.ICO_GPS -> EverliResources.Icons.Gps
    EverliResource.ICO_HELP -> EverliResources.Icons.Help
    EverliResource.ICO_HOME -> EverliResources.Icons.Home
    EverliResource.ICO_INFO_CIRCLE_FILLED -> EverliResources.Icons.InfoCircleFilled
    EverliResource.ICO_INFO_CIRCLE_OUTLINE -> EverliResources.Icons.InfoCircleOutline
    EverliResource.ICO_INVOICE -> EverliResources.Icons.Invoice
    EverliResource.ICO_LABEL -> EverliResources.Icons.Label
    EverliResource.ICO_LINK -> EverliResources.Icons.Link
    EverliResource.ICO_MENU -> EverliResources.Icons.Menu
    EverliResource.ICO_MORE -> EverliResources.Icons.More
    EverliResource.ICO_NOTE -> EverliResources.Icons.Note
    EverliResource.ICO_NOTIFICATIONS -> EverliResources.Icons.Notifications
    EverliResource.ICO_PADLOCK -> EverliResources.Icons.Padlock
    EverliResource.ICO_PADLOCK_CIRCLE -> EverliResources.Icons.PadlockCircle
    EverliResource.ICO_POS -> EverliResources.Icons.Pos
    EverliResource.ICO_POSITION_MARK_FILLED -> EverliResources.Icons.PositionMarkFilled
    EverliResource.ICO_POSITION_MARK_OUTLINE -> EverliResources.Icons.PositionMarkOutline
    EverliResource.ICO_QUESTION_CIRCLE_FILLED -> EverliResources.Icons.QuestionCircleFilled
    EverliResource.ICO_QUESTION_CIRCLE_OUTILNE -> EverliResources.Icons.QuestionCircleOutilne
    EverliResource.ICO_REMOVE -> EverliResources.Icons.Remove
    EverliResource.ICO_REPLACEMENTS -> EverliResources.Icons.Replacements
    EverliResource.ICO_ROCKET -> EverliResources.Icons.Rocket
    EverliResource.ICO_SAVE -> EverliResources.Icons.Save
    EverliResource.ICO_SEARCH -> EverliResources.Icons.Search
    EverliResource.ICO_SETTINGS -> EverliResources.Icons.Settings
    EverliResource.ICO_SHIELD_CONSENTS -> EverliResources.Icons.ShieldConsents
    EverliResource.ICO_SHIELD_PRIVACY -> EverliResources.Icons.ShieldPrivacy
    EverliResource.ICO_SHOPPING_LIST -> EverliResources.Icons.ShoppingList
    EverliResource.ICO_STAR -> EverliResources.Icons.Star
    EverliResource.ICO_USER -> EverliResources.Icons.User
    EverliResource.ICO_USER_VERIFIED -> EverliResources.Icons.UserVerified
    EverliResource.ICO_WALLET -> EverliResources.Icons.Wallet
    EverliResource.ICO_WRITE -> EverliResources.Icons.Write
    EverliResource.ICO_X -> EverliResources.Icons.X
    EverliResource.ICO_X_CIRCLE_FILLED -> EverliResources.Icons.XCircleFilled
    EverliResource.ICO_X_CIRCLE_OUTLINE -> EverliResources.Icons.XCircleOutline
    EverliResource.ICO_ZOOM -> EverliResources.Icons.Zoom
    EverliResource.IMG_BENEFIT_DISTANCE -> EverliResources.Images.BenefitDistance
    EverliResource.IMG_BENEFIT_SAVING -> EverliResources.Images.BenefitSaving
    EverliResource.IMG_BENEFIT_TIME -> EverliResources.Images.BenefitTime
    EverliResource.IMG_BENEFIT_WEIGHT -> EverliResources.Images.BenefitWeight
    EverliResource.IMG_DELIVERY -> EverliResources.Images.Delivery
    EverliResource.IMG_DELIVERY_FAST -> EverliResources.Images.DeliveryFast
    EverliResource.IMG_FEE_CASH -> EverliResources.Images.FeeCash
    EverliResource.IMG_FEE_SERVICE -> EverliResources.Images.FeeService
    EverliResource.IMG_FEE_SURCHARGE -> EverliResources.Images.FeeSurcharge
    EverliResource.IMG_FRESH -> EverliResources.Images.Fresh
    EverliResource.IMG_ITEMS -> EverliResources.Images.Items
    EverliResource.IMG_MONEY -> EverliResources.Images.Money
    EverliResource.IMG_PIGGY -> EverliResources.Images.Piggy
    EverliResource.IMG_RELAX -> EverliResources.Images.Relax
    EverliResource.LOGO_APPLE -> EverliResources.Logos.Apple
    EverliResource.LOGO_APPLE_MAPS_APP -> EverliResources.Logos.AppleMapsApp
    EverliResource.LOGO_EVERLI_APP -> EverliResources.Logos.EverliApp
    EverliResource.LOGO_EVERLI_HAND -> EverliResources.Logos.EverliHand
    EverliResource.LOGO_EVERLI_HORIZONTAL -> EverliResources.Logos.EverliHorizontal
    EverliResource.LOGO_EVERLI_PLUS_HORIZONTAL -> EverliResources.Logos.EverliPlusHorizontal
    EverliResource.LOGO_EVERLI_VERTICAL -> EverliResources.Logos.EverliVertical
    EverliResource.LOGO_FACEBOOK -> EverliResources.Logos.Facebook
    EverliResource.LOGO_GOOGLE -> EverliResources.Logos.Google
    EverliResource.LOGO_GOOGLE_MAPS_APP -> EverliResources.Logos.GoogleMapsApp
    EverliResource.LOGO_PAYMENT_AMEX -> EverliResources.Logos.PaymentAmex
    EverliResource.LOGO_PAYMENT_APPLE_PAY -> EverliResources.Logos.PaymentApplePay
    EverliResource.LOGO_PAYMENT_BLIK -> EverliResources.Logos.PaymentBlik
    EverliResource.LOGO_PAYMENT_GOOGLE_PAY -> EverliResources.Logos.PaymentGooglePay
    EverliResource.LOGO_PAYMENT_MASTERCARD -> EverliResources.Logos.PaymentMastercard
    EverliResource.LOGO_PAYMENT_PAYPAL -> EverliResources.Logos.PaymentPaypal
    EverliResource.LOGO_PAYMENT_VISA -> EverliResources.Logos.PaymentVisa
    EverliResource.LOGO_PWRD_BY_GOOGLE -> EverliResources.Logos.PwrdByGoogle
    EverliResource.LOGO_TWITTER -> EverliResources.Logos.Twitter
    EverliResource.LOGO_WAZE -> EverliResources.Logos.Waze
  }
}

/**
 * Return a resource id based on [EverliResource]
 */
@Composable
fun EverliResource.toResourceId(): Int {
  return when (this) {
    EverliResource.ICO_ADD -> R.drawable.ico_add
    EverliResource.ICO_ADD_CIRCLE -> R.drawable.ico_add_circle
    EverliResource.ICO_ALERT -> R.drawable.ico_alert
    EverliResource.ICO_ANNOUNCEMENT -> R.drawable.ico_announcement
    EverliResource.ICO_ARROW_DOWN_CIRCLE -> R.drawable.ico_arrow_down_circle
    EverliResource.ICO_ARROW_EXTERNAL -> R.drawable.ico_arrow_external
    EverliResource.ICO_ARROW_LEFT -> R.drawable.ico_arrow_left
    EverliResource.ICO_ARROW_LEFT_CIRCLE -> R.drawable.ico_arrow_left_circle
    EverliResource.ICO_ARROW_RIGHT -> R.drawable.ico_arrow_right
    EverliResource.ICO_ARROW_RIGHT_CIRCLE -> R.drawable.ico_arrow_right_circle
    EverliResource.ICO_ARROW_TOP_CIRCLE -> R.drawable.ico_arrow_top_circle
    EverliResource.ICO_ASK_QUESTION -> R.drawable.ico_ask_question
    EverliResource.ICO_BASKET -> R.drawable.ico_basket
    EverliResource.ICO_BASKET_CIRCLE -> R.drawable.ico_basket_circle
    EverliResource.ICO_CASH -> R.drawable.ico_cash
    EverliResource.ICO_CASHBACK -> R.drawable.ico_cashback
    EverliResource.ICO_CASHBACK_PLUS -> R.drawable.ico_cashback_plus
    EverliResource.ICO_CATEGORIES -> R.drawable.ico_categories
    EverliResource.ICO_CHAT -> R.drawable.ico_chat
    EverliResource.ICO_CHECK -> R.drawable.ico_check
    EverliResource.ICO_CHECK_CIRCLE_FILLED -> R.drawable.ico_check_circle_filled
    EverliResource.ICO_CHECK_CIRCLE_OUTLINE -> R.drawable.ico_check_circle_outline
    EverliResource.ICO_CHEVRON_DOWN -> R.drawable.ico_chevron_down
    EverliResource.ICO_CHEVRON_LEFT -> R.drawable.ico_chevron_left
    EverliResource.ICO_CHEVRON_RIGHT -> R.drawable.ico_chevron_right
    EverliResource.ICO_CHEVRON_TOP -> R.drawable.ico_chevron_top
    EverliResource.ICO_CLOCK -> R.drawable.ico_clock
    EverliResource.ICO_CLOCK_FILLED -> R.drawable.ico_clock_filled
    EverliResource.ICO_CONTRACT -> R.drawable.ico_contract
    EverliResource.ICO_COOKIE -> R.drawable.ico_cookie
    EverliResource.ICO_CREDIT_CARD -> R.drawable.ico_credit_card
    EverliResource.ICO_DELETE -> R.drawable.ico_delete
    EverliResource.ICO_DELIVERY -> R.drawable.ico_delivery
    EverliResource.ICO_DOCS -> R.drawable.ico_docs
    EverliResource.ICO_DOWNLOAD -> R.drawable.ico_download
    EverliResource.ICO_EDIT -> R.drawable.ico_edit
    EverliResource.ICO_EMAIL -> R.drawable.ico_email
    EverliResource.ICO_EMPTY -> R.drawable.ico_empty
    EverliResource.ICO_FAVORITE_FILLED -> R.drawable.ico_favorite_filled
    EverliResource.ICO_FAVORITE_OUTLINE -> R.drawable.ico_favorite_outline
    EverliResource.ICO_FILTERS -> R.drawable.ico_filters
    EverliResource.ICO_FILTERS_MULTIPLE -> R.drawable.ico_filters_multiple
    EverliResource.ICO_FLASH -> R.drawable.ico_flash
    EverliResource.ICO_FLASH_CIRCLE -> R.drawable.ico_flash_circle
    EverliResource.ICO_FORWARD -> R.drawable.ico_forward
    EverliResource.ICO_GIFT -> R.drawable.ico_gift
    EverliResource.ICO_GIFT_CARD -> R.drawable.ico_gift_card
    EverliResource.ICO_GPS -> R.drawable.ico_gps
    EverliResource.ICO_HELP -> R.drawable.ico_help
    EverliResource.ICO_HOME -> R.drawable.ico_home
    EverliResource.ICO_INFO_CIRCLE_FILLED -> R.drawable.ico_info_circle_filled
    EverliResource.ICO_INFO_CIRCLE_OUTLINE -> R.drawable.ico_info_circle_outline
    EverliResource.ICO_INVOICE -> R.drawable.ico_invoice
    EverliResource.ICO_LABEL -> R.drawable.ico_label
    EverliResource.ICO_LINK -> R.drawable.ico_link
    EverliResource.ICO_MENU -> R.drawable.ico_menu
    EverliResource.ICO_MORE -> R.drawable.ico_more
    EverliResource.ICO_NOTE -> R.drawable.ico_note
    EverliResource.ICO_NOTIFICATIONS -> R.drawable.ico_notifications
    EverliResource.ICO_PADLOCK -> R.drawable.ico_padlock
    EverliResource.ICO_PADLOCK_CIRCLE -> R.drawable.ico_padlock_circle
    EverliResource.ICO_POS -> R.drawable.ico_pos
    EverliResource.ICO_POSITION_MARK_FILLED -> R.drawable.ico_position_mark_filled
    EverliResource.ICO_POSITION_MARK_OUTLINE -> R.drawable.ico_position_mark_outline
    EverliResource.ICO_QUESTION_CIRCLE_FILLED -> R.drawable.ico_question_circle_filled
    EverliResource.ICO_QUESTION_CIRCLE_OUTILNE -> R.drawable.ico_question_circle_outilne
    EverliResource.ICO_REMOVE -> R.drawable.ico_remove
    EverliResource.ICO_REPLACEMENTS -> R.drawable.ico_replacements
    EverliResource.ICO_ROCKET -> R.drawable.ico_rocket
    EverliResource.ICO_SAVE -> R.drawable.ico_save
    EverliResource.ICO_SEARCH -> R.drawable.ico_search
    EverliResource.ICO_SETTINGS -> R.drawable.ico_settings
    EverliResource.ICO_SHIELD_CONSENTS -> R.drawable.ico_shield_consents
    EverliResource.ICO_SHIELD_PRIVACY -> R.drawable.ico_shield_privacy
    EverliResource.ICO_SHOPPING_LIST -> R.drawable.ico_shopping_list
    EverliResource.ICO_STAR -> R.drawable.ico_star
    EverliResource.ICO_USER -> R.drawable.ico_user
    EverliResource.ICO_USER_VERIFIED -> R.drawable.ico_user_verified
    EverliResource.ICO_WALLET -> R.drawable.ico_wallet
    EverliResource.ICO_WRITE -> R.drawable.ico_write
    EverliResource.ICO_X -> R.drawable.ico_x
    EverliResource.ICO_X_CIRCLE_FILLED -> R.drawable.ico_x_circle_filled
    EverliResource.ICO_X_CIRCLE_OUTLINE -> R.drawable.ico_x_circle_outline
    EverliResource.ICO_ZOOM -> R.drawable.ico_zoom
    EverliResource.IMG_BENEFIT_DISTANCE -> R.drawable.img_benefit_distance
    EverliResource.IMG_BENEFIT_SAVING -> R.drawable.img_benefit_saving
    EverliResource.IMG_BENEFIT_TIME -> R.drawable.img_benefit_time
    EverliResource.IMG_BENEFIT_WEIGHT -> R.drawable.img_benefit_weight
    EverliResource.IMG_DELIVERY -> R.drawable.img_delivery
    EverliResource.IMG_DELIVERY_FAST -> R.drawable.img_delivery_fast
    EverliResource.IMG_FEE_CASH -> R.drawable.img_fee_cash
    EverliResource.IMG_FEE_SERVICE -> R.drawable.img_fee_service
    EverliResource.IMG_FEE_SURCHARGE -> R.drawable.img_fee_surcharge
    EverliResource.IMG_FRESH -> R.drawable.img_fresh
    EverliResource.IMG_ITEMS -> R.drawable.img_items
    EverliResource.IMG_MONEY -> R.drawable.img_money
    EverliResource.IMG_PIGGY -> R.drawable.img_piggy
    EverliResource.IMG_RELAX -> R.drawable.img_relax
    EverliResource.LOGO_APPLE -> R.drawable.logo_apple
    EverliResource.LOGO_APPLE_MAPS_APP -> R.drawable.logo_apple_maps_app
    EverliResource.LOGO_EVERLI_APP -> R.drawable.logo_everli_app
    EverliResource.LOGO_EVERLI_HAND -> R.drawable.logo_everli_hand
    EverliResource.LOGO_EVERLI_HORIZONTAL -> R.drawable.logo_everli_horizontal
    EverliResource.LOGO_EVERLI_PLUS_HORIZONTAL -> R.drawable.logo_everli_plus_horizontal
    EverliResource.LOGO_EVERLI_VERTICAL -> R.drawable.logo_everli_vertical
    EverliResource.LOGO_FACEBOOK -> R.drawable.logo_facebook
    EverliResource.LOGO_GOOGLE -> R.drawable.logo_google
    EverliResource.LOGO_GOOGLE_MAPS_APP -> R.drawable.logo_google_maps_app
    EverliResource.LOGO_PAYMENT_AMEX -> R.drawable.logo_payment_amex
    EverliResource.LOGO_PAYMENT_APPLE_PAY -> R.drawable.logo_payment_apple_pay
    EverliResource.LOGO_PAYMENT_BLIK -> R.drawable.logo_payment_blik
    EverliResource.LOGO_PAYMENT_GOOGLE_PAY -> R.drawable.logo_payment_google_pay
    EverliResource.LOGO_PAYMENT_MASTERCARD -> R.drawable.logo_payment_mastercard
    EverliResource.LOGO_PAYMENT_PAYPAL -> R.drawable.logo_payment_paypal
    EverliResource.LOGO_PAYMENT_VISA -> R.drawable.logo_payment_visa
    EverliResource.LOGO_PWRD_BY_GOOGLE -> R.drawable.logo_pwrd_by_google
    EverliResource.LOGO_TWITTER -> R.drawable.logo_twitter
    EverliResource.LOGO_WAZE -> R.drawable.logo_waze
  }

}
