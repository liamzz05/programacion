/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja6.ej8;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej8 {

    public static void main(String[] args) {
        int mayor=0;
        int menor=1000;
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime la edad "+(i+1));
            int edad=new Scanner(System.in).nextInt();
            if (edad<menor) {
                menor=edad;
            }
            if (edad>mayor) {
                mayor=edad;
            }
        }
        System.out.println("El mayor es "+mayor);
        System.out.println("El menor es "+menor);
    }
}
