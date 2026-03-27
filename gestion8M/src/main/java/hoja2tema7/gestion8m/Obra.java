/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.gestion8m;

/**
 *
 * @author Guille
 */
public class Obra implements Comparable<Obra> {
    protected String titulo;
    protected String autor;
    protected String genero;
    protected double precio;
    public Obra(String titulo, String autor, String genero, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
    }
    @Override
    public int compareTo(Obra o) {
        return this.titulo.compareToIgnoreCase(o.titulo);
    }
}

