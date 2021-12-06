package com.everli.designsystem.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.everli.designsystem.core.ui.theme.EverliTheme
import com.everli.designsystem.core.ui.theme.Green100
import com.everli.designsystem.core.ui.theme.White
import com.everli.designsystem.playground.color.ColorsPlayground
import com.everli.designsystem.playground.typography.TypographyPlayground
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@ExperimentalFoundationApi
@ExperimentalPagerApi
class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      EverliTheme {
        App()
      }
    }
  }

}

@Composable
@ExperimentalPagerApi
@ExperimentalFoundationApi
fun App() {
  val systemUiController = rememberSystemUiController()
  systemUiController.setSystemBarsColor(
    color = EverliTheme.colors.green100
  )
  Navigation()
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
  }
}

@Composable
fun HomeButton(text: String, onClick: () -> Unit) {
  Button(
    colors = ButtonDefaults.buttonColors(
      backgroundColor = EverliTheme.colors.green100,
      contentColor = EverliTheme.colors.white),
    onClick = onClick,
    modifier = Modifier
      .fillMaxWidth()
      .padding(16.dp)
      .height(54.dp)
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
  }
}

object Destinations {

  const val HOME = "Home"
  const val COLORS = "Colors"
  const val TYPOGRAPHY = "Typography"

}

@Preview
@Composable
fun HomePreview() {
  EverliTheme {
    Home(rememberNavController())
  }
}
