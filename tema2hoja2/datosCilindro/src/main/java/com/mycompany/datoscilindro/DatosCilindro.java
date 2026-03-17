/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datoscilindro;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class DatosCilindro {

    public static void main(String[] args) {
        double radio;
        double altura;
        System.out.println("Dime el radio ");
        radio= new Scanner(System.in).nextDouble();
        System.out.println("Dime la altura ");
        altura= new Scanner(System.in).nextDouble();
        
        double area= 2*Math.PI*radio*altura;
        double volumen= Math.PI*Math.pow(radio, 2)*altura;
        
        System.out.println("El area lateral es: "+area);
        System.out.println("El volumen es: "+volumen);
    }
}
