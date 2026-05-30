/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja3tema7.ej5;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej5 {

    public static void main(String[] args) {
        boolean salir = false;
        Carrera carrera = new Carrera();
        carrera.insertarAtleta(new Atleta(1, "maripili", 30));
        carrera.insertarAtleta(new Atleta(2, "ayuso", 10));
        carrera.insertarAtleta(new Atleta(3, "fiona", 20));
        
        do {
            System.out.println("1-Añadir atleta\n2-Tiempo medio\n3-Dar la vuelta\n4-Ver lista\n5-Salir");
            int opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 ->
                    carrera.insertarAtleta(new Atleta(4, "Hola", 20.0));
                case 2 ->
                    System.out.println("tiempo medio: " + carrera.tiempoMedio());
                case 3 ->
                    carrera.darVuelta();
                case 4 ->
                    System.out.println(carrera.toString());
                case 5 ->
                    salir = true;
            }
        } while (!salir);
    }
}
