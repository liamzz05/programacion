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

public class Fraccion {
    // Atributos
    private int numerador;
    private int denominador;

    // Constructor sin parámetros (fracción por defecto 0/1)
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    // Constructor con parámetros
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            System.out.println("El denominador no puede ser 0.");
            // throw new IllegalArgumentException("El denominador no puede ser 0.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Método para sumar fracciones
    public Fraccion sumar(Fraccion otra) {
        int nuevoNumerador = (this.numerador * otra.denominador) + (otra.numerador * this.denominador);
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    // Método para restar fracciones
    public Fraccion restar(Fraccion otra) {
        int nuevoNumerador = (this.numerador * otra.denominador) - (otra.numerador * this.denominador);
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    // Método para multiplicar fracciones
    public Fraccion multiplicar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    // Método para dividir fracciones
    public Fraccion dividir(Fraccion otra) {
        if (otra.numerador == 0) {
            System.out.println("No se puede dividir por una fracción con numerador 0.");
            //throw new IllegalArgumentException("No se puede dividir por una fracción con numerador 0.");
        }
        int nuevoNumerador = this.numerador * otra.denominador;
        int nuevoDenominador = this.denominador * otra.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    // Método para mostrar la fracción
    public void mostrar() {
        System.out.println(this.numerador + " / " + this.denominador);
    }

    // Métodos get
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
}
