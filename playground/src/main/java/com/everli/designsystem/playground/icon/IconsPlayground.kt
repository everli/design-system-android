package com.everli.designsystem.playground.icon

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.everli.designsystem.core.constants.EverliColors
import com.everli.designsystem.core.theme.DefaultTheme
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.playground.EverliButton

@ExperimentalFoundationApi
@Composable
fun IconsPlayground() {
  var size by remember { mutableStateOf(24.dp) }
  var color by remember { mutableStateOf(EverliColors.Black100) }

  val data = iconModels()

  Column(horizontalAlignment = Alignment.CenterHorizontally) {
    Row(
      horizontalArrangement = Arrangement.Center,
      verticalAlignment = Alignment.CenterVertically,
      modifier = Modifier.fillMaxWidth(),
    ) {
      EverliButton(
        onClick = { size -= 4.dp },
        text = "Decrease",
        modifier = Modifier.padding(8.dp),
      )
      Text(text = size.toString(), style = EverliTheme.typography.body.semibold)
      EverliButton(
        onClick = { size += 4.dp },
        text = "Increase",
        modifier = Modifier.padding(8.dp),
      )
    }

    Row(
      horizontalArrangement = Arrangement.Center,
      modifier = Modifier.fillMaxWidth(),
    ) {
      EverliButton(
        onClick = { color = EverliColors.Black100 },
        text = "Black100",
        modifier = Modifier.padding(8.dp),
      )
      EverliButton(
        onClick = { color = EverliColors.Green100 },
        text = "Green100",
        modifier = Modifier.padding(8.dp),
      )
      EverliButton(
        onClick = { color = EverliColors.Navy100 },
        text = "Navy100",
        modifier = Modifier.padding(8.dp),
      )
    }

    LazyVerticalGrid(
      columns = GridCells.Fixed(2),
    ) {
      items(data.size) { index ->
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
          Icon(
            painter = data[index].icon,
            tint = color,
            contentDescription = data[index].name,
            modifier = Modifier
              .padding(8.dp)
              .width(size)
              .height(size)
              .animateContentSize(),
          )
          Text(text = data[index].name, style = EverliTheme.typography.bodySmall.semibold)
        }
      }
    }
  }
}

@ExperimentalFoundationApi
@Preview
@Composable
fun PreviewIconsPlayground() {
  DefaultTheme {
    IconsPlayground()
  }
}
