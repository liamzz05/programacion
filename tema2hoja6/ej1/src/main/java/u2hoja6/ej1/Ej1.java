/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja6.ej1;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej1 {

    public static void main(String[] args) {  
        int numero;
        numero=new Scanner(System.in).nextInt();
        int divisores=0;
        for (int i = 1; i < numero/2; i++) {
            if (numero%i==0) {
                divisores++;
            }
        }
        System.out.println(""+divisores);
    }
}
