/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej5;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej5 {

    public static void main(String[] args) {
        System.out.println("Dime un numero");
        int numero= new Scanner(System.in).nextInt();
        if (numero%4 == 0 && numero%100==0 && numero%400!=0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
