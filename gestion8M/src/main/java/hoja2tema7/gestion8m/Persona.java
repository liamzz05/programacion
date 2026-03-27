/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.gestion8m;

/**
 *
 * @author Guille
 */
public class Persona {
    protected String nombre;
    protected String apellidos;
    protected String genero;

    public Persona(String nombre, String apellidos, String genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
    }

    public String getGenero() { return genero; }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + genero + ")";
    }
}


