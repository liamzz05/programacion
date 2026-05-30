/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5tema7.actextra;

import java.util.Objects;

/**
 *
 * @author DAM104
 */
public class ClaveCriatura implements Comparable<ClaveCriatura>{
    private final String nombre;
    private final int nivel;

    public ClaveCriatura(String nombre, int nivel) {
        this.nombre = nombre.toUpperCase();
        this.nivel = nivel;
    }

    @Override
    public int compareTo(ClaveCriatura o) {
        int comparacionNombre = this.nombre.compareTo(o.nombre);
        
        if (comparacionNombre != 0) {
            return comparacionNombre;
        } 
        return Integer.compare(o.nivel, this.nivel);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + this.nivel;
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
        final ClaveCriatura other = (ClaveCriatura) obj;
        if (this.nivel != other.nivel) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return nombre + "-" + nivel;
    }
    
    
}
