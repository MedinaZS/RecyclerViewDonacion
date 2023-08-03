package com.roshka.recyclerviewdonacion.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.roshka.recyclerviewdonacion.R
import com.roshka.recyclerviewdonacion.data.PuntosDonacion

class PuntosDonacionAdapter(private val puntosDonacionList: List<PuntosDonacion>) : RecyclerView.Adapter<PuntosDonacionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PuntosDonacionViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return PuntosDonacionViewHolder(layoutInflater.inflate(R.layout.item_punto_donacion, parent, false))
    }

    override fun getItemCount(): Int {
        return puntosDonacionList.size
    }

    override fun onBindViewHolder(holder: PuntosDonacionViewHolder, position: Int) {
        val item = puntosDonacionList[position]
        holder.render(item)
    }
}