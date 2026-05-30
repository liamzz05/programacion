/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eurosapesetas;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class EurosApesetas {

    public static void main(String[] args) {
        System.out.println("Escribe el precio en euros:");
        float dinero= new Scanner(System.in).nextFloat();
        System.out.println("El precio de la vivienda en euros es: "+dinero);
        float pesetas= dinero*166.386f;
        System.out.println("El precio de la vivienda en pesetas es: "+pesetas);
    }
}
