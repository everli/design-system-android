package com.everli.designsystem.core.constants

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.everli.designsystem.core.R

/**
 * Object with all available icons resources in the design system
 * All icons here are 24x24 with default tint of black100/#302030
 *
 * Usage:
 *   Icon(
 *     painter = EverliIcons.ActionMore,
 *     contentDescription = "action more",
 *     tint = Red100, // change color
 *     modifier = Modifier // change size
 *       .width(64.dp)
 *       .height(64.dp))
 */
object EverliIcons {

  val ActionMore: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_action_more)

  val Add: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_add)

  val AddCircle: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_add_circle)

  val Alert: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_alert)

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

  val ArrowTopCircle: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_arrow_top_circle)

  val AskQuestion: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_ask_question)

  val Basket: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_basket)

  val Cart: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_cart)

  val Cash: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_cash)

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
    get() = painterResource(id = R.drawable.ico_checkmark_circle_filled)

  val CheckCircleOutline: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_checkmark_circle_outline)

  val CheckmarkCircleFilled: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_checkmark_circle_filled)

  val CheckmarkCircleOutline: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_checkmark_circle_outline)

  val ChevronDown: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_chevron_down)

  val ChevronRight: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_chevron_right)

  val ChevronLeft: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_chevron_left)

  val ChevronTop: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_chevron_top)

  val Clock: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_clock)

  val ClockFilled: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_clock_filled)

  val Close: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_close)

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

  val Download: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_download)

  val Docs: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_docs)

  val Edit: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_edit)

  val Email: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_email)

  val Empty: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_empty)

  val Error: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_error)

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

  val Info: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_info)

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

  val NoteProduct: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_note_product)

  val NoteShopper: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_note_shopper)

  val Notifications: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_notifications)

  val Padlock: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_padlock)

  val Pos: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_pos)

  val PositionMarkerFilled: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_position_marker_filled)

  val PositionMarkerOutline: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_position_marker_outline)

  val QuestionCircleFilled: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_question_circle_filled)

  val QuestionCircleOutline: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_question_circle_outilne)

  val Remove: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_remove)

  val Replacements: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_replacements)

  val Rocket: Painter
    @Composable
    get() = painterResource(id = R.drawable.ico_rocket)

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
