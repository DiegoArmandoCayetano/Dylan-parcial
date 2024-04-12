/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_parcial_2;

/**
 *
 * @author Armando Bautista
 */
public class Ejercicio_2_parcial_2 {
 
    private long numero_cuenta;
    private long dni_cliente;
    private double saldo;
    private double interes_anual;

    public Ejercicio_2_parcial_2(long numeroCuenta, long dniCliente, double saldo, double interesAnual) {
        this.numero_cuenta = numeroCuenta;
        this.dni_cliente = dniCliente;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo. Se establecerá a 0.");
            this.saldo = 0;
        }
        if (interesAnual >= 0) {
            this.interes_anual = interesAnual;
        } else {
            System.out.println("El interés anual no puede ser negativo. Se establecerá a 0.");
            this.interes_anual = 0;
        }
    }

    public void actualizarSaldo() {
        double interesDiario = (interes_anual / 100) / 365;
        saldo += saldo * interesDiario;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("Debe ingresar una cantidad mayor que 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
            } else {
                System.out.println("Saldo insuficiente para retirar la cantidad especificada.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que 0.");
        }
    }

    // Getters y setters
    public long getNumeroCuenta() {
        return numero_cuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numero_cuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dni_cliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dni_cliente = dniCliente;
    }

    public double get_saldo() {
        return saldo;
    }

    public void set_saldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo. No se realizarán cambios.");
        }
    }

    
    public double get_interesAnual() {
        return interes_anual;
    }

    public void setInteresAnual(double interesAnual) {
        if (interesAnual >= 0) {
            this.interes_anual = interesAnual;
        } else {
            System.out.println("El interés anual no puede ser negativo. No se realizarán cambios.");
        }
    }

    
    
    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numero_cuenta +
                ", dniCliente=" + dni_cliente +
                ", saldo=" + saldo +
                ", interesAnual=" + interes_anual +
                '}';
    
}

}
