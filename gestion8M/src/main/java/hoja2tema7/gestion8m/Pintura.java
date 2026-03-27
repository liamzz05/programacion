/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.gestion8m;

/**
 *
 * @author Guille
 */

public class Pintura extends Obra {
    private String tipoPintura;
    public Pintura(String titulo, String autor, String genero, double precio, String tipoPintura) {
        super(titulo, autor, genero, precio);
        this.tipoPintura = tipoPintura;
    }
}

