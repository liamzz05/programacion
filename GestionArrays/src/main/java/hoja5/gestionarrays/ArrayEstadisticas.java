/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.gestionarrays;

import static hoja5.gestionarrays.ArrayUtil.contarElementos;
import static hoja5.gestionarrays.ArrayUtil.estaVacio;

/**
 *
 * @author DAM104
 */
public class ArrayEstadisticas {

    public static int suma(int[] array) throws ArrayVacioExcepcion {
        int suma = 0;
        if (estaVacio(array)) {
            throw new ArrayVacioExcepcion("El array esta vacio");
        }
        for (int a : array) {
            suma += a;
        }
        return suma;
    }

    public static double media(int[] array) throws ArrayVacioExcepcion {
        int suma = 0;
        if (estaVacio(array)) {
            throw new ArrayVacioExcepcion("El array esta vacio");
        }
        for (int a : array) {
            suma += a;
        }
        return suma / (contarElementos(array));
    }

    public static int maximo(int[] array) throws ArrayVacioExcepcion { // devuelve el numero mas alto comparandolos, empieza con el valor minimo de un int
        int maximo = -2147483648;
        if (estaVacio(array)) {
            throw new ArrayVacioExcepcion("El array esta vacio");
        }
        for (int a : array) {
            if (a > maximo) {
                maximo = a;
            }
        }
        return maximo;
    }

    public static int minimo(int[] array) throws ArrayVacioExcepcion { // devuelve el numero mas alto comparandolos, empieza con el valor maximo de un int
        int minimo = 2147483647;
        if (estaVacio(array)) {
            throw new ArrayVacioExcepcion("El array esta vacio");
        }
        for (int a : array) {
            if (a < minimo) {
                minimo = a;
            }
        }
        return minimo;
    }
    
}
