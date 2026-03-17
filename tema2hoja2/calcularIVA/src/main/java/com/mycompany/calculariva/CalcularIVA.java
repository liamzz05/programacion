/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculariva;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class CalcularIVA {

    public static void main(String[] args) {
        System.out.println("Dime el precio ");
        double precio=new Scanner(System.in).nextDouble();
        int IVA=21;
        double precioIVA= precio+(precio/100*IVA);
        double precioDescuento= precioIVA*0.9;
        System.out.println("El precio sin IVA es: "+precio);
        System.out.println("El precio con IVA es: "+precioIVA);
        System.out.println("El precio espues de aplicar un porcentaje de 10 de descuento es: "+precioDescuento);
    }
}
