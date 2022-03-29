package com.cultivo;

public class Nephentes extends Plant {

    public Nephentes(){
        super(true);
        this.color = "Verde y amarillo dependiendo del cuidado";
        this.tipo = "Nephentes";
        this.altura = 15+"cm";
        this.origen = "Tropical";
        this.temperatura ="15 - 30 °C";
    }

    /**
     * Param: Herencia de regar planta
     */
    public void regarPlanta() {
        System.out.println("Regaste tu nephentes");
    }

    /**
     * Param: Clase abstracata que trae los atributos
     */
    public void infoGeneral (){
        System.out.println("Sol: "+ sol);
        System.out.println("Origen: "+ origen);
        System.out.println("Altura: "+ altura);
        System.out.println("Tipo: "+ tipo);
        System.out.println("Color: "+ color);
        System.out.println("Temperatura: "+ temperatura);
    }
}
