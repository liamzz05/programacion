/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2tema7.ej2;

import java.time.LocalDateTime;

/**
 *
 * @author DAM104
 */
public class Contenedor {
    private int codigo;
    private String origen;
    private LocalDateTime hora;

    public Contenedor(int codigo, String origen) {
        this.codigo = codigo;
        this.origen = origen;
        this.hora = LocalDateTime.now();
    }
    
    
}
