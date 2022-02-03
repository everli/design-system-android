package com.everli.designsystem.playground.button

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.everli.designsystem.components.button.EverliButton
import com.everli.designsystem.components.button.ButtonStyle
import com.everli.designsystem.core.theme.Blue100
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.core.theme.Gray80
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.everli.designsystem.core.theme.DefaultTheme
import com.everli.designsystem.core.theme.LightColorPalette
import com.everli.designsystem.core.theme.Red100
import com.everli.designsystem.core.theme.StateColor

@Composable
fun ButtonsPlayground() {
  val context = LocalContext.current

  val onClick: () -> Unit = {
    Toast.makeText(context, "Clicked on Button!", Toast.LENGTH_SHORT).show()
  }

  Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
      .padding(8.dp)
      .fillMaxWidth()) {

    Text(text = "Primary",
         style = EverliTheme.typography.title2Bold,
         color = Blue100)

    Text(text = "Small",
         style = EverliTheme.typography.title4Semibold,
         color = Gray80)

    Row {
      EverliButton(
        onClick = onClick,
        style = ButtonStyle.SMALL,
        text = "Label",
        modifier = Modifier.padding(8.dp))

      EverliButton(
        onClick = onClick,
        style = ButtonStyle.SMALL,
        text = "Label",
        enabled = false,
        modifier = Modifier.padding(8.dp))
    }

    Text(text = "Default",
         style = EverliTheme.typography.title4Semibold,
         color = Gray80)

    Row {
      EverliButton(
        onClick = onClick,
        style = ButtonStyle.DEFAULT,
        text = "Label",
        modifier = Modifier.padding(8.dp))

      EverliButton(
        onClick = onClick,
        style = ButtonStyle.DEFAULT,
        text = "Label",
        enabled = false,
        modifier = Modifier.padding(8.dp))
    }

    Text(text = "Large",
         style = EverliTheme.typography.title4Semibold,
         color = Gray80)

    Row {
      EverliButton(
        onClick = onClick,
        style = ButtonStyle.LARGE,
        text = "Label",
        modifier = Modifier.padding(8.dp))

      EverliButton(
        onClick = onClick,
        style = ButtonStyle.LARGE,
        text = "Label",
        enabled = false,
        modifier = Modifier.padding(8.dp))
    }

    Text(text = "Default Different Nested Theme",
         style = EverliTheme.typography.title4Semibold,
         color = Gray80,
         modifier = Modifier.padding(top = 12.dp))

    Row {

      var enabled by remember { mutableStateOf(false) }

      EverliTheme(colors = LightColorPalette.copy(
        buttons = LightColorPalette.buttons.copy(
          primary = LightColorPalette.buttons.primary.copy(
            background = StateColor(
              enabled = Red100,
              disabled = Blue100
            )
          )
        )
      )) {
        EverliButton(
          onClick = {
            enabled = !enabled
          },
          style = ButtonStyle.DEFAULT,
          text = "Label",
          modifier = Modifier.padding(8.dp))

        EverliButton(
          onClick = onClick,
          style = ButtonStyle.DEFAULT,
          text = "Label",
          enabled = enabled,
          modifier = Modifier.padding(8.dp))
      }
    }
  }
}

@Preview
@Composable
fun PreviewButtonPlayground() {
  DefaultTheme {
    ButtonsPlayground()
  }
}
