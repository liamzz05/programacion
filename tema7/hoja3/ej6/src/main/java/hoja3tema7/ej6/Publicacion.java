/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3tema7.ej6;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author DAM104
 */
public class Publicacion {
    private String titulo;
    private String autor;
    private Calendar fecha;
    
    
    public Publicacion(String titulo, String autor, int dia, int mes, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha.set(año, mes, dia);
    }
    
    @Override
    public String toString() {
        return "Publicacion{" + super.toString() + "titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    
    
}
