/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u2ej5;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class U2ej5 {

    public static void main(String[] args) {
        double num1;
        double num2;
        System.out.println("Dime el primer numero:");
        num1= new Scanner(System.in).nextInt();
        System.out.println("Dime el segundo numero:");
        num2= new Scanner(System.in).nextInt();
        
        double suma=num1+num2;
        double resta=num1-num2;
        double mult=num1*num2;
        double div=num1/num2;
        double potencia=Math.pow(num1, 2);
        double raiz=Math.sqrt(num1);
        
        System.out.println("x= "+ num1+" y "+"y= "+num2);
        System.out.println("x + y = "+suma);
        System.out.println("x - y = "+resta);
        System.out.println("x * y ="+mult);
        System.out.println("x / y = "+div);
        System.out.println("x ^ 2 = "+potencia);
        System.out.println("√x = "+raiz);
    }
}
