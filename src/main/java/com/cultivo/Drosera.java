package com.cultivo;

public class Drosera extends Plant {
    public Drosera(){
        super(true);
        this.color = "Depende del cuidado, pero el más común es verde y rosado";
        this.tipo = "Spatulata";
        this.altura = 3+"cm";
        this.origen = "Oceanía";
        this.temperatura ="2°C";
    }

    public void regarPlanta() {
        System.out.println("Regaste tu drosera");
    }

    public void infoGeneral (){
        System.out.println("Sol: "+ sol);
        System.out.println("Origen: "+ origen);
        System.out.println("Altura: "+ altura);
        System.out.println("Tipo: "+ tipo);
        System.out.println("Color: "+ color);
        System.out.println("Temperatura: "+ temperatura);
    }


}
