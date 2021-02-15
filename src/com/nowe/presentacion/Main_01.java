/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

import java.util.Scanner;

/**
 *
 * @author agarm
 */
public class Main_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Vamos a preguntar si es casado o no es casado. Hay que guardar el dato de si es o no casado
        // Solicitar por consola si la persona es casada o no
        // Guardar para 5 personas la información
        
        //1. Declaración de variables
        boolean[] estadosCiviles = new boolean[5];
        Scanner sc = new Scanner(System.in);
        
        //2. Bucle para solicitar la información
        for (int i = 0; i < estadosCiviles.length; i++) {
            System.out.println("¿Es casado? Responde true o false --> ");
            estadosCiviles[i] = sc.nextBoolean();     
        }
        
        for (int i = 0; i < estadosCiviles.length; i++) {
            System.out.println("La persona " + i + " es casada? " + estadosCiviles[i]);
        }
       sc.close();
    }
    
}
