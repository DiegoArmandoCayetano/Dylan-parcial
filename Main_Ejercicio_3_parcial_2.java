/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_3_parcial_2;

/**
 *
 * @author Armando Bautista
 */
import java.util.Scanner;

public class Main_Ejercicio_3_parcial_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crear una fecha
        System.out.println("Digite la primera fecha:");
        Ejercicio_3_parcial_2 fecha1 = new Ejercicio_3_parcial_2();
        
        // Mostrar información de la primera fecha
        System.out.println("Fecha número 1 en formato corto: " + fecha1.formatoCorto());
        System.out.println("Fecha número 1 en formato extendido: " + fecha1.formatoExtendido());
        System.out.println("Año Bisiesto: " + fecha1.bisiesto());
        System.out.println("Días transcurridos desde el 1-1-1900: " + fecha1.diasTranscurridos());
        System.out.println("Día de la semana (0: Domingo, 1: Lunes, .. , 6: Sábado): " + fecha1.diaSemana());

        
        fecha1.siguiente();
        System.out.println("Fecha de la siguiente a la Fecha 1: " + fecha1.formatoCorto());
        fecha1.anterior();
        System.out.println("Fecha de la anterior a la Fecha 1: " + fecha1.formatoCorto());

        System.out.println("\nDigite la segunda fecha:");
        Ejercicio_3_parcial_2 fecha2 = new Ejercicio_3_parcial_2();

       
        System.out.println("Fecha 2 en formato corto: " + fecha2.formatoCorto());
        System.out.println("Fecha 2 en formato extendido: " + fecha2.formatoExtendido());

        System.out.println("número de días entre Fecha 1 y Fecha 2: " + fecha1.diasEntre(fecha2));

        teclado.close();
    }
}
