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
public class Hipoteca {
    private double capital;
    private double redito; // En porcentaje
    private int tiempo; // En años

    // Constructor
    public Hipoteca(double capital, double redito, int tiempo) {
        this.capital = capital;
        this.redito = redito;
        this.tiempo = tiempo;
    }

    // Método para calcular la cuota
    public double cuota() {
        return (capital * redito * tiempo) / 100;
    }

    // Método para mostrar todos los atributos
    public void mostrarAtributos() {
        System.out.println("CAPITAL: " + capital + " €");
        System.out.println("REDITO: " + redito + " %");
        System.out.println("TIEMPO: " + tiempo + " años");
    }

}
