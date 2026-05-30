/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja5tema7.actextra;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class ActExtra {

    public static void main(String[] args) {
        boolean salir = false;
        Bestiario bestiario = new Bestiario();

        do {
            int opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduzca el nombre de la criatura");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Introduzca el tipo de la criatura");
                    String tipo=new Scanner(System.in).nextLine();
                    System.out.println("Introduzca el nivel de la criatura");
                    int nivel = new Scanner(System.in).nextInt();
                    Criatura criatura = new Criatura(nombre, nivel);
                    bestiario.agregarCriatura(criatura);
                }
                case 4 ->
                    salir = true;
            }
        } while (!salir);
    }
}
