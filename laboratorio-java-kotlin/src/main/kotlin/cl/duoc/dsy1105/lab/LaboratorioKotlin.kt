package cl.duoc.dsy1105.lab

fun main() {
    // TODO 1: declarar modelo, bateria, modoAhorro y propietario.
    val modelo = "Galaxy A55"
    val porcentaje = 18
    val modoBateria = false


    // TODO 2: mostrar los datos del telefono usando String templates.
    println("=== TELEFONO ===")
    println("Modelo: $modelo")
    println("Bateria: $porcentaje")

    // TODO 3: llamar a obtenerEstadoBateria y mostrar el resultado.
    println("Estado: " + obtenerEstadoBateria(porcentaje))
    println("Ahorro de energia: $modoBateria")

    // TODO 4: usar String? y ?: para el propietario.
    var nombreProp: String? = null
    if (nombreProp == null) {
        nombreProp = "Sin propietario"
    }
    println("Propietario: $nombreProp")
}

fun obtenerEstadoBateria(bateria: Int): String {
    // TODO: implementar las tres reglas indicadas en el README.
    return if (bateria <= 20) {
        "Bateria baja"
    } else if (bateria <= 79) {
        "Bateria suficiente"
    } else {
        "Bateria alta"
    }
}
