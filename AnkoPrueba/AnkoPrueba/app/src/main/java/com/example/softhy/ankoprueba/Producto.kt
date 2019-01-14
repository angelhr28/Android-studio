package com.example.softhy.ankoprueba

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_view.view.*
import kotlinx.android.synthetic.main.items_productos.view.*


class Producto(var data: List<ItemsDatos2>): RecyclerView.Adapter<Producto.ViewHolder>() {

   override fun onCreateViewHolder(parent: ViewGroup, p1: Int) : ViewHolder {
          return ViewHolder(parent.inflate(R.layout.items_productos))
    }
    override fun getItemCount(): Int =data.size

    override fun onBindViewHolder(holder: ViewHolder, p1: Int) {
        holder.bindView(data[p1])
    }

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindView(dato: ItemsDatos2) {
            with(dato) {
                itemView.lbl_nombre.text = nombre
                itemView.lbl_desc.text = descrip
                itemView.lbl_precio.text = precio
                itemView.img_producto.setImageResource(imagen);            }
        }
    }
}