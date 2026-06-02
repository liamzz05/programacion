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
public class Juez extends Persona {

    private int licencia;

    public Juez(String DNI, String nombre, LocalDate fechaNac, int licencia) {
        super(DNI, nombre, fechaNac);
        this.licencia = licencia;
    }

    @Override
    public void informar() {

    }
}
