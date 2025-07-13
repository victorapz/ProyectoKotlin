package com.example.recetasapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.recetasapp.R
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.recetasapp.model.Usuario

class SeguidoresAdapter: RecyclerView.Adapter<SeguidoresAdapter.SeguidoresViewHolder>()  {

    private var seguidores: List<Usuario> = emptyList()

    fun submitList(newList: List<Usuario>){
        seguidores = newList
        notifyDataSetChanged()
    }
    class SeguidoresViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nombreSeguidor: TextView = itemView.findViewById(R.id.tvNombreSeguidor)
        val isFollow: Button = itemView.findViewById(R.id.btnIsFollow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeguidoresViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_seguidores, parent, false)
        return SeguidoresViewHolder(view)
    }
    override fun onBindViewHolder(holder: SeguidoresViewHolder, position: Int) {
        val seguidor = seguidores[position]
        holder.nombreSeguidor.text = seguidor.nombre
        holder.isFollow.text = "Seguir"
        holder.isFollow.setOnClickListener {
            if (holder.isFollow.text=="Seguir"){
                holder.isFollow.text = "Dejar de seguir"
                holder.isFollow.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.red))
            }else{
                holder.isFollow.text = "Seguir"
                holder.isFollow.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.btncolor))
            }
        }
    }
    override fun getItemCount(): Int {
        return seguidores.size
    }
}