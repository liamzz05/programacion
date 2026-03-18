/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3tema7.ej6;

/**
 *
 * @author DAM104
 */
public class Disco extends Publicacion {
    private int duracionMinutos;

    public Disco(int duracionMinutos, String titulo, String autor, int dia, int mes, int año) {
        super(titulo, autor, dia, mes, año);
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Disco{" + "duracionMinutos=" + duracionMinutos + '}';
    }
    
}
