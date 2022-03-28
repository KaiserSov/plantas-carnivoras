package com.cultivo;

public class Main {
    public static void main(String[] args) {

        Plant cephalotus = new CephalotusFollicularis(true, "a");
        Plant nephentesN = new Nephentes();
        Plant atrapaMoscas = new DionaeaMuscipula();

        cephalotus.regarPlanta();
        atrapaMoscas.regarPlanta();
    }
}
