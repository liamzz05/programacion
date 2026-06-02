/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package repaso.repasoexamencolecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class RepasoExamenColecciones {

    public static void main(String[] args) {
        boolean salir = false;
        MediaMaraton a = new MediaMaraton();

        do {
            System.out.println("Opciones:\n1.Inscribir persona\n2.Mostrar jueces veteranos\n3.Borrar persona"
                    + "\n4.Generar dorsales\n5.Simular carrera\n6.Mostrar resultados\n7.Salir");
            int opcion = new Scanner(System.in).nextInt();
            
            switch (opcion) {
                case 1 -> {
                    System.out.println("Inserte DNI de la persona");
                    String dni = new Scanner(System.in).nextLine();
                    System.out.println("Inserte nombre de la persona");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Inserte fecha de nacimiento(dd/mm/aaaa)"); // !!
                    String fecha = new Scanner(System.in).nextLine();
                    LocalDate f = LocalDate.parse(fecha);
                    Runner corredor = new Runner(dni, nombre, f);
                    a.añadirCorredor(corredor);
                }
                case 2 -> {
                    a.mostrarVeteranos();
                }
                case 3 -> {
                    System.out.println("DNI de la persona?");
                    String DNI = new Scanner(System.in).nextLine();
                    if (a.borrarCorredor(DNI)) {
                        System.out.println("Borrado con exito");
                    } else {
                        System.out.println("Error al borrar");
                    }
                }
                case 4 -> {
                    Carrera.generarDorsales(a.getCorredores());
                }
                case 5 -> {
                    Carrera.simularCarrera(a.getCorredores());
                }
                case 6 -> {
                    a.mostrarCarrera();
                }
                case 7 -> {
                    salir = true;
                }
            }
        } while (!salir);
    }
}
