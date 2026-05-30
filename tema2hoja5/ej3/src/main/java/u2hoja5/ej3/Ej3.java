/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package u2hoja5.ej3;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej3 {

    public static void main(String[] args) {
        int contador=1;
        int positivos=0;
        int nulos=0;
        int negativos=0;
        
        while(contador<11){
            System.out.println("Dime el numero "+contador);
            int numero=new Scanner(System.in).nextInt();
            contador++;
            
            if (numero>0) {
                positivos++;
            }else{
                if (numero<0) {
                    negativos++;
                }else{
                    nulos++;
                }
            }
        }
        System.out.println("Positivos: "+positivos);
        System.out.println("Negativos: "+negativos);
        System.out.println("Nulos: "+nulos);
    }
}
