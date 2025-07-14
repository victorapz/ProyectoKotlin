package com.example.recetasapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.recetasapp.databinding.FragmentRecetaDetailBinding
import com.example.recetasapp.model.Receta

class RecetaDetailFragment : Fragment() {

    private var binding: FragmentRecetaDetailBinding? = null
    private var receta: Receta? = null
    private val valoraciones = mutableListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("DEPRECATION")
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

        receta?.let { receta ->
            binding?.apply {
                tituloDetalle.text = receta.titulo
                dificultadDetalle.text = receta.dificultad
                tiempoDetalle.text = receta.tiempo
                descripcionDetalle.text = receta.descripcion

                Glide.with(requireContext())
                    .load(receta.imagenUrl)
                    .into(imagenDetalle)

                listaIngredientes.removeAllViews()
                receta.ingredientes.forEach { ingrediente ->
                    val textView = TextView(requireContext())
                    textView.text = "• $ingrediente"
                    textView.textSize = 16f
                    listaIngredientes.addView(textView)
                }

                listaPreparacion.removeAllViews()
                receta.preparacion.forEachIndexed { i, paso ->
                    val textView = TextView(requireContext())
                    textView.text = "${i + 1}. $paso"
                    textView.textSize = 16f
                    listaPreparacion.addView(textView)
                }
                btnEnviarValoracion.setOnClickListener {
                    val estrellas = ratingBar.rating.toInt()
                    if (estrellas in 1..5) {
                        valoraciones.add(estrellas)
                        actualizarPromedio()
                        ratingBar.rating = 0f
                        Toast.makeText(requireContext(), "¡Gracias por tu valoración!", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(requireContext(), "Selecciona entre 1 y 5 estrellas", Toast.LENGTH_SHORT).show()
                    }
                }
            }


        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    private fun actualizarPromedio() {
        val promedio = valoraciones.average()
        val estrellasTexto = "★".repeat(promedio.toInt())
        binding?.tvPromedioValoracion?.text = "Promedio: %.1f %s".format(promedio, estrellasTexto)
    }
}
