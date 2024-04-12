/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4_parcial_2;

/**
 *
 * @author Armando Bautista
 */
import java.util.Random;

class Ejercicio_4_parcial_2 {
    private Pelicula pelicula;
    private double precioEntrada;
    private boolean[][] asientos;//d

    public Ejercicio_4_parcial_2(Pelicula pelicula, double precioEntrada, int filas, int columnas) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.asientos = new boolean[filas][columnas];
    }

    public boolean hayEspacioLibre() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (!asientos[i][j]) {
                    return true; // 
                }
            }
        }
        return false; // No hay ningún asiento libre
    }

    public boolean sentarEspectador(Espectador espectador) {
        Random random = new Random();
        int filas, columnas;

        filas = random.nextInt(asientos.length);
        columnas = random.nextInt(asientos[0].length);

        if (asientos[filas][columnas]) { // Si está ocupado el asiento
            for (int i = 0; i < asientos.length; i++) {
                for (int d = 0; d < asientos[i].length; d++) {
                    if (!asientos[i][d]) {
                        filas = i;
                        columnas = d;
                        break;
                    }
                }
                if (!asientos[filas][columnas]) {
                    break;
                }
            }
        }

        if (espectador.getEdad() >= pelicula.get_edad_minima() && espectador.getDinero() >= precioEntrada) {
            asientos[filas][columnas] = true;
            System.out.println(espectador.getNombre() + " se ha sentado en el asiento " + (filas + 1) + (char) ('A' + columnas));
            return true;
        } else {
            System.out.println(espectador.getNombre() + " no cumple los requisitos para ver la película.");
            return false;
        }
    }
}

class Pelicula {
    private String titulo;
    private int duracion; // en minutos
    private int edad_minima;
    private String director;

    public Pelicula(String titulo, int duracion, int edad_minima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edad_minima = edad_minima;
        this.director = director;
    }

    public int get_edad_minima() {
        return edad_minima;
    }
}

class Espectador {
    private String nombre;
    private int edad;
    private double dinero;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public int getEdad() {
        return edad;
    }

    public double getDinero() {
        return dinero;
    }

    public String getNombre() {
        return nombre;
    }
}


