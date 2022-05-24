package com.everli.designsystem.playground.icon

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.everli.designsystem.core.constants.EverliColor
import com.everli.designsystem.core.constants.EverliResource
import com.everli.designsystem.core.constants.EverliResources
import com.everli.designsystem.helper.toColor
import com.everli.designsystem.helper.toPainter
import com.everli.designsystem.playground.color.ColorModel
import com.everli.designsystem.playground.color.textColor

data class IconModel(
  val name: String,
  val icon: Painter,
)

@Composable
fun iconModels() = EverliResource.values()
  .filter { resource -> resource.designName.contains("ico") }
  .map { resource ->
    IconModel(name = resource.designName, icon = resource.toPainter())
  }
