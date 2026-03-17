/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja5.ej5;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej5 {

    public static void main(String[] args) {
        System.out.println("Dime la base");
        int base=new Scanner(System.in).nextInt();
        System.out.println("Dime el exponente");
        int exponente=new Scanner(System.in).nextInt();
        int resultado=1;
        do {
        resultado=resultado*base;
        exponente--;
        } while (exponente>0);
        System.out.println("El resultado es "+resultado);
    }
}
