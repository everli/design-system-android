package com.everli.designsystem.components.button

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView
import com.everli.designsystem.core.R
import com.everli.designsystem.core.theme.BridgeComposable
import com.everli.designsystem.helper.empty
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
  var size by mutableStateOf(ButtonSize.MEDIUM)
  var useContextTheme by mutableStateOf(false)
  var icon by mutableStateOf<Drawable?>(null)

  private var onClick by mutableStateOf({})
  private var isButtonEnabled by mutableStateOf(isEnabled)

  init {
    context.theme.obtainStyledAttributes(
      attrs,
      R.styleable.EverliButtonView,
      0, 0).apply {
      try {
        text = getStringOrEmpty(R.styleable.EverliButtonView_text)
        variant = ButtonVariant.getByValueOrFallback(getInt(R.styleable.EverliButtonView_variant, variant.ordinal))
        size = ButtonSize.getByValueOrFallback(getInt(R.styleable.EverliButtonView_size, size.ordinal))
        isButtonEnabled = getBooleanOrTrue(R.styleable.EverliButtonView_enabled)
        useContextTheme = getBooleanOrFalse(R.styleable.EverliButtonView_useContextTheme)
        icon = getDrawable(R.styleable.EverliButtonView_buttonIcon)
      } finally {
        recycle()
      }
    }
  }

  @Composable
  override fun Content() {
    BridgeComposable(useCustomTheme = useContextTheme, context = context) {
      EverliButton(
        onClick = onClick,
        text = text,
        variant = variant,
        size = size,
        enabled = isButtonEnabled,
        icon = icon?.let { rememberDrawablePainter(drawable = it) },
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

