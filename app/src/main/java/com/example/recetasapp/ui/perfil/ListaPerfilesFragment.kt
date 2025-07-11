package com.example.recetasapp.ui.perfil

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recetasapp.R
import com.example.recetasapp.adapter.PerfilAdapter
import com.example.recetasapp.model.DatosPerfiles

class ListaPerfilesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla el layout de la lista de perfiles
        return inflater.inflate(R.layout.fragment_lista_perfiles, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Obtiene el RecyclerView del layout
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerPerfiles)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Obtiene la lista de perfiles desde el objeto DatosPerfiles
        val listaPerfiles = DatosPerfiles.obtenerPerfiles()

        // Crea y asigna el adapter
        val adapter = PerfilAdapter(listaPerfiles)
        recyclerView.adapter = adapter
    }


}
