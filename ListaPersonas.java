/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personas;
import java.util.*;
/**
* Esta clase denominada ListaPersonas define un vector de Personas.
* @version 1.2/2020
*/
public class ListaPersonas {
    Vector listaPersonas;
    public ListaPersonas() {
        listaPersonas = new Vector();
    }
    /**
    * Método que permite agregar una persona al vector de personas
    * @param p Parámetro que define la persona a agregar al vector de 
    * personas
    */
    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }
    /**
    * Método que permite eliminar una persona del vector de personas
    * @param i Parámetro que define la posición a eliminar en el vector 
    * de personas
    */
    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }
    public void borrarLista() {
    listaPersonas.removeAllElements();
    }
}
