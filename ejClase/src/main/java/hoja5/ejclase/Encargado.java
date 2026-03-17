/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejclase;

/**
 *
 * @author DAM104
 */
public class Encargado extends Empleado{
    
    public Encargado(int sueldoBase) {
        super(sueldoBase);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() * 1.10; 
    }
    
    
}
