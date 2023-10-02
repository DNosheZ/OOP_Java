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
* Esta clase denominada CasaIndependiente modela un tipo específico 
* de casa urbana que no está en conjunto cerrado y es completamente 
* independiente de otras casas. Tiene un atributo estático para 
* especificar un valor del área del inmueble.
* @version 1.2/2020
*/
public class CasaIndependiente extends CasaUrbana {
    // Atributo que identifica el valor por área de una casa independiente
    protected static double valorArea = 3000000;
    /**
    * Constructor de la clase CasaIndependiente
    * @param identificadorInmobiliario Parámetro que define el 
    * identificador inmobiliario de una casa independiente
    * @param area Parámetro que define el área de una casa independiente
    * @param direccion Parámetro que define la dirección donde se 
    * encuentra localizada una casa independiente
    * @param numeroHabitaciones Parámetro que define el número de 
    * habitaciones que tiene una casa independiente
    * @param numeroBaños Parámetro que define el número de baños 
    * que tiene una casa independiente
    * @param numeroPisos Parámetro que define el número de pisos 
    * que tiene una casa independiente
    */
    public CasaIndependiente(int identificadorInmobiliario, int area, 
        String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }
    /**
    * Método que muestra en pantalla los datos de una casa independiente
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    } 
}
