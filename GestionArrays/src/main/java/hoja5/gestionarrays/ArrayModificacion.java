/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.gestionarrays;

import static hoja5.gestionarrays.ArrayUtil.contarElementos;

/**
 *
 * @author DAM104
 */
public class ArrayModificacion {
    
    public static int[] copiar (int[] array){      // crea un array nuevo que devuelve como copia
        int[] copia= array;      
        return copia;
    }
    
    public static int[] invertir(int[] array){      //inicializa un nuevo array con la longitud del array pasado por parametro
        int[] invertido=new int[contarElementos(array)];   // copia los valores del array original al nuevo
        for (int i = 0; i < contarElementos(array); i++) {
          invertido[contarElementos(array)-i]=array[i];  
        }
        return invertido;
    }
    
    public static int[] concatenar(int[] array1, int[] array2){  // inicializa un array con la longitud de ambos arrays dados
        int elementos= contarElementos(array1)+contarElementos(array2);
        int[] concatenado= new int[elementos];                   // copia primero los valores del array1 y cuando acaba copia los del 2
        for (int i = 0; i < elementos; i++) {
            if (i <= contarElementos(array1)) {
                concatenado[i]=array1[i];
            } else {
                concatenado[i]=array2[i-contarElementos(array1)];
            }
        }
        return concatenado;
    }
}
