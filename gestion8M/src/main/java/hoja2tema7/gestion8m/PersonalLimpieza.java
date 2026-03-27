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
public class PersonalLimpieza extends Empleado {
    private String turno;
    public PersonalLimpieza(String nombre, String apellidos, String genero, LocalDate fechaAlta,
                            String numSS, double sueldo, String turno) {
        super(nombre, apellidos, genero, fechaAlta, numSS, sueldo);
        this.turno = turno;
    }
} 

