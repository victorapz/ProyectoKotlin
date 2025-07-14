package com.example.recetasapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recetasapp.R
import com.example.recetasapp.model.Notificacion



class NotificacionesAdapter(private val lista: List<Notificacion>) :
    RecyclerView.Adapter<NotificacionesAdapter.NotificacionViewHolder>() {

    class NotificacionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mensaje = view.findViewById<TextView>(R.id.tvMensaje)
        val fecha = view.findViewById<TextView>(R.id.tvFecha)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificacionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_notification, parent, false)
        return NotificacionViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotificacionViewHolder, position: Int) {
        val noti = lista[position]
        holder.mensaje.text = noti.mensaje
        holder.fecha.text = noti.fecha
    }

    override fun getItemCount(): Int = lista.size
}
