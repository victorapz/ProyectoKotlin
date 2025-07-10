package com.example.recetasapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.recetasapp.databinding.FragmentRecetaDetailBinding
import com.example.recetasapp.model.Receta

class RecetaDetailFragment : Fragment() {

    private var binding: FragmentRecetaDetailBinding? = null
    private var receta: Receta? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("DEPRECATION") // no sabia que se podia hacer esto
        receta = arguments?.getSerializable("receta") as? Receta

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRecetaDetailBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        receta?.let {
            binding?.apply {
                tituloDetalle.text = it.titulo
                dificultadDetalle.text = it.dificultad
                tiempoDetalle.text = it.tiempo
                descripcionDetalle.text = it.descripcion

                Glide.with(requireContext())
                    .load(it.imagenUrl)
                    .into(imagenDetalle)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
