package com.example.recetasapp.model

object DatosPerfiles {

    fun obtenerPerfiles(): List<Perfil> {
        return listOf(
            Perfil("Catalina González", "catalina.gonzalez@mail.cl", "Creador de recetas"),
            Perfil("Ignacio Fernández", "ignacio.fernandez@mail.cl", "Ver recetas"),
            Perfil("Camilo Herrera", "camilo.herrera@mail.cl", "Creador de recetas")
        )
    }
}