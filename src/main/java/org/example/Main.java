package org.example;

import org.example.LSK.Configuracion;


public class Main {
    public static void main(String[] args) {
        Configuracion configuracion = new Configuracion();
        configuracion.cargarConfiguracion();
        configuracion.salvarConfiguracion();
    }

}
