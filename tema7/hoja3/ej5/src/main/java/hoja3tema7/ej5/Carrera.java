/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3tema7.ej5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Stack;

/**
 *
 * @author DAM104
 */
public class Carrera {

    private LinkedHashSet<Atleta> carrera= new LinkedHashSet<>();

    public void Carrera() {
    }

    public void insertarAtleta(Atleta a) {
        carrera.add(a);
    }

    public double tiempoMedio() {
        double tiempo = 0;
        int contador = 0;

        Iterator<Atleta> it = carrera.iterator();
        while (it.hasNext()) {
            tiempo += it.next().getTiempo();
            contador++;
        }
        return tiempo / contador;
      //  return carrera.stream().mapToDouble(Atleta::getTiempo).average().orElse(0);
    }

    public void darVuelta() {
        Stack<Atleta> pila = new Stack<>();
        pila.addAll(carrera);
        carrera.clear();
        while(!pila.isEmpty()){
            carrera.add(pila.pop());
        }
    }

    @Override
    public String toString() {
        return "Carrera{" + "carrera=" + carrera + '}';
    }
    
}
