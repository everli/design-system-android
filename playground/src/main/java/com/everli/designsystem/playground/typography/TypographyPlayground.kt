package com.everli.designsystem.playground.typography

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.everli.designsystem.core.ui.theme.Black100
import com.everli.designsystem.core.ui.theme.DefaultEverliTypography
import com.everli.designsystem.core.ui.theme.EverliTheme

@Composable
fun TypographyItem(typographyModel: TypographyModel) {
  Text(
    style = typographyModel.style,
    text = typographyModel.name,
    modifier = Modifier.padding(8.dp),
    color = Black100
  )
}

@ExperimentalFoundationApi
@Composable
fun TypographyPlayground() {
  LazyColumn {
    typographyModels.forEach { (name, values) ->
      stickyHeader {
        Surface(
          color = EverliTheme.colors.white,
          modifier = Modifier.fillMaxWidth()) {
          Text(
            text = name,
            modifier = Modifier.padding(8.dp),
            color = EverliTheme.colors.green100,
            style = EverliTheme.typography.subtitleSemibold)
        }
      }
      items(values) {
        TypographyItem(typographyModel = it)
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun TypographyItemPreview() {
  TypographyItem(typographyModel = TypographyModel("Title 3 Semibold", DefaultEverliTypography.title3Semibold))
}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun TypographyPlaygroundPreview() {
  EverliTheme {
    TypographyPlayground()
  }
}
