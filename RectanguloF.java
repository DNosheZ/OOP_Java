/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.geometricfigures;

/**
 *
 * @author Usuario
 */
public class RectanguloF {
    double base;
    double altura; 
    RectanguloF(double base, double altura) {
    this.base = base;
    this.altura = altura;
    }
    double calcularArea() {
    return base * altura;
    }   
    double calcularPerimetro() {
    return (2 * base) + (2 * altura);
    }
}
