package com.cultivo;

//Tienen gotitas de líquido pegajoso
public class Drosera {
    //Variables nativas
    String altura;
    String color;
    String tipo;
    String origen;
    String temperatura;

    //Constructores, esto no sale cuando lo ejecuto
    public Drosera ()
    {
        color = ("Depende del cuidado, pero el más común es verde y rosado");
        tipo = ("Spatulata");
        altura = (3+"cm");
        origen = ("Oceanía");
        temperatura = (2+"°C");
    }

    public Drosera(String altura, String color, String tipo,  String origen, String temperatura)
    {
        this.altura=altura;
        this.temperatura=temperatura;
        this.origen=origen;
        this.tipo=tipo;
        this.color=color;
    }
    //Acaban los constructores

    //Métodos
    public String obtenerColor()
    {
        //System.out.println("Nuestra drosera es de color: ");
        return this.color;
    }

    public String obtenerAltura ()
    {
        //System.out.println("Nuestra drosera mide: ");
        return this.altura;
    }

    public String obtenerTipo ()
    {
        //System.out.println("Nuestra drosera es del tipo: ");
        return this.tipo;
    }

    public String obtenerOrigen ()
    {
        //System.out.println("Nuestra vino de: ");
        return this.origen;
    }

    public String obtenerTemperatura ()
    {
        //System.out.println("Nuestra drosera necesita una temperatura de: ");
        return this.temperatura;
    }

    public void regarDrosera()
    {
        System.out.println("Regaste la plantita");
    }
}