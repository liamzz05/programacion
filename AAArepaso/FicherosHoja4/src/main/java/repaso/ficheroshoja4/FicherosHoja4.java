/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package repaso.ficheroshoja4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM104
 */
public class FicherosHoja4 {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Promocionado> pasan = new ArrayList<>();

        File archivo = new File("D:\\Usuarios\\DAM104\\Downloads", "Alumnos.dat");
        File promocionan = new File("D:\\Usuarios\\DAM104\\Downloads", "Promocionan.dat");
        try {
            promocionan.createNewFile();
            Alumno leido;
            // leer alumno y comprobar si promociona
            while ((leido = Alumno.leerAlumno(archivo)) != null) {
                alumnos.add(leido);
                if (leido.getNota1() && leido.getNota2() && leido.getNota3()) {
                    pasan.add(new Promocionado(leido.getMatricula(),leido.getNombre(),leido.getMedia()));
                }
            }
            // escribir lista promocionados en nuevo archivo
            for(Promocionado alumno : pasan){ 
                Promocionado.escribirAlumno(alumno, promocionan);
            }
            
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FicherosHoja4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
