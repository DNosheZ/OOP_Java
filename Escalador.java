/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreraciclista;

/**
 *
 * @author Usuario
 */
public class Escalador extends Ciclista {
    private double aceleracionPromedio;
    private double gradoRampa;
    /**
    * Constructor de la clase Escalador
    * @param identificador Parámetro que define el identificador de un 
    * escalador
    * @param nombre Parámetro que define el nombre de un escalador
    * @param aceleracionPromedio Parámetro que define la aceleración 
    * promedio de un escalador
    * @param gradoRampa Parámetro que define el grado de rampa de 
    * un escalador
    */
    public Escalador(int identificador, String nombre, double aceleracionPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }
    /**
    * Método que devuelve la aceleración promedio de un escalador
    * @return La aceleración promedio de un escalador
    */
    protected double getAceleraciónPromedio() {
        return aceleracionPromedio;
    }
    /**
    * Método que establece la aceleración promedio de un escalador
    * @param Parametro que especifica la aceleración promedio de un 
    * escalador
    */
    protected void setAceleraciónPromedio(double aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }
    protected double getGradoRampa() {
        return gradoRampa;
    }
    /**
    * Método que establece el grado de rampa soportado por un escalador
    * @param Parametro que especifica el grado de rampa soportado 
    * por un escalador
    */
    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
    /**
    * Método que muestra en pantalla los datos de un escalador
    */
    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Aceleración promedio = " + aceleracionPromedio);
        System.out.println("Grado de rampa = " + gradoRampa);
    }
    protected String imprimirTipo() {
        return "Es un escalador";
    }
}
