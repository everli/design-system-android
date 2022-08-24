package com.everli.designsystem.components.button

enum class ButtonVariant {

  PRIMARY,
  SPECIAL,
  LINK,
  FACEBOOK,
  GOOGLE,
  APPLE,
  BLIK,

}

enum class ButtonStyle {

  FILL,
  OUTLINE,
  FLAT;

  companion object {

    /**
     * Convert string to a [ButtonStyle]
     *
     * @param name name of the style
     * @param fallback used in case the conversion fails, default value [ButtonStyle.FILL]
     * @return [ButtonStyle] for given [name] or [fallback]
     */
    fun fromString(name: String, fallback: ButtonStyle = FILL): ButtonStyle {
      return values().associateBy(ButtonStyle::name)[name.uppercase()] ?: fallback
    }

  }

  override fun toString(): String = name.lowercase()

}

enum class BrandButtonStyle {

  FILL,
  OUTLINE,

}

enum class ButtonSize {

  LARGE,
  MEDIUM,
  SMALL;

}

enum class BrandButtonSize {

  LARGE,
  MEDIUM,

}

enum class IconPosition {

  LEFT,
  RIGHT,

}

/**
 * Utility Methods
 */
fun ButtonVariant.isLink(): Boolean = this == ButtonVariant.LINK
fun ButtonVariant.isBrand(): Boolean = when (this) {
  ButtonVariant.PRIMARY,
  ButtonVariant.SPECIAL,
  ButtonVariant.LINK,
  -> false
  ButtonVariant.FACEBOOK,
  ButtonVariant.GOOGLE,
  ButtonVariant.APPLE,
  ButtonVariant.BLIK,
  -> true
}

fun IconPosition.isLeft() = this == IconPosition.LEFT
fun IconPosition.isRight() = this == IconPosition.RIGHT

fun BrandButtonSize.toButtonSize(): ButtonSize = when (this) {
  BrandButtonSize.LARGE -> ButtonSize.LARGE
  BrandButtonSize.MEDIUM -> ButtonSize.MEDIUM
}

fun BrandButtonStyle.toButtonStyle(): ButtonStyle = when (this) {
  BrandButtonStyle.FILL -> ButtonStyle.FILL
  BrandButtonStyle.OUTLINE -> ButtonStyle.OUTLINE
}
