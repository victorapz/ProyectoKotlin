package com.example.recetasapp.ui.perfil

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recetasapp.databinding.FragmentSeguidosBinding
import com.example.recetasapp.ui.viewmodel.PerfilViewModel
import androidx.fragment.app.activityViewModels
import com.example.recetasapp.adapter.SeguidosAdapter

class SeguidosFragment: Fragment() {

    private var _binding: FragmentSeguidosBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: SeguidosAdapter
    private val viewModel: PerfilViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeguidosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = SeguidosAdapter()
        binding.recyclerSeguidos.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerSeguidos.adapter = adapter

        viewModel.seguidos.observe(viewLifecycleOwner) { lista ->
            Log.d("SeguidosFragment", "Cantidad de seguidos: ${lista.size}")
            adapter.submitList(lista)
        }
    }
    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }
}