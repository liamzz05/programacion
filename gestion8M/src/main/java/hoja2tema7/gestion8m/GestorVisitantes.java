/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.gestion8m;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Guille
 */
public class GestorVisitantes {
    private Queue<Visitante> visitantes = new LinkedList<>();
    public void registrarVisitante(Visitante v) {
        visitantes.add(v);
    }
    public double ratioVisitantes() {
        long mujeres = visitantes.stream().filter(v -> v.getGenero().equalsIgnoreCase("F")).count();
        long hombres = visitantes.stream().filter(v -> v.getGenero().equalsIgnoreCase("M")).count();
        return hombres == 0 ? 0 : (double) mujeres / hombres;
    }
}
