/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja4.ej3;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej3 {

    public static void main(String[] args) {
        
        System.out.println("----Elige una opcion---\n1.Cuadrado\n2.Doble\n3.Raiz cuadrada");
        int numero=new Scanner(System.in).nextInt();
        System.out.println("Que numero?");
        int resultado=new Scanner(System.in).nextInt();
        
        switch(numero){
            case 1: resultado=resultado*resultado; break;
            case 2: resultado=resultado*2; break;
            case 3: resultado=(int) Math.sqrt(resultado); break;
        }
        System.out.println("El resultado es "+resultado);
    }
}
