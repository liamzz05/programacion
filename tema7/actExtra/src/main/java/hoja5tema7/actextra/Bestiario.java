/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5tema7.actextra;

import java.util.Map;
import static java.util.Map.entry;
import java.util.TreeMap;

/**
 *
 * @author DAM104
 */
public class Bestiario {

    private Map<ClaveCriatura, Criatura> criaturas;

    public Bestiario() {
        criaturas = new TreeMap<ClaveCriatura, Criatura>();
    }

    public void agregarCriatura(Criatura c) {
        ClaveCriatura clave = new ClaveCriatura(c.getNombre(), c.getNivel());
        if (criaturas.put(clave, c) == null) {
            System.out.println("Error al agregar criatura");
        }
    }

    public void eliminarCriatura(String nombre, int nivel) {
        ClaveCriatura clave = new ClaveCriatura(nombre, nivel);
        if (criaturas.remove(clave) == null) {
            System.out.println("Error al eliminar criatura, no encontrada");
        }
    }

    public void mostrarCriaturas() {
        for (ClaveCriatura clave : criaturas.keySet()) {
            System.out.println(clave);
        }
    }
}
