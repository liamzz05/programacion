/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3actividad5ej2;

/**
 *
 * @author José Franciso Márquez Díaz
 */
public class Principal {
        public static void main(String[] args) {
        // Crear usuario u1
        Usuario u1 = new Usuario("Julio", "Santamaria", "942484848");

        // Probar si u1 es de Cantabria
        System.out.println("¿Es de Cantabria? " + (u1.esDeCantabria() ? "Sí" : "No"));

        // Generar y mostrar email
        String email = u1.generaEmail();
        System.out.println("Email generado: " + email);

        // Contar letra en el apellido
        char letra = 'a';
        int veces = u1.contieneLetra(letra);
        System.out.println("La letra '" + letra + "' aparece " + veces + " veces en el apellido.");

        // Modificar teléfono
        u1.setTelefono("955676767");
        System.out.println("Teléfono modificado: " + u1.getTelefono());

        // Probar si u1 es de Cantabria después de modificar el teléfono
        System.out.println("¿Es de Cantabria ahora? " + (u1.esDeCantabria() ? "Sí" : "No"));
    }
}
