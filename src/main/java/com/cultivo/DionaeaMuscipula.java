package com.cultivo;

public class DionaeaMuscipula extends Plant{

    public DionaeaMuscipula(){
        super(true);
        this.color = "Verde y/o morado";
        this.tipo = "Droseraceae";
        this.altura = 3.5+" - "+10+ "cm";
        this.origen = "Sureste de Estados Unidos";
        this.temperatura ="-7 - 40 °C";
    }

    /**
     * Param: Herencia de regar planta
     */
    public void regarPlanta() {
        System.out.println("Regaste tu venus atrapa moscas");
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
