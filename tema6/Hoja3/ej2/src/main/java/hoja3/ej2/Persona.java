/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ej2;

/**
 *
 * @author DAM104
 */
public abstract class Persona {
    private String DNI, nombre, direccion;

    public Persona(String DNI, String nombre, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre+" Direccion: "+direccion);
    }

    public String getDNI() {
        return DNI;
    }
    
}
