package com.example.recetasapp.model

object DatosPerfiles {

    fun obtenerPerfiles(): List<Usuario> {
        return listOf(
            Usuario("Catalina González", "catalina.gonzalez@mail.cl"),
            Usuario("Ignacio Fernández", "ignacio.fernandez@mail.cl"),
            Usuario("Camilo Herrera", "camilo.herrera@mail.cl")
        )
    }
}