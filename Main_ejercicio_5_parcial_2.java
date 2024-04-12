/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5_parcial_2;

import java.util.List;

/**
 *
 * @author Armando Bautista
 */
public class Main_ejercicio_5_parcial_2 {
      public static void main(String[] args) {
        BarajaCartas baraja = new BarajaCartas();
        baraja.barajar();
        System.out.println("Cantidad de cartas disponibles: " + baraja.cartas_libres());

        System.out.println("\nAgregando 5 cartas:");
        List<Ejercicio_5_parcial_2> cartasDadas = baraja.darCartas(7);
        for (Ejercicio_5_parcial_2 carta : cartasDadas) {
            System.out.println(carta);
        }

        System.out.println("\nCantidad de cartas disponibles después de dar 5 cartas: " + baraja.cartas_libres());

        System.out.println("\nCartas en el montón:");
        baraja.cartas_monton();

        System.out.println("\nCartas restantes en la baraja:");
        baraja.mostrar_baraja();
    }
}
