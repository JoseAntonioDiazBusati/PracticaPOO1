 enum class Color() {
     Blanco, Verde, Azul,Gris,Rosa;
      companion object {
           fun colores(color: String): Color? {
                return try {
                     valueOf(color.toUpperCase())
                } catch (e: IllegalArgumentException) {
                     null
                }
           }
      }
}