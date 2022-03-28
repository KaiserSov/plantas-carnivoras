package com.cultivo;

//De jarron, la diferencia es que tienen tapitas
public class CephalotusFollicularis extends Plant {

    public CephalotusFollicularis(Boolean sol, String altura){
        super(true, "20 cm", "oceanía", "Nephentes", "Verde y vinotinto", "20 - 35 °C");
    }

    public void regarPlanta() {
        System.out.println("Regaste tu plantita");
    }


}
