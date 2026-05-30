/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datoscirculo;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class DatosCirculo {

    public static void main(String[] args) {
        double radio;
        System.out.println("Dime el radio ");
        radio= new Scanner(System.in).nextDouble();
        double longitud=2*Math.PI*radio;
        double area=Math.PI*Math.pow(radio, 2);
        System.out.println("La longitud es: "+longitud);
        System.out.println("El ares es: "+area);
    }
}
