package com.everli.designsystem.playground.color

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.everli.designsystem.core.ui.theme.Green100
import com.everli.designsystem.core.ui.theme.White
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

@Composable
fun ColorItem(colorModel: ColorModel) {
  Card(
    backgroundColor = colorModel.color,
    elevation = 10.dp,
    modifier = Modifier
      .fillMaxWidth()
      .height(100.dp)
      .padding(16.dp)
  ) {
    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center
    ) {
      Text(
        text = colorModel.name,
        color = colorModel.textColor,
        textAlign = TextAlign.Center
      )
      Text(
        text = "(${"#" + Integer.toHexString(colorModel.color.toArgb()).uppercase()})",
        color = colorModel.textColor,
        textAlign = TextAlign.Center
      )
    }
  }
}

@Composable
@ExperimentalFoundationApi
fun ColorsGrid(colors: List<ColorModel>) {
  LazyVerticalGrid(
    cells = GridCells.Fixed(2)
  ) {
    items(colors.size) { index ->
      ColorItem(colors[index])
    }
  }
}

@ExperimentalPagerApi
@ExperimentalFoundationApi
@Composable
fun ColorsPlayground() {
  val pagerState = rememberPagerState()
  val scope = rememberCoroutineScope()
  val tabs = listOf("Brand", "Dev")

  Column {
    TabRow(
      backgroundColor = Green100,
      contentColor = White,
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
        0 -> ColorsGrid(colors = brandColors)
        1 -> ColorsGrid(colors = devColors)
      }
    }
  }
}
