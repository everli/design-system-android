package com.everli.designsystem.components.button

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView
import com.everli.designsystem.R
import com.everli.designsystem.core.theme.ThemeAdapterComposable
import com.everli.designsystem.helper.empty
import com.everli.designsystem.helper.enumValueOfOrFallback
import com.everli.designsystem.helper.getBooleanOrFalse
import com.everli.designsystem.helper.getBooleanOrTrue
import com.everli.designsystem.helper.getStringOrEmpty
import com.google.accompanist.drawablepainter.rememberDrawablePainter

/**
 * View System wrapper for [EverliButton]
 */
class EverliButtonView @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyleAttr: Int = 0,
) : AbstractComposeView(context, attrs, defStyleAttr) {

  var text by mutableStateOf(String.empty)
  var variant by mutableStateOf(ButtonVariant.PRIMARY)
  var style by mutableStateOf(ButtonStyle.FILL)
  var size by mutableStateOf(ButtonSize.MEDIUM)
  var useContextTheme by mutableStateOf(false)
  var icon by mutableStateOf<Drawable?>(null)
  var iconPosition by mutableStateOf(IconPosition.LEFT)

  private var onClick by mutableStateOf({})
  private var isButtonEnabled by mutableStateOf(isEnabled)

  init {
    context.theme.obtainStyledAttributes(
      attrs,
      R.styleable.EverliButtonView,
      0, 0).apply {
      try {
        text = getStringOrEmpty(R.styleable.EverliButtonView_text)
        variant = enumValueOfOrFallback(getInt(R.styleable.EverliButtonView_btnVariant, variant.ordinal), ButtonVariant.PRIMARY)
        style = enumValueOfOrFallback(getInt(R.styleable.EverliButtonView_btnStyle, style.ordinal), ButtonStyle.FILL)
        size = enumValueOfOrFallback(getInt(R.styleable.EverliButtonView_btnSize, size.ordinal), ButtonSize.MEDIUM)
        isButtonEnabled = getBooleanOrTrue(R.styleable.EverliButtonView_enabled)
        useContextTheme = getBooleanOrFalse(R.styleable.EverliButtonView_useContextTheme)
        icon = getDrawable(R.styleable.EverliButtonView_btnIcon)
        iconPosition = enumValueOfOrFallback(getInt(R.styleable.EverliButtonView_iconPosition, style.ordinal), IconPosition.LEFT)
      } finally {
        recycle()
      }
    }
  }

  @Composable
  override fun Content() {
    ThemeAdapterComposable(useCustomTheme = useContextTheme, context = context) {
      EverliButton.Button(
        onClick = onClick,
        text = text,
        variant = variant,
        buttonStyle = style,
        size = size,
        enabled = isButtonEnabled,
        icon = icon?.let { rememberDrawablePainter(drawable = it) },
        iconPosition = iconPosition,
        contentDescription = contentDescription?.let { it.toString() }
      )
    }
  }

  fun onClick(block: (() -> Unit)) {
    onClick = block
  }

  override fun setEnabled(enabled: Boolean) {
    super.setEnabled(enabled)
    isButtonEnabled = enabled
  }

}

