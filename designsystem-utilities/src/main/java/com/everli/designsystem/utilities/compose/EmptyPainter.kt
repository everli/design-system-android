package com.everli.designsystem.utilities.compose

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.painter.Painter

/**
 * A [Painter] that uses [Size.Unspecified] to render nothing
 */
object EmptyPainter : Painter() {

  override val intrinsicSize: Size get() = Size.Unspecified
  override fun DrawScope.onDraw() {}

}
