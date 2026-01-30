/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ej3;

import java.time.LocalDate;

/**
 *
 * @author DAM104
 */
public class Contacto {
    private String nombre;
    private String apellidos;
    private int telefono;
    private String email;
    private LocalDate fechaNac;

    public Contacto(String nombre, String apellidos, int telefono, String email, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    
}
