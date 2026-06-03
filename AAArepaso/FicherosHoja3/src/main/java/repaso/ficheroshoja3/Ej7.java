/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package repaso.ficheroshoja3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DAM104
 */
public class Ej7 {

    public static void main(String[] args) {

        File file = new File("D:\\Usuarios\\DAM104\\Downloads", "PoemaE.txt");

        if (file.exists()) {

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String linea;
                int numLinea = 1;

                while ((linea = br.readLine()) != null) {
                    for (int i = 0; i < linea.length(); i++) {
                        char c = linea.charAt(i);
                        System.out.print((char) (c - numLinea));
                    }
                    System.out.println();
                    numLinea++;
                }

            } catch (IOException a) {
                System.out.println("Error" + a.getMessage());
            }

        } else {
            System.out.println("No se encuentra el archivo");
        }
    }
}
