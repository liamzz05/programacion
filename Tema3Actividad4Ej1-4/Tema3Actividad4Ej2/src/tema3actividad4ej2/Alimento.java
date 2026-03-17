/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3actividad4ej2;

/**
 *
 * @author José Franciso Márquez Díaz
 */
public class Alimento {
    // Atributos
    private String nombre;
    private int grasas;
    private int hidratos;
    private boolean origenAnimal;

    // Constructor
    public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal) {
        this.nombre = nombre;
        this.grasas = grasas;
        this.hidratos = hidratos;
        this.origenAnimal = origenAnimal;
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public int getGrasas() {
        return grasas;
    }

    public int getHidratos() {
        return hidratos;
    }

    public boolean isOrigenAnimal() {
        return origenAnimal;
    }

    // Método que muestra los atributos
    public void mostrarAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Grasas: " + grasas + " g");
        System.out.println("Hidratos: " + hidratos + " g");
        System.out.println("Origen animal: " + (origenAnimal ? "Sí" : "No"));
    }

    // Método esDietetico
    public boolean esDietetico() {
        return grasas < 12 && !origenAnimal;
    }

    // Método calorías
    public double calorias(int gramos) {
        return gramos * (grasas * 5.3 + hidratos * 2.1);
    }
}
