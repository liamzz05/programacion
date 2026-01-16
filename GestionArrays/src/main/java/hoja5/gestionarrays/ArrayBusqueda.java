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
public class ArrayBusqueda {

    public static boolean contiene(int[] array, int valor) {
        boolean contiene = false;
        for (int a : array) {   // recorre el array con un bucle, si encuentra el valor buscado devuelve positivo
            if (a == valor) {
                contiene = true;
            }
        }
        return contiene;
    }

    public static int indiceDe(int[] array, int valor) {   // devuelve el indice del valor, si no lo encuentra devuelve -1
        int indice = -1;
        boolean salir = false;
        for (int i = 0; i < contarElementos(array) && salir == false; i++) {
            if (array[i] == valor) {
                indice = i;
                salir = true;
            }
        }
        return indice;
    }

    public static int ultimoIndiceDe(int[] array, int valor) {   // devuelve el ultimo indice donde se encuentra el valor, si no lo encuentra devuelve -1
        int indice = -1;
        for (int i = 0; i < contarElementos(array); i++) {
            if (array[i] == valor) {
                indice = i;
            }
        }
        return indice;
    }
}
