/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.gestion8m;

/**
 *
 * @author Guille
 */
public class Libro extends Obra {
    private String editorial;
    public Libro(String titulo, String autor, String genero, double precio, String editorial) {
        super(titulo, autor, genero, precio);
        this.editorial = editorial;
    }
}
