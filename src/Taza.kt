class Taza(color: String, capacidad: Int, cantidad: Int) {
    val color = Color.blanco
    val capacidad = 50
    var cantidad = 0
        set(value) {

            if (cantidad > capacidad) {
                field = capacidad
            } else {
                field = value
            }

            // companion object -> genera taza random con ordinal
        }
}