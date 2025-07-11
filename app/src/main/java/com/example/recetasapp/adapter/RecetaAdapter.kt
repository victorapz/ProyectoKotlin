package com.example.recetasapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recetasapp.R
import com.example.recetasapp.model.Receta

class RecetaAdapter(
    private val recetas: List<Receta>,
    private val onItemClick: (Receta) -> Unit
) : RecyclerView.Adapter<RecetaAdapter.RecetaViewHolder>() {

    class RecetaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagen: ImageView = itemView.findViewById(R.id.imagenReceta)
        val titulo: TextView = itemView.findViewById(R.id.tituloReceta)
        val dificultad: TextView = itemView.findViewById(R.id.dificultadReceta)
        val tiempo: TextView = itemView.findViewById(R.id.tiempoReceta)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_receta, parent, false)
        return RecetaViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecetaViewHolder, position: Int) {
        val receta = recetas[position]
        holder.titulo.text = receta.titulo
        holder.dificultad.text = receta.dificultad
        holder.tiempo.text = receta.tiempo

        // glide permite cargar imagenes
        Glide.with(holder.itemView.context)
            .load(receta.imagenUrl)
            .into(holder.imagen)


        holder.itemView.setOnClickListener {
            onItemClick(receta)
        }
    }

    override fun getItemCount(): Int = recetas.size
}
