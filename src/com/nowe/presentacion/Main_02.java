/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

/**
 *
 * @author agarm
 */
public class Main_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dar la vuelta al array, el número último ponerlo el primero
        
        int[] numeros = {5,8,9,10,12};
        int auxiliar;
        
        for (int i = 0; i < numeros.length/2; i++) { //entre 2 porque sólo hace falta hasta la mitad del recorrido
            //Guardar en una variable auxiliar el valor de la posición i (de la primera posición)
            auxiliar = numeros[i];
            //Pasar el de la última posición a la primera posición
            numeros[i] = numeros[numeros.length-1-i]; //-1-i porque va desde atrás 
            numeros[numeros.length-1-i] = auxiliar;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + ", ");      
        }
    }
    
}
