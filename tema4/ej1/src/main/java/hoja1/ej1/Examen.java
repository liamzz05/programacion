/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ej1;

/**
 *
 * @author DAM104
 */
public class Examen {
    private String asignatura;
    private String aula;
    private Fecha fecha;
    private Hora hora;

    public Examen(String asignatura, String aula, Fecha fecha, Hora hora) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Examen{" + "asignatura=" + asignatura + ", aula=" + aula + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
    
}
