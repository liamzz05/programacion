/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ej3;

/**
 *
 * @author DAM104
 */
public abstract class Forma {
    @Override
    public abstract String toString();
    public void identidad(Forma forma){
            System.out.println(forma.getClass());
    }
    
}
