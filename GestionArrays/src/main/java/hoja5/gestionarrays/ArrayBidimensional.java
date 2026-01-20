/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.gestionarrays;

import static hoja5.gestionarrays.ArrayEstadisticas.suma;
import static hoja5.gestionarrays.ArrayUtil.contarElementos;
/**
 *
 * @author Guille
 */
public class ArrayBidimensional {
    
    public static int contarElementosMatriz(int[][] matriz){    // por cada fila, cuenta todos los elementos que hay en esa columna y los suma en un valor
        int total=0;
        for (int[] fila : matriz) {
           total+= contarElementos(fila);
        }
        return total;
    }
    
    public static int sumaTotal(int[][] matriz) throws ArrayVacioExcepcion{
        int total=0;                                              // por cada fila del array suma todos los valores en esta al total usando un metodo de la clase arrayEstadistica
        for (int[] fila : matriz) {
            total+=suma(fila);
        }
        return total;
    }
    
    public static int  sumaFila(int[][] matriz, int fila) throws ArrayVacioExcepcion{
        return suma(matriz[fila]);                                // devuelve el resultado de usar el metodo de suma de array unidimensional con la fila que introducimos
    }
    
    public static int sumaColumna(int[][] matriz, int columna){  // recorre cada fila buscando solo el elemento perteneciente a la columna para sumarlo
        int suma=0;
        for (int[] fila : matriz) {
            suma += fila[columna];
        }
        return suma;
    }
}
