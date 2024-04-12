/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4_parcial_2;

/**
 *
 * @author Armando Bautista
 */
public class Main_Ejercicio_4_parcial_2 {
   
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Titanic", 195, 13, "James Cameron");
        Ejercicio_4_parcial_2 cine = new Ejercicio_4_parcial_2(pelicula, 7, 10, 6);

        // Generar espectadores aleatorios
        for (int i = 0; i < 20; i++) {
            Espectador espec = new Espectador("Espectador" + i, (int) (Math.random() * 50 + 5), Math.random() * 50 + 10);
            if (cine.hayEspacioLibre()) {
                cine.sentarEspectador(espec);
            } else {
                System.out.println("No hay espacio disponible para más espectadores.");
                break;
            }
        }
    }

}
