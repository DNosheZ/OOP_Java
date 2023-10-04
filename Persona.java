/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personas;
public class Persona {
    String nombre;
    String apellidos;
    String telefono;
    String direccion;
    /**
    * Constructor de la clase Persona
    * @param nombre Parámetro que define el nombre de una persona 
    * @param apellidos Parámetro que define los apellidos de una 
    * persona
    * @param telefono Parámetro que define el teléfono de una persona
    * @param direccion Parámetro que define la dirección de una 
    * persona
    */
    public Persona(String nombre, String apellidos, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    } 
}

