/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.gestion8m;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Guille
 */
public class GestorObras {
    private Set<Obra> obras = new TreeSet<>(); // orden alfabético y sin duplicados
    public boolean agregarObra(Obra o) {
        return obras.add(o);
    }
    public boolean venderObra(String titulo) {
        return obras.removeIf(o -> o.titulo.equalsIgnoreCase(titulo));
    }
    public double ratioObras() {
        long mujeres = obras.stream().filter(o -> o.genero.equalsIgnoreCase("F")).count();
        long hombres = obras.stream().filter(o -> o.genero.equalsIgnoreCase("M")).count();
        return hombres == 0 ? 0 : (double) mujeres / hombres;
    }
}
