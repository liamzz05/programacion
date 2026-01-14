/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.gestionarrays;

/**
 *
 * @author DAM104
 */
public class ArrayUtil {
    
    public static int contarElementos(int [] array){
        int numero=0;
        for (int num : array) {
            numero++;
        }
        return numero;
    }
    
    public static boolean estaVacio(int [] array){
        return contarElementos(array)==0; //q no sea nulo
    }
    
    public static int PrimerElemento(int [] array){
        if (contarElementos(array)==0) {
            
        }
        return array[0];
    }
}
