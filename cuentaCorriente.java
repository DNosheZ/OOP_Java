/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajero;

/**
 *
 * @author Usuario
 */
public class CuentaCorriente extends Cuenta {
    float sobregiro;
    /**
    * Constructor de la clase CuentaCorrienta
    * @param saldo Parámetro que define el saldo de la cuenta corriente
    * @param tasa Parámetro que define la tasa anual de interés de la 
    * cuenta corriente
    */
    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro = 0;
    }
    /**
    * Método que recibe una cantidad de dinero a retirar y actualiza el 
    * saldo de la cuenta
    * @param cantidad Parámetro que define la cantidad de dinero a 
    * retirar de la cuenta corriente
    */
    public void retirar(float cantidad) {
        float resultado = saldo - cantidad;
        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }
    /**
    * Método que recibe una cantidad de dinero a consignar y actualiza 
    * el saldo de la cuenta
    * @param cantidad Parámetro que define la cantidad de dinero a 
    * consignar en la cuenta corriente
    */
    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;
        if (sobregiro > 0) {
            if ( residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            } else {
            sobregiro = -residuo;
            saldo = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }
    public void extractoMensual() {
        super.extractoMensual(); 
    }
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Valor de sogregiro = $" + (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}
