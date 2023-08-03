package com.roshka.recyclerviewdonacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.roshka.recyclerviewdonacion.adapter.PuntosDonacionAdapter
import com.roshka.recyclerviewdonacion.data.PuntosDonacion
import com.roshka.recyclerviewdonacion.data.PuntosDonacionProvider
import com.roshka.recyclerviewdonacion.databinding.ActivityMainBinding
import com.roshka.recyclerviewdonacion.databinding.ActivityPuntosDonacionBinding

class PuntosDonacionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPuntosDonacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Modo oscuro desactivado
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        binding = ActivityPuntosDonacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)

        binding.recyclerPuntosDonacion.layoutManager = manager

        binding.recyclerPuntosDonacion.adapter = PuntosDonacionAdapter( PuntosDonacionProvider.puntosDonacionList )

    }
}