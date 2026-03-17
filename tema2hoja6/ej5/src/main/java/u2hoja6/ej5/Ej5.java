/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja6.ej5;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej5 {

    public static void main(String[] args) {
        double dinero=0;
        int donativos=0;
        do {
            System.out.println("Introduce un donativo");
            double donativo= new Scanner(System.in).nextDouble();
            dinero += donativo;
            donativos++;
        } while (dinero<=600);
        System.out.println("Donativos alcanzados\nDinero recaudado: "+dinero+
                "Numero de donativos: "+donativos);
    }
}
