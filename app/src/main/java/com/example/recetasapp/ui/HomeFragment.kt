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

    // 1) Guardamos el adapter como propiedad para poder filtrar después
    private lateinit var adaptador: RecetaAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_home, container, false)

        val recyclerView = vista.findViewById<RecyclerView>(R.id.recyclerRecetas)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // 2) Obtenemos la lista completa
        val listaRecetas = DatosRecetas.obtenerRecetas()

        // 3) Inicializamos el adapter con la lista completa
        adaptador = RecetaAdapter(listaRecetas) { receta ->
            val fragmentoDetalle = RecetaDetailFragment().apply {
                arguments = Bundle().apply {
                    putSerializable("receta", receta)
                }
            }
            parentFragmentManager.beginTransaction()
                .replace(R.id.contenedorFragmento, fragmentoDetalle)
                .addToBackStack(null)
                .commit()
        }

        recyclerView.adapter = adaptador
        return vista
    }

    /**
     * 4) Este método será invocado desde MainActivity cada vez que
     *    cambie el texto del SearchView para filtrar la lista.
     */
    fun filterRecipes(query: String) {
        adaptador.filter.filter(query)
    }
}
