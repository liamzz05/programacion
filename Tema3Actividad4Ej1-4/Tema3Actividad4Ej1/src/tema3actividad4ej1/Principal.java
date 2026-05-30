/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3actividad4ej1;

/**
 *
 * @author José Franciso Márquez Díaz
 */
public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de tipo Alarma con argumentos
        Alarma alarma1 = new Alarma(40); // Temperatura inicial de 40
        alarma1.comprueba();
        if (alarma1.isTimbreEncendido()) {
            System.out.println("Alarma 1: El timbre está encendido. Normalizando...");
            alarma1.normaliza();
        }
        alarma1.mostrarEstado();

        // Crear un objeto de tipo Alarma sin argumentos
        Alarma alarma2 = new Alarma(); // Pedirá la temperatura por teclado
        alarma2.comprueba();
        if (alarma2.isTimbreEncendido()) {
            System.out.println("Alarma 2: El timbre está encendido. Normalizando...");
            alarma2.normaliza();
        }
        alarma2.mostrarEstado();
    }
}
