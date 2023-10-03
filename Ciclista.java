/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreraciclista;

/**
 *
 * @author Usuario
 */
public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempoAcumulado = 0;
    /**
    * Constructor de la clase Ciclista
    * @param identificador Parámetro que define el identificador de un 
    * ciclista
    * @param nombre Parámetro que define el nombre completo de un 
    * ciclista
    */
    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }
    abstract String imprimirTipo();
        protected int getIdentificador() {
        return identificador;
    }
    protected void setIdentificador() {
        this.identificador = identificador;
    }
    protected String getNombre() {
        return nombre;
    }
    /**
    * Método que establece el nombre de un ciclista
    * @param Parametro que especifica el nombre de un ciclista
    */
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected int getPosicionGeneral(int posicionGeneral) {
        return posicionGeneral;
    }
    /**
    * Método que establece el puesto que ocupa un ciclista en la 
    * posición general
    * @param Parametro que especifica el puesto que ocupa un ciclista 
    * en la posición general
    */
    protected void setPosiciónGeneral(int posicionGeneral) {
        posicionGeneral = posicionGeneral;
    }
    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }
    /**
    * Método que establece el tiempo acumulado por un ciclista
    * @param Parametro que especifica el tiempo acumulado por un ciclista
    */
    protected void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }
    /**
    * Método muestra en pantalla los datos de un ciclista
    */
    protected void imprimir() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
    }
}
