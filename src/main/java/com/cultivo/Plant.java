package com.cultivo;

//Tienen gotitas de líquido pegajoso
public abstract class Plant {
    //Variables nativas
    public String altura;
    public String color;
    public String tipo;
    public String origen;
    public String temperatura;
    public Boolean sol;

    public Plant(Boolean sol, String altura, String origen, String tipo, String color, String temperatura)
    {
        this.color = "Depende del cuidado, pero el más común es verde y rosado";
        this.tipo = "Spatulata";
        this.altura = 3+"cm";
        this.origen = "Oceanía";
        this.temperatura = 2+"°C";
        this.sol = sol;
    }

   /* public Drosera(String altura, String color, String tipo,  String origen, String temperatura)
    {
        this.altura=altura;
        this.temperatura=temperatura;
        this.origen=origen;
        this.tipo=tipo;
        this.color=color;
    }*/
    //Acaban los constructores

    public abstract void regarPlanta();
    public void sacarAlSol(){
        this.sol = true;
    }
}