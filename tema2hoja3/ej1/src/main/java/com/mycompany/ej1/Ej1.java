/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej1;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej1 {

    public static void main(String[] args) {
        System.out.println("Dime un numero");
        int numero= new Scanner(System.in).nextInt();
        if (numero<1000 && numero>100) {
            System.out.println("El numero esta entre 100 y 1000"); 
        } else {
            System.out.println("El numero NO esta entre 100 y 1000");
        }
    }
}
