/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1_parcial_2;

/**
 *
 * @author Armando Bautista
 */
public class Ejercicio_1_parcial_2 {
   
    private class Punto {
        double x;
        double y;

        Punto(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    private Punto puntoA;
    private Punto puntoB;

    Ejercicio_1_parcial_2(double x1, double y1, double x2, double y2) {
        this.puntoA = new Punto(x1, y1);
        this.puntoB = new Punto(x2, y2);
    }

    public void mueve_derecha(double distancia) {
        puntoA.x += distancia;
        puntoB.x += distancia;
    }

    public void mueve_izquierda(double distancia) {
        puntoA.x -= distancia;
        puntoB.x -= distancia;
    }

    public void mueve_arriba(double distancia) {
        puntoA.y += distancia;
        puntoB.y += distancia;
    }

    void mueve_abajo(double distancia) {
        puntoA.y -= distancia;
        puntoB.y -= distancia;
    }

   
    @Override
    public String toString() {
        return "[" + puntoA + "," + puntoB + "]";
    }
}


