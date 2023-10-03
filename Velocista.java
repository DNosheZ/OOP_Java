/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreraciclista;

/**
 *
 * @author Usuario
 */
public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadPromedio;
    /**
    * Constructor de la clase Velocista
    * @param identificador Parámetro que define el identificador de un 
    * velocista
    * @param nombre Parámetro que define el nombre de un velocista
    * @param potenciaPromedio Parámetro que define la potencia 
    * promedio de un velocista
    * @param velocidadPromedio Parámetro que define la velocidad 
    * promedio de un velocista
    */
    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }
    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }
    /**
    * Método que establece la potencia promedio de un velocista
    * @param Parametro que especifica la potencia promedio de un 
    * velocista
    */
    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }
    protected double getvelocidadPromedio() {
        return velocidadPromedio;
    }
    /**
    * Método que establece la velocidad promedio de un velocista
    * @param Parametro que especifica la velocidad promedio de un 
    * velocista
    */
    protected void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    /**
    * Método que muestra en pantalla los datos de un velocista
    */
    protected void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio = " + potenciaPromedio);
        System.out.println("Velocidad promedio = " + velocidadPromedio);
    }
    protected String imprimirTipo() {
        return "Es un velocista";
    }
}
