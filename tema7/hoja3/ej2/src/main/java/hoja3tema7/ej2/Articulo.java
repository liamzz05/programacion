/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3tema7.ej2;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class Articulo {

    private int codigo;
    private String descripcion;
    private int existencias;

    public Articulo() {
        System.out.println("Introduce el codigo del articulo");
        this.codigo = new Scanner(System.in).nextInt();
        System.out.println("Introduce la descripcion");
        this.descripcion = new Scanner(System.in).nextLine();
        System.out.println("Introduce las existencias");
        this.existencias = new Scanner(System.in).nextInt();
    }

    public Articulo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", existencias=" + existencias + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articulo other = (Articulo) obj;
        return this.codigo == other.codigo;
    }
    
}
