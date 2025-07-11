package com.example.recetasapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recetasapp.ui.HomeFragment
import com.example.recetasapp.ui.perfil.PerfilFragment
import androidx.appcompat.widget.Toolbar
import com.example.recetasapp.ui.perfil.ListaPerfilesFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.contenedorFragmento, HomeFragment())
                .commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_hamburguesa -> {
                showPopupMenu()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showPopupMenu() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val popup = PopupMenu(this, toolbar, android.view.Gravity.END)
        popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)
        popup.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.popup_recetas -> {
                    supportActionBar?.title = "Recetas"
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.contenedorFragmento, HomeFragment())
                        .addToBackStack(null)
                        .commit()
                    true
                }
                R.id.popup_perfiles -> {
                    supportActionBar?.title = "Lista de Perfiles"
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.contenedorFragmento, ListaPerfilesFragment())  // <-- ¡Aquí va la lista!
                        .addToBackStack(null)
                        .commit()
                    true
                }
                // ...otros casos...
                else -> false
            }
        }
        popup.show()
    }

}
