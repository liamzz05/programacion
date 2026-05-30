/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intercambiovalores;

/**
 *
 * @author DAM104
 */
public class IntercambioValores {

    public static void main(String[] args) {
        int a=23;
        int b=56;
        System.out.println("El valor previo de a es "+a);
        System.out.println("El valor previo de b es "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("El valor actual de a es "+a);
        System.out.println("El valor actual de b es "+b);
    }
}
