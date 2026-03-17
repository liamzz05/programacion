/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja6.ej3;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej3 {

    public static void main(String[] args) {
        
        System.out.println("Dime un numero positivo");
        int num=new Scanner(System.in).nextInt();
        
        if (num >= 0) {
            System.out.println("Tabla de multiplicar de "+num);
            for (int i = 1; i <= 10; i++) {
                int mult=num*i;
                System.out.println(num+" x "+i+" = "+mult);
            }
            
        } else {
            System.out.println("Valor incorrecto");
        }
    }
}
