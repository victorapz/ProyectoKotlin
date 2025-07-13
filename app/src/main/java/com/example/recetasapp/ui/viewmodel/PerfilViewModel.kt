package com.example.recetasapp.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recetasapp.model.Usuario

class PerfilViewModel : ViewModel() {

    private val _seguidores = MutableLiveData<List<Usuario>>()
    private val _seguidos = MutableLiveData<List<Usuario>>()
    val seguidores: LiveData<List<Usuario>> = _seguidores
    val seguidos: LiveData<List<Usuario>> = _seguidos

    init {
        cargarSeguidores()
        cargarSeguidos()
    }

    private fun cargarSeguidores() {
        val datosSimulados = listOf(
            Usuario("Juan Pérez", "juan@mail.com"),
            Usuario("María López", "maria@mail.com"),
            Usuario("Carlos Díaz", "carlos@mail.com")
        )
        _seguidores.value = datosSimulados
    }
    private fun cargarSeguidos() {
        val datosSimuladosSeguidos = listOf(
            Usuario("Juan Pérez", "juan@mail.com"),
            Usuario("María López", "maria@mail.com"),
            Usuario("Teo Vidal", "carlos@mail.com"),
            Usuario("Victor Perez", "victor@mail.com"),
            Usuario("Malina Vidal", "malina@mail.com"),
            Usuario("Kuzco Vidal", "kuzco@mail.com")
        )
        _seguidos.value = datosSimuladosSeguidos
    }
}
