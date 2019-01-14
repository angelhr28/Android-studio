package com.example.softhy.ankoprueba

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.util.AdapterListUpdateCallback
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_view.*

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        rcV_texto.layoutManager= GridLayoutManager(this, 2)


        var listaDatos = mutableListOf<ItemsDatos2>()
        listaDatos.add(ItemsDatos2("nokia", "sd","$200", R.drawable.images))
        listaDatos.add(ItemsDatos2("zte", "seed","$200",R.drawable.images))
        listaDatos.add(ItemsDatos2("alcatel", "seed","$200",R.drawable.images))
        listaDatos.add(ItemsDatos2("samsumg", "seed","$2022",R.drawable.images))
        listaDatos.add(ItemsDatos2("lg", "seed","$2003",R.drawable.images))
        listaDatos.add(ItemsDatos2("huawei", "seed","$8200",R.drawable.images))



        val item= (0 .. 20 ).map{
            ItemsDatos2( "titulo $it", "descripcion: $it", "soles: $it ", it)
        }
        val adapter = Producto(listaDatos)
            rcV_texto.adapter= adapter
    }
}
