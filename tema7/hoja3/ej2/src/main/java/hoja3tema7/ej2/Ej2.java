/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja3tema7.ej2;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej2 {

    public static void main(String[] args) {
        boolean salir = false;
        Almacen almacen = new Almacen();
        do {
            System.out.println("1. Añadir articulo\n2. Buscar articulo\n3. Ver almacen\n4. Salir");
            int opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    Articulo a = new Articulo();
                    almacen.insertar(a);
                }
                case 2 -> {
                    System.out.println("Codigo del articulo?");
                    int codigo = new Scanner(System.in).nextInt();
                    System.out.println(almacen.buscar(codigo).toString());
                }
                case 3 -> {
                    System.out.println(almacen.toString());
                }
                case 4 ->
                    salir = true;
            }
        } while (!salir);
    }
}
