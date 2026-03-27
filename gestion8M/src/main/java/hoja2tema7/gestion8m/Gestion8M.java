/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2tema7.gestion8m;

import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class Gestion8M {

    public static void main(String[] args) {
        GestorEmpleados ge = new GestorEmpleados();
        GestorObras go = new GestorObras();
        GestorVisitantes gv = new GestorVisitantes();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== GESTIÓN MUSEO ===");
            System.out.println("1. Gestionar empleados");
            System.out.println("2. Gestionar obras");
            System.out.println("3. Gestionar visitantes");
            System.out.println("4. Estadísticas");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Aquí podrías implementar submenús para empleados
                    break;
                case 4:
                    System.out.println("Ratio Empleados: " + ge.ratioEmpleado());
                    System.out.println("Brecha Salarial: " + ge.brechaSalarial());
                    System.out.println("Ratio Obras: " + go.ratioObras());
                    System.out.println("Ratio Visitantes: " + gv.ratioVisitantes());
                    break;
            }
        } while (opcion != 0);
    }
}
