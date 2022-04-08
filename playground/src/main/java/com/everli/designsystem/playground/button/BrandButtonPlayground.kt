package com.everli.designsystem.playground.button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.everli.designsystem.components.button.Apple
import com.everli.designsystem.components.button.Blik
import com.everli.designsystem.components.button.BrandButtonStyle
import com.everli.designsystem.components.button.EverliButton
import com.everli.designsystem.components.button.Facebook
import com.everli.designsystem.components.button.Google
import com.everli.designsystem.core.constants.EverliColors
import com.everli.designsystem.core.theme.EverliTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

@Composable
fun FacebookSection() {
  Column(modifier = Modifier.padding(8.dp)) {
    Row {
      EverliButton.Facebook(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.FILL,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Facebook(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.FILL,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    Row {
      EverliButton.Facebook(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.OUTLINE,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Facebook(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.OUTLINE,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    Row {
      EverliButton.Facebook(
        onClick = { },
        style = BrandButtonStyle.FILL,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Facebook(
        onClick = { },
        style = BrandButtonStyle.FILL,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Facebook(
        onClick = { },
        style = BrandButtonStyle.OUTLINE,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Facebook(
        onClick = { },
        style = BrandButtonStyle.OUTLINE,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    EverliButton.Facebook(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.FILL,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Facebook(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.FILL,
      enabled = false,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Facebook(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.OUTLINE,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Facebook(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.OUTLINE,
      enabled = false,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
  }
}

@Composable
fun GoogleSection() {
  Column(modifier = Modifier.padding(8.dp)) {
    Row {
      EverliButton.Google(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.FILL,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Google(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.FILL,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    Row {
      EverliButton.Google(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.OUTLINE,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Google(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.OUTLINE,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    Row {
      EverliButton.Google(
        onClick = { },
        style = BrandButtonStyle.FILL,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Google(
        onClick = { },
        style = BrandButtonStyle.FILL,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Google(
        onClick = { },
        style = BrandButtonStyle.OUTLINE,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Google(
        onClick = { },
        style = BrandButtonStyle.OUTLINE,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    EverliButton.Google(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.FILL,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Google(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.FILL,
      enabled = false,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Google(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.OUTLINE,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Google(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.OUTLINE,
      enabled = false,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
  }
}

@Composable
fun AppleSection() {
  Column(modifier = Modifier.padding(8.dp)) {
    Row {
      EverliButton.Apple(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.FILL,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Apple(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.FILL,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    Row {
      EverliButton.Apple(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.OUTLINE,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Apple(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.OUTLINE,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    Row {
      EverliButton.Apple(
        onClick = { },
        style = BrandButtonStyle.FILL,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Apple(
        onClick = { },
        style = BrandButtonStyle.FILL,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Apple(
        onClick = { },
        style = BrandButtonStyle.OUTLINE,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Apple(
        onClick = { },
        style = BrandButtonStyle.OUTLINE,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    EverliButton.Apple(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.FILL,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Apple(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.FILL,
      enabled = false,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Apple(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.OUTLINE,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Apple(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.OUTLINE,
      enabled = false,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
  }
}

@Composable
fun BlikSection() {
  Column(modifier = Modifier.padding(8.dp)) {
    Row {
      EverliButton.Blik(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.FILL,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Blik(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.FILL,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    Row {
      EverliButton.Blik(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.OUTLINE,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Blik(
        onClick = { },
        text = "Button",
        style = BrandButtonStyle.OUTLINE,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    Row {
      EverliButton.Blik(
        onClick = { },
        style = BrandButtonStyle.FILL,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Blik(
        onClick = { },
        style = BrandButtonStyle.FILL,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Blik(
        onClick = { },
        style = BrandButtonStyle.OUTLINE,
        modifier = Modifier.padding(8.dp)
      )
      EverliButton.Blik(
        onClick = { },
        style = BrandButtonStyle.OUTLINE,
        enabled = false,
        modifier = Modifier.padding(8.dp)
      )
    }
    EverliButton.Blik(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.FILL,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Blik(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.FILL,
      enabled = false,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Blik(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.OUTLINE,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
    EverliButton.Blik(
      onClick = { },
      text = "Button",
      style = BrandButtonStyle.OUTLINE,
      enabled = false,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    )
  }
}

@ExperimentalPagerApi
@Composable
fun BrandButtonPlayground() {

  val pagerState = rememberPagerState()
  val scope = rememberCoroutineScope()
  val tabs = listOf("Facebook", "Google", "Apple", "Blik")

  Column {
    TabRow(
      backgroundColor = EverliTheme.button.color.primary.fill.background.enabled,
      contentColor = EverliColors.White,
      selectedTabIndex = pagerState.currentPage,
      indicator = { tabPositions ->
        TabRowDefaults.Indicator(
          Modifier.pagerTabIndicatorOffset(pagerState, tabPositions)
        )
      }
    ) {
      tabs.forEachIndexed { index, title ->
        Tab(
          text = { Text(title) },
          selected = pagerState.currentPage == index,
          onClick = {
            scope.launch {
              pagerState.animateScrollToPage(index)
            }
          },
        )
      }
    }

    HorizontalPager(state = pagerState, count = tabs.size) { page ->
      when (page) {
        0 -> FacebookSection()
        1 -> GoogleSection()
        2 -> AppleSection()
        3 -> BlikSection()
      }
    }
  }
}
