/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja5.ej4;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej4 {

    public static void main(String[] args) {
        System.out.println("Dime un numero");
        int num=new Scanner(System.in).nextInt();
        int contador=num-1;
        
        while (contador>0) {
            
            num=num*contador;
            contador--;
        } 
        System.out.println("El factorial es: "+num);
    }
}
