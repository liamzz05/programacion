/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2tema8.ej1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej4 {

    public static void main(String[] args) {
        System.out.println("Introduce el nombre del archivo a copiar");
        String nombre1 = new Scanner(System.in).nextLine();
        File archivo1 = new File(nombre1);
        if (!archivo1.exists() || !archivo1.isFile()) {
            System.out.println("Error, archivo no encontrado");
            return;
        }
        System.out.println("Introduce el nombre del archivo donde copiar");
        String nombre2 = new Scanner(System.in).nextLine();
        File archivo2 = new File(nombre2);

        try {
            if (!archivo2.exists()) {
                archivo2.createNewFile();
                System.out.println("Archivo " + nombre2 + " creado");
            }
        } catch (IOException a) {
            System.out.println("Error al crear el archivo");
        }

        FileInputStream lector = null;
        FileOutputStream escritor = null;
        try {
            lector = new FileInputStream(archivo1);
            escritor = new FileOutputStream(archivo2, true);
            
            int byteLeido;
            while ((byteLeido = lector.read()) != -1) {
                escritor.write(byteLeido); 
                System.out.print((char) byteLeido);                 
            }
        } catch (IOException a) {
            System.out.println("Error copiando");
        }finally {
            if (lector != null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
            if (escritor != null) {
                try {
                    escritor.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
    }
}
