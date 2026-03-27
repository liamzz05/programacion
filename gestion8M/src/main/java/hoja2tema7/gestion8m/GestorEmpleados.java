/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.gestion8m;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Guille
 */
public class GestorEmpleados {
    private Set<Empleado> empleados = new HashSet<>();
    public boolean agregarEmpleado(Empleado e) {
        return empleados.add(e);
    }
    public boolean eliminarEmpleado(String numSS) {
        return empleados.removeIf(e -> e.getNumSeguridadSocial().equals(numSS));
    }
    public double ratioEmpleado() {
        long mujeres = empleados.stream().filter(e -> e.getGenero().equalsIgnoreCase("F")).count();
        long hombres = empleados.stream().filter(e -> e.getGenero().equalsIgnoreCase("M")).count();
        return hombres == 0 ? 0 : (double) mujeres / hombres;
    }
    public double brechaSalarial() {
        double mediaH = empleados.stream().filter(e -> e.getGenero().equalsIgnoreCase("M"))
                .mapToDouble(Empleado::getSueldo).average().orElse(0);
        double mediaM = empleados.stream().filter(e -> e.getGenero().equalsIgnoreCase("F"))
                .mapToDouble(Empleado::getSueldo).average().orElse(0);
        return mediaH - mediaM;
    }
    public Set<Empleado> getEmpleados() {
        return empleados;
    }
}
