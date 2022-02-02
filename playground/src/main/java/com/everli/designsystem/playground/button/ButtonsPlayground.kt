package com.everli.designsystem.playground.button

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.everli.designsystem.components.button.PrimaryButton
import com.everli.designsystem.components.button.PrimaryButtonVariant
import com.everli.designsystem.core.theme.Blue100
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.core.theme.Gray80
import com.everli.designsystem.core.theme.Green100
import com.everli.designsystem.core.theme.Yellow100

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
      PrimaryButton(
        onClick = onClick,
        variant = PrimaryButtonVariant.SMALL,
        text = "Label",
        modifier = Modifier.padding(8.dp))

      PrimaryButton(
        onClick = onClick,
        variant = PrimaryButtonVariant.SMALL,
        text = "Label",
        enabled = false,
        modifier = Modifier.padding(8.dp))
    }

    Text(text = "Default",
         style = EverliTheme.typography.title4Semibold,
         color = Gray80)

    Row {
      PrimaryButton(
        onClick = onClick,
        variant = PrimaryButtonVariant.DEFAULT,
        text = "Label",
        modifier = Modifier.padding(8.dp))

      PrimaryButton(
        onClick = onClick,
        variant = PrimaryButtonVariant.DEFAULT,
        text = "Label",
        enabled = false,
        modifier = Modifier.padding(8.dp))
    }

    Text(text = "Large",
         style = EverliTheme.typography.title4Semibold,
         color = Gray80)

    Row {
      PrimaryButton(
        onClick = onClick,
        variant = PrimaryButtonVariant.LARGE,
        text = "Label",
        modifier = Modifier.padding(8.dp))

      PrimaryButton(
        onClick = onClick,
        variant = PrimaryButtonVariant.LARGE,
        text = "Label",
        enabled = false,
        modifier = Modifier.padding(8.dp))
    }
  }
}

@Preview
@Composable
fun PreviewButtonPlayground() {
  EverliTheme {
    ButtonsPlayground()
  }
}
