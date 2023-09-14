/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometricfigures;

/**
 *
 * @author Usuario
 */
public class TrianguloF {
    double base; 
    double altura;
    public TrianguloF (double base, double altura) {
    this.base = base;
    this.altura = altura;
    }
    double calcularArea() {
    return (base * altura / 2);
    }
    double calcularPerímetro() {
    return (base + altura + calcularHipotenusa());
    }
    double calcularHipotenusa() {
    return Math.pow(base*base + altura*altura, 0.5);
    }
    String determinarTipoTriángulo() {
        String MsgTrRect="";
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
           MsgTrRect="Es un triángulo equilátero";
        }else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            MsgTrRect="Es un triángulo escaleno";
        }else{ 
            MsgTrRect="Es un triángulo isósceles";  
        }
        return MsgTrRect;
    }
}
