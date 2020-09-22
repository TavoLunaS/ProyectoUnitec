package com.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//El punto de partida de toda app es la main activity(presenter)
/*
public class TarjetaCredito extends Tarjeta{
public tarjetaCredito(){
super();
}
}

 */
class MainActivity : AppCompatActivity() {
 //fun es una palabra reservada para implementar una funcion o metodo

    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)
        setContentView(R.layout.activity_main)
    }
}