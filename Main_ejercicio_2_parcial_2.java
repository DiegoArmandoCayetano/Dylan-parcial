/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_parcial_2;

/**
 *
 * @author Armando Bautista
 */

public class Main_ejercicio_2_parcial_2 {
    
    public static void main(String[] args) {
        // Crear una cuenta
        Ejercicio_2_parcial_2 cuenta = new Ejercicio_2_parcial_2(123, 1091968734, 1000000, 12);

       
        
        // Mostrar información de la cuenta
        System.out.println("Información de la cuenta:");
        System.out.println(cuenta);

        
        cuenta.actualizarSaldo();
        System.out.println("Saldo después de la cargar: " + cuenta.get_saldo());

       
        cuenta.ingresar(350);
        System.out.println("Saldo después de ingresar 350: " + cuenta.get_saldo());

        
        cuenta.retirar(2300); 
        System.out.println("Saldo después de intentar retirar 2300: " + cuenta.get_saldo());

        
        cuenta.retirar(900);
        System.out.println("Saldo después de retirar 900: " + cuenta.get_saldo());
        
        
    }


}
