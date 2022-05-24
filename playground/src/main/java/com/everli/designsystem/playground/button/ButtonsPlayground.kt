package com.everli.designsystem.playground.button

import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.everli.designsystem.components.button.ButtonSize
import com.everli.designsystem.components.button.ButtonStyle
import com.everli.designsystem.components.button.ButtonVariant
import com.everli.designsystem.components.button.EverliButton
import com.everli.designsystem.components.button.IconPosition
import com.everli.designsystem.core.constants.EverliColors
import com.everli.designsystem.core.constants.EverliResources
import com.everli.designsystem.core.theme.DefaultTheme
import com.everli.designsystem.core.theme.EverliTheme
import com.everli.designsystem.playground.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

@Composable
fun onClick(): () -> Unit {
  val context = LocalContext.current

  return {
    Toast.makeText(context, "Primary clicked!", Toast.LENGTH_SHORT).show()
  }
}

fun buttonText() = "Button"

@Composable
fun SubHeaderText(text: String) {
  Text(
    style = EverliTheme.typography.subtitle.semibold,
    color = EverliColors.Gray80,
    text = text,
    modifier = Modifier.padding(8.dp)
  )
}

@Composable
fun ButtonSection(
  variant: ButtonVariant,
  buttonStyle: ButtonStyle,
  size: ButtonSize,
) {
  Column {
    Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
      EverliButton.Button(
        onClick = onClick(),
        variant = variant,
        buttonStyle = buttonStyle,
        size = size,
        text = buttonText(),
        modifier = Modifier.padding(horizontal = 8.dp)
      )
      EverliButton.Button(
        onClick = onClick(),
        variant = variant,
        buttonStyle = buttonStyle,
        size = size,
        text = buttonText(),
        modifier = Modifier.padding(horizontal = 8.dp),
        enabled = false,
      )
    }
  }
}

@Composable
fun ButtonSectionWithIcon(
  variant: ButtonVariant,
  buttonStyle: ButtonStyle,
  size: ButtonSize,
) {
  Column {
    Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
      Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        EverliButton.Button(
          onClick = onClick(),
          variant = variant,
          buttonStyle = buttonStyle,
          size = size,
          text = buttonText(),
          icon = EverliResources.Icons.Basket,
          iconPosition = IconPosition.LEFT,
          modifier = Modifier.padding(horizontal = 8.dp)
        )
        EverliButton.Button(
          onClick = onClick(),
          variant = variant,
          buttonStyle = buttonStyle,
          size = size,
          text = buttonText(),
          icon = EverliResources.Icons.Basket,
          iconPosition = IconPosition.LEFT,
          modifier = Modifier.padding(horizontal = 8.dp),
          enabled = false,
        )
      }
    }
  }
}

@Composable
fun ButtonSectionIconOnly(
  variant: ButtonVariant,
  buttonStyle: ButtonStyle,
  size: ButtonSize,
) {
  Column {
    Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
      Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        EverliButton.Button(
          onClick = onClick(),
          variant = variant,
          buttonStyle = buttonStyle,
          size = size,
          icon = EverliResources.Icons.Basket,
          iconPosition = IconPosition.LEFT,
          modifier = Modifier.padding(horizontal = 8.dp)
        )
        EverliButton.Button(
          onClick = onClick(),
          variant = variant,
          buttonStyle = buttonStyle,
          size = size,
          icon = EverliResources.Icons.Basket,
          iconPosition = IconPosition.LEFT,
          modifier = Modifier.padding(horizontal = 8.dp),
          enabled = false,
        )
      }
    }
  }
}

@Composable
fun ButtonSectionFullWidth(
  variant: ButtonVariant,
  buttonStyle: ButtonStyle,
  size: ButtonSize,
) {
  Column {
    EverliButton.Button(
      onClick = onClick(),
      variant = variant,
      buttonStyle = buttonStyle,
      size = size,
      text = buttonText(),
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
    )
    EverliButton.Button(
      onClick = onClick(),
      variant = variant,
      buttonStyle = buttonStyle,
      size = size,
      text = buttonText(),
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
      enabled = false,
    )
    EverliButton.Button(
      onClick = onClick(),
      variant = variant,
      buttonStyle = buttonStyle,
      size = size,
      text = buttonText(),
      icon = EverliResources.Icons.Basket,
      iconPosition = IconPosition.LEFT,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
    )
    EverliButton.Button(
      onClick = onClick(),
      variant = variant,
      buttonStyle = buttonStyle,
      size = size,
      text = buttonText(),
      icon = EverliResources.Icons.Basket,
      iconPosition = IconPosition.RIGHT,
      modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
    )
  }
}

