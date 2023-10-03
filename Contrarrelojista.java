/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreraciclista;

/**
 *
 * @author Usuario
 */
public class Contrarrelojista extends Ciclista {
    // Atributo que define la velocidad máxima de un contrarrelojista
    private double velocidadMaxima;
    /**
    * Constructor de la clase Escalador
    * @param identificador Parámetro que define el identificador de un 
    * contrarrelojista
    * @param nombre Parámetro que define el nombre de un 
    * contrarrelojista  
    * @param velocidadMaxima Parámetro que define la velocidad 
    * máxima de un contrarrelojista
    */
    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }
    /**
    * Método que devuelve la velocidad máxima de un contrarrelojista
    * @return La velocidad máxima de un contrarrelojista
    */
    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    /**
    * Método que establece la velocidad máxima de un contrarrelojista
    * @param Parametro que especifica la velocidad máxima de un 
    * contrarrelojista
    */
    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio = " + velocidadMaxima);
    }
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }
}
