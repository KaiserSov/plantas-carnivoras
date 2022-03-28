package com.cultivo;

public class Nephentes extends Plant {

    public Nephentes(){
        super(true, "15 metros", "Tropico", "Nephentes", "Verde y amarillo dependiendo del cuidado", "15 - 30 °C");
    }

    public void regarPlanta() {
        System.out.println("Regaste tu plantita");
    }
}
