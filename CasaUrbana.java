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
* Esta clase denominada CasaUrbana modela un tipo específico de casa 
* destinada para la vivienda localizada en el sector urbano.
* @version 1.2/2020
*/
public class CasaUrbana extends Casa {
    /**
    * Constructor de la clase CasaUrbana
    * @param identificadorInmobiliario Parámetro que define el 
    * identificador inmobiliario de una casa urbana
    * @param area Parámetro que define el área de una casa urbana
    * @param direccion Parámetro que define la dirección donde se 
    * encuentra localizada una casa urbana
    * @param numeroHabitaciones Parámetro que define el número de 
    * habitaciones que tiene una casa urbana
    * @param numeroBaños Parámetro que define el número de baños 
    * que tiene una casa urbana
    * @param numeroPisos Parámetro que define el número de pisos 
    * que tiene una casa urbana
    */
    public CasaUrbana(int identificadorInmobiliario, int area, String 
        direccion, int numeroHabitaciones, int numeroBaños, int 
        numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }
    /**
    * Método que muestra en pantalla los datos de una casa urbana
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
