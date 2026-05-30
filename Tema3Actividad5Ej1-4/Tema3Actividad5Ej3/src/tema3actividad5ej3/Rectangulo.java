/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3actividad5ej3;

/**
 *
 * @author José Franciso Márquez Díaz
 */
import java.util.Scanner;

public class Rectangulo {
    private int largo;
    private int ancho;

    // Constructor sin argumentos: pide largo y ancho por teclado
    public Rectangulo() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el largo del rectángulo: ");
        this.largo = teclado.nextInt();

        System.out.print("Introduce el ancho del rectángulo: ");
        this.ancho = teclado.nextInt();
    }

    // Constructor con argumentos: inicializa largo y ancho
    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Método esAlargado: verifica si el largo es al menos el doble que el ancho
    public boolean esAlargado() {
        return largo >= 2 * ancho;
    }

    // Método dibuja: dibuja el rectángulo con asteriscos
    public void dibuja() {
        for (int i = 0; i < ancho; i++) { // Cada fila representa el ancho
            for (int j = 0; j < largo; j++) { // Cada columna representa el largo
                System.out.print("* ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }

    // Métodos getter para obtener información de los atributos
    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    // Métodos setter para modificar información de los atributos
    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
}
