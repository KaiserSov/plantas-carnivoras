package com.cultivo;

/**
 * @Author: Sara Oquendo Valle
 */

import java.util.Scanner;

/**
 * Param: Trae los objetos y genera un menú
 */
public class Main {
    public static void main(String[] args) {

        Plant cephalotus = new CephalotusFollicularis(true);
        Plant nephentesN = new Nephentes();
        Plant atrapaMoscas = new DionaeaMuscipula();
        Plant droseraN = new Drosera();

        Scanner deber = new Scanner(System.in);
        System.out.println("Tus plantas agradecen que las cuides");
        System.out.println("Qué harás hoy?");
        System.out.println("Acción               |  opción");
        System.out.println("Regar tus plantas    |     a   ");
        System.out.println("Información general  |     b");
        System.out.println("Menú                 |     c");
        System.out.println("Dejar plantas en paz |     any keyword");

        System.out.println("Ingresa la opción de lo que vas a hacer con tus plantas");
        String deberHoy = deber.nextLine();

            switch (deberHoy){
                case "a":
                    cephalotus.regarPlanta();
                    atrapaMoscas.regarPlanta();
                    nephentesN.regarPlanta();
                    droseraN.regarPlanta();

                    System.out.println("Tus plantas no necesitan más agua hoy");
                    System.out.println("Ingresa la opción de lo que vas a hacer con tus plantas");
                    deberHoy = deber.nextLine();
                    break;

                case "b":
                    System.out.println("      | Atrapa moscas |");
                    atrapaMoscas.infoGeneral();

                    System.out.println(" ");
                    System.out.println("      | Cephalotus Follicularis |");
                    cephalotus.infoGeneral();

                    System.out.println(" ");
                    System.out.println("      | Nephentes |");
                    nephentesN.infoGeneral();

                    System.out.println(" ");
                    System.out.println("      | Drosera |");
                    droseraN.infoGeneral();

                    System.out.println("Ingresa la opción de lo que vas a hacer con tus plantas");
                    deberHoy = deber.nextLine();
                    break;

            case "c":
                System.out.println("Tus plantas agradecen que las cuides");
                System.out.println("Qué harás hoy?");
                System.out.println("Acción               |  opción");
                System.out.println("Regar tus plantas    |     a   ");
                System.out.println("Información general  |     b");
                System.out.println("Menú                 |     c");
                System.out.println("Dejar plantas en paz |     any keyword");

                System.out.println("Ingresa la opción de lo que vas a hacer con tus plantas");
                deberHoy = deber.nextLine();
                break;

                default:
                    System.out.println("Vuelve mañana y no olvides poner tus plantitas al sol");
            }
        }
}
