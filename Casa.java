/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciainmueble;

/**
* Esta clase denominada Casa modela un tipo específico de inmueble 
* destinado para la vivienda con atributos como el número de pisos 
* que tiene una casa.
* @version 1.2/2020
*/
public class Casa extends InmuebleVivienda {
    protected int numeroPisos; /* Atributo que identica el número de 
    pisos que tiene una casa */
    /**
    * Constructor de la clase Casa
    * @param identificadorInmobiliario Parámetro que define el 
    * identificador inmobiliario de una casa
    * @param area Parámetro que define el área de una casa
    * @param direccion Parámetro que define la dirección donde se 
    * encuentra localizada una casa
    * @param numeroHabitaciones Parámetro que define el número de 
    * habitaciones que tiene una casa
    * @param numeroBaños Parámetro que define el número de baños 
    * que tiene una casa
    * @param numeroPisos Parámetro que define el número de pisos 
    * que tiene una casa
    */
    public Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }
    /**
    * Método que muestra en pantalla los datos de una casa
    */
    void imprimir() {
        super.imprimir();
        System.out.println("Número de pisos = " + numeroPisos);
    }  
}
