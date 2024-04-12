/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_5_parcial_2;

/**
 *
 * @author Armando Bautista
 */

    import java.util.ArrayList;
import java.util.Random;
import java.util.List;

class Ejercicio_5_parcial_2 {
    private int numero;
    private String palo;

    public Ejercicio_5_parcial_2(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " del " + palo;
    }
}

class BarajaCartas {
    private List<Ejercicio_5_parcial_2> cartas;
    private List<Ejercicio_5_parcial_2> monton;

    public BarajaCartas() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();

        // Creamos las cartas de la baraja
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String palo : palos) {
            for (int numero = 0; numero < 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Ejercicio_5_parcial_2(numero, palo));
                }
            }
        }
    }
    Random azar=new Random();
    
    public void barajar() {
        int cartas = azar.nextInt();
    }

    public Ejercicio_5_parcial_2 siguiente_carta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        Ejercicio_5_parcial_2 carta = cartas.remove(0);
        monton.add(carta);
        return carta;
    }

    public int cartas_libres() {
        return cartas.size();
    }

    public List<Ejercicio_5_parcial_2> darCartas(int cantidad) {
        List<Ejercicio_5_parcial_2> cartas_dadas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Ejercicio_5_parcial_2 carta = siguiente_carta();
            if (carta != null) {
                cartas_dadas.add(carta);
            } else {
                break;
            }
        }
        return cartas_dadas;
    }

    public void cartas_monton() {
        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta aún.");
        } else {
            System.out.println("Cartas en el montón:");
            for (Ejercicio_5_parcial_2 carta : monton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrar_baraja() {
        System.out.println("Cartas restantes en la baraja:");
        for (Ejercicio_5_parcial_2 carta : cartas) {
            System.out.println(carta);
        }
    }
}




