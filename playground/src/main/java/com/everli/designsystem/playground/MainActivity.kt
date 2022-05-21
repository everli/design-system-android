package com.everli.designsystem.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.everli.designsystem.components.button.EverliButton
import com.everli.designsystem.core.theme.DefaultTheme
import com.everli.designsystem.core.constants.EverliColors
import com.everli.designsystem.core.theme.DefaultTypography
import com.everli.designsystem.playground.button.BrandButtonPlayground
import com.everli.designsystem.playground.button.ButtonsPlayground
import com.everli.designsystem.playground.color.ColorsPlayground
import com.everli.designsystem.playground.icon.IconsPlayground
import com.everli.designsystem.playground.theme.ThemePlaygroundContent
import com.everli.designsystem.playground.theme.Themes
import com.everli.designsystem.playground.theme.TokensPlayground
import com.everli.designsystem.playground.typography.TypographyPlayground
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@ExperimentalFoundationApi
@ExperimentalPagerApi
class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      App()
    }
  }

}

@Composable
@ExperimentalPagerApi
@ExperimentalFoundationApi
fun App() {
  var theme by remember { mutableStateOf(Themes.DEMAND) }

  val mockPrimary: Color = when (theme) {
    Themes.DEMAND -> EverliColors.Green100
    Themes.SUPPLY -> EverliColors.Purple100
  }

  // handled separately as it outside the main composable
  val systemUiController = rememberSystemUiController()
  systemUiController.setSystemBarsColor(
    color = mockPrimary
  )

  Scaffold(
    topBar = {
      TopAppBar(backgroundColor = mockPrimary) {
        Row(
          modifier = Modifier.fillMaxWidth(),
          verticalAlignment = Alignment.CenterVertically,
          horizontalArrangement = Arrangement.Center,
        ) {
          Text(text = "\uD83C\uDFA8", color = EverliColors.White, style = DefaultTypography.bodyRegular)
          TextButton(onClick = { theme = Themes.DEMAND }) {
            Text(
              text = "Demand",
              color = EverliColors.White,
              style = DefaultTypography.bodyRegular)
          }
          TextButton(onClick = { theme = Themes.SUPPLY }) {
            Text(
              text = "Supply",
              color = EverliColors.White,
              style = DefaultTypography.bodyRegular)
          }
        }
      }
    }
  ) {
    ThemePlaygroundContent(theme) {
      Navigation()
    }
  }
}

@Composable
fun Home(navController: NavController) {
  Column {
    HomeButton(
      text = "\uD83C\uDFA8 COLORS",
      onClick = { navController.navigate(Destinations.COLORS) })
    HomeButton(
      text = "\uD83D\uDD24 TYPOGRAPHY",
      onClick = { navController.navigate(Destinations.TYPOGRAPHY) })
    HomeButton(
      text = "\uD83C\uDD92 BUTTONS",
      onClick = { navController.navigate(Destinations.BUTTONS) })
    HomeButton(
      text = "\uD83C\uDD92 BRAND BUTTONS",
      onClick = { navController.navigate(Destinations.BRAND_BUTTONS) })
    HomeButton(
      text = "\uD83D\uDD25 TOKENS",
      onClick = { navController.navigate(Destinations.TOKENS) })
    HomeButton(
      text = "✔️ ICONS",
      onClick = { navController.navigate(Destinations.ICONS) })
  }
}

@Composable
fun HomeButton(text: String, onClick: () -> Unit) {
  EverliButton.Button(
    onClick = onClick,
    modifier = Modifier
      .fillMaxWidth()
      .padding(16.dp)
  ) {
    Text(text = text)
  }
}

@ExperimentalFoundationApi
@ExperimentalPagerApi
@Composable
fun Navigation() {
  val navController = rememberNavController()
  NavHost(navController = navController, startDestination = Destinations.HOME) {
    composable(Destinations.HOME) { Home(navController) }
    composable(Destinations.COLORS) { ColorsPlayground() }
    composable(Destinations.TYPOGRAPHY) { TypographyPlayground() }
    composable(Destinations.BUTTONS) { ButtonsPlayground() }
    composable(Destinations.BRAND_BUTTONS) { BrandButtonPlayground() }
    composable(Destinations.TOKENS) { TokensPlayground() }
    composable(Destinations.ICONS) { IconsPlayground() }
  }
}

object Destinations {

  const val HOME = "Home"
  const val COLORS = "Colors"
  const val TYPOGRAPHY = "Typography"
  const val BUTTONS = "Buttons"
  const val BRAND_BUTTONS = "Brand Buttons"
  const val TOKENS = "Tokens"
  const val ICONS = "Icons"

}

@ExperimentalFoundationApi
@ExperimentalPagerApi
@Preview
@Composable
fun AppPreview() {
  App()
}

@Preview
@Composable
fun HomePreview() {
  DefaultTheme {
    Home(rememberNavController())
  }
}
