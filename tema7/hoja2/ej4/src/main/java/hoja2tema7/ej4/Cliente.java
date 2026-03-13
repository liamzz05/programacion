/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.ej4;

import java.time.LocalDateTime;

/**
 *
 * @author DAM104
 */
public class Cliente {
    private String nombre;
    private int tlfn;
    private LocalDateTime horaLlegada;
    private LocalDateTime horaAtendido;

    public Cliente(String nombre, int tlfn) {
        this.nombre = nombre;
        this.tlfn = tlfn;
        this.horaLlegada = LocalDateTime.now();
    }

    public void setHoraAtendido(LocalDateTime horaAtendido) {
        this.horaAtendido = horaAtendido;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", tlfn=" + tlfn + ", horaLlegada=" + horaLlegada + ", horaAtendido=" + horaAtendido + '}';
    }

    public LocalDateTime getHoraLlegada() {
        return horaLlegada;
    }

    public LocalDateTime getHoraAtendido() {
        return horaAtendido;
    }
    
}
