/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja6.ej2;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej2 {

    public static void main(String[] args) {
        System.out.println("Dime el primer num");
        int num1= new Scanner(System.in).nextInt();
        System.out.println("Dime el segundo num");
        int num2= new Scanner(System.in).nextInt();
        
        if (num1>num2) {
            int aux=num1;
            num1=num2;
            num2=aux;
        }
        
        int suma=0;
        
        for (int i = num1; i < num2; i++) {
            if (i%2!=0) {
                System.out.println(i + " ");
                suma+=i;
            }
        }
        
        System.out.println("La suma es "+suma);
        
    }
}
