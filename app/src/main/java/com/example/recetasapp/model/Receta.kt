package com.example.recetasapp.model
import java.io.Serializable


data class Receta(
    val id: Int,
    val titulo: String,
    val imagenUrl: String,
    val dificultad: String,
    val tiempo: String,
    val descripcion: String
) : Serializable
