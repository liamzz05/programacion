/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3actividad5ej1;

/**
 *
 * @author José Franciso Márquez Díaz
 */
public class Principal {

    public static void main(String[] args) {
        // Definimos los valores de capital y rédito
        double capital = 6000;
        double redito = 3.5;

        // Mostramos información inicial
        System.out.println("CAPITAL: " + capital + " €");
        System.out.println("RÉDITO: " + redito + " %");
        System.out.println();
        System.err.println("TIEMPO\tCUOTA");

        // Generamos la tabla de cuotas para tiempos entre 10 y 20 años
        for (int tiempo = 10; tiempo <= 20; tiempo++) {
            Hipoteca hipoteca = new Hipoteca(capital, redito, tiempo);
            System.out.printf("%d\t%.2f €%n", tiempo, hipoteca.cuota());
        }
    }
}
