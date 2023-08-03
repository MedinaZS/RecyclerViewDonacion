package com.roshka.recyclerviewdonacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.roshka.recyclerviewdonacion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Modo oscuro desactivado
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        //Make bind
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Navegar al activity puntos de donacion
        binding.buttonPuntosDeDonacion.setOnClickListener { navigateToPuntosDonacionActivity() }
        binding.buttonSolicitudes.setOnClickListener { proximamenteToast() }
        binding.buttonCertificados.setOnClickListener { proximamenteToast() }

    }

    private fun navigateToPuntosDonacionActivity() {
        val intent = Intent(this, PuntosDonacionActivity::class.java).apply { }
        startActivity(intent)
    }

    private fun proximamenteToast() {
        Toast.makeText(this, "Proximamente", Toast.LENGTH_SHORT).show()
    }
}