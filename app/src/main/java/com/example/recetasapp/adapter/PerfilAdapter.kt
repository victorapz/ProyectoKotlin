package com.example.recetasapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recetasapp.R
import com.example.recetasapp.model.Perfil

class PerfilAdapter(private val perfiles: List<Perfil>) :
    RecyclerView.Adapter<PerfilAdapter.PerfilViewHolder>() {

    // ViewHolder para cada item_perfil.xml
    class PerfilViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombre: TextView = itemView.findViewById(R.id.textNombrePerfil)
        val correo: TextView = itemView.findViewById(R.id.textCorreoPerfil)
        val tipo: TextView = itemView.findViewById(R.id.textTipoPerfil)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerfilViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_perfil, parent, false)
        return PerfilViewHolder(view)
    }

    override fun onBindViewHolder(holder: PerfilViewHolder, position: Int) {
        val perfil = perfiles[position]
        holder.nombre.text = perfil.nombre
        holder.correo.text = perfil.correo
        holder.tipo.text = perfil.tipo
    }

    override fun getItemCount(): Int = perfiles.size
}
