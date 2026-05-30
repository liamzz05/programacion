/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja3tema8.ej6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Ej6 {

    public static void main(String[] args) throws IOException {
        System.out.println("Nombre fichero 1:");
        String file1 = new Scanner(System.in).nextLine();
        System.out.println("Nombre fichero 2:");
        String file2 = new Scanner(System.in).nextLine();
        System.out.println("Nombre fichero 3:");
        String file3 = new Scanner(System.in).nextLine();
        
        File archivo1=new File(file1);
        File archivo2=new File(file2);
        File archivoDestino=new File(file3);
        
        if(!archivo1.exists() && !archivo1.isFile()){
            System.out.println("error con el archivo 1 (no encuentra)");
        }
        if(!archivo2.exists() && !archivo2.isFile()){
            System.out.println("error con el archivo 2 (no encuentra)");
        }
        if(archivoDestino.exists()){
            System.out.println("error con el archivo 3 (ya existe)");
        } else{
            archivoDestino.createNewFile();
        }
        
        FileReader lector1 = null;
        BufferedReader br1 =null;
        FileReader lector2 = null;
        BufferedReader br2 =null;
        FileWriter escritor = null;
        BufferedWriter bw = null;
        String linea;
        
        try{
            
            while((linea = br1.readLine()) != null){
                
            }
            
        } catch(IOException a){
            System.out.println(a.getMessage());
        } finally {
            if (lector1 != null) {
                lector1.close();
            }
            if (lector2 != null) {
                lector2.close();
            }
            if (escritor != null) {
                escritor.close();
            }
        }
    }
}
