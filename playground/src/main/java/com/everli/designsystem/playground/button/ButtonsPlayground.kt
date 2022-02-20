package com.everli.designsystem.playground.button

import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.everli.designsystem.components.button.ButtonSize
import com.everli.designsystem.components.button.ButtonVariant
import com.everli.designsystem.components.button.EverliButton
import com.everli.designsystem.core.constants.EverliColors
import com.everli.designsystem.core.constants.EverliIcons
import com.everli.designsystem.core.theme.DefaultButtonTheme
import com.everli.designsystem.core.theme.DefaultTheme
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.core.theme.StateColor
import com.everli.designsystem.playground.R

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
      .fillMaxWidth()
      .verticalScroll(rememberScrollState())) {

    Text(text = "Primary",
         style = EverliTheme.typography.title2Bold,
         color = EverliColors.Blue100)

    Text(text = "Small",
         style = EverliTheme.typography.title4Semibold,
         color = EverliColors.Gray80)

    Row {
      EverliButton(
        onClick = onClick,
        size = ButtonSize.SMALL,
        text = "Label",
        modifier = Modifier.padding(8.dp))

      EverliButton(
        onClick = onClick,
        size = ButtonSize.SMALL,
        text = "Label",
        enabled = false,
        modifier = Modifier.padding(8.dp))
    }

    Text(text = "Medium",
         style = EverliTheme.typography.title4Semibold,
         color = EverliColors.Gray80)

    Row {
      EverliButton(
        onClick = onClick,
        size = ButtonSize.MEDIUM,
        text = "Label",
        modifier = Modifier.padding(8.dp))

      EverliButton(
        onClick = onClick,
        size = ButtonSize.MEDIUM,
        text = "Label",
        enabled = false,
        modifier = Modifier.padding(8.dp))
    }

    Text(text = "Large",
         style = EverliTheme.typography.title4Semibold,
         color = EverliColors.Gray80)

    Row {
      EverliButton(
        onClick = onClick,
        size = ButtonSize.LARGE,
        text = "Label",
        modifier = Modifier.padding(8.dp))

      EverliButton(
        onClick = onClick,
        size = ButtonSize.LARGE,
        text = "Label",
        enabled = false,
        modifier = Modifier.padding(8.dp))
    }


    Text(text = "Small Icon",
         style = EverliTheme.typography.title4Semibold,
         color = EverliColors.Gray80)

    Row {
      EverliButton(
        onClick = onClick,
        size = ButtonSize.SMALL,
        text = "Label",
        icon = EverliIcons.Cart,
        modifier = Modifier.padding(8.dp))

      EverliButton(
        onClick = onClick,
        size = ButtonSize.SMALL,
        text = "Label",
        enabled = false,
        icon = EverliIcons.Cart,
        modifier = Modifier.padding(8.dp))
    }

    Text(text = "Medium Icon",
         style = EverliTheme.typography.title4Semibold,
         color = EverliColors.Gray80)

    Row {
      EverliButton(
        onClick = onClick,
        variant = ButtonVariant.PRIMARY,
        size = ButtonSize.MEDIUM,
        text = "Label",
        icon = EverliIcons.Cart,
        modifier = Modifier.padding(8.dp))

      EverliButton(
        onClick = onClick,
        size = ButtonSize.MEDIUM,
        text = "Label",
        enabled = false,
        icon = EverliIcons.Cart,
        modifier = Modifier.padding(8.dp))
    }

    Text(text = "Large Icon",
         style = EverliTheme.typography.title4Semibold,
         color = EverliColors.Gray80)

    Row {
      EverliButton(
        onClick = onClick,
        size = ButtonSize.LARGE,
        text = "Label",
        icon = EverliIcons.Cart,
        modifier = Modifier.padding(8.dp))

      EverliButton(
        onClick = onClick,
        size = ButtonSize.LARGE,
        text = "Label",
        enabled = false,
        icon = EverliIcons.Cart,
        modifier = Modifier.padding(8.dp))
    }

    Text(text = "Full Width",
         style = EverliTheme.typography.title4Semibold,
         color = EverliColors.Gray80)

    Column {
      EverliButton(
        onClick = onClick,
        size = ButtonSize.MEDIUM,
        text = "Label",
        modifier = Modifier
          .fillMaxWidth()
          .padding(8.dp))

      EverliButton(
        onClick = onClick,
        size = ButtonSize.MEDIUM,
        text = "Label",
        enabled = false,
        modifier = Modifier
          .fillMaxWidth()
          .padding(8.dp))
    }


    Text(text = "Medium Different Nested Theme",
         style = EverliTheme.typography.title4Semibold,
         color = EverliColors.Gray80,
         modifier = Modifier.padding(top = 12.dp))

    Row {

      var enabled by remember { mutableStateOf(false) }

      EverliTheme(buttonTheme = DefaultButtonTheme.copy(
        color = DefaultButtonTheme.color.copy(
          primary = DefaultButtonTheme.color.primary.copy(
            background = StateColor(
              enabled = EverliColors.Red100,
              disabled = EverliColors.Blue100
            )
          )
        )
      )) {
        EverliButton(
          onClick = {
            enabled = !enabled
          },
          size = ButtonSize.MEDIUM,
          text = "Label",
          modifier = Modifier.padding(8.dp))

        EverliButton(
          onClick = onClick,
          size = ButtonSize.MEDIUM,
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

@Preview
@Composable
fun PreviewXMLPlayground() {
  AndroidView(
    factory = { context: Context ->
      val view = LayoutInflater.from(context)
        .inflate(R.layout.layout_button_sample, null, false)
      view
    },
    modifier = Modifier.fillMaxSize(),
  )
}
