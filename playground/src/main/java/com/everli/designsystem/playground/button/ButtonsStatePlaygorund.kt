package com.everli.designsystem.playground.button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.everli.designsystem.components.button.ButtonStyle
import com.everli.designsystem.components.button.EverliButton
import com.everli.designsystem.components.button.PrimaryButton
import com.everli.designsystem.core.constants.EverliColors
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.playground.color.textColor

@Composable
fun ButtonStatePlayground() {
  Column(modifier =
         Modifier
           .padding(16.dp)) {
    Text("1. Design System - Color change on Press")

    Row {
      EverliButton(
        modifier = Modifier.padding(4.dp),
        onClick = { /*TODO*/ },
        text = "Button")

      PrimaryButton(
        modifier = Modifier
          .padding(4.dp),
        buttonStyle = ButtonStyle.OUTLINE,
        onClick = { /*TODO*/ },
        text = "Button")

      PrimaryButton(
        modifier = Modifier
          .padding(4.dp),
        buttonStyle = ButtonStyle.FLAT,
        onClick = { /*TODO*/ },
        text = "Button")
    }

    EverliButton(
      modifier = Modifier.padding(4.dp).fillMaxWidth(),
      onClick = { /*TODO*/ },
      text = "Button")

    Text("2. Material - Ripple + Elevation")

    Button(
      modifier = Modifier.padding(4.dp),
      onClick = { /*TODO*/ },
      colors = ButtonDefaults.buttonColors(
        backgroundColor = EverliTheme.button.color.primary.fill.background.enabled,
        contentColor = EverliColors.White,
      )
    ) {
      Text(text = "Button")
    }

    Button(
      modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth(),
      onClick = { /*TODO*/ },
      colors = ButtonDefaults.buttonColors(
        backgroundColor = EverliTheme.button.color.primary.fill.background.enabled,
        contentColor = EverliColors.White,
      )
    ) {
      Text(text = "Button")
    }

    Text("3. Design system - Ripple + Pressed")

    Row {
      EverliButton(
        modifier = Modifier.padding(4.dp),
        onClick = { /*TODO*/ },
        withRipple = true,
        text = "Button")

      EverliButton(
        modifier = Modifier
          .padding(4.dp),
        buttonStyle = ButtonStyle.OUTLINE,
        onClick = { /*TODO*/ },
        withRipple = true,
        text = "Button")

      EverliButton(
        modifier = Modifier
          .padding(4.dp),
        buttonStyle = ButtonStyle.FLAT,
        onClick = { /*TODO*/ },
        withRipple = true,
        text = "Button")
    }

    EverliButton(
      modifier = Modifier.padding(4.dp).fillMaxWidth(),
      onClick = { /*TODO*/ },
      withRipple = true,
      text = "Button")

  }
}
