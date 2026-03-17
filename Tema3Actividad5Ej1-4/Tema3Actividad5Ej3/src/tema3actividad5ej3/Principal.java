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
public class Principal {
    public static void main(String[] args) {
        // Usar el constructor sin argumentos
        System.out.println("Creando un rectángulo mediante el constructor sin argumentos...");
        Rectangulo rect1 = new Rectangulo();
        System.out.println("Es alargado: " + rect1.esAlargado());
        System.out.println("Dibujo del rectángulo:");
        rect1.dibuja();

        System.out.println();

        // Usar el constructor con valores iniciales
        System.out.println("Creando un rectángulo mediante el constructor con argumentos...");
        Rectangulo rect2 = new Rectangulo(5, 3);
        System.out.println("Largo: " + rect2.getLargo());
        System.out.println("Ancho: " + rect2.getAncho());
        System.out.println("Es alargado: " + rect2.esAlargado());
        System.out.println("Dibujo del rectángulo:");
        rect2.dibuja();
    }
}
