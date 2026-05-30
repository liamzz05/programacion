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
public class Principal {
    public static void main(String[] args) {
        // Crear 6 objetos de tipo Carta
        Carta carta1 = new Carta();
        Carta carta2 = new Carta();
        Carta carta3 = new Carta();
        Carta carta4 = new Carta();
        Carta carta5 = new Carta();
        Carta carta6 = new Carta();

        // Mostrar las cartas generadas
        System.out.println("Cartas generadas:");
        System.out.print("Carta 1: ");
        carta1.mostrar();
        System.out.print("Carta 2: ");
        carta2.mostrar();
        System.out.print("Carta 3: ");
        carta3.mostrar();
        System.out.print("Carta 4: ");
        carta4.mostrar();
        System.out.print("Carta 5: ");
        carta5.mostrar();
        System.out.print("Carta 6: ");
        carta6.mostrar();

        // Determinar la carta ganadora
        Carta ganadora = carta1; // Suponer que carta1 es la inicial ganadora
        if (carta2.getNumero() > ganadora.getNumero()) ganadora = carta2;
        if (carta3.getNumero() > ganadora.getNumero()) ganadora = carta3;
        if (carta4.getNumero() > ganadora.getNumero()) ganadora = carta4;
        if (carta5.getNumero() > ganadora.getNumero()) ganadora = carta5;
        if (carta6.getNumero() > ganadora.getNumero()) ganadora = carta6;

        // Mostrar la carta ganadora
        System.out.print("\nLa carta ganadora es: ");
        ganadora.mostrar();
    }
}
