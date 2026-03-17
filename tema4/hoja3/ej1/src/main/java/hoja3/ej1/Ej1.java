/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja3.ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej1 {

    public static void main(String[] args) {
        boolean correcto = false;
        int dato;
        do {
            System.out.println("Escribe un int");
            try {
                dato = new Scanner(System.in).nextInt();
                correcto=true;
            } catch (InputMismatchException a) {
                System.out.println("Dato incorrecto");
            }
        } while (!correcto);
    }
}
