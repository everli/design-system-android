package com.everli.designsystem.playground.icon

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.everli.designsystem.core.constants.EverliResource
import com.everli.designsystem.helper.toPainter

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
