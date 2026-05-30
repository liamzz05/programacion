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
        estaVacio(array);
        int numero=0;
        for (int num : array) {
            numero++;
        }
        return numero;
    }
    
    public static boolean estaVacio(int [] array){
        return array == null && contarElementos(array) == 0; //devuelve positivo si el array es nulo y no tiene elementos ni espacios
    }
    
    public static int PrimerElemento(int [] array) throws ArrayVacioExcepcion{
        if (estaVacio(array)) {
            throw new ArrayVacioExcepcion("El array esta vacio");
        }
        return array[0]; // si el array no esta vacio devuelve el primer valor
    }
    
    public static int UltimoElemento(int [] array) throws ArrayVacioExcepcion{
        if (estaVacio(array)) {
            throw new ArrayVacioExcepcion("El array esta vacio");
        }
        return array[contarElementos(array)]; // si el array no esta vacio devuelve el ultimo numero usando el metodo de contar los elementos
    }
    
    
}
