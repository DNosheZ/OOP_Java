/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciainmueble;

/**
 *
 * @author Usuario
 */
/**
* Esta clase denominada Apartamento modela un tipo de inmueble 
* específico destinado para la vivienda.
* @version 1.2/2020
*/
public class Apartamento extends InmuebleVivienda {
    /**
    * Constructor de la clase Apartamento
    * @param identificadorInmobiliario Parámetro que define el 
    * identificador inmobiliario de un apartamento
    * @param area Parámetro que define el área de un apartamento
    * @param direccion Parámetro que define la dirección donde se 
    * encuentra localizado un apartamento
    * @param numeroHabitaciones Parámetro que define el número de 
    * habitaciones que tiene un apartamento
    * @param numeroBaños Parámetro que define el número de baños 
    * que tiene un apartamento
    */
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
    // Invoca al constructor de la clase padre
       super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }
    /**
    * Método que muestra en pantalla los datos de un apartamento
    */
    void imprimir() {
        super.imprimir();
    }
}
