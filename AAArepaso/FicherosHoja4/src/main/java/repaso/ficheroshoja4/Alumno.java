/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.ficheroshoja4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author DAM104
 */
public class Alumno implements Serializable {

    private int matricula;
    private String nombre;
    private int nota1;
    private int nota2;
    private int nota3;

    public Alumno(int matricula, String nombre, int nota1, int nota2, int nota3) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean getNota1() {
        return nota1 >= 5;
    }

    public boolean getNota2() {
        return nota2 >= 5;
    }

    public boolean getNota3() {
        return nota3 >= 5;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "matricula=" + matricula + ", nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }

    public String toStringAprobado() {
        return "Alumno{" + "matricula=" + matricula + ", nombre=" + nombre + ", media=" + this.getMedia();
    }

    public static Alumno leerAlumno(ObjectInputStream os) throws IOException, ClassNotFoundException {
        return (Alumno) os.readObject();
    }
 /*   public static Alumno leerAlumno(File fichero) throws IOException, ClassNotFoundException {
        ObjectInputStream os = null;
        Alumno a = null;
        try {
            os = new ObjectInputStream(new FileInputStream(fichero));
            a = (Alumno) os.readObject();
            System.out.println(a);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (os != null) {
                os.close();
            }
        }
        return a;
    } */
    
}
