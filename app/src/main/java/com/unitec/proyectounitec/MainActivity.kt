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
//vamos a probar que funciona github
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)
        setContentView(R.layout.ejemplito)
     //vamos a eliminar la barrita de la parte superior del celular. esta barrita se conoce
     //como supportActionBar
     //compilador del celular se llama Dalvik(en java es JVM)
     //Las sentencias no terminan en ;
     supportActionBar?.hide()
    }
}