/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1_parcial_2;

import java.util.Scanner;

/**
 *
 * @author Armando Bautista
 */
public class Main_ejercicio_1_parcial_2 {
    // Clase Main

    public static void main(String[] args) {
      
        Scanner teclado=new Scanner(System.in);
        Ejercicio_1_parcial_2 linea = new Ejercicio_1_parcial_2(0.0, 0.0, 1.0, 1.0);

        System.out.println("Linea original: " + linea);

        linea.mueve_derecha(1);
        System.out.println("Desplazamiento hacia la derecha: " + linea);

        linea.mueve_izquierda(5);
        System.out.println("Desplazamiento hacia la izquierda: " + linea);

        linea.mueve_arriba(6);
        System.out.println("Desplazamiento hacia arriba: " + linea);

        linea.mueve_abajo(3);
        System.out.println("Desplazamiento hacia abajo: " + linea);
        
        teclado.close();
    }
}
