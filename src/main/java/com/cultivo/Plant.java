package com.cultivo;

//Tienen gotitas de líquido pegajoso
/**
 * Param: Define las propiedades
 */
public abstract class Plant {
    //Variables nativas
    public String altura;
    public String color;
    public String tipo;
    public String origen;
    public String temperatura;
    public Boolean sol;

    /**
     * Param: Super para el sol en todos los objetos
     */
    public Plant(Boolean sol)
    {
        this.sol = sol;
    }

    /**
     * Param: Clase abstracta para regar la planta
     */
    public abstract void regarPlanta();
    public void sacarAlSol(){
        this.sol = true;
    }

    /**
     * Param: Clase abstracta para mostrar los atributos de las plantas
     */
    public abstract void infoGeneral();
}