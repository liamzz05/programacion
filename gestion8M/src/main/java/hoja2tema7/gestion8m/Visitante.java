/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.gestion8m;

/**
 *
 * @author Guille
 */
public class Visitante {
    private int edad;
    private String genero;
    private String provincia;
    public Visitante(int edad, String genero, String provincia) {
        this.edad = edad;
        this.genero = genero;
        this.provincia = provincia;
    }
    public String getGenero() { return genero; }
}
