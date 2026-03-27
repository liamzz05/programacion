/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.gestion8m;

/**
 *
 * @author Guille
 */
public class Escultura extends Obra {
    private String material;
    public Escultura(String titulo, String autor, String genero, double precio, String material) {
        super(titulo, autor, genero, precio);
        this.material = material;
    }
}
