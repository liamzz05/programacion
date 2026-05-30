/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej2;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej2 {

    public static void main(String[] args) {
        System.out.println("Dime un numero");
        int numero= new Scanner(System.in).nextInt();
        if (numero<0) {
            System.out.println("Es negativo");
        } else if (numero>0){
            System.out.println("Es positivo");
        } else {
            System.out.println("Es nulo");
        }
    }
}
