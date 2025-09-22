/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculodescuento;

/**
 *
 * @author DELL
 */
public class CalculoDescuento {
    
    public static void main(String[] args) {
        double monto1 = 200.0;
        double monto2 = 500.0;

        double descuento1 = calcularDescuento(monto1);
        double totalPagar1 = monto1 - descuento1;

        double descuento2 = calcularDescuento(monto2, 15.0);
        double totalPagar2 = monto2 - descuento2;

        System.out.println("---- Calculo de Descuentos ----");
        System.out.println("Monto: $" + monto1);
        System.out.println("Descuento aplicado (10%): $" + descuento1);
        System.out.println("Total a pagar: $" + totalPagar1);

        System.out.println("\nMonto: $" + monto2);
        System.out.println("Descuento aplicado (15%): $" + descuento2);
        System.out.println("Total a pagar: $" + totalPagar2);
    }
    
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
    }

    public static double calcularDescuento(double montoTotal) {
        return montoTotal * 0.10;
    }
}
