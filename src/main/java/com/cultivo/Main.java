package com.cultivo;

import com.cultivo.Drosera;

public class Main {
    public static void main(String[] args) {

        Drosera dro;
        dro = new Drosera();

        String col = dro.obtenerColor();
        String altu = dro.obtenerAltura();
        String temp = dro.obtenerTemperatura();
        String ori = dro.obtenerOrigen();
        String tip = dro.obtenerTipo();
        dro.regarDrosera();

        System.out.println("El color de la planta es: "+col);

    }
}
