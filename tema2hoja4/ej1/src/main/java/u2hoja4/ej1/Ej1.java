/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja4.ej1;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej1 {

    public static void main(String[] args) {
        
        String diaSemana="";
        int numero;
        
        System.out.println("Dime un numero 1-7:");
        numero=new Scanner(System.in).nextInt();
        
        switch (numero){
            case 1: diaSemana= "Lunes"; break;
            case 2: diaSemana= "Martes"; break;
            case 3: diaSemana= "Miercoles"; break;
            case 4: diaSemana= "Jueves"; break;
            case 5: diaSemana= "Viernes"; break;
            case 6: diaSemana= "Sabado"; break;
            case 7: diaSemana= "Domingo"; break;
            default: diaSemana= "Valor incorrecto"; break;
        }
        System.out.println(diaSemana);
    }
}
