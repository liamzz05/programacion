/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areatriangulo;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class AreaTriangulo {

    public static void main(String[] args) {
        double altura;
        double base;
        System.out.println("Dime la altura");
        altura=new Scanner(System.in).nextDouble();
        System.out.println("Dime la base");
        base=new Scanner(System.in).nextDouble();
        double area= base*altura/2;
        System.out.println("El area del triangulo es: "+area);
    }
}
