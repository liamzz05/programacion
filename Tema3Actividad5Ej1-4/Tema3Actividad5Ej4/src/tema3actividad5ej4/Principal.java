/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3actividad5ej4;

/**
 *
 * @author José Franciso Márquez Díaz
 */
public class Principal {
    public static void main(String[] args) {
        // Crear un reloj con el constructor sin argumentos
        Reloj reloj1 = new Reloj();
        System.out.println("Reloj inicial: " + reloj1.mostrar24());
        System.out.println("Hora válida: " + reloj1.horaValida());

        // Incrementar la hora
        System.out.println("Incrementando un segundo...");
        reloj1.horaMas();
        System.out.println("Hora en formato 24 horas: " + reloj1.mostrar24());
        System.out.println("Hora en formato 12 horas: " + reloj1.mostrar12());

        // Crear un reloj con valores específicos
        Reloj reloj2 = new Reloj(23, 59, 59);
        System.out.println("\nReloj inicial: " + reloj2.mostrar24());
        System.out.println("Hora válida: " + reloj2.horaValida());

        // Incrementar un segundo y verificar el cambio de día
        reloj2.horaMas();
        System.out.println("Después de incrementar un segundo: " + reloj2.mostrar24());

        // Decrementar un segundo
        reloj2.horaMenos();
        System.out.println("Después de decrementar un segundo: " + reloj2.mostrar24());
    }
}
