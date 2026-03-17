/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ej7;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej7 {

    public static void main(String[] args) {
        System.out.println("Dime un numero");
        int numero = new Scanner(System.in).nextInt();
        if(numero=<10 && numero>=0){
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }} else {
            System.out.println("El numero no está entre 1 y 10");
    }
}
