package com.example.recetasapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recetasapp.R
import com.example.recetasapp.model.Receta

class RecetaAdapter(
    private val fullList: List<Receta>,
    private val onItemClick: (Receta) -> Unit
) : RecyclerView.Adapter<RecetaAdapter.RecetaViewHolder>(), Filterable {

    // Lista interna que mostrará los resultados filtrados
    private val filteredList = fullList.toMutableList()

    inner class RecetaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagen: ImageView   = itemView.findViewById(R.id.imagenReceta)
        val titulo: TextView    = itemView.findViewById(R.id.tituloReceta)
        val dificultad: TextView= itemView.findViewById(R.id.dificultadReceta)
        val tiempo: TextView    = itemView.findViewById(R.id.tiempoReceta)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_receta, parent, false)
        return RecetaViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecetaViewHolder, position: Int) {
        val receta = filteredList[position]
        holder.titulo.text       = receta.titulo
        holder.dificultad.text   = receta.dificultad
        holder.tiempo.text       = receta.tiempo

        Glide.with(holder.itemView.context)
            .load(receta.imagenUrl)
            .into(holder.imagen)

        holder.itemView.setOnClickListener { onItemClick(receta) }
    }

    override fun getItemCount(): Int = filteredList.size

    // Implementación del filtro
    override fun getFilter(): Filter = object : Filter() {
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            val query = constraint?.toString()?.lowercase()?.trim().orEmpty()
            val results = if (query.isEmpty()) {
                fullList
            } else {
                fullList.filter {
                    it.titulo.lowercase().contains(query)
                }
            }
            return FilterResults().apply { values = results }
        }

        @Suppress("UNCHECKED_CAST")
        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            filteredList.apply {
                clear()
                addAll(results?.values as List<Receta>)
            }
            notifyDataSetChanged()
        }
    }
}
