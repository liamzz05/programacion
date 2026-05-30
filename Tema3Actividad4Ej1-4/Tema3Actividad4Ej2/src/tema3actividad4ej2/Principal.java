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
public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de tipo Alimento
        Alimento manzana = new Alimento("Manzana", 0, 14, false);

        // Mostrar atributos del alimento
        manzana.mostrarAtributos();

        // Comprobar si es dietético
        if (manzana.esDietetico()) {
            System.out.println("El alimento es dietético.");
        } else {
            System.out.println("El alimento no es dietético.");
        }

        // Calcular las calorías para una cantidad específica de gramos
        int gramos = 150; // Ejemplo: 150 gramos
        System.out.println("Las calorías para " + gramos + " gramos son: " + manzana.calorias(gramos) + " kcal.");
    }
}
