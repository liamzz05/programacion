/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja3tema8.ej7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej8 {

    public static void main(String[] args) throws IOException {
        String nombre = "socios.txt";
        String ruta = "D:\\Usuarios\\DAM104\\Downloads\\";
        File file = new File(ruta, nombre);

        if (!file.exists() && !file.isFile()) {
            System.out.println("Archivo no encontrado");
        }

        boolean salir = false;
        List<String> lista = new ArrayList<>();

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        fr = new FileReader(file);
        br = new BufferedReader(fr);
        

        // cargar nombres en el arrayList
        String linea = "";
        while ((linea = br.readLine()) != null) {
            lista.add(linea);
        }

        do {
            System.out.println("Opciones:\n1-Añadir nuevo nombre\n2-Borrar un nombre"
                    + "\n3-Mostrar nombres\n4-Salir");
            int opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Que nombre quieres añadir?");
                    String nuevo = new Scanner(System.in).nextLine();
                    fw = new FileWriter(file,true);
                    bw = new BufferedWriter(fw);
                    lista.add(nuevo);
                    bw.write(nuevo);
                }
                case 2 -> {
                    System.out.println("Que nombre quieres borrar?");
                    String borrar = new Scanner(System.in).nextLine();
                    lista.removeIf(x -> x.equalsIgnoreCase(borrar));
                }
                case 3 -> {
                    for (String nom : lista) {
                        System.out.println(nom);
                    }
                }
                case 4 ->{
                    fw = new FileWriter(file);
                    bw = new BufferedWriter(fw);
                    for (String nombres : lista) {
                        bw.write(nombres);
                        bw.newLine();
                    }
                    
                    bw.close();
                    salir = true;}
                default ->
                    System.out.println("Opcion no valida");
            }
        } while (!salir);

    }
}
