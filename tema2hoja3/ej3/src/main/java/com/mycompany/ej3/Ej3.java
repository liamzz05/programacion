/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej3;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej3 {

    public static void main(String[] args) {
        System.out.println("Dime un numero");
        int numero= new Scanner(System.in).nextInt();
        if (numero%2==0 && numero%5==0) {
            System.out.println("Es divisible por 2 y 5");
        }else{
            System.out.println("No es divisible por 2 y 5");
        }
        
    }
}
