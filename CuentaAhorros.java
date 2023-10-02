/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajero;

/**
 *
 * @author Usuario
 */
public class CuentaAhorros extends Cuenta {
    /* Atributo que identifica si una cuenta está activa; lo está si su saldo 
    es superior a 10000 */
    private boolean activa;
    /**
    * Constructor de la clase CuentaAhorros
    * @param saldo Parámetro que define el saldo de la cuenta de ahorros
    * @param tasa Parámetro que define la tasa anual de interés de la 
    * cuenta de ahorros
    */
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 10000){
            activa = false;
        }else{
            activa = true;
        }
    }
    /**
    * Método que recibe una cantidad de dinero a retirar y actualiza el 
    * saldo de la cuenta
    * @param saldo Parámetro que define la cantidad a retirar de una 
    * cuenta de ahorros
    */
    public void retirar(float cantidad) {
        if (activa){
            super.retirar(cantidad);
        }
    }
    /**
    * Método que recibe una cantidad de dinero a consignar y actualiza 
    * el saldo de la cuenta
    * @param saldo Parámetro que define la cantidad a consignar en 
    * una cuenta de ahorros
    */
    public void consignar(float cantidad) {
        if (activa){
            super.consignar(cantidad);
        }
    }
    /**
    * Método que genera el extracto mensual de una cuenta de ahorros
    */
    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if ( saldo < 10000 ){
            activa = false;
        }
    }
    /**
    * Método que muestra en pantalla los datos de una cuenta de 
    ahorros
    */
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " +comisionMensual);
        System.out.println("Número de transacciones = " +(numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}
