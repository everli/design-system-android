package com.everli.designsystem.core.constants

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.everli.designsystem.core.R

/**
 * Object with all available image resources in the design system
 */
object EverliImages {

  val Items: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_items)

  val Piggy: Painter
    @Composable
    get() = painterResource(id = R.drawable.img_piggy)

}
