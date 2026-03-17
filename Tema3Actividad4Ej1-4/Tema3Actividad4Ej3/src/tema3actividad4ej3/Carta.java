/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3actividad4ej3;

/**
 *
 * @author José Franciso Márquez Díaz
 */
import java.util.Random;

public class Carta {
    // Atributos
    private int numero; // del 1 al 10
    private String palo; // oros, copas, espadas, bastos

    // Constructor sin parámetros
    public Carta() {
        Random random = new Random();
        this.numero = random.nextInt(10) + 1; // Número aleatorio entre 1 y 10
        int paloAleatorio = random.nextInt(4); // Índice aleatorio para el palo

        switch (paloAleatorio) {
            case 0 -> this.palo = "oros";
            case 1 -> this.palo = "copas";
            case 2 -> this.palo = "espadas";
            case 3 -> this.palo = "bastos";
        }
    }

    // Método mostrar
    public void mostrar() {
        System.out.println(this.numero + " de " + this.palo);
    }

    // Métodos selectores (getters)
    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    // Métodos modificadores (setters) (opcional si se desea establecer atributos manualmente)
    public void setNumero(int numero) {
        if (numero >= 1 && numero <= 10) {
            this.numero = numero;
        } else {
            System.out.println("Número inválido. Debe estar entre 1 y 10.");
        }
    }

    public void setPalo(String palo) {
        if (palo.equals("oros") || palo.equals("copas") || palo.equals("espadas") || palo.equals("bastos")) {
            this.palo = palo;
        } else {
            System.out.println("Palo inválido. Debe ser oros, copas, espadas o bastos.");
        }
    }
}
