/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2tema7.ej1;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej1 {

    public static void main(String[] args) {
        boolean salir = false;
        Academia academia = new Academia();

        do {
            System.out.println("1.Añadir un nuevo curso al final de la lista\n2.Insertar un nuevo curso en cualquier posicion\n"
                    + "3.Borrar un curso dado su codigo\n4.Modificar el num de horas de un curso dado su codigo\n"
                    + "5.Mostrar todos los cursos\n6.Salir");
            int opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> {
                    Curso curso = new Curso();
                    academia.annadirCursoFinal(curso);
                }
                case 2 -> {
                    Curso curso = new Curso();
                    System.out.println("En que posicion quieres añadirlo?");
                    int pos = new Scanner(System.in).nextInt();
                    academia.annadirCurso(curso, pos);
                }
                case 3 -> {
                    int codigo = new Scanner(System.in).nextInt();
                    academia.borrarCurso(codigo);
                }
                case 4 -> {
                    System.out.println("Cual es el codigo del curso?");
                    int codigo = new Scanner(System.in).nextInt();
                    System.out.println("Cuantas horas tiene?");
                    int horas = new Scanner(System.in).nextInt();
                    academia.modificarHoras(academia.getCursoCodigo(codigo), horas); // curso x codigo
                }
                case 5 ->
                    academia.mostrarCursos();
                case 6 ->
                    salir = true;
            }
        } while (!salir);
    }
}
