/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.ej1;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Curso {
    private int codigo;
    private String descripcion;
    private int nHoras;

    public Curso(int codigo, String descripcion, int nHoras) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nHoras = nHoras;
    }

    public Curso() {
        System.out.println("Introduce el codigo del curso: ");
        this.codigo=new Scanner(System.in).nextInt();
        System.out.println("Introduce la descripcion: ");
        this.descripcion=new Scanner(System.in).nextLine();
        System.out.println("Introduce el numero de horas: ");
        this.nHoras=new Scanner(System.in).nextInt();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }
    
    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", nHoras=" + nHoras + '}';
    }
    
}
