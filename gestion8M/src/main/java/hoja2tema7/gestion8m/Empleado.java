/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.gestion8m;

import java.time.LocalDate;

/**
 *
 * @author Guille
 */
public class Empleado extends Persona {
    protected LocalDate fechaAlta;
    protected String numSeguridadSocial;
    protected double sueldo;
    public Empleado(String nombre, String apellidos, String genero, LocalDate fechaAlta,
                    String numSeguridadSocial, double sueldo) {
        super(nombre, apellidos, genero);
        this.fechaAlta = fechaAlta;
        this.numSeguridadSocial = numSeguridadSocial;
        this.sueldo = sueldo;
    }
    public String getNumSeguridadSocial() { return numSeguridadSocial; }
    public double getSueldo() { return sueldo; }
    @Override
    public String toString() {
        return super.toString() + " | SS: " + numSeguridadSocial + " | Sueldo: " + sueldo;
    }
}
