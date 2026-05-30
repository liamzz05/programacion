/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej4;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej4 {

    public static void main(String[] args) {
        System.out.println("Dime un numero");
        double numero= new Scanner(System.in).nextDouble();
        if (numero%1 == 0) {
            System.out.println("No tiene parte fraccionaria");
        } else {
            double fraccion=numero%1;
            System.out.println("Parte fraccionaria: "+fraccion);
        }
    }
}
