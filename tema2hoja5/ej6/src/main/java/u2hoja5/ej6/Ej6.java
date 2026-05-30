/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja5.ej6;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej6 {

    public static void main(String[] args) {
        char caracter;
        int contador=0;
        do {
            System.out.println("Escribe caracteres (. para salir)");
            caracter=new Scanner(System.in).next().charAt(0);
            contador++;
        } while (caracter != '.');
        System.out.println("Numero de caracteres: "+(contador-1));
    }
}
