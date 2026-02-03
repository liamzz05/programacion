/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hojafechas.ej1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas letras?: ");
        int n = sc.nextInt();

        Letra[] letras = new Letra[n];

        // Crear objetos
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- LETRA " + (i+1) + " ---");
            letras[i] = new Letra();
        }

        System.out.println("\n=== LETRAS VENCIDAS ===");
        for (Letra l : letras) {
            if (l.vencida()) {
                l.mostrar();
            }
        }

        System.out.println("\n=== DEMORANDO 15 DÍAS LAS DE DICIEMBRE ===");
        for (Letra l : letras) {
            Calendar f = l.fechaVen;  // usamos su fecha

            if (f.get(Calendar.MONTH) == Calendar.DECEMBER) {
                l.demora(15);
            }
        }

        System.out.println("\n=== TITULAR Y DÍAS QUE FALTAN (NO VENCIDAS) ===");
        for (Letra l : letras) {
            if (!l.vencida()) {
                System.out.println("Titular: " + l.titular +
                                   " | Días faltan: " + l.diasFaltan());
            }
        }
    }
}
