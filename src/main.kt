fun main(args: Array<String>) {
    var valido : Boolean = false
    while (!valido) {
        val title = """
        ::Bienvenido a Recipe Maker::
        1. Hacer una receta
        2. Ver mis recetas 
        3. Salir 
    """.trimIndent()
        println(title)
        val opcion: Int? = readLine()?.toInt() as Int

        when (opcion) {
            in 1..1 -> crearReceta()
            in 2..2 -> verLasRecetas()
            in 3..3 ->  valido = true


        }
    }
}


fun crearReceta() {

}

fun verLasRecetas() {
}


fun Salir() {

}
