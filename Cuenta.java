/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajero;
/**
 *
 * @author Usuario
 */
public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    /**
    * Constructor de la clase Cuenta
    * @param saldo Parámetro que define el saldo de la cuenta
    * @param tasaAnual Parámetro que define la tasa anual de interés de 
    * la cuenta
    */
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    /**
    * Método que recibe una cantidad de dinero a consignar y actualiza 
    * el saldo de la cuenta
    * @param saldo Parámetro que define la cantidad de dinero a 
    * consignar en la cuenta
    */
    public void consignar(float cantidad) {
        saldo = saldo + cantidad;
        numeroConsignaciones = numeroConsignaciones + 1;
    }
    /**
    * Método que recibe una cantidad de dinero a retirar y actualiza el 
    * saldo de la cuenta
    * @param saldo Parámetro que define la cantidad de dinero a retirar 
    * de la cuenta
    */
    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0) {
            saldo -= cantidad;
            numeroRetiros = numeroRetiros + 1;
        } else {
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }
    /**
    * Método que calcula interés mensual de la cuenta a partir de la tasa 
    * anual aplicada
    */
    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }
    /**
    * Método que genera un extracto aplicando al saldo actual una 
    * comisión y calculando sus intereses
    */
    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
    }
}
