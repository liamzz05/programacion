/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package repaso.ficheros1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM104
 */
public class Ficheros1 {

    public static void main(String[] args) {
        System.out.println("Pon el nombre del fichero");
        String nombre = new Scanner(System.in).nextLine();

        File file = new File("D:\\Usuarios\\DAM104\\Downloads", nombre);
        if (!file.exists()) {
            System.out.println("Error, archivo no encontrado");
        }

        // contar vocales
        FileInputStream lector = null;

        try {
            lector = new FileInputStream(file);
            int contadorVocales = 0;
            char byteLeido = 0;
            while (byteLeido != -1) {
                if (byteLeido == 'a' || byteLeido == 'e' || byteLeido== 'i'
                       || byteLeido == 'o' || byteLeido == 'u') {
                    contadorVocales++;
                }
            }
            System.out.println("Numero vocales: "+contadorVocales);
            
        } catch (IOException ex) {

        }

    }
}
