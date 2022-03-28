package com.cultivo;

//De jarron, la diferencia es que tienen tapitas
public class CephalotusFollicularis extends Plant {

    public CephalotusFollicularis(Boolean sol){
        super(true);
        this.color = "Verde y vinotinto";
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
