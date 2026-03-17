/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3actividad4ej1;

import java.util.Scanner;

/**
 *
 * @author José Franciso Márquez Díaz
 */
public class Alarma {
    // Atributos
    private double temperatura;
    private boolean timbre;

    // Constructor con argumentos
    public Alarma(double temperatura) {
        this.temperatura = temperatura;
        this.timbre = false; // Timbre apagado
    }

    // Constructor sin argumentos
    public Alarma() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la temperatura inicial: ");
        this.temperatura = teclado.nextDouble();
        this.timbre = false; // Timbre apagado
    }

    // Getter para timbre
    public boolean isTimbreEncendido() {
        return this.timbre;
    }
    
    // Método comprueba
    public void comprueba() {
        if (this.temperatura > 35 || this.temperatura < 10) {
            this.timbre = true; // Timbre encendido
        }
    }

    // Método normaliza
    public void normaliza() {
        this.temperatura = 25; // Temperatura normalizada
        this.timbre = false;   // Timbre apagado
    }

    // Método para mostrar el estado actual (opcional para depuración)
    public void mostrarEstado() {
        System.out.println("Temperatura: " + this.temperatura);
        System.out.println("Timbre: " + (this.timbre ? "Encendido" : "Apagado"));
    }
}
