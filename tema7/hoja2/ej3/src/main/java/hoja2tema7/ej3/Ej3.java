/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2tema7.ej3;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej3 {

    public static void main(String[] args) {
        Taller taller = new Taller();
        boolean salir = false;

        do {
            System.out.println("1- Agregar vehiculo\n2- Arreglar vehiculo\n3- Retirar vehiculo"
                    + "\n4- Ver vehiculos sin arreglar\n5- Ver vehiculos arreglados\n6- Ver historial\n7 -Salir");
            int opcion = new Scanner(System.in).nextInt();
            if (opcion >= 1 && opcion <= 7) {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Introduzca el codigo del vehiculo");
                        String codigo = new Scanner(System.in).nextLine();

                        Vehiculo vehiculo = new Vehiculo(codigo);
                        if (taller.insertarVehiculo(vehiculo)) {
                            System.out.println("Vehiculo añadido!");
                        } else {
                            System.out.println("Fallo al añadir el vehiculo");
                        }
                    }
                    case 2 -> {
                        System.out.println("Introduzca el codigo del vehiculo");
                        String codigo = new Scanner(System.in).nextLine();

                        if (taller.arreglarVehiculo(codigo)) {
                            System.out.println("Vehiculo arreglado!");
                        } else {
                            System.out.println("Fallo al arreglar el vehiculo");
                        }
                    }
                    case 3 -> {
                        System.out.println("Introduzca el codigo del vehiculo");
                        String codigo = new Scanner(System.in).nextLine();

                        if (taller.retirarVehiculo(codigo)) {
                            System.out.println("Vehiculo retirado!");
                        } else {
                            System.out.println("Error al retirar el vehiculo");
                        }
                    }
                    case 4 ->
                        System.out.println(taller.verNoArreglados());
                    case 5 ->
                        System.out.println(taller.verArreglados());
                    case 6 ->
                        System.out.println(taller.verRetirados());
                    case 7 ->
                        salir = true;

                }
            } else {
                System.out.println("Opcion no valida");
            }
        } while (!salir);
    }
}
