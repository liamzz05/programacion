/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejcodigoperdido;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author DAM104
 */
public class EjCodigoPerdido {

    public static void main(String[] args) {
        System.out.print("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("He elegido un número entre 1 y 100. ¡Intenta adivinarlo!");

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int numeroIntentos = 0;
        int intento = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            numeroIntentos++;
            System.out.println("Introduce tu intento:");
            intento = scanner.nextInt();
            
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            }
            if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            }
            
        } while (intento != numeroSecreto);
        
        scanner.close();
        System.out.println("¡Felicidades! Has adivinado el número " + 
                numeroSecreto + " en " + numeroIntentos + " intentos.");
    }
}
