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
  FLAT,

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

fun IconPosition.isLeft() = this == IconPosition.LEFT
fun IconPosition.isRight() = this == IconPosition.RIGHT

fun BrandButtonSize.toButtonSize(): ButtonSize = when(this) {
  BrandButtonSize.LARGE -> ButtonSize.LARGE
  BrandButtonSize.MEDIUM -> ButtonSize.MEDIUM
}

fun BrandButtonStyle.toButtonStyle(): ButtonStyle = when(this) {
  BrandButtonStyle.FILL -> ButtonStyle.FILL
  BrandButtonStyle.OUTLINE -> ButtonStyle.OUTLINE
}