@Composable
fun ButtonSectionIconRightAndSpecial(
  variant: ButtonVariant,
  buttonStyle: ButtonStyle,
  size: ButtonSize,
) {
  Column {
    Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
      Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        EverliButton.Button(
          onClick = onClick(),
          variant = variant,
          buttonStyle = buttonStyle,
          size = size,
          text = buttonText(),
          icon = EverliResources.Icons.Basket,
          iconPosition = IconPosition.RIGHT,
          modifier = Modifier.padding(horizontal = 8.dp)
        )
        EverliButton.Button(
          onClick = onClick(),
          variant = variant,
          buttonStyle = buttonStyle,
          size = size,
          text = buttonText(),
          icon = EverliResources.Icons.Basket,
          iconPosition = IconPosition.RIGHT,
          modifier = Modifier.padding(horizontal = 8.dp),
          enabled = false,
        )
        EverliButton.Button(
          onClick = onClick(),
          variant = variant,
          buttonStyle = buttonStyle,
          size = size,
          text = "OK",
          modifier = Modifier.padding(horizontal = 8.dp),
        )
      }
    }
    EverliButton.Button(
      onClick = onClick(),
      variant = variant,
      buttonStyle = buttonStyle,
      size = size,
      text = "This is a very long text to see how the button text will be wrapped given the fact that the text is too long",
      modifier = Modifier.padding(horizontal = 8.dp),
    )
  }
}

@ExperimentalPagerApi
@Composable
fun ButtonSizeSection(
  buttonVariant: ButtonVariant,
  buttonStyle: ButtonStyle,
  buttonSize: ButtonSize,
) {
  Column(
    modifier = Modifier
      .fillMaxWidth()
      .padding(bottom = 16.dp)
      .verticalScroll(rememberScrollState()),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.spacedBy(0.dp)) {

    SubHeaderText(text = "Text")

    ButtonSection(
      variant = buttonVariant,
      buttonStyle = buttonStyle,
      size = buttonSize)

    SubHeaderText(text = "Text & Icon")

    ButtonSectionWithIcon(
      variant = buttonVariant,
      buttonStyle = buttonStyle,
      size = buttonSize)

    SubHeaderText(text = "Icon")

    ButtonSectionIconOnly(
      variant = buttonVariant,
      buttonStyle = buttonStyle,
      size = buttonSize)

    SubHeaderText(text = "Full Width")

    ButtonSectionFullWidth(
      variant = buttonVariant,
      buttonStyle = buttonStyle,
      size = buttonSize)

    SubHeaderText(text = "Icon Right & Short/Long Text")

    ButtonSectionIconRightAndSpecial(
      variant = buttonVariant,
      buttonStyle = buttonStyle,
      size = buttonSize)
  }
}

@ExperimentalPagerApi
@Composable
fun ButtonStyleSection(
  buttonVariant: ButtonVariant,
  buttonStyle: ButtonStyle,
) {
  val pagerState = rememberPagerState()
  val scope = rememberCoroutineScope()
  val tabs = listOf("Large", "Medium", "Small")

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
        0 -> ButtonSizeSection(
          buttonVariant = buttonVariant,
          buttonStyle = buttonStyle,
          buttonSize = ButtonSize.LARGE,
        )
        1 -> ButtonSizeSection(
          buttonVariant = buttonVariant,
          buttonStyle = buttonStyle,
          buttonSize = ButtonSize.MEDIUM,
        )
        2 -> ButtonSizeSection(
          buttonVariant = buttonVariant,
          buttonStyle = buttonStyle,
          buttonSize = ButtonSize.SMALL,
        )
      }
    }
  }
}

@ExperimentalPagerApi
@Composable
fun VariantButtonPlayground(
  buttonVariant: ButtonVariant = ButtonVariant.PRIMARY,
) {

  val pagerState = rememberPagerState()
  val scope = rememberCoroutineScope()
  val tabs = listOf("Fill", "Outline", "Flat")

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
        0 -> ButtonStyleSection(
          buttonVariant = buttonVariant,
          buttonStyle = ButtonStyle.FILL,
        )
        1 -> ButtonStyleSection(
          buttonVariant = buttonVariant,
          buttonStyle = ButtonStyle.OUTLINE,
        )
        2 -> ButtonStyleSection(
          buttonVariant = buttonVariant,
          buttonStyle = ButtonStyle.FLAT,
        )
      }
    }
  }
}

@ExperimentalPagerApi
@Composable
fun LinkPlayground() {
  ButtonStyleSection(
    buttonVariant = ButtonVariant.LINK,
    buttonStyle = ButtonStyle.FLAT,
  )
}

@ExperimentalPagerApi
@ExperimentalFoundationApi
@Composable
fun ButtonsPlayground() {

  val pagerState = rememberPagerState()
  val scope = rememberCoroutineScope()
  val tabs = listOf("Primary", "Special", "Link")

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
        0 -> VariantButtonPlayground(ButtonVariant.PRIMARY)
        1 -> VariantButtonPlayground(ButtonVariant.SPECIAL)
        2 -> LinkPlayground()
      }
    }
  }

}

@ExperimentalFoundationApi
@ExperimentalPagerApi
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
