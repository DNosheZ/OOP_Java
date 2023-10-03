/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animales;

/**
 *
 * @author Usuario
 */
public class Animales {
/**
* Método main que crea un array de varios animales y para cada uno 
* muestra en pantalla su nombre científico, su sonido, alimentos y 
* hábitat
*/
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Gato();
        animals[1] = new Perro();
        animals[2] = new Lobo();
        animals[3] = new Leon();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getNombreCientifico());
            System.out.println("Sonido: " + animals[i].getSonido());
            System.out.println("Alimentos: " + animals[i].
            getAlimentos());
            System.out.println("Hábitat: " + animals[i].getHabitat());
            System.out.println();
        }
    }
}
