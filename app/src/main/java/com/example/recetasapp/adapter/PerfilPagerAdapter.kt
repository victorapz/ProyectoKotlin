package com.example.recetasapp.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.recetasapp.ui.perfil.SeguidoresFragment
import com.example.recetasapp.ui.perfil.SeguidosFragment

class PerfilPagerAdapter(fragment:Fragment):FragmentStateAdapter(fragment) {

    private val tabFragmentsCreators: Map<Int,() -> Fragment> = mapOf(

        0 to {SeguidoresFragment() },
        1 to {SeguidosFragment() }
    )

    override fun getItemCount(): Int = tabFragmentsCreators.size

    override fun createFragment(position: Int): Fragment =
        tabFragmentsCreators[position]?.invoke()?:throw IndexOutOfBoundsException()
}
