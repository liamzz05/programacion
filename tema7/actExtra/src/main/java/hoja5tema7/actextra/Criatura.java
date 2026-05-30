/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5tema7.actextra;

/**
 *
 * @author DAM104
 */
public class Criatura {
    private String nombre;
    private TipoCriatura tipo;
    private int nivel;

    public Criatura(String nombre, TipoCriatura tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Criatura{" + "nombre=" + nombre + ", tipo=" + tipo + ", nivel=" + nivel + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }
    
}
