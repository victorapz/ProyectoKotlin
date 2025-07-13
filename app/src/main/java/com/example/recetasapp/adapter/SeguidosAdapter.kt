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

class SeguidosAdapter: RecyclerView.Adapter<SeguidosAdapter.SeguidosViewHolder>()  {

    private var seguidos: List<Usuario> = emptyList()

    fun submitList(newList: List<Usuario>){
        seguidos = newList
        notifyDataSetChanged()
    }
    class SeguidosViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nombreSeguido: TextView = itemView.findViewById(R.id.tvNombreSeguido)
        val isFollow: Button = itemView.findViewById(R.id.btnIsFollow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeguidosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_seguidos, parent, false)
        return SeguidosViewHolder(view)
    }
    override fun onBindViewHolder(holder: SeguidosViewHolder, position: Int) {
        val seguido = seguidos[position]
        holder.nombreSeguido.text = seguido.nombre
        holder.isFollow.text = "Dejar de seguir"
        holder.isFollow.setBackgroundColor(ContextCompat.getColor(holder.itemView.context, R.color.red))
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
        return seguidos.size
    }
}