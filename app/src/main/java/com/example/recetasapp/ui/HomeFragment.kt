package com.example.recetasapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recetasapp.R
import com.example.recetasapp.adapter.RecetaAdapter
import com.example.recetasapp.model.DatosRecetas

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_home, container, false)


        val recyclerView = vista.findViewById<RecyclerView>(R.id.recyclerRecetas)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val listaRecetas = DatosRecetas.obtenerRecetas()

        val adaptador = RecetaAdapter(listaRecetas) { receta ->
            val fragmentoDetalle = RecetaDetailFragment()
            val bundle = Bundle()
            bundle.putSerializable("receta", receta)
            fragmentoDetalle.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.contenedorFragmento, fragmentoDetalle)
                .addToBackStack(null)
                .commit()
        }


        recyclerView.adapter = adaptador

        return vista
    }
}
