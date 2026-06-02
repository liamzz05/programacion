/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.repasoexamencolecciones;

import java.time.LocalDate;

/**
 *
 * @author DAM104
 */
public abstract class Persona {
    private String DNI;
    private String nombre;
    private LocalDate fechaNac;

    public Persona(String DNI, String nombre, LocalDate fechaNac) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getDNI() {
        return DNI;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }
    
    public abstract void informar();
}
