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

public class Ejercicio_3_parcial_2 {
    private int dia;
    private int mes;
    private int año;

    public Ejercicio_3_parcial_2() {
        leer();
    }

    public void leer() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el día (1-31): ");
        dia = teclado.nextInt();
        System.out.print("Ingrese el mes (1-12): ");
        mes = teclado.nextInt();
        System.out.print("Ingrese el año (1900-2050): ");
        año = teclado.nextInt();
        teclado.close();
        valida();
    }

    public boolean bisiesto() {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public int diasMes(int mes) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bisiesto())
            return 29;
        return diasPorMes[mes - 1];
    }

    public void valida() {
        if (dia < 1 || dia > diasMes(mes))
            dia = 1;
        if (mes < 1 || mes > 12)
            mes = 1;
        if (año < 1900 || año > 2050)
           año = 1900;
    }

    public String formatoCorto() {
        return String.format("%02d-%02d-%04d", dia, mes, año);
    }

    public int diasTranscurridos() {
        int dias = dia;
        for (int i = 1; i < mes; i++) {
            dias += diasMes(i);
        }
        for (int i = 1900; i < año; i++) {
            dias += bisiesto() ? 366 : 365;
        }
        return dias;
    }

    public int diaSemana() {
        return diasTranscurridos() % 7;
    }

    public String formatoExtendido() {
        String[] dias_semana = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        String[] nombres_meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return String.format("%s %d de %s de %d", dias_semana[diaSemana()], dia, nombres_meses[mes - 1], año);
    }

    public void fechaTranscurrido(long dias) {
        long total_dias = diasTranscurridos() + dias;
        año = 1900;
        while (total_dias > (bisiesto() ? 366 : 365)) {
            total_dias -= bisiesto() ? 366 : 365;
            año++;
        }
        for (mes = 1; mes <= 12; mes++) {
            int dias_en_mes = diasMes(mes);
            if (total_dias <= dias_en_mes) {
                dia = (int) total_dias;
                break;
            }
            total_dias -= dias_en_mes;
        }
    }

    public long diasEntre(Ejercicio_3_parcial_2 fecha) {
        long dias1 = diasTranscurridos();
        long dias2 = fecha.diasTranscurridos();
        return Math.abs(dias1 - dias2);
    }

    public void siguiente() {
        dia++;
        if (dia > diasMes(mes)) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
    }

    public void anterior() {
        dia--;
        if (dia < 1) {
            mes--;
            if (mes < 1) {
                mes = 12;
                año--;
            }
            dia = diasMes(mes);
        }
    }

    public boolean igualQue(Ejercicio_3_parcial_2 fecha) {
        return dia == fecha.dia && mes == fecha.mes && año == fecha.año;
    }

    public boolean menorQue(Ejercicio_3_parcial_2 fecha) {
        return diasTranscurridos() < fecha.diasTranscurridos();
    }

    public boolean mayorQue(Ejercicio_3_parcial_2 fecha) {
        return diasTranscurridos() > fecha.diasTranscurridos();
    }

  
}


