/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package repaso.ficheroshoja4;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author DAM104
 */
public class FicherosHoja4 {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Promocionado> pasan = new ArrayList<>();

        File archivo = new File("C:\\Users\\lidia\\Downloads", "Alumnos.dat");

        File promocionan = new File("C:\\Users\\lidia\\Downloads", "Promocionan.dat");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {

            while (true) {
                try {
                    Alumno leido = Alumno.leerAlumno(ois);
                    alumnos.add(leido);
                    System.out.println("Leído: " + leido);

                    if (leido.getNota1() && leido.getNota2() && leido.getNota3()) {
                        pasan.add(new Promocionado(leido.getMatricula(), leido.getNombre(), leido.getMedia()));
                    }
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error al leer Alumnos.dat: " + ex.getMessage());
        }

        if (!pasan.isEmpty()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(promocionan))) {

                for (Promocionado alumno : pasan) {
                    Promocionado.escribirAlumno(alumno, oos);
                }
                System.out.println("¡Listo! Se han guardado " + pasan.size() + " alumnos en Promocionan.dat");

            } catch (IOException ex) {
                System.out.println("Error al escribir en Promocionan.dat: " + ex.getMessage());
            }
        } else {
            System.out.println("Ningún alumno cumple las condiciones para promocionar.");
        }
    }

}
