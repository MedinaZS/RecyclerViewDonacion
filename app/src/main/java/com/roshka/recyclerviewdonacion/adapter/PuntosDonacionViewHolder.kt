package com.roshka.recyclerviewdonacion.adapter

import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.roshka.recyclerviewdonacion.data.PuntosDonacion
import com.roshka.recyclerviewdonacion.databinding.ItemPuntoDonacionBinding

class PuntosDonacionViewHolder(view: View) : ViewHolder(view) {

    //Agregar binding para acceder sin findViewById
    private val binding = ItemPuntoDonacionBinding.bind(view)

    fun render(puntosDonacionModel: PuntosDonacion) {

        val context = binding.textLocalDonacion.context

        binding.textLocalDonacion.text = puntosDonacionModel.local_donacion
        binding.textDireccion.text = puntosDonacionModel.direccion

        val horario = "${puntosDonacionModel.hora_apertura} - ${puntosDonacionModel.hora_cierre}"
        binding.textHorario.text = horario

        binding.buttonIrMaps.setOnClickListener {

            val uri =
                Uri.parse("geo:${puntosDonacionModel.latitud},${puntosDonacionModel.longitud}?q=${puntosDonacionModel.local_donacion}")

            // Create an Intent from uri. Set the action to ACTION_VIEW
            val mapIntent = Intent(Intent.ACTION_VIEW, uri)
            // Make the Intent explicit by setting the Google Maps package
            mapIntent.setPackage("com.google.android.apps.maps")

            context.startActivity(mapIntent)
        }

        binding.buttonVerMas.setOnClickListener {
            Toast.makeText(
                context,
                "Proximamente",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}