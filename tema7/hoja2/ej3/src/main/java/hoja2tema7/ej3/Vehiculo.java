/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.ej3;

import java.time.LocalDateTime;

/**
 *
 * @author DAM104
 */
public class Vehiculo {

    private String codigo;
    private LocalDateTime horaEntrada;
    private LocalDateTime fechaResolucion;
    private LocalDateTime fechaSalida;

    public Vehiculo(String codigo) {
        this.codigo = codigo;
        this.horaEntrada = LocalDateTime.now();
    }
    
    public String getCodigo(){
        return codigo;
    }

    public void setFechaResolucion(LocalDateTime fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ", horaEntrada=" + horaEntrada + ", fechaResolucion=" + fechaResolucion + ", fechaSalida=" + fechaSalida + '}';
    }
    
}
