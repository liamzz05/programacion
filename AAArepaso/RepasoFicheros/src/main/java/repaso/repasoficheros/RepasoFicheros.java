/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package repaso.repasoficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAM104
 */
public class RepasoFicheros {

    public static void main(String[] args) {

        File file = new File("D:\\Usuarios\\DAM104\\Downloads\\datos", "datos15.txt");
        File fileSalida = new File("D:\\Usuarios\\DAM104\\Downloads\\datos", "salida.txt");

        if (!file.exists() && !file.isFile()) {
            System.out.println("Error, no encuentra archivo");
        }

        FileInputStream lector = null;
        FileOutputStream escritor = null;

        try {
            if (!fileSalida.exists()) {
                fileSalida.createNewFile();
                System.out.println("Archivo creado");
            }

            lector = new FileInputStream(file);
            escritor = new FileOutputStream(fileSalida);

            int desplazamiento = 15;
            int byteLeido;
            while ((byteLeido = lector.read()) != -1) {
                int byteCifrado = (byteLeido - desplazamiento) % 256;
                escritor.write(byteCifrado);
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
