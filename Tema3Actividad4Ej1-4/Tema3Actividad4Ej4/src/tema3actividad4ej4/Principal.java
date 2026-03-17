/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3actividad4ej4;

/**
 *
 * @author José Franciso Márquez Díaz
 */
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir fracción 1
        System.out.print("Introduce el numerador de la primera fracción: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduce el denominador de la primera fracción: ");
        int den1 = teclado.nextInt();

        // Pedir fracción 2
        System.out.print("Introduce el numerador de la segunda fracción: ");
        int num2 = teclado.nextInt();
        System.out.print("Introduce el denominador de la segunda fracción: ");
        int den2 = teclado.nextInt();

        // Crear los objetos Fracción
        Fraccion fraccion1 = new Fraccion(num1, den1);
        Fraccion fraccion2 = new Fraccion(num2, den2);

        // Mostrar el menú de operaciones
        int opcion;
        do {
            System.out.println("\nMenú de operaciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    // Sumar
                    Fraccion suma = fraccion1.sumar(fraccion2);
                    System.out.print("Resultado de la suma: ");
                    suma.mostrar();
                    break;
                case 2:
                    // Restar
                    Fraccion resta = fraccion1.restar(fraccion2);
                    System.out.print("Resultado de la resta: ");
                    resta.mostrar();
                    break;
                case 3:
                    // Multiplicar
                    Fraccion multiplicacion = fraccion1.multiplicar(fraccion2);
                    System.out.print("Resultado de la multiplicación: ");
                    multiplicacion.mostrar();
                    break;
                case 4:
                    // Dividir
                    try {
                        Fraccion division = fraccion1.dividir(fraccion2);
                        System.out.print("Resultado de la división: ");
                        division.mostrar();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        teclado.close();
    }
}
