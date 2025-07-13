package com.example.recetasapp.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recetasapp.R
import com.example.recetasapp.MainActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var etCorreo: EditText
    private lateinit var etContraseña: EditText
    private lateinit var btnLogin: Button
    private lateinit var mbtnRegister: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // Ajuste edge-to-edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val sys = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(sys.left, sys.top, sys.right, sys.bottom)
            insets
        }

        // Bind de vistas
        etCorreo = findViewById(R.id.etCorreo)
        etContraseña = findViewById(R.id.etContraseña)
        btnLogin = findViewById(R.id.btnLogin)
        mbtnRegister = findViewById(R.id.mbtnRegister)

        // Lógica de login visual
        btnLogin.setOnClickListener {
            val correo = etCorreo.text.toString().trim()
            val clave  = etContraseña.text.toString()

            if (correo.isNotEmpty() && clave.isNotEmpty()) {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this,
                    "Por favor ingresa correo y contraseña",
                    Toast.LENGTH_SHORT).show()
            }
        }

        // Link de registro (sólo visual)
        mbtnRegister.setOnClickListener {
            Toast.makeText(this,
                "Funcionalidad de registro no implementada",
                Toast.LENGTH_SHORT).show()
        }
    }
}
