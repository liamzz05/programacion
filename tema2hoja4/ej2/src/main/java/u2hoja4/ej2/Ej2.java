/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja4.ej2;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej2 {

    public static void main(String[] args) {
         
        String numSemana="";
        int numero;
        
        System.out.println("Dime un numero 1-31:");
        numero=new Scanner(System.in).nextInt();
        
        numSemana = switch (numero) {
            case 1, 2, 3, 4, 5, 6, 7 -> "Primera semana";
            case 8, 9, 10, 11, 12, 13, 14 -> "Segunda semana";
            case 15, 16, 17, 18, 19, 20, 21 -> "Tercera semana";
            case 22, 23, 24, 25, 26, 27, 28 -> "Cuarta semana";
            default -> "Valor incorrecto";
        };
        System.out.println(numSemana);
    }
}
