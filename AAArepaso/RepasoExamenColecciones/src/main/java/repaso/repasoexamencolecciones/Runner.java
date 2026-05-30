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
public class Runner extends Persona {
    private int dorsal;
    private int tiempoMinutos;

    public Runner(String DNI, String nombre, LocalDate fechaNac) {
        super(DNI, nombre, fechaNac);
        this.dorsal = -1;
        this.tiempoMinutos = -1;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setTiempoMinutos(int tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.dorsal;
        hash = 61 * hash + this.tiempoMinutos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Runner other = (Runner) obj;
        if (this.dorsal != other.dorsal) {
            return false;
        }
        return this.tiempoMinutos == other.tiempoMinutos;
    }
    
    @Override
    public void informar(){
        
    }
}
