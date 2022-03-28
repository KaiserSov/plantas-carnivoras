package com.cultivo;

public class DionaeaMuscipula extends Plant{

    public DionaeaMuscipula(){
        super(true);
        this.color = "Verde y/o morado";
        this.tipo = "Nephentes";
        this.altura = 20+"cm";
        this.origen = "Oceanía";
        this.temperatura ="20 - 35 °C";
    }

    public void regarPlanta() {
        System.out.println("Regaste tu plantita");
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
