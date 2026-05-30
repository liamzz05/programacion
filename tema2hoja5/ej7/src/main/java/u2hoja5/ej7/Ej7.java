/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package u2hoja5.ej7;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej7 {

    public static void main(String[] args) {
        char caracter;
        int suma = 0;
        int contador = 0;
        do {
            System.out.println("Escribe numeros para hacer media");
            caracter = new Scanner(System.in).next().charAt(0);
            suma = suma+ (int) caracter;
            if (caracter != '.') {
               contador++; 
            }
        } while (caracter != '.');

        System.out.println("Has metido " + contador + " numeros.");
        suma = suma/contador;
        System.out.println("La media es: " + suma);
    }
}
