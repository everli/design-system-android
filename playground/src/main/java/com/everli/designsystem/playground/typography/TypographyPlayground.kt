package com.everli.designsystem.playground.typography

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.everli.designsystem.core.ui.theme.EverliTheme

@Composable
fun TypographyItem() {
  Card(
    backgroundColor = EverliTheme.colors.white,
    elevation = 10.dp,
    modifier = Modifier.padding(16.dp),
  ) {
    Text(style = EverliTheme.typography.title4.regular,
         text = "wow")
  }
}


@Preview(showBackground = true)
@Composable
fun TypographyItemPreview() {
  EverliTheme {
    TypographyItem()
  }
}
