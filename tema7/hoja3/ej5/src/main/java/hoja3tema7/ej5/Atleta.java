/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3tema7.ej5;

/**
 *
 * @author DAM104
 */
public class Atleta {
    private int dorsal;
    private String nombre;
    private double tiempo;

    public Atleta(int dorsal, String nombre, double tiempo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public double getTiempo() {
        return tiempo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.dorsal;
        return hash;
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
        final Atleta other = (Atleta) obj;
        return this.dorsal == other.dorsal;
    }

    @Override
    public String toString() {
        return "Atleta{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", tiempo=" + tiempo + '}';
    }
    
}
