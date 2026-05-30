/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package examenu2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int valorIni;
        int limite;
        final int INCREMENTO=7;
        
        System.out.println("Dime el valor inicial"); //pedimos los valores
        valorIni= new Scanner(System.in).nextInt();
        System.out.println("Dime el valor limite");
        limite = new Scanner(System.in).nextInt();
        
      /*  valor= valorIni;
        do {
            while(valor%7!=0){ 
                valor++;
            }
            System.out.println(valor); 
            valor+=INCREMENTO;  
            
        } while (valor<=limite); // establece el limite para que deje de repetir al llegar
        */
        for (int i = valorIni; i <= limite; i+=7) {  // incrementamos el valor de la serie en 7 al empezar la vuelta
            while (i%7!=0){ // para el primer valor de la serie, si el num no es divisible entre 7 se suma uno hasta encontrar un multiplo
                i++; 
            }
            System.out.println(i); // escribe el valor actual
            
        }
    }
}
