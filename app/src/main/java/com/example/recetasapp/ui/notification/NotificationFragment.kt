package com.example.recetasapp.ui.notification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.recetasapp.adapter.NotificacionesAdapter
import com.example.recetasapp.model.Notificacion
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recetasapp.R

class NotificacionesFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NotificacionesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notification, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById(R.id.rvNotificaciones)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val notificacionesSimuladas = listOf(
            Notificacion("Juan te empezó a seguir", "Hoy"),
            Notificacion("Ana valoró tu receta 'Pizza vegana' con 4 estrellas", "Ayer"),
            Notificacion("Marcos comentó tu receta", "Hace 3 días"),
            Notificacion("María guardó tu receta 'Lasaña de verduras' en favoritos", "Hace 5 días"),
            Notificacion("Carlos compartió tu receta 'Tacos de pollo'", "Hace 1 semana"),
            Notificacion("Sofía te envió un mensaje privado", "Hace 2 horas"),
            Notificacion("Luis valoró tu receta 'Brownies sin gluten' con 5 estrellas", "Hace 4 días"),
            Notificacion("Elena comentó: '¡Excelente receta, la haré mañana!'", "Hace 6 días"),
            Notificacion("Diego te empezó a seguir", "Hace 1 semana"),
            Notificacion("Valentina guardó tu receta 'Smoothie verde' en favoritos", "Hace 3 horas"),
            Notificacion("Alejandro compartió tu receta 'Pasta carbonara'", "Hace 2 días"),
            Notificacion("Camila valoró tu receta 'Torta de chocolate' con 5 estrellas", "Hace 1 semana"),
            Notificacion("Roberto comentó: '¿Puedo sustituir la harina normal?'", "Hace 8 horas"),
            Notificacion("Isabela te empezó a seguir", "Hace 4 días"),
            Notificacion("Fernando guardó tu receta 'Sopa de lentejas' en favoritos", "Hace 2 semanas")
        )

        adapter = NotificacionesAdapter(notificacionesSimuladas)
        recyclerView.adapter = adapter
    }
}
