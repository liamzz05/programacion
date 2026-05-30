/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ej1;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Array {

    private int array[][] = new int[3][3];

    public Array() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Valor de " + (i+1) + "|" + (j+1));
                array[i][j] = new Scanner(System.in).nextInt();
            }
        }
    }

    public void mostrarFila() {
        System.out.println("Que fila quieres mostrar?");
        int fila = new Scanner(System.in).nextInt();
        for (int i = 0; i < array[fila].length; i++) {
            System.out.print(array[fila-1][i] + " ");
        }
    }

    public void mostrarColumna() {
        System.out.println("Que columna quieres mostrar?");
        int columna = new Scanner(System.in).nextInt();
        for (int i = 0; i < 10; i++) {
            
        }
    }
    
    
}
